class Reverse {
    public static void main(String[] args) {

        int num = 1234;   // Input number
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;      // Get last digit
            reverse = reverse * 10 + digit;  // Add digit to reverse
            num = num / 10;            // Remove last digit
        }

        System.out.println("Reversed number is: " + reverse);
    }
}