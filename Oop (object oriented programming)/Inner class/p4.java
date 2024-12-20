class Outer{
	int b = 20;
	class Inner{
		int a = 10;
		void fun(){
			System.out.println("in inner class"+a);
			System.out.println("in inner class"+b);
		}
	}
	void gun(){
		System.out.println("in outer class gun"+a);
	}
}
class Demo{
	public static void main(String[]args){
	 Outer.Inner obj = new Outer().new Inner();
	 obj.fun();
	 Outer obj1= new Outer();
	 obj1.gun();
	}
}

// error: cannot find symbol