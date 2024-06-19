package practice;

public class vrags {
    static int sum(int  ...args){
        int result =0;
        for(int a:args){
            result +=a;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("sum of 2 , 3, 4 is "+sum(2,3,4));
        System.out.println("sum of 2 , 3, 4,5 is "+sum(2,3,4,5));
        System.out.println("sum of 2 , 3, 4,5,6,7 is "+sum(2,3,4,5,6,7));
    }
}
