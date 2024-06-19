package practice;

public class FibboReccusrsion {
    static int fibbo(int x){
        if(x==1){
            return 0;
        }
        else if(x==2){
            return 1;
        }
        else{
            return fibbo(x-1) + fibbo(x-2);
        }
    }
    public static void main(String[] args) {
        int num =7;
        System.out.println("7 th term of fibonaci series is"+fibbo(num));
    }
}
