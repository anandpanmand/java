package Thread;
class Mythrp1 extends Thread{
    public Mythrp1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<=200){
            System.out.println("I am the thread " + this.getName());
            i++;
        }
    }
}
public class CWH_74_Thread_priority {
    public static void main(String[] args) {
        Mythrp1 p1 = new Mythrp1("Anand Max priority ");
        Mythrp1 p2 = new Mythrp1("Pralhad ");
        Mythrp1 p3 = new Mythrp1("Kaustubh ");
        Mythrp1 p4 = new Mythrp1("Vaibhav ");
        Mythrp1 p5 = new Mythrp1("Amol ");
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
