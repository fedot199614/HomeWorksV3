package lesson_2.Ex_1.account;

import lesson_2.Ex_1.exceptions.PositiveException;

public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int num) throws PositiveException {
        super(num);
        this.setInterest(0);
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(int interest) throws PositiveException{
        if(interest>=0 && interest<=100){
            this.interest = interest;
        }else {
            throw new PositiveException("Error: Interest should be between 0% and 100%");
        }
    }

    @Override
    public String toString() {
        return "Account type "+this.getClass().getName()+"| Account ID is " + getAccountNumber() + " the balance " + getBalance() + "$," + " The interest is " + getInterest()+"%";
    }
}
