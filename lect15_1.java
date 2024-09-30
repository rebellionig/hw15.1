package banat1.tect_10__17.hw10_17.hw15_1;

import java.util.ArrayList;
import java.util.List;

public class lect15_1 {
    public static void main(String[] args) {
        List<StaffMember> staff = new ArrayList<>();
        staff.add(new StaffMember("Alice", 30));
        staff.add(new StaffMember("Bob", 25));
        staff.add(new StaffMember("Charlie", 35));
        staff.add(new StaffMember("David", 22));

        // Filter staff by minimum age
        List<StaffMember> filteredStaff = StaffMember.filterByMinAge(staff, 28);
        System.out.println("Staff members aged 28 or older:");
        for (StaffMember member : filteredStaff) {
            System.out.println(member.getName());
        }

        // Check average age
        boolean averageCheck = StaffMember.isAverageAgeHigher(staff, 27);
        System.out.println("Is the average age higher than 27? " + (averageCheck ? "Yes" : "No"));

        // Find the youngest staff member
        StaffMember youngest = StaffMember.findYoungestMember(staff);
        if (youngest != null) {
            System.out.println("The youngest staff member is: " + youngest.getName() + ", Age: " + youngest.getAge());
        }
    }
}
