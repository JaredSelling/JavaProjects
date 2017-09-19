public class Chair {
    private boolean isRollingChair;
    private boolean isErgonomic;
    private String paddingType;
    private Dimensions dimensions;

    public Chair(boolean isRollingChair, boolean isErgonomic, String paddingType, Dimensions dimensions) {
        this.isRollingChair = isRollingChair;
        this.isErgonomic = isErgonomic;
        this.paddingType = paddingType;
        this.dimensions = dimensions;
    }

    public String getPaddingType() {
        return paddingType;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void Push() {
        if(isRollingChair) {
            System.out.println("The chair rolls across the floor");
        } else {
            System.out.println("The chair scuffs along the floor.");
        }
    }
}
