class Codex{
	void add(int a, int b){
		System.out.println(a+b);
		}
	void add(int a,int b,int c){
		System.out.println(a+b+c);
		}
}

class Demo{
	public static void main(String[]args){
		Codex d = new Codex();
		d.add(10,20);
		d.add(10,20,30);
	}
}

/*30
60*/		
	
