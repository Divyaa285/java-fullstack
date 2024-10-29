class Demo{
	public static void main(String[]args){
	Test t= new Test();
	Test t1= new Test();
	t.x++;
	t.access();
	System.out.println(" var is :"+t.x);
	t1.access();
	System.out.println(" var is :"+t1.x);

	}
}
class Test{
	 static int x=10;
	static void access(){
	System.out.println(x);
	
	}
}

11
 var is :11
11
 var is :11*/