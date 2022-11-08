package CollectionFrameworks;
import java.util.*;

public class ArrayLists {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);

        System.out.println(list);

        list.add(0,50);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(130);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(1));

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println("iterator" + it.next());
        }
    }
}
