package employee;

import Hospital.Hospital;

public class Janitor extends Employee{
	
	Hospital hospital = new Hospital();
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
	
	@Override
	public String toString() {
		return "Janitor " + getName() + " " + getId() + " " + isSweeping;
	}
	public void clean() {
		hospital.clean();
	}
	
	public void superClean() {
		hospital.superClean();
	}

}
