class Parent{
	int a=20;
	void Property(){
	System.out.println("Sanskar");
	}
}
class Child extends Parent{
	void education(){
	System.out.println("engineering");
	}
}
class Demo{
	public static void main(String[]args){
	Child obj = new Child();
	obj.Property();
	obj.education();
	}
}

/*Sanskar
engineering*/