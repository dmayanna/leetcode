package junktrials;


import java.util.Arrays;

public class J5 {

    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder();


    }

    public boolean isAnagram(String s, String t) {

        if (t.length() != s.length())
            return false;

        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars1[i]) {
                return false;
            }
        }

        return true;


    }

}
