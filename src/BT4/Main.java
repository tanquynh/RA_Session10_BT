package BT4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Tạo một chuỗi
        String str = "Rekkei Academy để nông dân biết code";

        // Tách chuỗi thành mảng các chuỗi dựa trên dấu cách
        String[] strSplit = str.split(" ");
        System.out.println(Arrays.toString(strSplit));

        // Tạo một danh sách từ mảng các chuỗi
        List<String> list = new ArrayList<String>(Arrays.asList(strSplit));


        // Lặp qua danh sách và in ra các phần tử có độ dài lớn hơn 3 ký tự
        for (String s : list){
            if (s.length() > 3){
                System.out.print (s + " ");
            }
        }
    }
}