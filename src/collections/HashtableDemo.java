package collections;
import java.util.*;



class Temp1{
	int i;
	public Temp1(int i) {
		this.i= i;
	}
	public int hashCode() {
		return i; 
		// return i%9; // {16=F, 15=D, 6=C, 23=E, 5=A, 2=B}
	}
	
	public String toString(){
		return i+"";
	}
}
public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable h = new Hashtable();  
//		Hashtable h = new Hashtable(25); // {23=E, 16=F, 15=D, 6=C, 5=A, 2=B}
		h.put(new Temp1(5) , "A");
		h.put(new Temp1(2) , "B");
		h.put(new Temp1(6) , "C");
		h.put(new Temp1(15) , "D");
		h.put(new Temp1(23) , "E");
		h.put(new Temp1(16) , "F");
		System.out.println(h);

	}
}
