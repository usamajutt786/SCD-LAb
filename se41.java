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

    public Object getParkingSlots() {
        return null;
    }

}

// Class2: Movie
class Movie {
    private int movieId;//
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
        if (slotsOccupied < totalSlots) {
            slotsOccupied++;
            System.out.println("Parked successfully. Slot occupied: " + slotsOccupied + "/" + totalSlots);
        } else {
            System.out.println("Parking is full. No available slots.");
        }
    }

    public void pay() {
        if (slotsOccupied > 0) {
            slotsOccupied--;
            System.out.println("Payment processed. Slot occupied: " + slotsOccupied + "/" + totalSlots);
        } else {
            System.out.println("No occupied slots to pay for.");
        }
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
        System.out.println("Available seats: " + (totalSeats - noOfSeatsBooked));
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
        System.out.println("Ticket id"+ticketId);
        System.out.println("customer id "+customerId);
        System.out.println("hall id "+hallId);
        System.out.println("movie name "+movieName);
        System.out.println("ticket price "+ticketPrice);
    }
    public void bookTicket() {
        System.out.println("Ticket booked the ticket id is "+ticketId);

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
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
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
        System.out.println("Shop ID: " + shopId);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Shop Name: " + shopName);
        System.out.println("Items available:");
        for (String item : itemList) {
            System.out.println(item);
        }
    }

    public void itemDetails() {
        // Assuming itemDetails displays details of a specific item
        if (itemList.isEmpty()) {
            System.out.println("No items available");
        } else {
            System.out.println("Items available:");
            for (String item : itemList) {
                System.out.println(item);
            }
        }
    }

    public void buy(String item) {
        if (itemList.contains(item)) {
            System.out.println("Purchased: " + item);
            itemList.remove(item);
        } else {
            System.out.println("Item not available for purchase");
        }
    }

    public void addItem(String item) {
        itemList.add(item);
        System.out.println("Added " + item + " to the shop's inventory.");
    }

    public void removeItem(String item) {
        if (itemList.contains(item)) {
            itemList.remove(item);
            System.out.println("Removed " + item + " from the shop's inventory.");
        } else {
            System.out.println("Item not found in the inventory.");
        }
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
        System.out.println("the customer id is: "+customerId);
        System.out.println("the customer name is: "+customerName);
        System.out.println("the customer age is: "+customerAge);
        System.out.println("the customer gender is: "+customerGender);
        System.out.println("the customer id is: "+customerId);
    }
}

// Class11: RestRoom
class RestRoom {
    private int noOfStaff;

    public RestRoom(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public void use() {
        if (noOfStaff > 0) {
            System.out.println("Restroom in use. Staff monitoring the restroom.");
        } else {
            System.out.println("Restroom temporarily unavailable. No staff present.");
        }
    }
}
public class se41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Theater theater = null;
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Theater");
            System.out.println("2. Add Movie");
            System.out.println("3. Show Theater Movies");
            System.out.println("4. Book Ticket");
            System.out.println("5. Show Employee Details");
            System.out.println("6. Manage Shops");
            System.out.println("7. Use Restroom");
            System.out.println("8. Park Vehicle");
            System.out.println("9. Exit");
            System.out.print("Please enter your choice: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    theater = addTheater(scanner);
                    break;
                case 2:
                    if (theater != null) {
                        addMovie(scanner, theater);
                    } else {
                        System.out.println("Please add a theater first.");
                    }
                    break;
                case 3:
                    if (theater != null) {
                        theater.displayMovieNames();
                    } else {
                        System.out.println("Theater details not available.");
                    }
                    break;
                case 4:
                    // Booking ticket logic
                    break;
                case 5:
                    // Show employee details
                    break;
                case 6:
                    manageShops(scanner);
                    break;
                case 7:
                    useRestroom(scanner);
                    break;
                case 8:
                    if (theater != null) {
                        parkVehicle(scanner, theater);
                    } else {
                        System.out.println("Please add a theater first.");
                    }
                    break;
                case 9:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 9);

        scanner.close();
    }

    public static Theater addTheater(Scanner scanner) {
        System.out.println("\n=== Add Theater ===");
        System.out.print("Enter theater name: ");
        String theaterName = scanner.next();
        System.out.print("Enter city: ");
        String city = scanner.next();
        System.out.print("Enter the number of screens: ");
        int noOfScreens = scanner.nextInt();
        return new Theater(theaterName, city, noOfScreens);
    }

    public static void addMovie(Scanner scanner, Theater theater) {
        System.out.println("\n=== Add Movie ===");
        System.out.print("Enter movie ID: ");
        int movieId = scanner.nextInt();
        System.out.print("Enter movie name: ");
        scanner.nextLine(); // Consume newline
        String movieName = scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter duration (in minutes): ");
        int duration = scanner.nextInt();

        Movie movie = new Movie(movieId, movieName, genre, duration);
        theater.addMovie(movie);
        System.out.println("Movie added successfully.");
    }

    public static void manageShops(Scanner scanner) {
        System.out.println("\n=== Manage Shops ===");
        // Logic for shop management: Add, Remove, Buy, Display, etc.
    }

    public static void useRestroom(Scanner scanner) {
        System.out.println("\n=== Use Restroom ===");
        // Logic for using the restroom
    }

    public static void parkVehicle(Scanner scanner, Theater theater) {
        System.out.println("\n=== Park Vehicle ===");
        if (theater.getParkingSlots() != null) {
            System.out.println("1. Park a vehicle");
            System.out.println("2. Pay for parking");
            System.out.print("Please enter your choice: ");
            int parkingChoice = scanner.nextInt();

            switch (parkingChoice) {
                case 1:
                    ((ParkingSlots) theater.getParkingSlots()).park();
                    break;
                case 2:
                    ((ParkingSlots) theater.getParkingSlots()).pay();
                    break;
                default:
                    System.out.println("Invalid choice for parking.");
                    break;
            }
        } else {
            System.out.println("Parking slot details are unavailable.");
        }
    }
}
