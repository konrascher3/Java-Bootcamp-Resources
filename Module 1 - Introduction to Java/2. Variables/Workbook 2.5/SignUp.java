import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("Please enter your first name: ");
        String firstName = scan.nextLine();

        //Ask for their last name.
        System.out.println("Please enter your last name: ");
        String lastName = scan.nextLine();

        //Ask: how old are you?
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Please enter your username: ");
        String userName = scan.nextLine();

        //Ask what city they live in.
        System.out.println("Please enter the city you live in: ");
        String city = scan.nextLine();

        //Ask what country that's from.
        System.out.println("Please enter the country you live in: ");
        String country = scan.nextLine();

        //Task 2 - Print their information.
        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:
        System.out.println(
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Username: " + userName + "\n" +
                "City: " + city + "\n" +
                "Country: " + country
                );

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D !
        scan.close();
    }
}
