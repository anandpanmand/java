package practice;


import java.net.Socket;
import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        System.out.println("Program for Checking odd or even in java");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number to check number is even or odd:- ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is even number.");
        }
        else{
            System.out.println(num+" is odd number");
        }
    }
}
