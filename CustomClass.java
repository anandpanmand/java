package practice;

import javax.sound.midi.Soundbank;

class Employee{
     int id;
    String name;
    public void getproperties(){
        System.out.println("My id is "+ id);
        System.out.println("My Name  is " +name);
    }
}
public class CustomClass {

    public static void main(String[] args) {
        System.out.println("Custom Class Example ");
        Employee emp = new Employee();
        emp.id=1;
        emp.name="Anand";
        System.out.println("My id is :-"+emp.id);
        System.out.println("My Name is :-"+emp.name);
        emp.getproperties();
        Employee abhi = new Employee();
        abhi.id=2;
        abhi.name="Abhishek";
        abhi.getproperties();
    }
}