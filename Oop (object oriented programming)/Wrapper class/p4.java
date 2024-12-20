//INTEGER CLASS METHOD


class Demo{
	public static void main(String[]args){
		int obj = 40;
		System.out.println(System.identityHashCode(obj));
		obj = 10;
		System.out.println(System.identityHashCode(obj));

		String s= new String("shubham");
		System.out.println(System.identityHashCode(s));
		 s= new String("shubham");
		System.out.println(System.identityHashCode(s));

	}
}

/*925858445
798154996
681842940
1392838282*/