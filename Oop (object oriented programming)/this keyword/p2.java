class Demo{
	public static void main(String[]args){
		Codex obj= new Codex();
		obj.fun();
		
		}
}
class Codex{
	int a=10;
	void fun(){
		System.out.println("address of own class :"+this.a);
		}
}

//address of own class :10