class Emp{
	String name;
	
	Emp(String name){
		this.name=name;
	}
}
class Demo{
	public static void main(String[]args){
		Emp e= new Emp("shubham");
		Emp e1= new Emp("sanket");
		Emp e2= new Emp("rohan");
		
		Emp arr[]=new Emp[3];
		arr[0]=e;
		arr[1]=e1;
		arr[2]=e2;

		for(int i=0;i<=2;i++){
			System.out.println(arr[i]);
			System.out.println(arr[i].name);
		}
	}
}