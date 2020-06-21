package lesson_2.Ex_1.account;

import lesson_2.Ex_1.exceptions.PositiveException;

public class CurrentAccount extends Account {
    private double overDraftLimit;

    public CurrentAccount(int num) throws PositiveException {
        super(num);
        setOverDraftLimit(0);
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) throws PositiveException{
        if(overDraftLimit>=0){
            this.overDraftLimit = overDraftLimit;
        }else{
            throw new PositiveException("Error: Overdraft Limit should be positive");
        }

    }

    @Override
    public String toString() {
        return "Account type "+this.getClass().getName()+"| Account ID is " + getAccountNumber() + "  the balance " + getBalance() + "$," + " The Overdraft Limit is " + getOverDraftLimit();
    }
}
