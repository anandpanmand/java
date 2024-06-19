package oops;
class cyl{
    int radius ;
    int height;
    public cyl(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int area(){
        return radius * height;
    }
}

public class Cylainder {
    public static void main(String[] args) {
        cyl c = new cyl(15, 25);
        System.out.println(c.getHeight());
        System.out.println(c.area());
    }
}
   
