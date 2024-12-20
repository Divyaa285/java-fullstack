
class Demo{
	public static void main(String[]args){
		Integer obj = new Integer(40);
		System.out.println(System.identityHashCode(obj));
		obj= new Integer(10);
		System.out.println(System.identityHashCode(obj));
	}
}
/*warning
925858445
798154996*/