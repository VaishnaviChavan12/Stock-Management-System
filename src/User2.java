/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaishnavi Chavan
 */
class User2 {
    private int PId,Price;
    private String PName,Category;
    public User2(int PId,String PName,int Price,String Category)
    {
        this.PId=PId;
        this.PName=PName;
        this.Category=Category;
        this.Price=Price;           
    }
    public int getPId()
    {
        return PId;
    }
    public String getPName()
    {
        return PName;
    }
    public String getCategory()
    {
        return Category;
    }
    public int getPrice()
    {
        return Price;
    }
    
}
