package userInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

import database.Account;
import services.Authentication;
import services.CreatingAccount;

public class MainClass {

  public static String path = new String(
      "C:/Users/rohit/OneDrive/Documents/Java_Projects/ATM_Demo/database/AccountInfo/");

  public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

    System.out.println("\n=====================SESSION STARTED=====================\n\n");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    do {

      System.out.print("\n1.Create Account\n2.Login Account\n(Anything else to exit)\nEnter option:");
      String op = br.readLine();

      if (op.equals("1")) {
        CreatingAccount ca = new CreatingAccount();
        ca.create();
      }

      else if (op.equals("2")) {
        Authentication auth = new Authentication();
        Account currentAcc = auth.authenticate();
        UserFunctions uf = new UserFunctions();
        uf.services(currentAcc);
      }

      else
        endSession("EXIT BY USER!!");

    } while (true);
  }

  public static void endSession(String exitStatus) {
    System.out.println("\n" + exitStatus + "\n");
    System.out.println("=====================SESSION ENDED=====================");
    System.exit(0);
  }

}
