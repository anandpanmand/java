package oops;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printMe(){
        System.out.println(" I am a base class");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
public class Cwh_45_Inheritance {
    public static void main(String[] args) {
        // creating object of base class
        Base b = new Base();
        b.setX(43);
        System.out.println(b.getX());;
        b.printMe();

        // creating object of Derived class
        Derived d = new Derived();
        d.setX(15);
        System.out.println(d.getX());
        d.setY(53);
        System.out.println(d.getY());
    }
}
