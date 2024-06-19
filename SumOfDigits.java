package practice;


import java.util.Scanner;

/**
 * SumOfDigits
 */
public class SumOfDigits {

    public static void main(String[] args) {
        System.out.print("Enter A number :- ");
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int num = sc.nextInt();
        // while(num!=0){
        //     int rem = num%10;
        //     sum += rem;
        //     num /=10;
        // }
        // System.out.println(sum);
        int product = 1;
        while(num!=0){
            int rem = num%10;
            product *= rem;
            num /=10;
        }
        System.out.println(product);
    }
}