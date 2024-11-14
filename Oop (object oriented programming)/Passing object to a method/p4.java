class Demo{
	public static void main(String[]args){
	One obj = new One();
	int a= 10;
	obj.display();
	Two t = new Two	();
	t.display(a);
	t.data(obj);
	} 
}
class One{
	int a=10;
	void display(){
		System.out.println("One method :"+a);
	}
}
class Two{
	//passing object to a method

	void data(One ref){
		System.out.println("Two method :"+ref.a);
		ref.display();
	}
	
	//passing primitive datatype to a method
	
	void display(int a){
		System.out.println("Two method :"+a);
	}
}