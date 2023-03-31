package mypackage;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Demo {
	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<>();
		//adding elements we use put
		hm.put(2,"kk");
		hm.put(1, "pp");
		hm.put(3, "pp");
		//key -no duplicate -Set
		Set s=hm.entrySet();
		
		Iterator i=(Iterator) s.iterator();
		while(i.hasNext()) {
		//LHS map	      //i.next() Set value -typecast with a map
		Map.Entry map=(Map.Entry)i.next();
		
		System.out.println(map.getKey()+"   "+map.getValue());
		}
	}
}
