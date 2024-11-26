class Codex{
	void fun(int a){
		System.out.println("in fun"+a);
		}
	void fun(char a){
		System.out.println("in fun2"+a);
		}
}

class Demo{
	public static void main(String[]args){
		Codex d = new Codex();
		d.fun(10);
	}
}

//in fun10