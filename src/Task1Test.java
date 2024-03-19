import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static junit.framework.Assert.assertEquals;


class Task1Test {
    /*
        @Test
        void getCity() {
            Scanner scanner = new Scanner(System.in);

            String city = Task1.getCity(scanner);

            assertEquals("Wszawa", city);
        }

        /*@Test
        void getAge(){
            Scanner scanner = new Scanner(System.in);

            int age = Task1.getAge(scanner);

            assertEquals(14, scanner);
        }
    */
    @Test
    public void testTicketDiscount() {
        assertEquals(100, Task1.ticketDiscount(5, "Warszawa", "MONDAY"));

        assertEquals(50, Task1.ticketDiscount(13, "Kraków", "MONDAY"));

        assertEquals(60, Task1.ticketDiscount(17, "Warszawa", "MONDAY"));

        assertEquals(100, Task1.ticketDiscount(19, "Warszawa", "THURSDAY"));

        assertEquals(0, Task1.ticketDiscount(43, "Kraków", "MONDAY"));
    }

    @Test
    public void testTicketPrice() {
        assertEquals(0, Task1.ticketPrice(5, "Warszawa", "MONDAY"));

        assertEquals(20, Task1.ticketPrice(15, "Kraków", "MONDAY"));

        assertEquals(18, Task1.ticketPrice(16, "Warszawa", "MONDAY"));

        assertEquals(0, Task1.ticketPrice(25, "Warszawa", "THURSDAY"));

        assertEquals(40, Task1.ticketPrice(29, "Szczecin", "SUNDAY"));
    }
}