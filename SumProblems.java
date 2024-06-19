package practice;

public class SumProblems {
   public static void main(String[] args) {
    System.out.println("Sum of numbers");
    int sum=0;
    for(int i =100;i<=200;i++){
        if(i%7==0){
            sum += i;
        }
    }
    System.out.println(sum);
   } 
}
