class Demo{
	public static void main(String[]args){
	Codex obj= new Codex();
	obj.fun();
	obj.a=10;
	obj.name= "Shubham";
	obj.fun();
	
 	}
}
class Codex{
	int a=1;
	String name = "Virat";
	void fun(){
		System.out.println(a);
		System.out.println(name);
	}
}

/* o/p = 1
Virat
10
Shubham*/
