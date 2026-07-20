
package MovieTicketSystem;

public class GoldScreen extends Screen implements GoldScreeninterface{
    public GoldScreen(String bookingId,int ticketPrice,int snackPrice,int convenienceFee,Viewerinterface viewer){
        this.setBookingId(bookingId);
        this.setTicketPrice(ticketPrice);
        this.setSnackPrice(snackPrice);
        this.setConvenienceFee(convenienceFee);
        this.setViewer(viewer);
    }

}