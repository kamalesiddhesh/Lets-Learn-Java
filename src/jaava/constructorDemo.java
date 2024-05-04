package jaava;

class MyEmployee {

	private int id;
	private String name;

	
    public MyEmployee() { 
    	id = 0; 
    	name = "Your-Name-Here"; 
	}	 

	public MyEmployee(int myId, String myName) {
		id = myId;
		name = myName;
	}

	// Creating Getters and Setters...

	public void setId(int i) {
		id = i;
	}

	public int getId() {
		return id;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	// Creating Method for Employee...
	public void getDetails() {
		System.out.println("The ID of Employee = " + id);
		System.out.println("The Name of Employee = " + name);
	}
}

public class constructorDemo {

	public static void main(String[] args) {
		MyEmployee harry = new MyEmployee(10, "Sid");

//		harry.setId(10);
//		harry.setName("Harry");

		harry.getDetails();

	}

}
