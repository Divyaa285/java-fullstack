class Codex{
	void fun(int a){
		System.out.println("in fun");
		}
	void fun(){
		System.out.println("in fun2");
		}
}

class Demo{
	public static void main(String[]args){
		Codex d = new Codex();
		d.fun();
	}
}

//in fun2