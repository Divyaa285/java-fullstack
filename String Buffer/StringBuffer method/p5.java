//StringBuffer delete(int,int);

class Demo{
		public static void main(String[]args){
		StringBuffer sb= new StringBuffer("virat");
		StringBuffer s = sb.delete(2,4);
		System.out.println(sb);		        		
		System.out.println(s);


		}
}

/* o/p =
vit
vit*/