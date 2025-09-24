import java.util.HashSet;
import java.util.Arrays;
import java.util.List;

public class EventSecurity {
    private HashSet<String> vipList = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie"));
    public boolean containsNonVip(List<String> attendees) {
        for (String d : attendees) {
            if (vipList.contains(d))
                return false;// Your code here. Iterate through the attendees and check against the vipList.
        }
        return true; // Placeholder
    }
    public static void main(String[] args) {
        EventSecurity ob = new EventSecurity();
        System.out.println(ob.containsNonVip(Arrays.asList("Ali", "khalid", "ghost")));
    }
}