package practice;

class Rectangle{
	private int length;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	private int breadth;
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		rec.setLength(15);
		rec.setBreadth(30);
		System.out.println(rec.getBreadth());
		System.out.println(rec.getLength());
	}

}
