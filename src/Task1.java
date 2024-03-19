import java.util.Scanner;
import java.time.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = LocalDate.now().getDayOfWeek().name();

        int age = getAge(scanner);
        String city = getCity(scanner);
        int discount = ticketDiscount(age, city, dayOfWeek);
        int basicPrice = ticketPrice(age, city, dayOfWeek);


        System.out.println("Data: " + city + ", " + age + " years old, " + dayOfWeek);
        System.out.println("Ticket price: " + basicPrice + " PLN");
        System.out.println("Discount: " + discount + "%");


    }

    public static int ticketDiscount(int age, String city, String dayOfWeek) {
        int discount = 0;
        if (age <= 10) {
            discount = 100;
        } else if (age < 18 && city.equalsIgnoreCase("Warszawa")) {
            discount = 60;
        } else if (age < 18) {
            discount = 50;
        } else if (dayOfWeek.equals("THURSDAY")) {
            discount = 100;
        }
        return discount;
    }

    public static int ticketPrice(int age, String city, String dayOfWeek) {
        int basicPrice = 40;
        if (age <= 10) {
            basicPrice = 0;
        } else if (age < 18 && city.equalsIgnoreCase("Warszawa")) {
            basicPrice = 18;
        } else if (age < 18) {
            basicPrice = 20;
        } else if (dayOfWeek.equals("THURSDAY")) {
            basicPrice = 0;
        }
        return basicPrice;
    }

    public static String getCity(Scanner scanner) {
        System.out.println("Where are you from?");
        return scanner.next();
    }

    public static int getAge(Scanner scanner) {
        System.out.println("What is your age?");
        return scanner.nextInt();
    }
}
