class A{
	public void display() {
		System.out.println("in parent class");
	}
}
class B  extends A {	
}
class c extends A{ 
}

public class multipleinheritance {
public static void main(String []args) {
	B c1=new B();
	c1.display();
}
}