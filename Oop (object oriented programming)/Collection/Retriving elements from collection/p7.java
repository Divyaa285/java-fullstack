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

	System.out.println("using iterator interface");
	Iterator itr = ls.iterator();
	
	while(itr.hasNext()){
	 System.out.println(itr.next());
		}
	itr =  ls.iterator();					//reinitialising(hasNext box become empty)
	while(itr.hasNext()){
	User u=(User) itr.next();
		System.out.println(u.getName());
		}


	}
}

/*using iterator interface
name is :divyaphnnum is :1234
name is :nikitaphnnum is :123
divya
nikita*/