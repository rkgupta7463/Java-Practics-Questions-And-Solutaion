import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Room {
    private int roomNumber;
    private boolean isReserved;
    private String guestName;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isReserved = false;
        this.guestName = "";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void reserveRoom(String guestName) {
        this.isReserved = true;
        this.guestName = guestName;
    }

    public void checkOut() {
        this.isReserved = false;
        this.guestName = "";
    }

    public String getGuestName() {
        return guestName;
    }
}

class Hotel {
    private List<Room> rooms;

    public Hotel(int numRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= numRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public void displayRooms() {
        for (Room room : rooms) {
            System.out.println("Room " + room.getRoomNumber() + " - " + (room.isReserved() ? "Occupied by " + room.getGuestName() : "Available"));
        }
    }

    public Room reserveRoom(int roomNumber, String guestName) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isReserved()) {
                room.reserveRoom(guestName);
                return room;
            }
        }
        return null; // Room not available or does not exist
    }

    public void checkOutRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isReserved()) {
                room.checkOut();
                return;
            }
        }
    }
}

public class hospitalmanagment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(10); // Creating a hotel with 10 rooms

        while (true) {
            System.out.println("Hotel Reservation System");
            System.out.println("1. Display Room Status");
            System.out.println("2. Reserve a Room");
            System.out.println("3. Check Out");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    hotel.displayRooms();
                    break;
                case 2:
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter guest name: ");
                    String guestName = scanner.nextLine();
                    Room reservedRoom = hotel.reserveRoom(roomNumber, guestName);
                    if (reservedRoom != null) {
                        System.out.println("Room " + reservedRoom.getRoomNumber() + " reserved for " + guestName);
                    } else {
                        System.out.println("Room not available or does not exist.");
                    }
                    break;
                case 3:
                    System.out.print("Enter room number to check out: ");
                    int roomToCheckOut = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    hotel.checkOutRoom(roomToCheckOut);
                    System.out.println("Room " + roomToCheckOut + " checked out.");
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
