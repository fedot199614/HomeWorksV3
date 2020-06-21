package lesson_2;

import lesson_2.Ex_1.Bank;
import lesson_2.Ex_1.exceptions.PositiveException;
import lesson_2.Ex_1.factories.AccountFactories;

public class Main {

    public static void main(String[] args) throws PositiveException {


       Bank bank = new Bank(AccountFactories.generateRandomAccountList(30));
       //bank.printAccountList(); //Check all generated Accounts Type
       bank.updateAccountsBalance(); //update process

    }
}
