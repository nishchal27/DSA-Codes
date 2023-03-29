//https://course.acciojob.com/idle?question=01f5cb94-1ae6-44dc-a1ca-57edb8bcb0bf
//Odd Number Pyramid
package Gym;
import java.util.*;

public class oddNumPyramid {
    public static void main(String[] args) throws Throwable {

        Scanner cs = new Scanner(System.in);
        // System.out.println("Enter the row size:");

        int row_size = cs.nextInt();
        cs.close();
        printPattern(row_size);
    }

    public static void printPattern(int rowSize) {
		int num = 1;
               for(int j = 0; j < rowSize; j++) {
          for(int i = rowSize - 1; i > j; i--) {
              System.out.print(" ");
          }
          for(int i = 0; i < num; i++) {
              System.out.print(num);
          }
          num += 2;
          System.out.println();
       }
    }
}
