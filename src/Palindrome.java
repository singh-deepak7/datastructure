public class Palindrome {
    public static void main(String[] args) {
        String input = "a";
        int left = 0;
        int right = input.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
    }

}
