class Solution {
    public boolean isPalindrome(int n) {

        if(n < 0){
            return false;
        }
        int dupl = n;
        int rev_N = 0;

        while (n != 0) {

            int last_D = n % 10;
            n = n / 10;

            rev_N = (rev_N * 10) + last_D;
        }

        return rev_N == dupl;
    }
}