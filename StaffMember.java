package banat1.tect_10__17.hw10_17.hw15_1;

import java.util.ArrayList;
import java.util.List;

public class StaffMember {
    private String name;
    private int age;

    public StaffMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<StaffMember> filterByMinAge(List<StaffMember> staffMembers, int minAge) {
        List<StaffMember> filtered = new ArrayList<>();
        for (StaffMember member : staffMembers) {
            if (member.getAge() >= minAge) {
                filtered.add(member);
            }
        }
        return filtered;
    }

    public static boolean isAverageAgeHigher(List<StaffMember> staffMembers, double minAverageAge) {
        if (staffMembers.isEmpty()) {
            return false; // Avoid division by zero
        }
        double totalAge = 0;
        for (StaffMember member : staffMembers) {
            totalAge += member.getAge();
        }
        double averageAge = totalAge / staffMembers.size();
        return averageAge > minAverageAge;
    }

    public static StaffMember findYoungestMember(List<StaffMember> staffMembers) {
        if (staffMembers.isEmpty()) {
            return null; // Handle empty list case
        }
        StaffMember youngest = staffMembers.get(0);
        for (StaffMember member : staffMembers) {
            if (member.getAge() < youngest.getAge()) {
                youngest = member;
            }
        }
        return youngest;
    }
}
