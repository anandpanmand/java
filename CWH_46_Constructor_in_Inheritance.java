package oops;
class Base1{
    Base1(){
        System.out.println(" I am default constructor");
    }
    Base1(int x){
        System.out.println("I am overloaded Base constructor with value of X is :- " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println(" I am default derived Constructor ");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println(" I am overloaded Constructor with value of Y is :-" + y);
    }
}
public class CWH_46_Constructor_in_Inheritance {

    public static void main(String[] args) {
        // Base1  b = new Base1();
        // Base1  b = new Base1(5);
        // Derived1 d = new Derived1();
        Derived1 d = new Derived1(1,2);
    }
}