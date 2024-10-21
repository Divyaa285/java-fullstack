class Demo{
		public static void main(String[]args){
		String s= "shubham";
		String s1= new String("shubham");
		String data = s.substring(2,8);
		System.out.println(data);
		}
}

// o/p = StringIndexOutOfBoundsException: Range [2, 8) 