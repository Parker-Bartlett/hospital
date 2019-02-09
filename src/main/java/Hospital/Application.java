package Hospital;

import java.util.Scanner;

import employee.Doctor;
import employee.Employee;
import employee.Janitor;
import employee.Nurse;
import employee.Receptionist;
import employee.Surgeon;
import patient.Patient;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Hospital hospital = new Hospital();
		Employee doctor = new Doctor("Dave", 2093, "Heart");
		hospital.addEmployee(doctor);
		Employee surgeon = new Surgeon("Susan", 9012, "Brain");
		hospital.addEmployee(surgeon);
		Employee nurse = new Nurse("Henry", 8392);
		hospital.addEmployee(nurse);
		Employee recep = new Receptionist("Amy", 4365);
		hospital.addEmployee(recep);
		Employee janitor = new Janitor("Lola", 9328);
		hospital.addEmployee(janitor);
		Patient patOne = new Patient("Jack");
		((Receptionist) recep).addPatient(patOne);
		Patient patTwo = new Patient("Billy");
		((Receptionist) recep).addPatient(patTwo);

		System.out.println("Welcome to the hospital! Try not to let to many people die...");

		boolean gameOn = true;
		while (gameOn) {
			System.out.println("       Main Menu\n1. See Employee Information\n2. Manage employees");
			String mainMenuOption = input.nextLine();

			switch (mainMenuOption) {
			case "1":
				employeeInformation(hospital);
			case "2":
				employeeInteraction();
			}
		}

	}

	private static void employeeInformation(Hospital hospital) {
		System.out.println("Here are the Employees at the hospitial");
		System.out.println(hospital.getEmployees());
		System.out.println("\nHere are the Employees pay rates at the hospital");
		System.out.println(hospital.getPay());
		System.out.println("\nHere are the Employees who can draw blood");
		System.out.println(hospital.canDrawBlood());
		System.out.println("\nHere are the Employees who can care for patients");
		System.out.println(hospital.canCareForPatient());

	}

	private static void employeeInteraction() {
		// TODO Auto-generated method stub

	}
}
