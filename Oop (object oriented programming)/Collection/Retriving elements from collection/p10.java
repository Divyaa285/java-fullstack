import java.util.*;
import java.util.*;
class User{
	String name;
	
	
	User(String name){
		this.name=name;
		
		}
	String getName(){
		return name;
	}
	
	//@overriding
	public String toString(){
		return"name is :"+name;
	}
}
class Demo{
	public static void main(String[]args){
	LinkedList<User> ls= new LinkedList<User>();
	User s = new User("divya");
	User s1 = new User("nikita");
	User s2 = new User("vaishnavi");
	ls.add(s);
	ls.add(s1);
	ls.add(s2);


	System.out.println("Forward list");
	ListIterator<User> itr= ls.listIterator();
	while(itr.hasNext()){
	 System.out.println(itr.next());
		}

	System.out.println("revers list");
	while(itr.hasPrevious()){
	 System.out.println(itr.previous());
		}

	}
}

/*Forward list
name is :divya
name is :nikita
name is :vaishnavi
revers list
name is :vaishnavi
name is :nikita
name is :divya*/
