package practice;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int reverse =0;
        System.out.print("Enter A number to check pallindrome or not :- ");
        Scanner sc = new Scanner(System.in);
        int num4 = sc.nextInt();
        int number=num4;
        while (number !=0) {
            int rem = number%10;
            reverse = reverse*10+ rem ;
            number = number/10;
        }
        if(reverse == num4){
            System.out.println(num4+ " is a pallindrome number");
        }
        else{
            System.out.println(num4+" is not pallindrome number");
        }
    }
}
