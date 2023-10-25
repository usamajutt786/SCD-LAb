import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class1: Theater
class Theater {
    private String theaterName;
    private String city;
    private int noOfScreens;
    private List<Movie> movies = new ArrayList<>();
    private List<Hall> halls = new ArrayList();
    private List<Employee> employees = new ArrayList();
    private List<Shops> shops = new ArrayList();
    private List<RestRoom> restrooms = new ArrayList();
    private OperatorRoom operatorRoom;
    private ParkingSlots parkingSlots;
    private TicketCounter ticketCounter;

    public Theater(String theaterName, String city, int noOfScreens) {
        this.theaterName = theaterName;
        this.city = city;
        this.noOfScreens = noOfScreens;
    }

    public boolean isOpen() {
        return true;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addShop(Shops shop) {
        shops.add(shop);
    }

    public void addRestRoom(RestRoom restroom) {
        restrooms.add(restroom);
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

    public void displayMovieNames() {
        for (Movie movie : movies) {
            System.out.println(movie.getMovieName());
        }
    }

}

// Class2: Movie
class Movie {
    private int movieId;// not 
    private String movieName;
    private String genre;
    private int duration;

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
    }

    public void pay() {
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
    }

    public void bookTicket() {

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
    }
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
        // Implement shopDetails logic
    }

    public void itemDetails() {
        // Implement itemDetails logic
    }

    public void buy() {
        // Implement buy logic
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
        // Implement customerDetails logic
    }
}

// Class11: RestRoom
class RestRoom {
    private int noOfStaff;

    public RestRoom(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public void use() {
        // Implement use logic
    }
}

public class se41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Theater Management System!");
        int choice;

        Theater theater = null;
        do {
            System.out.println("1. Add Theater");
            System.out.println("2. Add Movie");
            System.out.println("3. Show Theater");
            System.out.println("4. Show Movie");
            System.out.println("Please enter your choice (-1 to exit):");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter theater name:");
                String theaterName = scanner.next();
                System.out.println("Enter city:");
                String city = scanner.next();
                System.out.println("Enter the number of screens:");
                int noOfScreens = scanner.nextInt();
                theater = new Theater(theaterName, city, noOfScreens);
            } else if (choice == 2) {
                System.out.println("Enter movie details:");
                System.out.println("Enter movie ID:");
                int movieId = scanner.nextInt();

                System.out.println("Enter movie name:");
                scanner.nextLine(); // Consume newline
                String movieName = scanner.nextLine();

                System.out.println("Enter genre:");
                String genre = scanner.nextLine();
                System.out.println("Enter duration (in minutes):");
                int duration = scanner.nextInt();

                Movie movie = new Movie(movieId, movieName, genre, duration);
                theater.addMovie(movie);
                System.out.println("You selected choice 2.");

            } else if (choice == 3) {
                theater.displayMovieNames();
            } else if (choice == 4) {

            } else if (choice == -1) {
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != -1);

        boolean continueAddingMovies = true;

        while (continueAddingMovies) {
            System.out.println("Do you want to add another movie? (yes/no)");
            String addAnotherMovie = scanner.next();
            if (!addAnotherMovie.equalsIgnoreCase("yes")) {
                continueAddingMovies = false;
            }
        }

        if (theater != null) {
            System.out.println("Movie Names:");
            theater.displayMovieNames();
        }

        // Implement similar logic for other objects like Hall, OperatorRoom,
        // ParkingSlots, TicketCounter, etc.

        // Close the scanner
        scanner.close();
    }
}