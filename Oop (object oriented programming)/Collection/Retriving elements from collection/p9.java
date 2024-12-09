import java.util.*;
class Demo{
	public static void main(String[]args){
	LinkedList<String> ls= new LinkedList<String>();
	ls.add("A");
	ls.add("B");
	ls.add("C");
	System.out.println("Forward list");
	ListIterator<String> itr= ls.listIterator();
	while(itr.hasNext()){
	 System.out.println(itr.next());
		}

	System.out.println("revers list");
	while(itr.hasPrevious()){
	 System.out.println(itr.previous());
		}

	}
}

/*Forward list
A
B
C
revers list
C
B
A*/