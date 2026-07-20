package MovieTicketSystem;
public abstract class Screen implements Screeninterface{
    //Known
    private String bookingId;
    private int ticketPrice;
    private int snackPrice;
    private int totalBill;
    private int convenienceFee;

    private Viewerinterface viewer;
    public String getBookingId() {
        return bookingId;
    }
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
    public int getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public int getSnackPrice() {
        return snackPrice;
    }
    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }
    public int getTotalBill() {
        return totalBill;
    }
    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
    public int getConvenienceFee() {
        return convenienceFee;
    }
    public void setConvenienceFee(int convenienceFee) {
        this.convenienceFee = convenienceFee;
    }
    public Viewerinterface getViewer() {
        return viewer;
    }
    public void setViewer(Viewerinterface viewer) {
        this.viewer = viewer;
    }
    public void calculateTicketPrice(){
        this.ticketPrice=this.viewer.getNumberOfSeats()*this.ticketPrice;
    }
    public void calculateSnackPrice(){
        if(this.viewer.getWantSnacks().equals("YES")) {
            this.snackPrice = this.viewer.getSnackQuantity() * this.snackPrice;
            System.out.println("Snack Price");
            System.out.println(this.snackPrice);
        }
        else if(this.viewer.getWantSnacks().equals("NO")){
            System.out.println("Snack Price:0");
        }
        else {
            System.out.println("Snack detail is not given ");
        }
    }
    public void generateBill(){
        this.totalBill=this.ticketPrice+this.snackPrice+this.convenienceFee;
    }
    public void applyDiscount(){
        if(this.viewer.getNumberOfSeats()>=4){
            int Discount=this.totalBill*10/100;
            this.totalBill=this.totalBill-Discount;
            System.out.println("Discount Applied");
            System.out.println(this.totalBill);
        }
        else {
            System.out.println("No Discount");
        }
    }
}