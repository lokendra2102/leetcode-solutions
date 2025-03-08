class Solution {
    public int largestInteger(int[] nums, int k) {
        int len = nums.length;

        if(k >= len) {
            Arrays.sort(nums);
            return nums[len-1];
        }

        int[] arr = new int[51];
        for(int i=0; i<=len-k; i++) {
            for(int j=i; j<i+k; j++) {
                arr[nums[j]]++;
            }
        }

        int max = -1;
        for(int i=0; i<51; i++) {
            if(arr[i] == 1) max = Math.max(max, i);
        }

        return max;
    }
}