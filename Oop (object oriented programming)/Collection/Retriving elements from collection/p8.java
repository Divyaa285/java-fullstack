//USING LISTITERATOR INTERFACE

import java.util.*;
class Demo{
	public static void main(String[]args){
	LinkedList ls= new LinkedList();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	System.out.println("using listiterator");
	ListIterator itr= ls.listIterator();
	

	while(itr.hasNext()){
	 System.out.println(itr.next());
		}
	}
}

/*using listiterator
10
20
30*/