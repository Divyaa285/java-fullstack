class Outer{
	int b = 20;
	 private class Inner{
		int a = 10;
		void fun(){
			System.out.println("in inner class"+a);
			System.out.println("in inner class"+b);
		}
	}
	void gun(){
		Inner obj= new Inner();
		obj.fun();
	}
}
class Demo{
	public static void main(String[]args){
	 Outer obj= new Outer();
	 obj.gun();
	}
}

/*in inner class10
in inner class20*/
