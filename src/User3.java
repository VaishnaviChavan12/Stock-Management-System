/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaishnavi Chavan
 */
class User3 {
    private int PID;
    private String PName,Category,Price,Quantity;
    public User3(int PID,String PName,String Price,String Category,String Quantity)
    {
        this.PID=PID;
        this.PName=PName;
        this.Price=Price;
        this.Category=Category;
        this.Quantity=Quantity;
              
    }
    public int getPID()
    {
        return PID;
    }
    public String getPName()
    {
        return PName;
    }
    public String getPrice()
    {
        return Price;
    }
    public String getCategory()
    {
        return Category;
    }
    public String getQuantity()
    {
        return Quantity;
    }
       
}
