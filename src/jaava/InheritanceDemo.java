package jaava;


class Base{
	int x;

	public int getX() {	return x;}

	public void setX(int x) {this.x = x;}
	
	public void printConstructor() {
		System.out.println("I am Constructor!");
	}
	
	public void printDetails(int n) {
		System.out.println(n);
	}
	
}

class Derived extends Base{
	int y;

	public int getY() {	return y;}

	public void setY(int y) {this.y = y;}
	
		
}
public class InheritanceDemo{
	
	public static void main(String[] args) {
		
		Base b = new Base();
		Derived d = new Derived();
		
		d.printConstructor();
		
		b.setX(2);
		b.printDetails(b.getX());
		
		d.setY(3);
		d.printDetails(d.getY());
		
		
		
	}

}
