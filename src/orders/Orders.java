/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orders;

/**
 *
 * @author Amer Osama
 */
public class Orders {
    private int id;
    private final int quantity;
    private int cashier_id,client_id,item_id;
    public Orders(int quantity, int cashier_id, int client_id, int item_id)
    {
        this.quantity = quantity;
        this.cashier_id=cashier_id;
        this.client_id=client_id;
        this.item_id=item_id;
    }
    
       public Orders(int order_id, int quantity)
    {
        id=order_id;
        this.quantity = quantity;
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @return the cashier_id
     */
    public int getCashier_id() {
        return cashier_id;
    }

    /**
     * @return the client_id
     */
    public int getClient_id() {
        return client_id;
    }

    /**
     * @return the item_id
     */
    public int getItem_id() {
        return item_id;
    }
}
