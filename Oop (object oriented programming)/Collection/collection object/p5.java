class Emp{
	String name;
	String address;
	
	Emp(String name,String address){
		this.name=name;
		this.address=address;
	}
	public String toString(){
		return"Name is:"+name+"address is :"+address;
	}
	String getName(){
		return name;
	}
}
class Demo{
	public static void main(String[]args){
		Emp e= new Emp("shubham","pune");
		Emp e1= new Emp("sanket","satara");
		System.out.println(e);
		System.out.println(e1);

		System.out.println("Enter name:");
		System.out.println(e.getName());
		System.out.println(e1.getName());

	}
}

/*Name is:shubhamaddress is :pune
Name is:sanketaddress is :satara
Enter name:
shubham
sanket*/

		
