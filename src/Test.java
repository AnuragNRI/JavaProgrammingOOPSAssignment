public class Test {
    public static void main(String[] args) {
        Current c = new Current(101, "Current Account");
        Saving s = new Saving(102, "Saving Account");

        c.display();
        s.display();
    }
}

