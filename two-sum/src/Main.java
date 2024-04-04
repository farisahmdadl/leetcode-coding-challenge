import java.util.Arrays;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                int value = target - nums[i];
                if (nums[j] == value) {
                    return new int [] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("Can't find the right numbers!");
    }

    public static void main(String[] args) {
        int [] setNumbers = {2,3,5,7,11,15};
        int setTarget = 12;
        Main main = new Main();
        int [] twoSum = main.twoSum(setNumbers,setTarget);
        System.out.println(Arrays.toString(twoSum));
    }
}