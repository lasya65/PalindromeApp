import java.util.* ;

public class UC2Palindrome {

    static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        // REQUIRED LOOP (checks only till half of string)
        for (int i = 0; i < input.length() / 2; i++) {

            char startChar = input.charAt(i);
            char endChar = input.charAt(input.length() - 1 - i);

            if (startChar != endChar) {
                isPalindrome = false;
                break;   // exit loop immediately if mismatch found
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();


    }
}