class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, HashSet<Integer>> hs = new HashMap<Integer, HashSet<Integer>>();
        int len = nums.length;

        for(int i=0; i<=len-k; i++) {
            for(int j=0; j<k; j++) {
                hs.putIfAbsent(nums[j + i], new HashSet<Integer>());
                hs.get(nums[j+i]).add(i);
            }
        }

        int max = -1;
        for(Integer i: hs.keySet()) {
            if(hs.get(i).size() == 1) {
                max = Math.max(max, i);
            }
        }

        return max;
    }
}