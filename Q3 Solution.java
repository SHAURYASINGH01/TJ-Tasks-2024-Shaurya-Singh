import java.util.Arrays;
public class Quesno-3 {
    public static int[] searchRange(int[] nums, int target) {
         //write your code here
        int leftIndex = binarySearch(nums, target, true);
        int rightIndex = binarySearch(nums,target, false);
      
        return new int[]{leftIndex, rightIndex};
    }
    private static int binarySearch(int[] nums, int target, boolean findLeft) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                if (findLeft) {
                    if (mid == 0 || nums[mid - 1] < target) {
                        return mid;
                    }
                    right = mid - 1;
                } else {
                    if (mid == nums.length - 1 || nums[mid + 1] > target) {
                        return mid;
                    }
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}
