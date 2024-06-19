package practice;

import java.util.Scanner;

public class Armnumb {
    public static void main(String[] args) {
        int result=0,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A nuber to check whether it is armstrong or not");
        int num= sc.nextInt();
        int number=num;
        while (number!=0) {
            rem=number%10;
            result += Math.pow(rem, 3);
            number=number
            /10;
        }
        if(result==num){
            System.out.println(num+" is an Armstrong No");
        }
        else{
            System.out.println(num+" is not an Armstrong No");
        }
    }
}
