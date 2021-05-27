package AutoWiring;

public class A {
 B c;
 A(){
	 System.out.println("A is created");
 }
public B getC() {
	return c;
}
public void setC(B c) {
	this.c = c;
}
void print() {
	System.out.println("Hello a");
}
public void display() {
	print();
	c.print();
}
}
