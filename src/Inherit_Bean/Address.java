package Inherit_Bean;

public class Address {
	String add;
    String city;
    String country;
    
	public Address(String city, String country, String add) {
		super();
		
		this.city = city;
		this.country = country;
		this.add = add;
		
	}
    public String toString() {
    	return "country= "+ country+" "+"city= "+city+" "+"address= "+add;
    }
}
