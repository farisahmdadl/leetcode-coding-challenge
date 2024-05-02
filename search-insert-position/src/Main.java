// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public int searchInsert(int[] nums, int target) {
        int counter = 0;
        int lastValue = nums.length - 1;

        while (counter <= lastValue) {
            int middle = (counter + lastValue) / 2;
            if (nums[middle] == target){
                return middle;
            } else if (nums[middle] > target) {
                lastValue = middle - 1;
            } else  {
                counter = middle + 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] nums = {2,4,6,8};
        int target = 7;
        Main main = new Main();
        int searchInsert = main.searchInsert(nums,target);
        System.out.println(searchInsert);
    }
}