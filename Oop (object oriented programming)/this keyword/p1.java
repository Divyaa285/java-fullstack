class Demo{
	public static void main(String[]args){
		Codex obj= new Codex();
		obj.fun();
		System.out.println("address of code :"+obj);

		}
}
class Codex{
	
	void fun(){
		System.out.println("address of code :"+this);
		}
}

/*address of code :Codex@2f92e0f4
address of code :Codex@2f92e0f4*/