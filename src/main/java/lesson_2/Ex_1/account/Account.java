package lesson_2.Ex_1.account;

import lesson_2.Ex_1.exceptions.PositiveException;

public class Account
{
    private double balance; //The current balance
    private int acctNum; //The account number  public Account (int num)


    public Account(int num){
        balance = 0.0;
        acctNum = num;
    }

    public void deposit (double amt) throws PositiveException {
        if (amt>0)
            this.balance += amt;
        else
            throw new PositiveException("Can not deposit negative amount!");
        // add the amount to the balance only if positive
    }
    public void withdraw (double amt) throws PositiveException
    {
        if (amt>0)
            this.balance -=amt;
        else
            throw new PositiveException("Can not withdraw negative amount!");
        // subtract the amount from the balance only if poisitve
    }

    public double getBalance()
    {
        return balance; //returns the balance
    }
    public int getAccountNumber()
    {
        return acctNum; //returns the account number
    }
    @Override
    public String toString()
    {
        return "Account number is " + acctNum + " the balance is " + balance + ".";
    }

    public final void print ()
    {
        //Don't override this, override the toString method above
        System.out.println(toString());
    }
}

