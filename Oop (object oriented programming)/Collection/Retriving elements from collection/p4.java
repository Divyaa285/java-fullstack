import java.util.*;
class User{
	String name;
	int phnNum;
	
	User(String name,int phnNum){
		this.name=name;
		this.phnNum=phnNum;
		}
	String getName(){
		return name;
	}
	int getphnNum(){
		return phnNum;
	}
	//@overriding
	public String toString(){
		return"name is :"+name+ "phnnum is :"+phnNum;
	}
}
class Demo{
	public static void main(String[]args){
	LinkedList<User> ls= new LinkedList<User>();
	User s = new User("divya",1234);
	User s1 = new User("nikita",123);
	ls.add(s);
	ls.add(s1);
	
	for(User  a : ls){
		System.out.println(a);
		}
	System.out.println("all user name");

	for(User  a : ls){
		System.out.println(a.getName());
		}
	System.out.println("all user phnNum");

	for(User  a : ls){
		System.out.println(a.getphnNum());
		}

	}
		
}
