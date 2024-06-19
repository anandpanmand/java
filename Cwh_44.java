package oops;
/**
 * InnerCwh_44
 */
 class Sphere {
        double radius;

        public Sphere(int radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }
        public double surphasearea(){
            return 4 * Math.PI * radius * radius;
        }
        public Sphere(){

        }
}
public class Cwh_44 {
    public static void main(String[] args) {
        Sphere sp = new Sphere(15);
        //sp.setRadius(15);
        System.out.println(sp.getRadius());
        System.out.println(sp.surphasearea());
    }
}
