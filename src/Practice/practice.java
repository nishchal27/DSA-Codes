package Practice;

import java.util.*;
import java.lang.*;
import java.io.*;

class Vehicle {
    void print_V() {
        System.out.print("Vehicle class ");
    }
}

class Car extends Vehicle {
    void print_C() {
        System.out.print("Car class ");
    }

    public class practice {

        public static void main(String[] args) {
            Car obj1 = new Car();
            obj1.print_C();
            obj1.print_V();
        }
    }
}
