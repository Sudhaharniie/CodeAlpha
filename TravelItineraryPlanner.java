import java.util.ArrayList;
import java.util.Scanner;

public class TravelItineraryPlanner {

    static class Itinerary {
        String destination;
        String startDate;
        String endDate;
        String preferences;

        Itinerary(String destination, String startDate, String endDate, String preferences) {
            this.destination = destination;
            this.startDate = startDate;
            this.endDate = endDate;
            this.preferences = preferences;
        }

        @Override
        public String toString() {
            return "Destination: " + destination + "\nStart Date: " + startDate +
                   "\nEnd Date: " + endDate + "\nPreferences: " + preferences;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Itinerary> itineraries = new ArrayList<>();
        String cont;

        do {
            System.out.print("Enter destination: ");
            String destination = scanner.nextLine();
            System.out.print("Enter start date (YYYY-MM-DD): ");
            String startDate = scanner.nextLine();
            System.out.print("Enter end date (YYYY-MM-DD): ");
            String endDate = scanner.nextLine();
            System.out.print("Enter preferences (e.g., activities, budget): ");
            String preferences = scanner.nextLine();

            Itinerary itinerary = new Itinerary(destination, startDate, endDate, preferences);
            itineraries.add(itinerary);

            System.out.println("\n--- Your Itinerary ---");
            for (Itinerary it : itineraries) {
                System.out.println(it);
                System.out.println();
            }

            System.out.print("Would you like to add another itinerary? (yes/no): ");
            cont = scanner.nextLine();
        } while (cont.equalsIgnoreCase("yes"));

        scanner.close();
        System.out.println("Thank you for using the Travel Itinerary Planner!");
    }
}