//NESTED INNER CLASS

class Outer{
	class Inner{
		void fun(){
			System.out.println("in inner class");
		}
	}
}
class Demo{
	public static void main(String[]args){
	 Inner obj = new Inner();
	 obj.fun();
	}
}

// error: cannot find symbol