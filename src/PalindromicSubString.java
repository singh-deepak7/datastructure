public class PalindromicSubString {
    public static void main(String[] args) {
        String input = "abcc";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String temp = input.substring(i, j + 1);
                if (isPalindrome(temp)) {
                    System.out.println(temp);
                }
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;

    }

}
