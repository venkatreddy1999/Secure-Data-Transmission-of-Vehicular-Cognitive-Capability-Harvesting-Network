
package supermen_security;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class encryption {

    KeyGenerator keyGenerator = null;
    SecretKey secretKey = null;
    Cipher cipher = null;

    public encryption() {
        try {
           
            keyGenerator = KeyGenerator.getInstance("Blowfish");
            secretKey = keyGenerator.generateKey();

     
            cipher = Cipher.getInstance("Blowfish");
        } catch (NoSuchPaddingException ex) {
            System.out.println(ex);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }

    }

    
    public byte[] encryptText(String plainText) {
        byte[] cipherBytes = null;
        try {
           
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            
            byte[] plainBytes = plainText.getBytes();
           
            cipherBytes = cipher.doFinal(plainBytes);
        } catch (IllegalBlockSizeException ex) {
            System.out.println(ex);
        } catch (BadPaddingException ex) {
            System.out.println(ex);
        } catch (InvalidKeyException ex) {
            System.out.println(ex);
        }

        return cipherBytes;
    }

    
 /*  public String decryptText(byte[] cipherBytes) {
        String plainText = null;
        try {
            
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            
            byte[] plainBytes = cipher.doFinal(cipherBytes);
           
            plainText = new String(plainBytes);
        } catch (IllegalBlockSizeException ex) {
            System.out.println(ex);
        } catch (BadPaddingException ex) {
            System.out.println(ex);
        } catch (InvalidKeyException ex) {
            System.out.println(ex);
        }

        return plainText;
    }*/

  
   
    public String encrypt(String plainText) {
        String cipherText = null;
        byte[] cipherBytes = encryptText(plainText);
        cipherText = bytesToString(cipherBytes);
        return cipherText;
    }

   
   /* public String decrypt(String cipherText) {
        String plainText = null;
        byte[] cipherBytes = stringToBytes(cipherText);
        plainText = decryptText(cipherBytes);
        return plainText;
    }*/
    private String bytesToString(byte[] rawText) {
        String plainText = null;
        plainText = Base64.encode(rawText);
        return plainText;
    }
   
}