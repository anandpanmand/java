package practice;


import java.util.Scanner;

public class FloydeTringle {
    public static void main(String[] args) {
        int n,i,j,num=1;
        System.out.println("Enter a row number for floyde tringle");
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        for (i=1;i<=n;i++){
            for(j=1;j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }

    }
}
