package junktrials;

public class ReverseDigit {

    public static void main(String[] args) {

        System.out.println(reverseDisgit(1234));
    }

    public static int reverseDisgit(int number) {

        int output = 0;
        while (number != 0) {
            output = output * 10 + number % 10;
            number = number/10;
        }

        return output;
    }
}
