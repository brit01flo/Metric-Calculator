import java.util.Scanner;

public class MetricCalculator {
   public static void main(String[] args) {

       // Set up a scanner to get user input
       Scanner input = new Scanner(System.in);

       // Prompt the user to choose a conversion option
       System.out.println("Which conversion would you like to do?");
       System.out.println("1. Feet to meters");
       System.out.println("2. Pounds to kilograms");
       System.out.println("3. Celsius to Fahrenheit");

       int option = input.nextInt();

       // Switch statement to handle the chosen option
       switch (option) {
           case 1: // feet to meters
               System.out.println("Enter the number of feet:");
               double feet = input.nextDouble();
               double meters = feet * 0.3048;
               System.out.println(feet + " feet is equal to " + meters + " meters.");
               break;

           case 2: // pounds to kilograms
               System.out.println("Enter the number of pounds:");
               double pounds = input.nextDouble();
               double kilograms = pounds * 0.45359237;
               System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
               break;

           case 3: // Celsius to Fahrenheit
               System.out.println("Enter the temperature in Celsius:");
               double celsius = input.nextDouble();
               double fahrenheit = celsius * 1.8 + 32;
               System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
               break;

           default:
               System.out.println("Invalid option selected.");
               break;
       }

       // Close the scanner
       input.close();
   }
}