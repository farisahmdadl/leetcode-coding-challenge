import java.util.Arrays;
public class Main {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9,9,9};
        Main main = new Main();
        int[] plusOne = main.plusOne(digits);
        System.out.println(Arrays.toString(plusOne));
    }
}