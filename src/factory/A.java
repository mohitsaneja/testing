package factory;

public class A {
  private  A() {
	   System.out.println("You are in A class");
   }
   public static A getA() {
	   System.out.println("You are in GetA method");
	   return new A();
   }
   public void msg() {
	   System.out.println("You are in display method");
   }
}
