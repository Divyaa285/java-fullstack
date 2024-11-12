class Demo{
	public static void main(String[]args){
		Codex obj= new Codex();
			obj.fun();
		}
}
class Codex{
	int a= 10;
	vod fun(){
		static int b = 20;
		System.out.println(b);
		}
}

//static variable do not allowed in side the method