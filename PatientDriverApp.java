package assignment2;
//Class: CMSC203 CRN 31480
//Program: Assignment #2 
//Instructor: Ashique Tanveer
//Summary of Description: Patient information
//Due Date: 03/06/2024
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Print Name: Robel Baraki

public class PatientDriverApp {
    public static void main(String[] args) {
        Patient patient = new Patient("Jenny", "Elaine", "Santori", "123 Main Street", "MyTown", "CA", "01234", "301-123-4567", "Bill Santori", "777-555-1212");
        Procedure procedure1 = new Procedure("Physical Exam", "7/20/2019", "Dr. Irvine", 3250.0);
        Procedure procedure2 = new Procedure("X-ray", "7/20/2019", "Dr. Jamison", 5500.43);
        Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);

        displayPatient(patient);
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%,.2f\n", totalCharges);

        System.out.println("\nStudent Name: Robel Baraki");
        System.out.println("MC#: MC777777");
        System.out.println("Due Date: 06/03/2024");
    }

    public static void displayPatient(Patient patient) {
        System.out.println("Patient info:");
        System.out.println(patient);
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }

    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
    }
}
