class Demo{
		public static void main (String[]args){
	        char x='A';
		for(int i=1;i<=4;i++){
		int y=1;
		for(int j=4;j>=1;j--){
		if(j>i){
			System.out.print("  ");
			}else if(i%2==0){
			System.out.print(y+" ");
			y++;
			}else{
			System.out.print(x+" ");
			x++;
			}
		    }	
	                System.out.println( );
		}
	}
}

o/p =  
      A
    1 2
  B C D
1 2 3 4

