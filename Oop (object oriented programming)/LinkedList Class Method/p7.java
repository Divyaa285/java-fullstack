
import java.util.*;
class Emp{
	String name;
	int sal;
	Emp(String name,int sal){
	this.name=name;
	this.sal=sal;	
}
	
public String toString(){
	return "name is :"+name+"sal is :"+sal;
}
	}

class Demo{
	public static void main(String[]args){
	LinkedList <Emp> ls= new LinkedList<Emp>();
	Scanner sc =new Scanner(System.in);
	for(int i =0;i<3;i++){
	System.out.println("enter emp name:");
	String name = sc.next(); 
	System.out.println("enter emp sal :");
	int sal =sc.nextInt();
	ls.add(new Emp (name,sal));

}
	Iterator itr =ls.iterator();
	System.out.println("All emps :");
	while(itr.hasNext()){
	System.out.println(itr.next());

}
	System.out.println("Enter emp position");
	int position = sc.nextInt();
	System.out.println("Employee of specified position");
	System.out.println(ls.get(position));


}
	}

	/*enter emp name:
Shivam
enter emp sal :
1000
enter emp name:
Nikhil
enter emp sal :
2000
enter emp name:
Pranay
enter emp sal :
3000
All emps :
 name is :Shivamsal is :1000
 name is :Nikhilsal is :2000
 name is :Pranaysal is :3000
Enter emp position
1
Employee of specified position
 name is :Nikhilsal is :2000*/
