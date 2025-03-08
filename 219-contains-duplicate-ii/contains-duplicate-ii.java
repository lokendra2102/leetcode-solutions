class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, HashSet<Integer>> hs = new HashMap<Integer, HashSet<Integer>>();
        int len = nums.length;

        for(int i=0; i<len; i++) {
            hs.putIfAbsent(nums[i], new HashSet<Integer>());
            if(hs.get(nums[i]).size() > 0) {
                for(Integer in: hs.get(nums[i])) {
                    if(Math.abs(in - i) <= k) return true;
                }
            }
            hs.get(nums[i]).add(i);
        }

        return false;
    }
}