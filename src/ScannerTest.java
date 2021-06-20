import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner s1 = new Scanner(System.in);
        int number = s1.nextInt();
        System.out.println("Number is: " + number);

        System.out.println("Please enter your name");
        Scanner s2 = new Scanner(System.in);
        String name = s2.next();
        System.out.println("Your name is: " + name);
    }
}
