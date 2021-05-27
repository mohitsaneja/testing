package Injection_Map; 
import java.util.Iterator;  
import java.util.Map;  
import java.util.Set;  
import java.util.Map.Entry;
public class Question {
    int id;
    String name;
    Map<String,String> answere;
	public Question(int id, String name, Map<String, String> answere) {
		super();
		this.id = id;
		this.name = name;
		this.answere = answere;
	}
    public void display() {
    	System.out.println("id= "+id+" "+"name= "+name);
    	 Iterator<Map.Entry<String, String>> itr = answere.entrySet().iterator();
    	 while(itr.hasNext()) {
    		 Map.Entry<String, String> entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue());
    	 }
    }
}
