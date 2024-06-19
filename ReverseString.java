package practice;


import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print(" Enter String to reverse : - ");
        Scanner sc = new Scanner(System.in);
        String revrse ="";
        String  str= sc.nextLine();
        for(int i = str.length()-1; i>=0;i--){
            revrse = revrse + str.charAt(i);
        }
        System.out.println(revrse);
        
    }
}
