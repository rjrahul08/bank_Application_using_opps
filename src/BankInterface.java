public interface BankInterface {
    int getBalanace();

    String depositeMoney(int amount);


    String withdraw(int amount, String enterPassword);

    double calculateIntterest(int time);

}
