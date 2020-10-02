package leetcodeProblems;

public class P9 {

    public boolean isPalindrome(int x) {

        String in = x + "";

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < in.length(); i++) {
            builder.append(in.charAt((in.length() - 1) - i));
        }

        return in.equals(builder.toString()) ? true : false;
    }
}
