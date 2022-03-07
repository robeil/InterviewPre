package InterviewPre.EasyLevel;

import java.util.Arrays;

public class FirstDay {
    //sum of two number
    public int[] twoSum(int[] nums, int target){

        int[] addNum = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target) {
                    int second = i;
                    int first = j;
                    addNum[0] = first;
                    addNum[1] = second;
                }
            }
        }
        return addNum;
    }

    public static void main(String[] args) {
        FirstDay fd = new FirstDay();

        int[] nums = {2,5,7,11,15};
        int[] newArr = fd.twoSum(nums,17);

        System.out.println(Arrays.toString(newArr));
    }
}
