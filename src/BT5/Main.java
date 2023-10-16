package BT5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String str = "Rekkei Academy để nông dân biết code";
        String[] strSplit = str.split(" ");

        List<String> list = new ArrayList<String>(Arrays.asList(strSplit));
        int l = 0;
        String shortestPhrase = null;
        for (String s: list) {
            if (shortestPhrase == null || s.length() < shortestPhrase.length()) {
                shortestPhrase = s;
                l = s.length() ;
            }
        }

        System.out.println("ky tự: " + shortestPhrase);
        System.out.println("Chiều dài: " + l);

    }
}