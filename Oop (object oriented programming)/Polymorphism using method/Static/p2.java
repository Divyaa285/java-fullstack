class Parent{
	static void education(){
	System.out.println("kbp");
  	}
}
class Child extends Parent{
	static void education(){
	System.out.println("ycis");
	}
}
class Demo{
	public static void main(String[]args){
	Parent obj= new Child();
	obj.education();
	}
  }
	//kbp