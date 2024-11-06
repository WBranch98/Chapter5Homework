
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {



                String inputFileName = "Book1.csv";
                String outputFileName = "stats.txt";

                List<Double> numbers = new ArrayList<>();

                // Read numbers from the CSV file
                try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFileName))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] values = line.split(",");
                        for (String value : values) {
                            numbers.add(Double.parseDouble(value.trim()));
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                    return;
                }

                // Calculate sum, lowest, highest, and average
                double sum = 0;
                double lowest = Double.MAX_VALUE;
                double highest = Double.MIN_VALUE;

                for (double num : numbers) {
                    sum += num;
                    if (num < lowest) lowest = num;
                    if (num > highest) highest = num;
                }
                double average = sum / numbers.size();

                // Write results to the output file
                try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFileName))) {
                    writer.write("The sum of the numbers is: " + sum + "\n");
                    writer.write("The lowest number is: " + lowest + "\n");
                    writer.write("The highest number is: " + highest + "\n");
                    writer.write("The average of the numbers is: " + average + "\n");
                    System.out.println("Statistics written to " + outputFileName);
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e.getMessage());
                }
            }
        }

