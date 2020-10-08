package leetcodeProblems;

public class P9 {

    public boolean isPalindrome(int number) {

        int output = 0;
        int backup = number;
        while (number != 0) {
            output = output * 10 + number % 10;
            number = number / 10;
        }
        String string = "saa";

        string.toLowerCase();

        return output == backup ? true : false;
    }
}
