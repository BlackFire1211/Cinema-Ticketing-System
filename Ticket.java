public class Ticket {
    protected String movieTitle;
    protected String customerName;
    protected String showtime;
    protected double basePrice;

    public Ticket() {
        this.movieTitle = "";
        this.customerName = "";
        this.showtime = "";
        this.basePrice = 15.00; 
    }
    public Ticket(String movieTitle, String customerName, String showtime) {
        this.movieTitle = movieTitle;
        this.customerName = customerName;
        this.showtime = showtime;
        this.basePrice = 15.00; 
    }

    public double calculateTotal() {
        return this.basePrice;
    }

    // Standard Getters
    public String getMovieTitle() { return movieTitle; }
    public String getCustomerName() { return customerName; }
    public String getShowtime() { return showtime; }
}