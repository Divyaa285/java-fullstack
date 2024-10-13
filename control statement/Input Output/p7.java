import java.util.*;

class Demo{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number a");
	int a=sc.nextInt();
	
	Codex chavi= new Codex();
	chavi.number();
	
	}
}

class Codex{
		void number(int a){
		 int count=0;
		for(int i=1;i<=5;i++){
		if(a%i==0){
			count++;
		}
	}if(count==2){
		System.out.println("prime no.");
		}else{
		System.out.println("not prime no.");
        	}

	}
			
}

