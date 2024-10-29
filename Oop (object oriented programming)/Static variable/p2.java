class Demo{
	public static void main(String[]args){
	Test t= new Test();
	Test.access();
	}
}
class Test{
	//Static variable
	static int x=10;
	
 	static void access(){
	System.out.println(x);
	
	}
}

//10