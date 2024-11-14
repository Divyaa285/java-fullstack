class Person{
	
	void fun(){
		System.out.println("in fun");
		}
}
class Demo{
	public static void main(String[]args){
	Person p1 = new Person();
	System.out.println(p1.fun());
	}
}