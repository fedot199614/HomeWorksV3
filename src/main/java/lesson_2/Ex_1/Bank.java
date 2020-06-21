package lesson_2.Ex_1;

import lesson_2.Ex_1.account.Account;
import lesson_2.Ex_1.account.CurrentAccount;
import lesson_2.Ex_1.account.SavingsAccount;
import lesson_2.Ex_1.exceptions.PositiveException;

import java.util.Map;

public class Bank {
      private Map<Integer,Account> accountList;
      public static final int MAX_FIRST_DEPOSIT = 50000;
      public static final double MAX_OVERDRAFT_LIMIT = 25000;
      public static final double MAX_INTEREST = 15.0;


      public Bank(Map<Integer,Account> accountList){
          this.accountList = accountList;
      }

      public void printAccountList(){
          this.accountList.forEach((accountID,account)->{
              System.out.println(account);
           });
      }

      public void openAnAccount(Account account){
          this.accountList.put(account.getAccountNumber(),account);
      }

    public void closedAccount(Account account){
        this.accountList.get(account.getAccountNumber());
    }

    public Account searchAccount(int accountID){
          if(accountList.containsKey(accountID)) {
              return this.accountList.get(accountID);
          }else{
              if(ifAccountExistsInBase(accountID)){
                  System.out.println("Current account "+accountID+" did not exists in our list!!!");
              }
              return null;
          }
    }

    public boolean ifAccountExistsInBase(int accountID){
        if(accountList.containsKey(accountID)) {
            return true;
        }else{
            return false;
        }
    }

    public void updateAccountsBalance(){
        this.accountList.forEach((accountID,account) ->{
            int currentAccountNum = account.getAccountNumber();
            double currentAccountBalance = account.getBalance();

            if(account instanceof SavingsAccount){
                System.out.println("Preparing to update balance for account "+currentAccountNum+". Current balance "+currentAccountBalance+"$. Current interest "+((SavingsAccount) account).getInterest()+"%");
                try {

                    account.deposit(((currentAccountBalance*(((SavingsAccount) account).getInterest()))/100.0));
                } catch (PositiveException e) {
                    e.printStackTrace();
                }
                System.out.println("Current balance for account "+currentAccountNum+" after update is "+account.getBalance()+"$");
            }else if(account instanceof CurrentAccount){
                double credit = Utils.getRandomNumber(100000);
                if(credit>((CurrentAccount) account).getOverDraftLimit()){
                    System.out.println("We can't approve this credit "+credit+"$ for account "+currentAccountNum+", because your Overdraft Limit is "+((CurrentAccount) account).getOverDraftLimit()+"$ and balance is "+currentAccountBalance+"$");
                }else{
                    System.out.println(credit+"$ Credit  was successful approved for account "+currentAccountNum+". Your current Overdraft Limit is "+((CurrentAccount) account).getOverDraftLimit()+"$ and balance = "+currentAccountBalance+"$");
                    try {
                        account.withdraw(credit);
                    } catch (PositiveException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Current balance for account "+currentAccountNum+" after credit is "+account.getBalance()+"$");
                }
            }
        });
    }



}
