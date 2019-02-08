package hospital;

public class Surgeon extends Employee {
	
	private boolean isOperating;
	
	public Surgeon(String name, int id) {
		super(name, id);
		this.isOperating = false;
	}

	public boolean getIsOperating() {
		return isOperating;
	}

	public void toggleIsOperating() {
		isOperating = !isOperating; 
	}

}
