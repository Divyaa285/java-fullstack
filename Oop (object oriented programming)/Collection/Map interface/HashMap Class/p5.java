import java.util.*;
class User{
	String name;
	String add;
	User(String name,String add){
		this.name = name;
		this.add = add;
	}
	
	String getName(){
		return name;
	}
}
class Demo{
	public static void main(String[]args){
	LinkedList<User> ls = new LinkedList<User>();
	ls.add(new User("shubham","pune"));
	ls.add(new User("sanket","satara"));

	Iterator<User> itr = ls.iterator();
	System.out.println(itr.next().getName());
	
	while(itr.hasNext()){
		User u = itr.next();
		System.out.println(itr.next().getName());
		System.out.println(u.getName());
	}
		User u=ls.get(0);
		System.out.println(u.getName());
	}
}
