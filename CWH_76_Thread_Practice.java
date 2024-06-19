package Thread;
class Good extends Thread{
    public void run(){
        int i = 1;
        while (i<200) {
            System.out.println("Good Morning");
            i++;
        }
    }
}
class Welcome extends Thread{
    public void run(){
        int i = 1;
        while (i<200) {
            System.out.println("Welcome");
            i++;
        }
    }
}
public class CWH_76_Thread_Practice {
    public static void main(String[] args) {
        Good g = new Good();
        Welcome w = new Welcome();
        g.start();
        w.start();
    }
}
