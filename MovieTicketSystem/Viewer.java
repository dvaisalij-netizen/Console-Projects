package MovieTicketSystem;

public class Viewer implements Viewerinterface{
    private  int numberOfSeats;
    private String screenType;
    private String wantSnacks;
    private int snackQuantity;

    Screeninterface [] screen=new Screeninterface[2];
    public Viewer(){
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public String getScreenType() {
        return screenType;
    }
    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }
    public String getWantSnacks() {
        return wantSnacks;
    }
    public void setWantSnacks(String wantSnacks) {
        this.wantSnacks = wantSnacks;
    }
    public int getSnackQuantity() {
        return snackQuantity;
    }
    public void setSnackQuantity(int snackQuantity) {
        this.snackQuantity = snackQuantity;
    }
    public Screeninterface[] getScreen(){
        return screen;
    }
    public void setScreen(Screeninterface[] screen){
        this.screen=screen;
    }

}