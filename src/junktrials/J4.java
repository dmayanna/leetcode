package junktrials;

public class J4 {

    public static void main(String[] args) {

        String a = "hellolladdll";

        System.out.println(a.contains("ll"));

        System.out.println(a.indexOf("Z"));


        if (a.substring(2, 4).equals("ll")) {
            System.out.println("True");
        }
    }
}
