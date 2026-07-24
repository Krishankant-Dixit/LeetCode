class Solution {

    public void reverseString(char[] s) {

        reverse(s, 0, s.length - 1);

    }

    public void reverse(char[] s, int left, int right) {

        // Base Case
        if (left >= right) {
            return;
        }

        // Swap
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        // Recursive Call
        reverse(s, left + 1, right - 1);
    }
}