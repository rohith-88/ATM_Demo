package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

import database.Account;
import userInterface.MainClass;

public class Transfer {

  public void transferAmount(Account currAccount) throws IOException, NoSuchAlgorithmException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("\nEnter the receiver:");
    String recipient = new String(br.readLine());
    System.out.println("Enter the amount:");
    int transferAmt = Integer.parseInt(br.readLine());
    int amount = Integer.parseInt(currAccount.accData.get(3));
    Authentication.verifyPin(currAccount);

    if (amount < transferAmt)
      MainClass.endSession("INSUFFICIENT FUNDS!!");
    amount = amount - transferAmt;

    Updation.writeChanges(currAccount, String.valueOf(amount));
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    String stmt = new String(sdf.format(date) + "\t\tTRANSFER TO " + recipient + ":Rs." + transferAmt
        + "\t\tAVAILABLE BALANCE:Rs." + amount);
    Updation.writeTransaction(currAccount, stmt);
    MainClass.endSession("Amount Transfer Successful");

  }
}
