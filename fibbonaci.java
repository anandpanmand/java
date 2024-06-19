package practice;


import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println("Enter the terms upto which fibbonaci series extended");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i =2 ; i<n; i++){
            int c = a + b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
