class Demo{
	public static void main(String[]args){
		Codex obj= new Codex();
		obj.fun();
		obj.gun();
		}
}
class Codex{
	int a=10;
	void fun(){
		System.out.println("Instance variable a :"+a);
		}
	static void gun(){
		System.out.println("Instance variable a :"+a);
		}

}

// error: non-static variable a cannot be referenced from a static context