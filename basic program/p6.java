class Demo{
		public static void main (String[]args){
			System.out.println("welcome to the java");
			Narishakti.fun();
			
		}		
}

class Narishakti{
	        void fun(){
		System.out.println("in fun method");
		}
}


o/p = p6.java:4: error: non-static method fun() cannot be referenced from a static context
                        Narishakti.fun();