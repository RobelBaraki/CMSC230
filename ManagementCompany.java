//Class: CMSC203 CRN 31480
//Program: Assignment 4
//Instructor: Professor Ashique Tanveer
//Summary of Description:A property management company manages individual properties they will build to rent, and charges them a management fee as the percentages of the monthly rental amount.
//Due Date: 04/05/24
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Student’s Name: Robel Baraki
public class ManagementCompany {
    private final int MAX_PROPERTY = 5;
    private final int MGMT_WIDTH = 10;
    private final int MGMT_DEPTH = 10;
    
    private String name;
    private String taxID;
    private double mgmtFeePer;
    private Property[] properties;
    private int numberOfProperties;
    
    public ManagementCompany(String name, String taxID, double mgmtFeePer) {
        this.name = name;
        this.taxID = taxID;
        this.mgmtFeePer = mgmtFeePer;
        this.properties = new Property[MAX_PROPERTY];
        new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.numberOfProperties = 0;
    }
    
    // Other methods as per the requirements
    
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("List of the properties for ").append(name).append(", taxID: ").append(taxID).append("\n");
        result.append("______________________________________________________\n");
        for (int i = 0; i < numberOfProperties; i++) {
            result.append(properties[i].toString()).append("\n");
        }
        result.append("______________________________________________________\n");
        result.append("\n total management Fee: ").append(getTotalRent() * mgmtFeePer / 100);
        return result.toString();
    }
    
    private double getTotalRent() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

	public Object addProperty(Property sampleProperty) {
		// TODO Auto-generated method stub
		return null;
	}
}
