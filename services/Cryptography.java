package services;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

public class Cryptography {

  public static String convertHash(String pd) throws NoSuchAlgorithmException {

    MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
    byte[] temp = mDigest.digest(pd.getBytes(StandardCharsets.UTF_8));

    StringBuilder result = new StringBuilder(2 * temp.length);
    for (int i = 0; i < temp.length; i++) {
      String hex = Integer.toHexString(0xff & temp[i]);
      if (hex.length() == 1) {
        result.append("0");
      }
      result.append(hex);
    }
    return result.toString();

  }

}
