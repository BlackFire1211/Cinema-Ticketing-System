public class Ticket {
    // Protected attributes so subclasses can access them directly
    protected String movieTitle;
    protected String customerName;
    protected String showtime;
    protected double basePrice;

    // Constructor
    public Ticket(String movieTitle, String customerName, String showtime) {
        this.movieTitle = movieTitle;
        this.customerName = customerName;
        this.showtime = showtime;
        this.basePrice = 15.00; // Standard flat rate in MYR
    }

    // Method to be overridden by subclasses (Polymorphism)
    public double calculateTotal() {
        return this.basePrice;
    }

    // Standard Getters
    public String getMovieTitle() { return movieTitle; }
    public String getCustomerName() { return customerName; }
    public String getShowtime() { return showtime; }
}