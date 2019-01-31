public class TestEncryption {

    public static void main(String[] args) {

        String encryptedString = Encryption.encrypt("Super Long Text Messge",3);

        System.out.println(encryptedString);

    }

}
