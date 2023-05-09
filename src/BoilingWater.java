import java.util.Scanner;
public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than 212: ");
        int temp = scanner.nextInt();
        if ( temp >= 212) {
            System.out.println("The water is boiling!");
        }
    }
}
