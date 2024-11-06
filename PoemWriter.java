import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PoemWriter {

    public static void main(String[] args) {
        // Correctly create three different Poem objects using the parameterized constructor
        Poem poem1 = new Poem("The Road Not Taken", "Robert Frost");
        Poem poem2 = new Poem("Ode to a Nightingale", "John Keats");
        Poem poem3 = new Poem("The Raven", "Edgar Allan Poe");

        // Open poems.txt for writing and write poem details to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("poems.txt"))) {
            writePoemToFile(poem1, writer);
            writePoemToFile(poem2, writer);
            writePoemToFile(poem3, writer);
            System.out.println("Poem details written to poems.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to write each poem's name and poet to the file
    public static void writePoemToFile(Poem poem, BufferedWriter writer) throws IOException {
        writer.write(poem.getName());  // Write the poem name
        writer.newLine();              // Write a new line
        writer.write(poem.getPoet());  // Write the poet's name
        writer.newLine(); // Write a new line between poems

        writer.newLine();
    }
}
