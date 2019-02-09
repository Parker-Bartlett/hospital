package Hospital;

import java.util.Collection;
import java.util.HashMap;

import employee.Employee;
import employee.IInteractWithPatient;

public class Hospital {
	HashMap<String, Employee> employees = new HashMap<String, Employee>();
	
	public Hospital() {}
	
	public void addEmployee(Employee e) {
		employees.put(e.getName(), e);
	}
	
	public Collection<Employee> getEmployees() {
		return employees.values();
	}
	
	public String getPay() {
		String pay = "";
		for (Employee employee : employees.values()) {
			pay += employee.getName() + " gets paid a salary of " + employee.calculatePay() + " per year\n";
		}
		return pay;
	}

	public String canDrawBlood() {
		String canDrawBlood = "";
		for (Employee employee : employees.values()) {
			if (employee instanceof IInteractWithPatient) {
				canDrawBlood += employee.getName() + " is capable of drawing blood\n";
			}
		}
		return canDrawBlood;
	}

	public String canCareForPatient() {
		String canCareForPatient = "";
		for (Employee employee : employees.values()) {
			if (employee instanceof IInteractWithPatient) {
				canCareForPatient += employee.getName() + " is capable of caring for a patient\n";
			}
		}
		canCareForPatient += "\n";
		return canCareForPatient;
	} 
	
	
}
