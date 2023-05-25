package creditCard;

import java.util.Date;

public class CreditCard {
    private String number;
    private String holderName;
    private Date expirationDate;
    private int cvv;
    private double balance;
    
    
    public CreditCard(String number, String holderName, Date expirationDate, int cvv) {
        this.number = number;
        this.holderName = holderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.balance = 0.0;
    }
    
   
    
    public String getNumber() {
        return number;
    }
    
    public String getHolderName() {
        return holderName;
    }
    
    public Date getExpirationDate() {
        return expirationDate;
    }
    
    public int getCvv() {
        return cvv;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    public boolean isExpired() {
        Date currentDate = new Date();
        return expirationDate.before(currentDate);
    }
    


    public static boolean isValidCvv(int cvv) {

        return cvv >= 100 && cvv <= 999;
    }
    
    
    public static boolean isValidNumber(String cardNumber) {
        return cardNumber.length() == 16;
    }
    


}
