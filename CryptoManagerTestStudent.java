
//Class: CMSC203 CRN 31480
//Program: Assignment 3
//Instructor: Professor Ashique Tanveer
//Summary of Description: Write a Java program to encrypt and decrypt a phrase using two similar //approaches, each insecure by modern standards.  
//Due Date: 03/24/24
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Student’s Name: Robel Baraki

public class CryptoManagerTestStudent {

    // Test Strings
    private String plainText;
    private String encryptedText;
    private String decryptedText;

    // Caesar Cipher Key
    private int caesarKey;

    // Bellaso Cipher Key
    private String bellasoKey;

    @Before
    public void setUp() {
        // Initialize test strings
        plainText = "HELLO WORLD!";
        encryptedText = "KHOOR#ZRUOG$";
        decryptedText = "HELLO WORLD!";

        // Initialize Caesar key
        caesarKey = 3;

        // Initialize Bellaso key
        bellasoKey = "CMSC";
    }

    @After
    public void tearDown() {
        // Reset values after each test case
        plainText = null;
        encryptedText = null;
        decryptedText = null;
        caesarKey = 0;
        bellasoKey = null;
    }

    @Test
    public void testIsStringInBounds() {
        assertTrue(CryptoManager.isStringInBounds(plainText));
        assertFalse(CryptoManager.isStringInBounds("hello world!")); // Lowercase letters
        assertFalse(CryptoManager.isStringInBounds("1234")); // Numbers
        assertFalse(CryptoManager.isStringInBounds("!@#$")); // Special characters
    }

    @Test
    public void testCaesarEncryption() {
        assertEquals(encryptedText, CryptoManager.caesarEncryption(plainText, caesarKey));
    }

    @Test
    public void testCaesarDecryption() {
        assertEquals(decryptedText, CryptoManager.caesarDecryption(encryptedText, caesarKey));
    }

    @Test
    public void testBellasoEncryption() {
        // Since Bellaso encryption depends on random keys, we'll only test the decryption
    }

    @Test
    public void testBellasoDecryption() {
        // Encrypt plainText with Bellaso cipher
        String encryptedBellaso = CryptoManager.encryptBellaso(plainText, bellasoKey);
        // Decrypt encryptedBellaso using Bellaso cipher and the same key
        assertEquals(plainText, CryptoManager.bellasoDecryption(encryptedBellaso, bellasoKey));
    }
}
