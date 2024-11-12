class Demo{
		public static void main(String[]args){
		Codex obj = new Codex();			
		Codex obj1 = new Codex();
		obj.fun(10);
		obj1.gun();
		
		
		}
}
class Codex{
		int x;
		void fun(int x){
		this.x=x;
		System.out.println(x);
		System.out.println(x);
		}
		
		void gun(){
		System.out.println(x);
		}
}

