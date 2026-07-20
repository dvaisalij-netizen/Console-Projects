package MovieTicketSystem;

public interface Screeninterface {
    public String getBookingId();
    public void setBookingId(String bookingId);
    public int getTicketPrice();
    public void setTicketPrice(int ticketPrice);
    public int getSnackPrice();
    public void setSnackPrice(int snackPrice);
    public int getTotalBill();
    public void setTotalBill(int totalBill);
    public int getConvenienceFee();
    public void setConvenienceFee(int convenienceFee);
    public Viewerinterface getViewer();
    public void setViewer(Viewerinterface viewer);
    public void calculateTicketPrice();
    public void calculateSnackPrice();
    public void generateBill();
    public void applyDiscount();
}
