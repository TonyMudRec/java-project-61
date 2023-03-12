package hexlet.code;

import java.util.Scanner;

public class App {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to the Brain Games!");
        Thread.sleep(1000);
        System.out.println("May I have your name?");
        String name = s.next().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println();
        System.out.println("Hello, " + name + "!");
        s.close();
    }

}