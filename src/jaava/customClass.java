package jaava;

class Employee{
	
	// Creating attributes...
	private int id;
	private String name;
	
	// Creating Getters and Setters...
	
	public void setId(int i) {
		id = i;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String n) {
		name= n;
	}
	
	public String getName() {
		return name;
	}
	
	
	// Creating Method for Employee...
	public void getDetails() {
		System.out.println("The ID of Employee = " + id  );
		System.out.println("Name of Employee = " + name);
	}
	
}
public class customClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is Custom Class...");
		
		// Creating new object for Employee
		
		Employee harry = new Employee();
		Employee nami = new Employee();
		
		// Setting properties of Object - harry..
		harry.setId(1);
		harry.setName("Ram");
		
		nami.setId(2);
		nami.setName("Nami");
		
		/*
		 * System.out.println(harry.getId()); 
		 * System.out.println(harry.getName());
		 */
		
		// Calling getDetails Method.....
		harry.getDetails();
		nami.getDetails();
	}
}
