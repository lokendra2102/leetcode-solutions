class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        while(true) {
            int localTemp = 0;
            while(n != 0) {
                localTemp += (int) (Math.pow(n%10, 2));
                n /= 10;
            }
            n = localTemp;
            if(hs.contains(n)) break;
            hs.add(n);
        }

        return n == 1 ? true : hs.contains(n) ? false : true;
    }
}