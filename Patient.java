package assignment2;
//Class: CMSC203 CRN 31480
//Program: Assignment #2 
//Instructor: Ashique Tanveer
//Summary of Description: Patient information
//Due Date: 03/06/2024
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Print Name: Robel Baraki
public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    public Patient() {
    }

    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Accessors and Mutators

    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    @Override
    public String toString() {
        return "Name: " + buildFullName() + "\n" +
                "Address: " + buildAddress() + "\n" +
                "Emergency Contact: " + buildEmergencyContact();
    }

    public static void main(String[] args) {
        // Create a Patient object and demonstrate functionality
        Patient patient = new Patient("John", "Doe", "Smith", "123 Main St", "City", "State", "12345", "555-123-4567", "Emergency Contact", "555-987-6543");

        // Display patient information using toString method
        System.out.println(patient);
    }
}

