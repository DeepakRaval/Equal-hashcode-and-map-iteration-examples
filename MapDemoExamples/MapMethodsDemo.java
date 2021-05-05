package MapDemoExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethodsDemo {

	public static void main(String[] args) {
		new MapMethodsDemo().hashMapMethodTesting();
		new MapMethodsDemo().LinkedHashMapTesting();
	}

	void hashMapMethodTesting() {
		Map<Object, Object> m = new HashMap<>();
		m.put(1, "A");
		m.put(5, "E");
		m.put(3, "C");
		m.put(2, "B");
		m.put(4, "D");
		m.put(2, "Z");

		System.out.println("hashMap : " + m);
		System.out.println("get(k) : " + m.get(2));
		System.out.println("containsKey(k) : " + m.containsKey(3) + ", constainsValue(v) : " + m.containsValue("C"));
		System.out.println("entrySet() : " + m.entrySet());
		System.out.println("keySet() : " + m.keySet());
		System.out.println("size() : " + m.size());
		System.out.println("values() : " + m.values());

	}

	void LinkedHashMapTesting() {
		System.out.println("********************* linkedList removeEldestEntry ******************");
		LinkedHashMap<Object, Object> lm = new LinkedHashMap<Object, Object>(5, 0.75f, true) {
			private static final long serialVersionUID = 1L;
			int MAX_ENTRIES = 5;

			protected boolean removeEldestEntry(Map.Entry<Object, Object> eldest) {
				return size() > MAX_ENTRIES;
			}
		};
		lm.put(1, "A");
		lm.put(5, "E");
		lm.put(3, "C");
		lm.put(2, "B");
		lm.put(4, "D");
		System.out.println("before adding 6th element : "+lm);
		lm.put(6, "Z");
		System.out.println("after adding 6th element : "+lm);
	}

}
