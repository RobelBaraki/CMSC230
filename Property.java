//Class: CMSC203 CRN 31480
//Program: Assignment 4
//Instructor: Professor Ashique Tanveer
//Summary of Description:A property management company manages individual properties they will build to rent, and charges them a management fee as the percentages of the monthly rental amount.
//Due Date: 04/05/24
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Student’s Name: Robel Baraki
public class Property {
    private String propertyName;
    private String city;
    private String owner;
    private double rentAmount;
    public Property(String propertyName, String city, String owner, double rentAmount) {
        this.propertyName = propertyName;
        this.city = city;
        this.owner = owner;
        this.rentAmount = rentAmount;
        new Plot();
    }
    
    // Getters and setters
    
    public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentAmount;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

	public Object getPropertyName() {
		// TODO Auto-generated method stub
		return null;
	}
}

