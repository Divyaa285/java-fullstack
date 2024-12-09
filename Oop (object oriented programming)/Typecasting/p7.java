class Emp{
		void fun(){
		System.out.println("in fun");
	}
}
class Dev extends Emp{
		void gun(){
		System.out.println("coding");
	}
}
class Manager extends Emp{
		void manager(){
		System.out.println("Manager");
	}
}
class HR extends Emp{
		void rangoli(){
		System.out.println("useless job");
	}

}
class Codex{
		void display(Emp obj){
		Manager m = (Manager)obj;
		m.fun();
		}
}
class Demo{
	public static void main(String[]args){
	Dev d = new Dev();
	Manager m = new Manager();
	Codex obj = new Codex();
	obj.display(m);
    	
	
  }
}
