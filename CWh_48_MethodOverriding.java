package oops;
class A{
    public int method(){
        return 4;
    }
}
class B extends A{
    public int method(){
        return 5;
    }
}
public class CWh_48_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        int c= b.method();
        System.out.println(c);
    }
}
