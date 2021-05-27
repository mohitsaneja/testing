package Dependent_Object;

import java.util.Iterator;
import java.util.List;

public class Answere {
	int id;
	String name;
	String by;
	public Answere(int id, String name, String by) {
		super();
		this.id = id;
		this.name = name;
		this.by = by;
	}
	public String toString() {
		return id+" "+name+" "+by;
		
	}
    
}
