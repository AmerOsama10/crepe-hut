package orders;

import items.Items;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Handles item retrieval from the database.
 */
public class FindIemsDetails {

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/crepehut";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public FindIemsDetails() {}

    /**
     * Establishes a connection to the database.
     *
     * @return a Connection object or null if connection fails
     */
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database: " + e.getMessage());
            return null;
        }
    }

    /**
     * Fetches a list of items by a single item ID.
     *
     * @param itemId the ID of the item
     * @return a list of Items matching the given ID
     */
    public ArrayList<Items> getItemList(int itemId) {
        ArrayList<Items> itemList = new ArrayList<>();
        String query = "SELECT * FROM `Items` WHERE `item_id` = ?";

        try (Connection connection = getConnection();
             PreparedStatement pst = connection.prepareStatement(query)) {

            pst.setInt(1, itemId);
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Items item = new Items(
                            rs.getInt("item_id"),
                            rs.getString("item_name"),
                            rs.getString("item_size"),
                            rs.getFloat("item_cost")
                    );
                    itemList.add(item);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error fetching item: " + e.getMessage());
        }
        return itemList;
    }


    /**
     * Fetches all item details for item IDs between 70 and 79.
     *
     * @return an ArrayList of Items matching the ID range
     */
    public ArrayList<Items> getItemListByIds() {
        ArrayList<Items> itemList = new ArrayList<>();

        String query = "SELECT * FROM `Items` WHERE `item_id` BETWEEN 70 AND 79";

        try (Connection connection = getConnection();
             PreparedStatement pst = connection.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Items item = new Items(
                        rs.getInt("item_id"),
                        rs.getString("item_name"),
                        rs.getString("item_size"),
                        rs.getFloat("item_cost")
                );
                itemList.add(item);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error fetching items: " + e.getMessage());
        }
        return itemList;
    }


}
