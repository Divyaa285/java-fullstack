class Demo{
		public static void main(String[]args){
		StringBuffer sb= new StringBuffer("virat");
		StringBuffer s = sb.append("Mane");
		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(s));
		System.out.println(sb);		        		
		System.out.println(s);


		}
}

/* o/p =
 925858445
925858445
viratMane
viratMane*/
