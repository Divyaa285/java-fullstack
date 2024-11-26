abstract class Parent{
	abstract void marry();
  	
}
class Demo{
	public static void main(String[]args){
	Parents p= new Parent();
		p.marry();
	}
}

// error: Parent is abstract; cannot be instantiated