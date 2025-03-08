class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        HashSet<Integer> hs = new HashSet<Integer>();
        while(temp != 1) {
            int localTemp = 0;
            while(n != 0) {
                localTemp += (int) (Math.pow(n%10, 2));
                n /= 10;
            }
            if(hs.contains(localTemp)) return false;
            hs.add(localTemp);
            // System.out.println(localTemp + " :: " + temp + " :: " + n);
            temp = localTemp;
            n = localTemp;
            localTemp = 0;
        }

        return true;
    }
}