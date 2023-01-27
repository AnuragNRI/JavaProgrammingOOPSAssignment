public class Account {
    int accountId;
    String description;
    long minimumBalance;

    public Account(int accountId , String description){
        this.accountId = accountId;
        this.description = description;
    }

    public void display() {
        System.out.println("This method is used to display the content of the class");
    }
}
