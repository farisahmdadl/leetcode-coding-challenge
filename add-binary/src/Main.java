// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;

        while (aLength >= 0 || bLength >= 0) {
            int sum = carry;
            if (aLength >= 0) sum += a.charAt(aLength) - '0';
            if (bLength >= 0) sum += b.charAt(bLength) - '0';
            stringBuilder.append(sum % 2);
            carry = sum / 2;

            aLength--;
            bLength--;
        }
        if(carry != 0) stringBuilder.append(carry);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        Main main = new Main();
        String addBinary = main.addBinary(a, b);
        System.out.println(addBinary);
    }
}