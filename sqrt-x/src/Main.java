// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public int mySqrt(int x) {
        long left = 0, right = (x/2)+1;
        while (left < right) {
            long mid = left + (right - left) / 2 + 1;
            long square = mid * mid;

            if (square == x){
                return (int) mid;
            } else if (square < x) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return (int)left;
    }
    public static void main(String[] args) {
        int x = 17;
        Main main = new Main();
        int mySqrt = main.mySqrt(x);
        System.out.println(mySqrt);
    }
}