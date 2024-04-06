//Class: CMSC203 CRN 31480
//Program: Assignment 4
//Instructor: Professor Ashique Tanveer
//Summary of Description:A property management company manages individual properties they will build to rent, and charges them a management fee as the percentages of the monthly rental amount.
//Due Date: 04/05/24
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Student’s Name: Robel Baraki
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyteststudent {
	Property sampleProperty;
	ManagementCompany managementCo;

	@Before
	public void setUp() throws Exception {
		managementCo = new ManagementCompany("Railey", "555555555", 6);
	}

	@After
	public void tearDown() throws Exception {
		managementCo = null;
	}

	@Test
	public void testAddProperty() {
		sampleProperty = new Property("Sunsational", "Beckman", "BillyBob Wilson", 2);
		assertEquals(0, managementCo.addProperty(sampleProperty)); // Property successfully added to index 0
	}

	@Test
	public void testGetPropertiesCount() {
		sampleProperty = new Property("Sunsational", "Beckman", 2613, "BillyBob Wilson", 2, 5, 2, 2);
		managementCo.addProperty(sampleProperty);
		assertEquals(1, managementCo.getPropertiesCount());
	}

	@Test
	public void testToString() {
		sampleProperty = new Property("Sunsational", "Beckman", 2613.0, "BillyBob Wilson", 2, 5, 2, 2);
		managementCo.addProperty(sampleProperty); // Property successfully added to index 0
		String expectedString = "List of the properties for Railey, taxID: 555555555\n"
				+ "______________________________________________________\n"
				+ "Sunsational,Beckman,BillyBob Wilson,2613.0\n"
				+ "______________________________________________________\n" + "\n"
				+ " total management Fee: 156.78";
		assertEquals(expectedString, managementCo.toString());
	}
}
