package CollectionFrameworks.Set;
import java.util.*;

public class TreeSetImplementaion {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(24);
        set.add(65);

        System.out.println(set);

        //contains check if a given element is present or not, return true or false
        System.out.println(set.contains(100));
    }
}
