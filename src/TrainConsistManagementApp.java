import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Current Bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the consist.");
        }

        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        System.out.println("Adding duplicate ID: BG101");
        boolean isAdded = bogieIds.add("BG101");

        if (!isAdded) {
            System.out.println("Duplicate Bogie ID detected! Registration failed for: BG101");
        }

        System.out.println("Unique Bogie IDs in System: " + bogieIds);
        System.out.println("Total Unique Bogies: " + bogieIds.size());
        System.out.println("Final Consist: " + passengerBogies);
    }
}
