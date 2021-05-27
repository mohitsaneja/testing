package Inherit_Bean;

public class Employee {
     Address address;
     int id;
     String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee(Address address, int id, String name) {
		super();
		this.address = address;
		this.id = id;
		this.name = name;
	}
     public void display() {
    	 System.out.print("id= ");
    	 System.out.println(id);
    	 System.out.println("name= "+name);
    	 System.out.println(address);
    	 
     }
}
