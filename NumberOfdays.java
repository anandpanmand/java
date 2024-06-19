package practice;


import java.util.Scanner;

/**
 * NumberOfdays
 */
public class NumberOfdays {

    public static void main(String[] args) {
        System.out.println("Enter number of days  ");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
            int day = days%30;
            int month = days/30;
        System.out.println( month+" Months "+ day+ " Days");
    }
}