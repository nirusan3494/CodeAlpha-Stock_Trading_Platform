public class User {
    private int userId;
    private String username;
    private double cashBalance;

    public User(int userId, String username, double cashBalance) {
        this.userId = userId;
        this.username = username;
        this.cashBalance = cashBalance;
    }

    public int getUserId() { return userId; }
    public String getUsername() { return username; }
    public double getCashBalance() { return cashBalance; }

    public void setCashBalance(double cashBalance) {
        this.cashBalance = cashBalance;
    }
}