//3]METHOD LOCAL INNER CLASS

class Outer{
	void gun(){
	class Inner{
		void fun(){
			System.out.println("in inner class fun");
		}
	}
	Inner obj= new Inner();
	obj.fun();
	}
}
class Demo{
	public static void main(String[]args){
	 Outer obj = new Outer();
	 obj.gun();
	}
}

//in inner class fun
