import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
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
    }
}
