import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Enter password length (between 6 and 20): ");
        int length = scanner.nextInt();
        if (length < 6 || length > 20) {
            System.out.println("Error! Password length must be between 6 and 20 characters.");
            return;
        }


        System.out.print("Include uppercase letters? (yes/no): ");
        boolean useUppercase = scanner.next().equalsIgnoreCase("yes");уee

        System.out.print("Include numbers? (yes/no): ");
        boolean useNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean useSpecial = scanner.next().equalsIgnoreCase("yes");

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special = "!@#$%^&*()-_=+[]{};:,.<>?/";


        String allowedChars = lowercase;
        if (useUppercase) allowedChars += uppercase;
        if (useNumbers) allowedChars += numbers;
        if (useSpecial) allowedChars += special;


        if (allowedChars.isEmpty()) {
            System.out.println("Error! No character types selected.");
            return;
        }


        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allowedChars.length());
            password.append(allowedChars.charAt(index));
        }

        System.out.println("Generated password: " + password.toString());

        scanner.close();
    }
}
