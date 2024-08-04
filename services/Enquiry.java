package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

import database.Account;
import userInterface.MainClass;

// import database.*;

public class Enquiry {

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public void display(Account currAccount) throws IOException, NoSuchAlgorithmException {
    System.out.print("\n1.Balance Enquiry\n2.Display Transactions\nEnter option:");
    String ch = br.readLine();

    if (ch.equals("1")) {
      Authentication.verifyPin(currAccount);
      getBalance(currAccount);
    } else if (ch.equals("2")) {
      Authentication.verifyPin(currAccount);
      getStatements(currAccount);
    } else
      MainClass.endSession("EXIT BY USER!!");
  }

  public void getBalance(Account ca) throws IOException {
    // Account acc =new Account();
    System.out.println("\nCURRENT BALANCE:Rs." + ca.accData.get(3) + "\n");
    MainClass.endSession("");
  }

  public void getStatements(Account ca) throws IOException {
    // Account acc =new Account();
    if (ca.accData.size() == 4)
      MainClass.endSession("NO TRANSACTIONS!!");

    for (int i = 4; i < ca.accData.size(); i++) {
      System.out.println("\n" + (i - 3) + ". " + ca.accData.get(i));
    }
    MainClass.endSession("Transaction Log End!!");
  }
}
