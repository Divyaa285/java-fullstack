class Outer{
	class Inner{
		void fun(){
			System.out.println("in inner class");
		}
	}
}
class Demo{
	public static void main(String[]args){
	 Outer.Inner obj = new Outer().new Inner();
	 obj.fun();
	}
}

//in inner class
