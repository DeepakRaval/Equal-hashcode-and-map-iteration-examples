package EqualAndHashCodeDemo;

import java.util.HashSet;
import java.util.Set;

public class TestEqualHashCode {
	
	public static void main(String[] args) {
		
		new TestEqualHashCode().avoidDuplicates();
		
	}
	
	void avoidDuplicates(){
		
		Vehicle v  = new Vehicle("Grand_I10", 17);
		Vehicle v1 = new Vehicle("Sweeft_Dsire", 23);
		Vehicle v2 = new Vehicle("TATA_Safari", 8);
		Vehicle v3 = new Vehicle("Grand_I10", 14);
		
		Set<Object> vehicleSet = new HashSet<>();
		vehicleSet.add(v);
		vehicleSet.add(v1);
		vehicleSet.add(v2);
		vehicleSet.add(v3);
		
		for (Object object : vehicleSet) {
			System.out.println(object);			
		}
	}

}
  