package dep_woutList;

public class question {
	int id;
   String name;
   Address address;

public question(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

public void display() {
	System.out.println("name="+name+" "+"id="+id);
	System.out.println(address.toString());
}
}
