
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
public class Decryption {
     Cipher cipher = null;
     SecretKey secretKey = null;
    public Decryption()
    {
       try{
           cipher = Cipher.getInstance("Blowfish");
           secretKey=new encryption().secretKey;
       }catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }catch (NoSuchPaddingException ex) {
            System.out.println(ex);
        } 
       
    }
    public String decryptText(byte[] cipherBytes) {
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
    }
 public String decrypt(String cipherText) {
        String plainText = null;
        byte[] cipherBytes = stringToBytes(cipherText);
        plainText = decryptText(cipherBytes);
        return plainText;
    }
  private byte[] stringToBytes(String plainText) {
        byte[] rawText = null;
        try {
            rawText = Base64.decode(plainText);
        } catch (Base64DecodingException ex) {
            System.out.println(ex);
        }
        return rawText;
    }
    
}
