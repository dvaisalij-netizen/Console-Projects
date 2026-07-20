package MovieTicketSystem;

public class SilverScreen extends Screen implements SilverScreeninterface{
    public SilverScreen(String bookingId,int ticketPrice,int snackPrice,int convenienceFee,Viewerinterface viewer){
            this.setBookingId(bookingId);
            this.setTicketPrice(ticketPrice);
            this.setSnackPrice(snackPrice);
            this.setConvenienceFee(convenienceFee);
            this.setViewer(viewer);
        }
    }