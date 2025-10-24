import java.util.Scanner;

public class SimpleBusTicketSystem {
    static String[] passengers = new String[10]; // Max 10 seats
    static int seatCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Simple Bus Ticket System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Show Booked Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (seatCount >= passengers.length) {
                        System.out.println("Sorry, all seats are booked.");
                    } else {
                        System.out.print("Enter passenger name: ");
                        String name = sc.nextLine();
                        passengers[seatCount] = name;
                        System.out.println("Ticket booked! Seat number: " + (seatCount + 1));
                        seatCount++;
                    }
                    break;

                case 2:
                    System.out.println("--- Booked Tickets ---");
                    for (int i = 0; i < seatCount; i++) {
                        System.out.println("Seat " + (i + 1) + ": " + passengers[i]);
                    }
                    if (seatCount == 0) {
                        System.out.println("No tickets booked yet.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}