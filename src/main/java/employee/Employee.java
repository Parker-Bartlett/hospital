package employee;

public abstract class Employee {

	private String name;
	private int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public abstract int calculatePay();
	
	@Override
	public String toString() {
		return "Name: " + name;
	}

}
