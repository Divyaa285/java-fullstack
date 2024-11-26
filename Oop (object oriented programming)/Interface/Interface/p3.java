interface A{
	void fun();
}
class B implements A{
	public void fun(){				// by default compiler add public abstract void fun();
		System.out.println("in fun");
	}
}
class Demo{
	public static void main(String[]args){
		B obj= new B();
		obj.fun();
	}
}

//in fun