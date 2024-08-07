public class FindNearest {

//    5) Find nearest element from a given array ( All elements in array are in ascending order)
//     (Ex: numArray[] = {1,5,7,44,55,66} numberToSearch :61  output =66 is nearest element


    public static int findNearestUsingLoop(int[] nums, int key) {
        int n = nums.length;

        int minDistance = Integer.MAX_VALUE;
        int closet = nums[0];

        for (int num : nums) {
            int distance = Math.abs(num - key);
            if (distance < minDistance) {
                minDistance = distance;
                closet = num;
            }
        }
        return closet;
    }

    public static int findNearestUsingBinarySearch(int[] nums, int key) {
        int n = nums.length;
        int index = upperBoundSearch(nums, key);

        if (index == 0) {
            return nums[0];
        }
        if (index == n) {
            return nums[index - 1];
        }

        int minDistance = nums[index] - key;
        if (key - nums[index - 1] < minDistance) {
            return nums[index - 1];
        }
        return nums[index];
    }

    private static int upperBoundSearch(int[] nums, int key) {
        int n = nums.length;
        int left = 0, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= key) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,7,44,55,66};
        System.out.println(findNearestUsingLoop(nums, 61));
        System.out.println(findNearestUsingBinarySearch(nums, 60));
    }
}
