class Parent{
	private void education(){
	System.out.println("engi..");
  	}
}
class Child extends Parent{
	private void education(){
	System.out.println("engi sodun.");
	}
}
class Demo{
	public static void main(String[]args){
	Parent obj= new Child();
	obj.education();
	}
  }
	// error: education() has private access in Parent