public class Floor {
    private Dimensions dimensions;
    private String material;

    public Floor(Dimensions dimensions, String material) {
        this.dimensions = dimensions;
        this.material = material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void observeFloor() {
        System.out.println("The floor is " + dimensions.getLength() + " long by " + dimensions.getWidth() + " wide and made of " + material);
    }

}
