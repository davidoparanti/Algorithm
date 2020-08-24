public class IsPalindrome {
    static boolean isPalindrome (String str) {
        // base case #1
        if(str.length() == 0 || str.length() == 1) return true;

        // base case #2
        if(str.charAt(0) != str.charAt(str.length() -1 )) return false;

        // recursive case

        return isPalindrome(str.substring(1, str.length() -1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("goosog"));
    }

}
