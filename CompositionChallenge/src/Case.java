public class Case {
    private Dimensions dimensions;
    private String manufacturer;
    private String powerSupply;
    private String model;

    public Case(Dimensions dimensions, String manufacturer, String powerSupply, String model) {
        this.dimensions = dimensions;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.model = model;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getModel() {
        return model;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
