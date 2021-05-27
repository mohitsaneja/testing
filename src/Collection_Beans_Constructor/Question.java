package Collection_Beans_Constructor;
import java.util.*;
public class Question {
    int id;
    String name;
    List<String> answere;
	public Question(int id, String name, List<String> answere) {
		super();
		this.id = id;
		this.name = name;
		this.answere = answere;
	}
    void display() {
    	System.out.println("id= "+id+" "+"name= "+name);
    	Iterator<String> Itr=answere.iterator();
    	while(Itr.hasNext()) {
    		System.out.println(Itr.next());
    	}
    }
}
