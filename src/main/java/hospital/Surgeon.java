package hospital;

public class Surgeon extends Doctor {
	
	private boolean isOperating;
	private int pay;
	public Surgeon(String name, int id, String specialty) {
		super(name, id, specialty);
		this.isOperating = false;
		this.pay = 120000;
	}

	public boolean getIsOperating() {
		return isOperating;
	}

	public void toggleIsOperating() {
		isOperating = !isOperating; 
	}

	@Override
	public int calculatePay() {
		return pay;
	}

}
