import java.util.Scanner;

public class Main {

    static Scanner temp = new Scanner(System.in);

     static void main(String[] args) {

        ask();

        System.out.println("see ya!");
    }

    static void celcius(double a) {
        double celcius = ((a - 32) * 5) / 9;
        displayOutput(a, celcius);
    }

    static void ask() {
        double fahrenheit = 0;
        while (fahrenheit >= -460) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            fahrenheit = temp.nextDouble();
            celcius(fahrenheit);
        }
    }

    static void displayOutput(double f,double c) {
      System.out.println(f + " degrees Fahrenheit = " + c + " degrees Celcius");
    }
}