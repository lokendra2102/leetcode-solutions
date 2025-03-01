class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length, j=0;
        int[] res = new int[len];
        
        for(int i=0; i<len-1; i++) {
            if(nums[i] == nums[i+1]) {
                nums[i] = 2 * nums[i];
                nums[i+1] = 0;
            }

            if(nums[i] != 0) res[j++] = nums[i];
            if(i == len-2 && nums[i+1] != 0) res[j++] = nums[i+1];
        }

        return res;
    }
}