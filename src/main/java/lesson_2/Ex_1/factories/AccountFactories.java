package lesson_2.Ex_1.factories;

import lesson_2.Ex_1.Utils;
import lesson_2.Ex_1.account.Account;
import lesson_2.Ex_1.account.CurrentAccount;
import lesson_2.Ex_1.account.SavingsAccount;
import lesson_2.Ex_1.enums.AccountType;
import lesson_2.Ex_1.exceptions.PositiveException;
import lesson_2.Ex_1.Bank;

import java.util.Map;
import java.util.TreeMap;

public class AccountFactories {

    private static Account getAccount(AccountType accountType) throws PositiveException {
      if(accountType == AccountType.CURRENT_ACCOUNT){
          Account account = new CurrentAccount(Utils.getUniqueID());
          account.deposit(Utils.getRandomNumber(Bank.MAX_FIRST_DEPOSIT));
          ((CurrentAccount) account).setOverDraftLimit(Utils.getRandomNumber((int) Bank.MAX_OVERDRAFT_LIMIT));
          return account;
      }else if(accountType == AccountType.SAVINGS_ACCOUNT){
          Account account = new SavingsAccount(Utils.getUniqueID());
          account.deposit(Utils.getRandomNumber(Bank.MAX_FIRST_DEPOSIT));
          ((SavingsAccount) account).setInterest(Utils.getRandomNumber((int) Bank.MAX_INTEREST));
          return account;
      }
      return null;
    }

    public static Map<Integer,Account> generateRandomAccountList(int boundary) throws PositiveException {
        Map<Integer,Account> accountList = new TreeMap<>();

        for(int i =0;i<boundary;i++){
            AccountType randomAccountType = AccountType.values()[(Utils.getRandomNumber(AccountType.values().length)-1)];
            Account account = getAccount(randomAccountType);
            assert account != null;
            accountList.put(account.getAccountNumber(),account);
        }
        return accountList;
    }

}
