public class PC {
    private Case theCase;
    private Screen screen;
    private Motherboard motherboard;

    public PC(Case theCase, Screen screen, Motherboard motherboard) {
        this.theCase = theCase;
        this.screen = screen;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        screen.drawPixelAt(1250, 200, "blue");
    }


}
