// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reversed_int = 0;
        while(x > reversed_int) {
            int pop = x % 10;
            System.out.println(pop);
            x /= 10;

            reversed_int = (reversed_int * 10) + pop;
        }

        if (x == reversed_int || x == reversed_int / 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 1234321;
        Main main = new Main();
        boolean palindrome = main.isPalindrome(number);
        System.out.println(palindrome);
    }
}