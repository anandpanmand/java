package Thread;
class Mythread1 extends Thread{
    public void run(){
        int i= 0;
        while(i<=100){
        System.out.println(" My thread 1 is Running ");
        System.out.println("I am Good");
        i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        int i= 0;
        while(i<=100){
        System.out.println(" My thread 2 is Running ");
        System.out.println("I am Bad");
        i++;
        }
    }
}
public class CWH_70_Thread {
    public static void main(String[] args) {
        Mythread1 t1= new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
