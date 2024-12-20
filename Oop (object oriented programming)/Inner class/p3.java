class Outer{
	int b = 20;
	class Inner{
		int a = 10;
		void fun(){
			System.out.println("in inner class"+a);
			System.out.println("in inner class"+b);
		}
	}
}
class Demo{
	public static void main(String[]args){
	 Outer.Inner obj = new Outer().new Inner();
	 obj.fun();
	}
}

/*in inner class10
in inner class20*/