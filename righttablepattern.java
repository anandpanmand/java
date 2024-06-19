package practice;


import java.util.Scanner;

public class righttablepattern {
    public static void main(String[] args) {
        System.out.print("Enter a row number :- ");
        Scanner sc =new Scanner(System.in);
         int num = sc.nextInt();
        // for (int i = 1; i<= num;i++){
        //     for(int j=i;j<=num;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }
//* * * * *  
//* * * *  
//* * *  
//* *  
//*  
for (int i = num; i >0;i--){
    for(int j=i;j<=num
    ;j++){
        System.out.print("* ");
    }
    System.out.println(" ");
}
    }
}
