class Solution {
    public int numberOfAlternatingGroups(int[] colors, int t) {
        int len = colors.length;
        int[] rearr = new int[len + t -1];

        int start = -1;
        for(int i=0; i<len-1; i++) {
            if(colors[i] == colors[i+1]) {
                start = i+1;
                break;
            }
        }

        int k=0;
        if(start != -1) {
            for(int i=start; i<len; i++) {
                rearr[k++] = colors[i];
            }
            for(int i=0; i<start; i++) {
                rearr[k++] = colors[i];
            }
        }else{
            System.arraycopy(colors, 0, rearr, 0, len);
        }

        System.arraycopy(rearr, 0, rearr, len, t-1);
        int i=0, j=0;
        int count = 0;
        int curr = 0;

        while(j < len+t-1) {
            if(j == 0 || (rearr[j] != rearr[j-1])) {
                curr++;
            }else{
                curr = 1;
            }

            if(j-i+1 == t) {
                if(curr == t) {
                    count++;
                    curr -= 1;
                }
                i++;
            }
            j++;
        }

        return count;
    }
}