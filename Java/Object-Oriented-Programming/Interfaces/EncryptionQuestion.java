/*
Write a Java program to create an interface Encryptable with methods encrypt (String data) and decrypt (String encryptedData) that define encryption and decryption operations. Create two classes AES and RSA that implement the Encryptable interface and provide their own encryption and decryption algorithms.
*/

// Importing  necessary libraries for cryptographic operations


import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;


interface Encryptable{
    public String encrypt(String data);
    public String decrypt(String encryptedData);
}

class AES implements Encryptable {
    private static final String AES_ALGORITHM = "AES";
    private SecretKey secretKey;
    public AES(){
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance(AES_ALGORITHM);
            keyGen.init(128);
            secretKey = keyGen.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public String encrypt(String data) {
        try {
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String decrypt(String encryptedData) {
        try {
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);

            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
class RSA implements Encryptable{
    private static final String RSA_ALGORITHM = "RSA";
    private KeyPair keyPair;
    public RSA(){
        try {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance(RSA_ALGORITHM);
            keyGen.initialize(2048);
            keyPair = keyGen.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String encrypt(String data) {
        try {
            // Get the public key from the KeyPair
            PublicKey publicKey = keyPair.getPublic();
            Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);

            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public String decrypt(String encryptedData) {
        try {
            // Get the private key from the KeyPair
            PrivateKey privateKey = keyPair.getPrivate();
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);

            Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, privateKey);

            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
public class EncryptionQuestion {
    public static void main(String[] args) {
        Encryptable aes = new AES();
        String encryptedDataAES = aes.encrypt("Java Interface");
        System.out.println(encryptedDataAES);

        System.out.println(aes.decrypt(encryptedDataAES));


        Encryptable rsa= new RSA();
        String encryptedData = rsa.encrypt("Java Interface");
        System.out.println(encryptedData);
        System.out.println(rsa.decrypt(encryptedData));
    }
}
