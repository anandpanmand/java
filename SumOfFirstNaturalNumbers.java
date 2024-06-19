package practice;

public class SumOfFirstNaturalNumbers {
    static int sum(int x){
        if(x==1){
            return x;
        }
        else{
            return x + sum(x-1);

            }
        }
    
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Sum of first 6 numbers is "+sum(n));
    }
}
