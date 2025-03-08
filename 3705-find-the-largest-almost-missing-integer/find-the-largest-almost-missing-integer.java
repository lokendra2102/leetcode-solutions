class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        int len = nums.length;

        if(k >= len) {
            Arrays.sort(nums);
            return nums[len-1];
        }

        for(int i=0; i<=len-k; i++) {
            for(int j=i; j<i+k; j++) {
                hs.putIfAbsent(nums[j], 0);
                hs.put(nums[j], hs.get(nums[j]) + 1);
            }
        }

        int max = -1;
        for(Integer i: hs.keySet()) {
            if(hs.get(i) == 1) {
                max = Math.max(max, i);
            }
        }

        return max;
    }
}