public class Saving extends Account{
    public Saving(int accountId , String description) {
        super(accountId , description);
        this.minimumBalance = 500;
    }

    public void display(){
        System.out.println("The minimum balance of " + description + " with account id " + accountId + " is " + minimumBalance);
    }
}
