//WIDENING
class Emp{
		void fun(){
		System.out.println("in fun");
	}
	
}
class Dev extends Emp{
		void gun(){
		System.out.println("in gun");
	}

}
class Demo{
	public static void main(String[]args){
	Emp e = (Emp)new Dev();
    	e.fun();
  }
}

//in fun
