// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int a = 3, b = 2;
        for (int i = 0; i < n-3; i++) {
            a = a+b;
            b = a-b;
        }
        return a;
    }
    public static void main(String[] args) {
        int n = 5;
        Main main = new Main();
        int climbStairs = main.climbStairs(n);
        System.out.println(climbStairs);
    }
}