class Demo{
	public static void main(String[]args){
	Codex obj= new Codex();
	obj.fun();
	Jankalyan obj1= new Jankalyan();
	obj1.gun();
	
 	}
}
class Codex{
	int a;
	void fun(){
		System.out.println(a);
 	}
}
class Jankalyan{
	void gun(){
		Codex obj= new Codex();
		System.out.println("in gun :"+obj.a);
 	}
}