package CollectionFrameworks.Set;

import java.util.*;

public class LinkedHashSetImplement {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(24);
        set.add(65);

        System.out.println(set);

        // contains check if a given element is present or not, return true or false
        System.out.println(set.contains(100));

        int index = 5;
        int currIndex = 0;
        Integer CurrentElement = null;

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            CurrentElement = it.next();
            if (currIndex == index - 1) {
                System.out.println("Element at index "
                        + index + " is : "
                        + CurrentElement);
                break;
            }
            currIndex++;
        }

    }
}
