import java.util.*;
class Demo{
	public static void main(String[]args){
	HashMap<String,String> hm= new HashMap<String,String>();
	hm.put("viraj","koli");
	hm.put("rohit","verma");
	hm.put("rohit","sharma");
	System.out.println(hm);
	
	//Keyset() method : To get out all keys

	System.out.println("All keys:");
	for(String s:hm.keySet()){
		System.out.println(s);
		}

	//value() method: To get out all values
	System.out.println("All values:");
	for(String s:hm.values()){
		System.out.println(s);
		}

	//To get out both keys & values
	for(Map.Entry<String,String>entry:hm.entrySet()){
		System.out.println(entry.getKey()+"value is:"+entry.getValue());
		}
	}

}

/*{viraj=koli, rohit=sharma}
All keys:
viraj
rohit
All values:
koli
sharma
virajvalue is:koli
rohitvalue is:sharma*/