package practice;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter A number For Factorial :- ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=number;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }    
}
