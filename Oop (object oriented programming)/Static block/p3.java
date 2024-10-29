class Demo{
	
	public static void main(String[]args){
		Test t= new Test();
		System.out.println("in main method");
		}
}
class Test{
	static{
		System.out.println("in static method");
	}
}

/* in static method
in main method*/