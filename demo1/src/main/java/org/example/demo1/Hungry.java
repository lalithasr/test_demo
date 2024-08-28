package src.main.java.org.example.demo1;

import java.util.Scanner;

public class Hungry {
    String stomach;
    public void eat() {
        if (stomach == "full") {
            System.out.println("I am full");

        } else {
            System.out.println("I am hungry");
        }
    }

    public void refrigirator() {
        if(stomach == "full") {
            System.out.println("Come back when you are hungry");
        } else {
            System.out.println("Grab your your food from refrigirator");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your stomach status: ");
        String status = sc.nextLine();
        Hungry h = new Hungry();
        h.eat();
        h.refrigirator();
    }
}
