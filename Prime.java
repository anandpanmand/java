package practice;


import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter a number :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag=0;
        for(int i = 2; i<=num/2;i++){
            if(num%i==0){
                System.out.println(num+ " is not Prime ");
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println(num + " is prime number");
        }
    }
}
