abstract class Parent{
	abstract void marry();
  	void education(){
	System.out.println("engine...");
	}
}
class Child extends Parent{
	void marry(){
		System.out.println("x");
	}
	void education(){
	System.out.println("doctor...");
	}

}
class Child1 extends Parent{
	void marry(){
		System.out.println("xyz");
	}
}

class Demo{
	public static void main(String[]args){
	Child p= new Child();
		p.marry();
		p.education();

		Child1 p1= new Child1();
		p1.marry();
		p1.education();
	}
}

/*x
doctor...
xyz
engine...*/