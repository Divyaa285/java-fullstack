//b)

interface Outer{
	void fun();

}
class Demo{
	public static void main(String[]args){
		Outer obj = new Outer(){
		public void fun(){
			System.out.println("in anonymous fun");
		}
	};
	obj.fun();
	}
}

//in anonymous fun