package EqualAndHashCodeDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapItereting {
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> studentMap = new HashMap<String, Integer>();
		studentMap.put("A",614);
		studentMap.put("B",745);
		studentMap.put("C",546);
		studentMap.put("D",464);
		new HashMapItereting().iteratingByEntrySet(studentMap);
		new HashMapItereting().iteratingByGetKey(studentMap);
		new HashMapItereting().iteratingByValue(studentMap);
		new HashMapItereting().forEachByEntrySet(studentMap);
		new HashMapItereting().forEachByGetKey(studentMap);
		new HashMapItereting().forEachByValue(studentMap);
	}
	
	void iteratingByEntrySet(Map<String, Integer> stud){
		
		Iterator<Entry<String, Integer>> itr = stud.entrySet().iterator();
		 
			while(itr.hasNext()){
				Map.Entry<String, Integer> e = itr.next();
				System.out.println("key : "+e.getKey()+", value : "+e.getValue());
			}
		
		
	}
	
	void iteratingByGetKey(Map<String, Integer> stud){
		
		Iterator<String> itr = stud.keySet().iterator();
		 
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		
	}
	
	void iteratingByValue(Map<String, Integer> stud){
		
		Collection<Integer> c = stud.values();
		Iterator<Integer> itr = c.iterator();
		 
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		
	}
	
	
	void forEachByEntrySet(Map<String, Integer> stud){
		
		 for (Map.Entry<String, Integer> element : stud.entrySet()) {
			System.out.println("key : "+element.getKey() + ", value : "+element.getValue());
		}
		
		
	}
	
	void forEachByGetKey(Map<String, Integer> stud){
		
		Collection<String> c = stud.keySet();
		for (String element : c) {
			System.out.println("key : "+element);
		}
		
	}
	
	void forEachByValue(Map<String, Integer> stud){
		
		Collection<Integer> c = stud.values();		 
		for (Integer integer : c) {
			System.out.println("value : "+integer);
		}
		
	}
}

class Student {
	
	String name;
	int rollNo;
	
	public Student(String name) {
		super();
		this.name = name;
//		this.rollNo = rollNo;
	}
}