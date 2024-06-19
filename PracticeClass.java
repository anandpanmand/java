package practice;


import javax.sound.midi.Soundbank;

// class Employee1{
//     int salary;
//     String Name;

//     public int getsalary(){
//         return salary;
//     }

//     public String getname(){
//         return Name;
//     }
//     public void setName(String n){
//         Name = n;
//     }
// }
// class Sqaure{
//     int side;
//     public void setSide(int s){
//         side = s;
//     }
//     public int area(){
//         return side*side;
//     }
//     public int perimeter(){
//         return side * 4;
//     }
// }
class Rectangle{
    int length;
    int bredth;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBredth() {
        return bredth;
    }
    public void setBredth(int bredth) {
        this.bredth = bredth;
    }
    public void setSide(int l,int b){
        length = l;
        bredth = b;
    }
    public int area(){
        return length * bredth;
    }
    public int perimeter(){
        return 2*(length + bredth);
    }
}
public class PracticeClass {
        public static void main(String[] args) {
        // Employee1 anand = new Employee1();
        // anand.Name="Anand";
        // anand.salary=28799;
        // String Nam= anand.getname();
        // System.out.println(Nam);
        // int Sal =anand.getsalary();
        // System.out.println(Sal);
        // anand.setName("Kaustubh");
        // Sqaure sq = new Sqaure();
        // sq.setSide(15);
        // System.out.println("Area of Square is :- "+sq.area());
        // System.out.println("Perimeter of Square is :-"+sq.perimeter());
        Rectangle rec = new Rectangle();
        rec.setSide(15, 20);
        System.out.println("Area of Rectangle is :- "+rec.area());
        System.out.println("Perimeter Of Rectangle is :- "+rec.perimeter());


    }
}
