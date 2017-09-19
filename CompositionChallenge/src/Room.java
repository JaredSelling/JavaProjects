public class Room {
    private Ceiling theCeiling;
    private Floor theFloor;
    private Desk theDesk;
    private Chair theChair;
    private PC thePC;

    public Room(Ceiling theCeiling, Floor theFloor, Desk theDesk, Chair theChair, PC thePC) {
        this.theCeiling = theCeiling;
        this.theFloor = theFloor;
        this.theDesk = theDesk;
        this.theChair = theChair;
        this.thePC = thePC;
    }
}
