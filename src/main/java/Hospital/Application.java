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
				break;
			case "2":
				boolean employeeInteraction = true;
				while (employeeInteraction) {
					((Receptionist) recep).tickAll();
					hospital.tickCleanliness();
					System.out.println("Here are the Employees at the hospitial");
					System.out.println(hospital.getEmployees());
					System.out.println("\nPlease choose an employee by their ID, type \"medical team\" to treat all patients or type \"Exit\" to return to Main Menu");
					String employeeChoice = input.nextLine();
					switch (employeeChoice) {
					case "9012":
						// surgeon
						// list patients prompt for choice
						Patient surgeonsActivePatient = getActivePatient(input, recep);
						// give options (care for patient, perform surgery) repeat until finished
						System.out
								.println("How would you like to care for the patient? \"care for\" or \"draw blood\"");
						String howToCare = input.nextLine();
						switch (howToCare) {
						case "care for":
							((Surgeon) surgeon).careForPatient(surgeonsActivePatient);
							System.out.println(surgeonsActivePatient);
						case "draw blood":
							((Surgeon) surgeon).drawBlood(surgeonsActivePatient);
							System.out.println(surgeonsActivePatient);
						}
						break;
					case "2093":
						Patient doctorsActivePatient = getActivePatient(input, recep);
						System.out
								.println("How would you like to care for the patient? \"care for\" or \"draw blood\"");
						String doctorHowToCare = input.nextLine();
						switch (doctorHowToCare) {
						case "care for":
							((Doctor) doctor).careForPatient(doctorsActivePatient);
							System.out.println(doctorsActivePatient);
						case "draw blood":
							((Doctor) doctor).drawBlood(doctorsActivePatient);
							System.out.println(doctorsActivePatient);
						}
						break;
					case "4365":
						System.out.println("Would you like to \"admit\" a patient or \"release\" a pationt?");
						String recepChoice = input.nextLine();
						switch (recepChoice) {
						case "admit":
							System.out.println("What is the patients name?");
							String newPatientName = input.nextLine();
							Patient newPatient = new Patient(newPatientName);
							((Receptionist) recep).addPatient(newPatient);
							System.out.println(newPatient);
							break;
						case "release":
							System.out.println(((Receptionist) recep).getPatients());
							System.out.println("What patient would you like to release by name");
							String patientToRelease = input.nextLine();
							((Receptionist) recep).releasePatient(patientToRelease);
							System.out.println(((Receptionist) recep).getPatients());
							break;
						}
						break;
					case "9328":
						// Janitor
						System.out.println("Cleanliness: " + hospital.getCleanliness());
						System.out.println("Please press 1 to clean the hospital or 2 to super clean.");
						String janitorChoice = input.nextLine();
						switch (janitorChoice) {
						case "1":
							((Janitor) janitor).clean();
							break;
						case "2":
							((Janitor) janitor).superClean();
							break;
						}
						break;
					case "8329":
						Patient nursesActivePatient = getActivePatient(input, recep);
						System.out
								.println("How would you like to care for the patient? \"care for\" or \"draw blood\"");
						String nurseHowToCare = input.nextLine();
						switch (nurseHowToCare) {
						case "care for":
							((Nurse) nurse).careForPatient(nursesActivePatient);
							System.out.println(nursesActivePatient);
						case "draw blood":
							((Nurse) nurse).drawBlood(nursesActivePatient);
							System.out.println(nursesActivePatient);
						}
						break;
					case "medical team":
						// treat all patients
						break;
					case "exit":
						employeeInteraction = false;
						break;
					}
				}
			}
		}
	}

	private static Patient getActivePatient(Scanner input, Employee recep) {
		System.out.println(((Receptionist) recep).getPatients());
		System.out.println("Please choose a patient to work with by their name");
		String patientChoice = input.nextLine();
		Patient activePatient = ((Receptionist) recep).getSinglePatient(patientChoice);
		return activePatient;
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

}
