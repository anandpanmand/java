package practice;


import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two number :- ");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter Second number");
        int b = sc.nextInt();
        System.out.println(a+"Before Swapping Numbers"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"After Swapping Numbers"+b);
    }
}
