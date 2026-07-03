public class VIPTicket extends Ticket {
    private final double VIP_SURCHARGE = 15.00; 
    private boolean wantsSnackCombo;
    private final double DISCOUNTED_SNACK_PRICE = 8.00; 
 
    public VIPTicket() {
        super();
        this.wantsSnackCombo = false;
    }
    public VIPTicket(String movieTitle, String customerName, String showtime, boolean wantsSnackCombo) {
        super(movieTitle, customerName, showtime);
        this.wantsSnackCombo = wantsSnackCombo;
    }

    @Override
    public double calculateTotal() {
        double total = super.calculateTotal() + VIP_SURCHARGE;
        if (wantsSnackCombo) {
            total += DISCOUNTED_SNACK_PRICE;
        }
        return total;
    }
}