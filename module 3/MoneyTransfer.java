import java.sql.*;

public class MoneyTransfer {
    private static final String URL = "jdbc:mysql://localhost:3306/your_db";
    private static final String USER = "your_user";
    private static final String PASS = "your_password";

    public static void transferMoney(int fromAccountId, int toAccountId, double amount) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            conn.setAutoCommit(false);

            try (PreparedStatement debitStmt = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                 PreparedStatement creditStmt = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {

                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAccountId);
                int debitUpdated = debitStmt.executeUpdate();

                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAccountId);
                int creditUpdated = creditStmt.executeUpdate();

                if (debitUpdated == 1 && creditUpdated == 1) {
                    conn.commit();
                    System.out.println("Transfer successful.");
                } else {
                    conn.rollback();
                    System.out.println("Transfer failed, transaction rolled back.");
                }
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        transferMoney(1, 2, 100.00);
    }
}