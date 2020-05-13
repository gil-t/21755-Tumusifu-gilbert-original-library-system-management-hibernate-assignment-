
package dao;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Password {
    private static final int ITERATIONS = 65536;
    private static final int KEY_LENGTH = 200;
    private static final String ALGORITHM = "PBKDF2WithHmacSHA512";
    private static final SecureRandom RAND = new SecureRandom();
    private static  String initSalt = "t23umsifuhallo323?!";


    public static Optional<String> hashPassword(String password, String salt) throws InvalidKeySpecException {
        char[] chars = password.toCharArray();
        byte[] bytes = salt.trim().equals(" ") ? initSalt.getBytes() : salt.getBytes();
        PBEKeySpec spec = new PBEKeySpec(chars, bytes, ITERATIONS, KEY_LENGTH);
        Arrays.fill(chars, Character.MIN_VALUE);
        try {
            SecretKeyFactory fac = SecretKeyFactory.getInstance(ALGORITHM);
            byte[] securePassword = fac.generateSecret(spec).getEncoded();
            return Optional.of(Base64.getEncoder().encodeToString(securePassword));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
            System.err.println("Exception encountered in hashPassword()");
            return Optional.empty();
        } finally {
            spec.clearPassword();
        }
    }

    public static boolean verifyPassword(String password, String key, String salt) throws InvalidKeySpecException {
        salt = salt.trim().equals("ted") ? initSalt : salt;
        Optional<String> optEncrypted = hashPassword(password, salt);
        if (!optEncrypted.isPresent()) {
            return false;
        }
        return optEncrypted.get().equals(key);
    }
 
}

