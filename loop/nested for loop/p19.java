class Demo{
		public static void main (String[]args){
	        for(int i=1;i<=4;i++){
		int a=4;
		for(int j=4;j>=1;j--){
		if(j>i){
			System.out.print("  ");
			}else{
			System.out.print(a+" ");
			a--;
			}
		    }	
	                System.out.println( );
		}
	}
}

o/p =
      4
    4 3
  4 3 2
4 3 2 1