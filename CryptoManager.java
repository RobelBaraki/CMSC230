import java.util.Scanner;

public class CryptoManager {

    private static final char LOWER_BOUND = ' ';
    private static final char UPPER_BOUND = '_';
    private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

    public static boolean stringInBounds(String plainText) {
        boolean boundary = true;
        for (int index = 0; index < plainText.length(); index++) {
            if (!(plainText.charAt(index) >= LOWER_BOUND && plainText.charAt(index) <= UPPER_BOUND))
                boundary = false;
        }
        return boundary;
    }

    public static String encryptCaesar(String plainText, int key) {
        String encryptedText = "";
        if (stringInBounds(plainText)) {
            for (int index = 0; index < plainText.length(); index++) {
                char thisChar = plainText.charAt(index);
                int encryptedCharint = ((int) thisChar + key);
                while (encryptedCharint > UPPER_BOUND) {
                    encryptedCharint -= RANGE;
                }
                encryptedText += (char) encryptedCharint;
            }
        }
        return encryptedText;
    }

    public static String encryptBellaso(String plainText, String bellasoStr) {
        String encryptedText = "";
        int bellasoStrLength = bellasoStr.length();
        for (int index = 0; index < plainText.length(); index++) {
            char thisChar = plainText.charAt(index);
            int encryptedCharint = ((int) thisChar + (int) bellasoStr.charAt(index % bellasoStrLength));
            while (encryptedCharint > (int) UPPER_BOUND) {
                encryptedCharint -= RANGE;
            }
            encryptedText += (char) encryptedCharint;
        }
        return encryptedText;
    }

    public static String decryptCaesar(String encryptedText, int key) {
        String decryptedText = "";
        for (int index = 0; index < encryptedText.length(); index++) {
            char thisChar = encryptedText.charAt(index);
            int decryptedCharint = ((int) thisChar - key);
            while (decryptedCharint < LOWER_BOUND) {
                decryptedCharint += RANGE;
            }
            decryptedText += (char) decryptedCharint;
        }
        return decryptedText;
    }

    public static String decryptBellaso(String encryptedText, String bellasoStr) {
        String decryptedText = "";
        int bellasoStrLength = bellasoStr.length();
        for (int index = 0; index < encryptedText.length(); index++) {
            char thisChar = encryptedText.charAt(index);
            int decryptedCharint = ((int) thisChar - (int) bellasoStr.charAt(index % bellasoStrLength));
            while (decryptedCharint < (int) LOWER_BOUND) {
                decryptedCharint += RANGE;
            }
            decryptedText += (char) decryptedCharint;
        }
        return decryptedText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to encrypt:");
        String input = scanner.nextLine().toUpperCase();

        if (!stringInBounds(input)) {
            System.out.println("String not in bounds. Exiting program.");
            return;
        }

        System.out.println("Enter a Caesar key:");
        int caesarKey = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter a Bellaso keyword:");
        String bellasoKeyword = scanner.nextLine().toUpperCase();

        String encryptedCaesar = encryptCaesar(input, caesarKey);
        System.out.println("Caesar Encrypted: " + encryptedCaesar);

        String decryptedCaesar = decryptCaesar(encryptedCaesar, caesarKey);
        System.out.println("Caesar Decrypted: " + decryptedCaesar);

        String encryptedBellaso = encryptBellaso(input, bellasoKeyword);
        System.out.println("Bellaso Encrypted: " + encryptedBellaso);

        String decryptedBellaso = decryptBellaso(encryptedBellaso, bellasoKeyword);
        System.out.println("Bellaso Decrypted: " + decryptedBellaso);

        scanner.close();
    }
}
