package userInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

import database.Account;
import services.Enquiry;
import services.Transfer;
import services.Updation;

public class UserFunctions {
  public void services(Account currAccount) throws IOException, NoSuchAlgorithmException {
    System.out.print("\n1.Enquiry\n2.Withdraw\n3.Deposit\n4.Transfer\n(Anything else to Logout)\nEnter option:");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String ch = br.readLine();

    switch (ch) {
      case "1":
        Enquiry enq = new Enquiry();
        enq.display(currAccount);
        break;

      case "2":
        Updation up = new Updation();
        up.withdrawAmt(currAccount);
        break;

      case "3":
        Updation upd = new Updation();
        upd.depositAmt(currAccount);
        break;

      case "4":
        Transfer transfer = new Transfer();
        transfer.transferAmount(currAccount);
        break;

      default:
        MainClass.endSession("LOGOUT BY USER!!");
    }

  }
}
