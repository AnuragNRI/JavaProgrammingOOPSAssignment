public class Current extends Account {

    public Current(int accountId , String description) {
        super(accountId , description);
        this.minimumBalance = 0;
    }

    public void display(){
        System.out.println("The minimum balance of " + description + " with account id " + accountId + " is " + minimumBalance);
    }
    
}
