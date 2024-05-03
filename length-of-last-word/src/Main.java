// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String toString(char[] a) {
        String string = new String(a);
        return string;
    }
    private String filterLastChar(String s) {
        char[] sArray = s.toCharArray();
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[sArray.length-1] == ' ') {
                s = toString(sArray);
                s = s.substring(0, s.length()-1);
                sArray = s.toCharArray();
            }
        }
        return s;
    }
    public int lengthOfLastWord(String s) {
        String filteredS = filterLastChar(s);
        int counter = 0;
        char[] arrayFilteredS = filteredS.toCharArray();
        for (int i = arrayFilteredS.length; i > 0; i--) {
            if (arrayFilteredS[i-1] == ' ') {
                break;
            }
            counter += 1;
        }
        return counter;
    }

    public static void main(String[] args) {
        String s = "Faris Ahmad Adli    ";
        Main main = new Main();
        int lengthOfLastWord = main.lengthOfLastWord(s);
        System.out.println(lengthOfLastWord);
    }
}