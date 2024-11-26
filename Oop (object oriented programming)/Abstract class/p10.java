abstract class Company{
	abstract void break();
	void taskCompleted(){
	System.out.println("task completed in 4 days");
	}
}
class employ1 extends Company{
	void break(){
	System.out.println("daily 2hrs");
	}
}
class employ2 extends Company{
	void break(){
	System.out.println("1day");
	}
	void taskCompleted(){
	System.out.println("task completed in 5 days");
	}
}
	
class Demo{
	public static void main(String[]args){
	System.out.println("employ1 data : ");
	employ1 a= new employ1();
	a.break();
	a.taskCompleted();

	
	System.out.println("employ2 data : ");
	employ2 h= new employ2();
	h.break();
	h.taskCompleted();
	}
}
