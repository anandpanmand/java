package Thread;
class Mythr1 extends Thread{
    public  Mythr1(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am Mythr1");
    }
}
class Mythr2 extends Thread{
    public  Mythr2(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am Mythr1");
    }
}
public class CWH_73_Thread_Constructor {
    public static void main(String[] args) {
        Mythr1 mt1 = new Mythr1("anand");
        mt1.start();
        System.out.println(mt1.getName());
    }
}
