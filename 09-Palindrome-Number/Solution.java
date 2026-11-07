class Solution {
    public boolean isPalindrome(int x) {

        int a = x;
        int b = 0, c;

        while (x > 0) {
            c = x % 10;
            b = b * 10 + c;
            x = x / 10;
        }

        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
