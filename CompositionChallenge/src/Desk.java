public class Desk {
    private String material;
    private Dimensions dimensions;

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Desk(String material, Dimensions dimensions) {
        this.material = material;
        this.dimensions = dimensions;
    }
}
