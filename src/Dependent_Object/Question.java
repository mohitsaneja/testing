package Dependent_Object;

import java.util.Iterator;
import java.util.List;

public class Question {
	int id;
    String name;
    List<Answere> answere;
	public Question(int id, String name, List<Answere> answere) {
		super();
		this.id = id;
		this.name = name;
		this.answere = answere;
	}
    void display() {
    	System.out.println("id= "+id+" "+"name= "+name);
    	Iterator<Answere> Itr=answere.iterator();
    	while(Itr.hasNext()) {
    		System.out.println(Itr.next());
    	}
    }
}
