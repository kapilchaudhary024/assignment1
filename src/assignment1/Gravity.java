package assignment1;

import java.util.Scanner;
public class Gravity {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double time = obj.nextDouble();
        double GRAVITY = 9.8;
        double speed = GRAVITY * time;
        double distance = (GRAVITY * time * time) / 2;
    }
}
