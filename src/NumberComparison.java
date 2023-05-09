import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int a = scanner.nextInt();
        System.out.println("Please enter a second number:");
        int b = scanner.nextInt();
        if (a == b) {
            System.out.println("Numbers are the same.");
        } else if (a > b) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first.");
        }
    }
}
