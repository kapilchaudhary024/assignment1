package assignment1;

import java.util.Scanner;
public class Gravity {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double time = obj.nextDouble();
        double GRAVITY = 9.8;
        double speed = GRAVITY * time;
        double distance = (GRAVITY * time * time) / 2;
        System.out.println("The speed of the object at "+ time +" " +
                "seconds after its release is "+ speed +" " +
                "and the distance the object has travelled in the "+ time +
                " seconds after the relase is "+ distance);
    }
}
