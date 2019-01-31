public class TestEncryption {

    public static void main(String[] args) {

        String encryptedString = Encryption.encrypt("This is my super important secret message that I want to hide",7);

        System.out.println(encryptedString);

    }



}
