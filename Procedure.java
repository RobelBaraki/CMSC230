package assignment2;
//Class: CMSC203 CRN 31480
//Program: Assignment #2 
//Instructor: Ashique Tanveer
//Summary of Description: Patient information
//Due Date: 03/06/2024
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Print Name: Robel Baraki
public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;

    public Procedure() {
    }

    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Accessors and Mutators
    public double getCharges() {
        return charges;
    }

    // Other methods...
    @Override
    public String toString() {
        return "Procedure: " + procedureName + "\n" +
                "ProcedureDate=" + procedureDate + "\n" +
                "Practitioner=" + practitionerName + "\n" +
                "Charge=" + charges + "\n";
    }

    public static void main(String[] args) {
        // Create a Procedure object and demonstrate functionality
        Procedure procedure = new Procedure("Physical Exam", "7/20/2019", "Dr. Irvine", 3250.0);

        // Display procedure information using toString method
        System.out.println(procedure);
    }
}


