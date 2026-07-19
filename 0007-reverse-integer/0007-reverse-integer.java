class Solution {
    public int reverse(int x) {
        int rev_N = 0;
        
        while(x != 0){
            int last_D = x % 10;
            x = x / 10;

            // OVERFLOW CHECK FOR MAX
            if(rev_N > Integer.MAX_VALUE/10 || rev_N == Integer.MAX_VALUE/10 && last_D > 7){
                return 0;
            }

            // OVERFLOW CHECK FOR MAX

            if(rev_N < Integer.MIN_VALUE/10 || rev_N == Integer.MIN_VALUE/10 && last_D < -8){
                return 0;
            }

            rev_N = (rev_N * 10) + last_D;
        }
        return rev_N;
    }
}