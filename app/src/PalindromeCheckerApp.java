public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String original = "madam";
        String reversed = "";

        // Logic to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Print the result based on the comparison
        if (original.equals(reversed)) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is NOT a palindrome.");
        }
    }
}