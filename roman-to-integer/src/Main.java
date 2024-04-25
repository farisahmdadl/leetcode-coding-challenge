// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public int convert(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default :
                return 0;
        }
    }
    public int romanToInt(String s) {
        int sum = 0;
        int currentValue = convert(s.charAt(0));
        for (int i = 1; i < s.length(); i++){
            int nextValue = convert(s.charAt(i));
            if (currentValue < nextValue){
                sum -= currentValue;
            } else {
                sum += currentValue;
            }
            currentValue = nextValue;
        }
        sum += currentValue;
        return sum;
    }

    public static void main(String[] args) {
        String roman = "XCIV";
        Main main = new Main();
        int romanToInt = main.romanToInt(roman);
        System.out.println(romanToInt);
    }
}