public class Poem {
    private String name;
    private String poet;

    // No-argument constructor
    public Poem() {
        this.name = "unknown";
        this.poet = "unknown";
    }

    // Parameterized constructor
    public Poem(String name, String poet) {
        this.name = name;
        this.poet = poet;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for poet
    public String getPoet() {
        return poet;
    }

    // Setter for poet
    public void setPoet(String poet) {
        this.poet = poet;
    }

}
