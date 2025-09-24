import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductTagger {
    public static void main(String[] args) {

        HashSet<String> SetA = new HashSet<>(Arrays.asList("Laptop", "TV"));
        HashSet<String> SetB = new HashSet<>(Arrays.asList("Laptop", "TV", "New"));
        System.out.println("All sets: nA: " + SetA + "B: " + SetB);

        Set<String> checker = new HashSet<>(SetB);

        checker.retainAll(SetA);
        System.out.println(checker);

        if (checker.equals(SetA)) {
            System.out.println("true");
        } else System.out.println("false");
    }
}