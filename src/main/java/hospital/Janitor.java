package hospital;

public class Janitor extends Employee{

	private int pay;
	public boolean isSweeping;
	public Janitor(String name, int id) {
		super(name, id);
		this.pay = 40000;
		this.isSweeping = false;
	}
	@Override
	public int calculatePay() {
		return pay;
	}
	public boolean toggleSweepinng() {
		return isSweeping = !isSweeping;
	}

}
