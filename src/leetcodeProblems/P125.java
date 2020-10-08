package leetcodeProblems;

public class P125 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {


        StringBuilder builder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                builder.append(Character.toLowerCase(c));
            }

        }
        String s2 = builder.toString();
        String s1 = builder.reverse().toString();

        return s1.equals(s2) ? true : false;
    }
}
