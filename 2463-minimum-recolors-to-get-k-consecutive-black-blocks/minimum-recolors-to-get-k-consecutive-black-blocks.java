class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len = blocks.length();
        int i=0, j=0;
        int minop = Integer.MAX_VALUE;
        int currop = 0;
        int consec = 0;

        while(j < len) {
            if(blocks.charAt(j) == 'W') {
                if(consec >= k) return 0;
                currop++;
                consec = 0;
            }
            if(blocks.charAt(j) == 'B') consec++;
            if(j - i + 1 == k) {
                // System.out.println("BEFORE :: " + minop + " ::: " + currop + " :: " + blocks.substring(i, j+1));
                minop = Math.min(minop, currop);
                currop = Math.max(0, blocks.charAt(i) == 'W' ? currop-1 : currop);
                // System.out.println("AFTER :: " + minop + " ::: " + currop + " :: " + blocks.charAt(i) + " :: " + i + " :: " + j + "\n");
                i++;
            }
            j++;
        }

        return minop == Integer.MAX_VALUE ? 0 : minop;
    }
}