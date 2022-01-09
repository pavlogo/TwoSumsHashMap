import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {

    static int[] nums = new int[]{2, 7, 11, 15, 55};
    static int target = 70;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum()));
    }

    public static int[] twoSum() {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if (myHashMap.containsKey(sum)) {
                return new int[]{myHashMap.get(sum), i};
            }
            myHashMap.put(nums[i], i);
        }
        return null;
    }
}
