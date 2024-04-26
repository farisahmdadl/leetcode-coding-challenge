import java.util.Arrays;

public class Main {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String firstPrefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            System.out.println(firstPrefix);
            System.out.println(strs[i].indexOf(firstPrefix));
            while (strs[i].indexOf(firstPrefix) != 0) {
                firstPrefix = firstPrefix.substring(0, firstPrefix.length()-1);
                System.out.println(firstPrefix);
            }
        }
        return firstPrefix;
    }
    public static void main(String[] args) {
        String [] arrayString = {"flower","flow","flight"};
        Main main = new Main();
        String longestCommonPrefix = main.longestCommonPrefix(arrayString);
        System.out.println(longestCommonPrefix);
    }
}