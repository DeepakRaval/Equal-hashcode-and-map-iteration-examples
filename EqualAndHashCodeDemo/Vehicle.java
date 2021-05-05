package EqualAndHashCodeDemo;

public class Vehicle {

	private String vName;
	private int vMilage;
	
	public Vehicle(String vName, int vMilage) {
		super();
		this.vName = vName;
		this.vMilage = vMilage;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public int getvMilage() {
		return vMilage;
	}

	public void setvMilage(int vMilage) {
		this.vMilage = vMilage;
	}

	@Override
	public String toString() {
		return "Name = "+ vName + ", Milage = " + vMilage + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vName == null) ? 0 : vName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (vName == null) {
			if (other.vName != null)
				return false;
		} else if (!vName.equals(other.vName))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}
