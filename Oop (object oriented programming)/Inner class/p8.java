//3]ANONYMOUS INNER CLASS

//a)
class Outer{
	void fun(){
		System.out.println("in fun");
	}
}
class Demo{
	public static void main(String[]args){
		Outer obj = new Outer(){
		void fun(){
			System.out.println("in anonymous fun");
		}
	};
	obj.fun();
	}
}

//in anonymous fun