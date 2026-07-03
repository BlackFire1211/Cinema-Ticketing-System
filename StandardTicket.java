public class StandardTicket extends Ticket {
    private boolean wantsSnackCombo;
    private final double SNACK_PRICE = 12.00;

     public StandardTicket() {
        super();
        this.wantsSnackCombo = false;
    }
    public StandardTicket(String movieTitle, String customerName, String showtime, boolean wantsSnackCombo) {
        super(movieTitle, customerName, showtime);
        this.wantsSnackCombo = wantsSnackCombo;
    }

    @Override
    public double calculateTotal() {
        if (wantsSnackCombo) {
            return super.calculateTotal() + SNACK_PRICE;
        }
        return super.calculateTotal();
    }
}