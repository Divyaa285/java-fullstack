class Demo{
	public static void main(String[]args){
	Codex obj= new Codex();
	obj.fun();
	obj.a=10;
	obj.fun();
	
 	}
}
class Codex{
	int a;
	void fun(){
		System.out.println(a);
	}
}

/* o/p= 0
10*/