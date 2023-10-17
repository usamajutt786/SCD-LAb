import java.util.ArrayList;
import java.util.List;

// Class1: TheaterManagement
class TheaterManagement {
    private String theaterName;
    private String city;
    private int noOfScreens;
    private List<Movie> movieList = new ArrayList<>();
    private List<Hall> halls = new ArrayList<>();
    private OperatorRoom operatorRoom;
    private TicketCounter ticketCounter;
    private ParkingSlots parkingSlots;
    public TheaterManagement(ParkingSlots parkingSlots)
    {
        this.parkingSlots=parkingSlots;
    }
    public TheaterManagement(String theaterName, String city, int noOfScreens) {
        this.theaterName = theaterName;
        this.city = city;
        this.noOfScreens = noOfScreens;
    }

    public boolean isOpen()
    {
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

// Class2: Movie
class Movie {
    private int movieId;
    private String movieName;
    private String genre;
    private int duration;
    private Hall hall;
    Movie(Hall hall)
    {
        this.hall=hall;
    }

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

// Class3: Hall
class Hall {
    private int hallId;
    private String hallName;
    private int movieId;
    private Seats seats;
    Hall(Seats seats)
    {
        this.seats=seats;
    }
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

// Class4: OperatorRoom
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
        // i will implement  logic  here
    }
}

// Class5: ParkingSlots
class ParkingSlots {
    private int totalSlots;
    private int slotsOccupied;

    public ParkingSlots(int totalSlots, int slotsOccupied) {
        this.totalSlots = totalSlots;
        this.slotsOccupied = slotsOccupied;
    }
    public void park() {
        // i will implement  logic  here
    }

    public void pay() {
        // i will implement  logic  here
    }
}

// Class6: Seats
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
        // Implement displayAvailableSeats logic
    }
}

// Class7: TicketCounter
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
       // i will implement  logic  here
    }

    public void bookTicket() {
        // i will implement  logic  here
    }
}

// Class8: Employee
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
        // Implement employeeDetails logic
    }
}
class SupportStaff extends Employee 
{
    public SupportStaff(int employeeId, String employeeName, String designation, double salary);
}
class TechnicalOperator extends Employee
{

}
// Class9: Shops
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
        // i will implement  logic  here
    }

    public void itemDetails() {
       // i will implement  logic  here
    }

    public void buy() {
     // i will implement  logic  here
    }
}

// Class10: Customer
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
        // i will implement  logic  here
    }
}
// Class11: RestRoom
class RestRoom {
    private int noOfStaff;

    public RestRoom(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public void use() {
        // i will implement  logic  here
    }
}

// Main class
public class se41 {
    public static void main(String[] args) {
        // i will implement  logic  here
    }
}
