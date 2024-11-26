interface A{
	int a=10;
	void fun();
}
interface B{
	int a=20;
	void gun();
}

class Child implements A,B{
	public void fun(){
		System.out.println(A.a);
		System.out.println("in fun");
	}
	public void gun(){
		System.out.println(B.a);
		System.out.println("in gun");
	}

}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
			c.fun();
			c.gun();
	}
}

/*10
in fun
20
in gun*/
