package MapInjection;


import java.util.Map;
import java.util.Set;
import java.util.Iterator;    
import java.util.Map.Entry; 

public class Question {
 int id;
 String question;
 Map<Answere,User> map;

 public Question(int id, String question, Map<Answere, User> map) {
	super();
	this.id = id;
	this.question = question;
	this.map = map;
}

public void display() {
	 System.out.println("ID="+id);
	 System.out.println("Question="+question);
	 Set<Entry<Answere,User>> set=map.entrySet();
	 Iterator<Entry<Answere,User>> itr=set.iterator();
	 while(itr.hasNext()) {
		 Entry<Answere, User> entry=itr.next();  
	        Answere ans=entry.getKey();  
	        User user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	 }
 }
}
