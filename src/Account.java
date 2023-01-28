public abstract class Account {
    int accountId;
    String description;
    long minimumBalance;

    // We can still define a Constructor in abstract and set out attributes
    // But we can not create a direct object out of this class
    public Account(int accountId , String description){
        this.accountId = accountId;
        this.description = description;
    }

    public abstract void display();
}
