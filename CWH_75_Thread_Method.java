package Thread;
class MynewThread1 extends Thread{
    public void run(){
        int i =1;
        while(i<=200){
            System.out.println("I am Thread 1 ");
            i++;
        }
    }
}
class MynewThread2 extends Thread{
    public void run(){
        int i =1;
        while(i<=200){
            System.out.println("I am Thread 2 ");
            i++;
        }
    }
}
public class CWH_75_Thread_Method {
    public static void main(String[] args) {
        MynewThread1 t1 = new MynewThread1();
        MynewThread2 t2 = new MynewThread2();
        t1.start();
        
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();

    }
}
