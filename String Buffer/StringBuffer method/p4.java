//StringBuffer insert(int,X);

class Demo{
		public static void main(String[]args){
		StringBuffer sb= new StringBuffer("virat");
		StringBuffer s = sb.insert(2,"Anushka");
		System.out.println(sb);		        		
		System.out.println(s);


		}
}

/* o/p = 
viAnushkarat
viAnushkarat*/