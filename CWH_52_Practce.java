package oops;
class Rectangle{
    int lenght;
    int breadth;
    public Rectangle(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }
    Rectangle(){

    }
    public int getLenght() {
        return lenght;
    }
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public double area(){
        return this.lenght * this.breadth;
    }
    
}
class Cuboid extends Rectangle{
    int height;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public Cuboid(int lenght,int breadth,int height){
        super(lenght,breadth);
        this.height=height;
    }
    Cuboid(){

    }
    public double volume(){

        return this.lenght * this.breadth* this.height;
    }
}
public class CWH_52_Practce {
    public static void main(String[] args) {
        //Rectangle R = new Rectangle(15,30);
        // R.setBreadth(15);
        // R.setLenght(20);
       // System.out.println("Area Of Rectangle is "+ R.area());
        Cuboid c = new Cuboid(15,20,30);
        // c.setHeight(30);
       double cd = c.volume();
       System.out.println(cd);


    }
}
