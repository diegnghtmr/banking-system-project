package co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter;

import java.time.LocalDate;

public abstract class Transaction {
    private LocalDate date;
    private double amount;
    private Account account;
    
    public  Transaction (){
        this.date = LocalDate.now();
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
}
