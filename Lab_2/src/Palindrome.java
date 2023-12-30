public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " is Palindrome?  --> " + isPalindrome(s));
        }
    }


    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }


    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
