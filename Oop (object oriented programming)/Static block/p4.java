class Demo{
	
	public static void main(String[]args){
		Test t= new Test();
		t.gun();
		Test.gun();
		System.out.println("in main method");
		}
}
class Test{
	static{
		System.out.println("in static method");
	}
	static void gun(){
		
		System.out.println("in gun method");
	}
}