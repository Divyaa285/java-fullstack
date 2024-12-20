class Outer{
	private class Inner{
		int a = 10;
		void fun(){
			System.out.println("in inner class"+a);
		}
	}
}
class Demo{
	public static void main(String[]args){
	 Outer.Inner obj = new Outer().new Inner();
	 obj.fun();
	}
}

//error: Outer.Inner has private access in Outer