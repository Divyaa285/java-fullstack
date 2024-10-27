class Demo{
		public static void main(String[]args){
		StringBuffer sb= new StringBuffer("virat");
		String s = sb.append("Mane");

		System.out.println(sb);		        		
		System.out.println(s);


		}
}

/* o/p = error: incompatible types: StringBuffer cannot be converted to String
                String s = sb.append("Mane");*/
                                    ^