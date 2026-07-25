class Solution {

    public boolean isPowerOfTwo(int n) {

        // Base Case 1
        if (n == 1) {
            return true;
        }

        // Base Case 2
        if (n <= 0 || n % 2 != 0) {
            return false;
        }

        // Recursive Call
        return isPowerOfTwo(n / 2);
    }
}