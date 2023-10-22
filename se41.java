import java.util.ArrayList;
import java.util.List;

class TheaterManagement {
    private String theaterName;
    private String city;
    private int noOfScreens;
    private List<Movie> movieList = new ArrayList<>();
    private List<Hall> halls = new ArrayList<>();
    private OperatorRoom operatorRoom;
    private TicketCounter ticketCounter;
    private ParkingSlots parkingSlots;

    public TheaterManagement(String theaterName, String city, int noOfScreens) {
        this.theaterName = theaterName;
        this.city = city;
        this.noOfScreens = noOfScreens;
    }

    public boolean isOpen() {
        // Implement logic to check if the theater is open
        return true;
    }

    public void displayMovieNames() {
        for (Movie movie : movieList) {
            System.out.println(movie.getMovieName());
        }
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public void setOperatorRoom(OperatorRoom operatorRoom) {
        this.operatorRoom = operatorRoom;
    }

    public void setParkingSlots(ParkingSlots parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public void setTicketCounter(TicketCounter ticketCounter) {
        this.ticketCounter = ticketCounter;
    }
}

class Movie {
    private int movieId;
    private String movieName;
    private String genre;
    private int duration;
    private Hall hall;

    public Movie(int movieId, String movieName, String genre, int duration) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.duration = duration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void displayMovieDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class Hall {
    private int hallId;
    private String hallName;
    private int movieId;
    private Seats seats;

    public Hall(int hallId, String hallName, int movieId) {
        this.hallId = hallId;
        this.hallName = hallName;
        this.movieId = movieId;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    public void displayDetails() {
        System.out.println("Hall Name: " + hallName);
        System.out.println("Movie ID: " + movieId);
    }
}

class OperatorRoom {
    private int interchargeId;
    private String interchargeName;
    private int hallId;

    public OperatorRoom(int interchargeId, String interchargeName, int hallId) {
        this.interchargeId = interchargeId;
        this.interchargeName = interchargeName;
        this.hallId = hallId;
    }

    public void control() {
        // Implement operator room control logic
    }
}

class ParkingSlots {
    private int totalSlots;
    private int slotsOccupied;

    public ParkingSlots(int totalSlots, int slotsOccupied) {
        this.totalSlots = totalSlots;
        this.slotsOccupied = slotsOccupied;
    }

    public void park() {
        // Implement parking logic
    }

    public void pay() {
        // Implement payment logic
    }
}

class Seats {
    private int seatId;
    private int hallId;
    private String seatType;
    private int totalSeats;
    private int noOfSeatsBooked;

    public Seats(int seatId, int hallId, String seatType, int totalSeats) {
        this.seatId = seatId;
        this.hallId = hallId;
        this.seatType = seatType;
        this.totalSeats = totalSeats;
    }

    public void displayAvailableSeats() {
        // Implement logic to display available seats
    }
}

class TicketCounter {
    private int ticketId;
    private int customerId;
    private int hallId;
    private String movieName;
    private double ticketPrice;

    public TicketCounter(int ticketId, int customerId, int hallId, String movieName, double ticketPrice) {
        this.ticketId = ticketId;
        this.customerId = customerId;
        this.hallId = hallId;
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
    }

    public void showTicket() {
        // Implement logic to display tickets
    }

    public void bookTicket() {
        // Implement ticket booking logic
    }
}

class Employee {
    private int employeeId;
    private String employeeName;
    private String designation;
    private double salary;

    public Employee(int employeeId, String employeeName, String designation, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.salary = salary;
    }

    public void employeeDetails() {
        // Implement employee details logic
    }
}

class SupportStaff extends Employee {
    public SupportStaff(int employeeId, String employeeName, String designation, double salary) {
        super(employeeId, employeeName, designation, salary);
    }
}

class TechnicalOperator extends Employee {
    public TechnicalOperator(int employeeId, String employeeName, String designation, double salary) {
        super(employeeId, employeeName, designation, salary);
    }
}

class Shops {
    private int shopId;
    private int employeeId;
    private String shopName;
    private List<String> itemList;

    public Shops(int shopId, int employeeId, String shopName) {
        this.shopId = shopId;
        this.employeeId = employeeId;
        this.shopName = shopName;
        this.itemList = new ArrayList<>();
    }

    public void shopDetails() {
        // Implement shop details logic
    }

    public void itemDetails() {
        // Implement item details logic
    }

    public void buy() {
        // Implement shopping logic
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private int customerAge;
    private String customerGender;

    public Customer(int customerId, String customerName, int customerAge, String customerGender) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerGender = customerGender;
    }

    public void customerDetails() {
        // Implement customer details logic
    }
}

class RestRoom {
    private int noOfStaff;

    public RestRoom(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public void use() {
        // Implement restroom usage logic
    }
}

public class se41 {
    public static void main(String[] args) {
        // Create instances of the classes and implement the main logic for the theater management system
        TheaterManagement theater = new TheaterManagement("ABC Theater", "City", 5);
        Movie movie1 = new Movie(1, "Movie A", "Action", 120);
        Movie movie2 = new Movie(2, "Movie B", "Comedy", 90);
        Hall hall1 = new Hall(1, "Hall 1", 1);
        Seats seats1 = new Seats(1, 1, "Regular", 100);
        hall1.setSeats(seats1);
        theater.addMovie(movie1);
        theater.addMovie(movie2);
        theater.addHall(hall1);

        // Implement more logic as per your requirements
    }
}
