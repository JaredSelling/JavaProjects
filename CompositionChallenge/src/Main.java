public class Main {
    public static void main(String[] args) {


        Dimensions floorDimensions = new Dimensions(14, 10, 0);
        Dimensions deskDimensions = new Dimensions(4, 2, 3);
        Dimensions chairDimensions = new Dimensions(2, 2, 2);
        Ceiling theCeiling = new Ceiling(11, "white");
        Floor theFloor = new Floor(floorDimensions, "wood");
        Desk theDesk = new Desk("wood", deskDimensions);
        Chair theChair = new Chair(true, false, "leather", chairDimensions);

        Dimensions caseDimensions = new Dimensions(1, 3, 2);
        Case theCase = new Case(caseDimensions, "Dell", "240", "SmallBeast_x01");

        Screen theScreen = new Screen("PrecisionImage v101", "Acer", 27, new Resolution(1440, 2560));

        Motherboard theMotherboard = new Motherboard("BZ-200", "Asus", 4, 3, "v2.44");

        PC thePC = new PC(theCase, theScreen, theMotherboard);

        Room theRoom = new Room(theCeiling, theFloor, theDesk, theChair, thePC);
        theRoom.lookAround();
        theRoom.sitDown();
        theRoom.usePC();




    }
}
