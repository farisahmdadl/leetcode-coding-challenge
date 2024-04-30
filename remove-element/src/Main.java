// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        Main main = new Main();
        int removeElement = main.removeElement(nums, val);
        System.out.println(removeElement);
        System.out.println(removeElement);
    }
}