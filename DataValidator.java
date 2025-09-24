import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DataValidator {
    public static void main(String[] args) {
        Set<String> approvedUsers = new HashSet<>(Arrays.asList("s@test.com", "p@test.com", "k@test.com"));
        HashSet<String> items = new HashSet<>(Arrays.asList("userBob", "userKali", "userAlice"));

        System.out.println("The current users list includes: " + items);

        boolean wasAdded = items.add("UserBob");

        System.out.println("Trying to add 'UserBob' to the list. Was it added? " + wasAdded);
    }
}