class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // left side non-alphanumeric skip
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // right side non-alphanumeric skip
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // lowercase compare
            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            if (l != r) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}