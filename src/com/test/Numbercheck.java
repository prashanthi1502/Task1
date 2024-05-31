import java.util.Scanner;
public class Numbercheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println("it is positive ");
        } else if (number < 0) {
            System.out.println("it is negative ");
        } else {
            System.out.println("it is zero ");
        }
        scanner.close();
    }
}