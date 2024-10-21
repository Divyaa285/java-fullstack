class Demo{
		public static void main(String[]args){
		String s= "Divya";
		String  s1= s.concat("Sakunde");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		}
}

/*o/p = Divya
DivyaSakunde
925858445
798154996*/


