class Demo{
		public static void main(String[]args){
		String s= "Divya";
		System.out.println(System.identityHashCode(s));
		System.out.println(s);
    	        s= s.concat("Sakunde");
		System.out.println(System.identityHashCode(s));
		System.out.println(s);
		
		
		}
}

/* o/p =
925858445
Divya
798154996
DivyaSakunde*/
