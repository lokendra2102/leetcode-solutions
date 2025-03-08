class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len = blocks.length();
        int i = 0, j = -1, minop = Integer.MAX_VALUE, currop = 0;

        while(++j < len) {
            if(blocks.charAt(j) == 'W') currop++;
            if(j - i + 1 == k) {
                minop = Math.min(minop, currop);
                currop = Math.max(0, blocks.charAt(i++) == 'W' ? currop-1 : currop);
            }
        }

        return minop == Integer.MAX_VALUE ? 0 : minop;
    }
}