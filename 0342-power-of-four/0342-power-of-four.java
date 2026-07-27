class Solution {

    public boolean isPowerOfFour(int n) {

        // Base Case 1
        if (n == 1) {
            return true;
        }

        // Base Case 2
        if (n <= 0 || n % 4 != 0) {
            return false;
        }

        // Recursive Call
        return isPowerOfFour(n / 4);
    }
}