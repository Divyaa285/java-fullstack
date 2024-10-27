class Demo{
	public static void main(String[]args){
	Codex chavi= new Codex();
	chavi.fun();
 	}
}
class Codex{
	//instance variable
int chair;
String name;
boolean x;
double y;
float z;
	//action methods

	void fun(){
	int a=10;			//local variable
	System.out.println("fan started :"+a);
	System.out.println("fan started :"+chair);
	System.out.println("fan started :"+name);
	System.out.println("fan started :"+x);
	System.out.println("fan started :"+y);
	System.out.println("fan started :"+z);
	}
}


/* o/p =
fan started :10
fan started :0
fan started :null
fan started :false
fan started :0.0
fan started :0.0*/