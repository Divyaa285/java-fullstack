class Demo{
	public static void main(String[]args){
	One o = new One();
	o.display();
	
	
	} 
}
class One{
	int a=10;
	void display(){
		Two obj = new Two();
		obj.gun();
		}
}
class Two{
	int b=20;
	void gun(){
		System.out.println("in two gun");
	}
}