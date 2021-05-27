package dep_woutList;

public class Address {
   String state;
   String city;
public Address(String state, String city) {
	super();
	this.state = state;
	this.city = city;
}
   public String toString() {
	   return  "state="+state+" "+"city="+city;
   }
   
}
