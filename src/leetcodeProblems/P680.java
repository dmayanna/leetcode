package leetcodeProblems;

public class P680 {

    public static void main(String[] args) {
        System.out.println(validPalindrome("pidbliassaqozokmtgahluruufwbjdtayuhbxwoicviygilgzduudzgligyviciowxbhuyatdjbwfuurulhagtmkozoqassailbdip"));
    }

    public static boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;

    }

    private static boolean isPalindrome(String s, int i, int j) {

        while (i < j) {
            if (s.charAt(i++) != s.charAt((j--))) {
                return false;
            }
        }
        return true;
    }


}
