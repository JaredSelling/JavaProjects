public class Ceiling {
    private int height;
    private String color;

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public Ceiling(int height, String color) {
        this.height = height;
        this.color = color;
    }

    public void observeCeiling() {
        System.out.println("The ceiling is " + getHeight() + " feet high and " + getColor() + " in color.");
    }
}
