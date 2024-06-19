package practice;


import java.util.Scanner;

public class tringle {
    public static void main(String[] args) {
        System.out.println("Enter Row number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=1;i<=num2;i++){
            for(int j=i;j<=num2;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
