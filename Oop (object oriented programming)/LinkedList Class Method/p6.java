

import java.util.*;
class Demo{
	public static void main(String[]args){
	LinkedList ls= new LinkedList();
	ls.add("Shivam");
	ls.add("Pranay");
	ls.add("Nikhil");

	//getFirst method return first element in the list :element getFirst();
	System.out.println(ls.getFirst());

	//getLast method return  last element in the list :element getLast();
	System.out.println(ls.getLast());
	
	//get method return the element from specified position in the list :element get(int position);
	System.out.println(ls.get(1));


}
	}


	/*Shivam
Nikhil
Pranay
*/