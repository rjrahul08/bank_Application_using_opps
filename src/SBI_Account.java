import java.util.UUID;

public class SBI_Account implements BankInterface{

    private String name;
    private String accountNo;
    private int balance;
    private String Password;
    private double rateOfInterest;

    public SBI_Account(String name ,int balance , String Password){
        this.name = name;;
        this.balance = balance;
        this.Password = Password;

        this.rateOfInterest = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }


    @Override
    public int getBalanace() {
        return this.balance;
    }

    @Override
    public String depositeMoney(int amount) {
        this.balance += amount;
        return amount+ " is deposited";
    }

    @Override
    public String withdraw(int amount, String enterPassword) {
        if(enterPassword.equals(this.Password)){
            if(balance < amount){
                return "Insufficient balance";
            }
            else{
                balance -= amount;
                return "Money deducted and the current balance is "+balance;
            }
        }
        else{
            return "Wrong Password, please check the password";
        }
    }

    @Override
    public double calculateIntterest(int time) {

        return (balance*rateOfInterest*time)/100.0;
    }
}
