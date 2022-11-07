package CollectionFrameworks;

import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        int arr[] = {1,5,6,5,1,3};
        // Creating a map using the HashMap
        Map<Integer, Boolean> numbers = new HashMap<>();

        // Insert elements to the map
        for(int i=0; i<6; i++){
            numbers.put(arr[i], true);
        }
        System.out.println("Map: " + numbers);
    }
}
