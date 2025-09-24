import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserManagement {
    private static Set<String> approvedUsers = new HashSet<>(Arrays.asList("d@test.com", "b@test.com", "k@test.com"));
    public static void main(String[] args) {
        System.out.println("Approved users are --> " + approvedUsers);
        removeUsers();
        System.out.println("All users were removed --> " + approvedUsers);
    }
    private static void removeUsers() {
        approvedUsers.removeAll(approvedUsers);
    }
}