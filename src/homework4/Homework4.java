package homework4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
//ЗАДАНИЕ 4
        Scanner in = new Scanner(System.in);
        String user = in.toString();
        String names = "собака";
        for (int i = 0; i < names.length(); i++) {
            names = Character.toUpperCase(names.charAt(0)) + names.substring(1);
        }
        System.out.println(names);
//ЗАДАНИЕ 3
        String a = "Мадам";
        String b = "Казак";
        String c = "Потоп";
        String d = "Лошадь";
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
        System.out.println(isPalindrome(c));
        System.out.println(isPalindrome(d));
    }
    public static boolean isPalindrome(String str) {
      return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
}






}














