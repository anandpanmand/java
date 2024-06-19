package practice;


import java.util.Scanner;

public class reversedigit {
   public static void main(String[] args) {
    System.out.print("Enter A number :- ");
    int reverse=0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n !=0) {
        int rem = n%10;
        reverse = reverse*10+rem;
        n/=10;
    }
    System.out.println("Reverse number is : "+reverse);
   } 
}
