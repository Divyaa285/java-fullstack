class Demo{
		public static void main(String[]args){
		String s= new String("virat");
		System.out.println(System.identityHashCode(s));
		System.out.println(s);
		s.concat("anushka");
		System.out.println(System.identityHashCode(s));
		System.out.println(s);
		StringBuffer sb = new StringBuffer("Rohit");
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb);
	        sb.append("Ritika");
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb);


		}
}

/*o/p = 925858445
virat
925858445
virat
798154996
Rohit
798154996
RohitRitika*/
