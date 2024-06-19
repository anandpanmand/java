package practice;


import java.util.Scanner;

public class GreetMessageForMarks {
    public static void main(String[] args) {
        System.out.println("Enter Average Marks of Final Exam :- ");
        Scanner Sc = new Scanner(System.in);
        int marks = Sc.nextInt();
        if (marks >= 35) {
            switch (marks / 10) {
                case 10:
                    System.out.println("Extraordanry");
                    break;
                case 9:
                    System.out.println("Exclent");
                    break;
                case 8:
                    System.out.println("Nice");
                    break;
                case 7:
                    System.out.println("Distinction");
                    break;
                case 6:
                    System.out.println("First Class");
                    break;
                case 5:
                    System.out.println("Good");
                    break;
                case 4:
                    System.out.println("Pass");
                    break;
                case 3:
                    System.out.println("fail");
                default:
                    break;
            }
        }
        else{
            System.out.println("fail");
        }
    }
}
