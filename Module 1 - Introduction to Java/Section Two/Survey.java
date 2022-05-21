// Import Scanner from the util-library
import java.util.Scanner;
import java.util.Locale;

public class Survey {

    public static void main(String[] args) {

        System.out.println("Welcome! Thank you for taking the survey!");

        // Instantiate a new scanner that listens for user-input
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("What is your name?");

        // Java waits for the user to input a string
        String name = scan.nextLine();

        System.out.println("How old are you?");

        // Java waits for the user to input a number
        int age = scan.nextInt();

        System.out.println("How much do you spend on coffee?");

        // Java waits for the user to input a double
        double coffeePrice = scan.nextDouble();

        System.out.println(name + ", you are " + age + " years old!");
        System.out.println("You spend $" + coffeePrice + " on coffee.");

        // After using the scanner, it should be closed. Keeping it
        // open is a memory leak!
        scan.close();

    }
}


