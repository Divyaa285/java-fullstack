class Demo{
	public static void main(String[]args){
	One o = new One();
	o.display();
	
	
	} 
}
class One{
	int a=10;
	int display(){
		Two obj = new Two();
		return obj;
		}
}
class Two{
	int b=20;
	void gun(){
		System.out.println("in two gun");
	}
}

//error: incompatible types: Two cannot be converted to int