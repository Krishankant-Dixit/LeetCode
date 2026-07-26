class Solution {

    public boolean isPowerOfThree(int n) {

        // Base Case 1
        if (n == 1) {
            return true;
        }

        // Base Case 2
        if (n <= 0 || n % 3 != 0) {
            return false;
        }

        // Recursive Call
        return isPowerOfThree(n / 3);
    }
}