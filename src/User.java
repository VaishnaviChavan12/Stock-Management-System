/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaishnavi Chavan
 */
class User {
    private int SId;
    private String FName,LName,Email,Gender,DOB,Address,Contact;
    public User(int SId,String FName,String LName,String Contact,String Email,String Gender,String DOB,String Address)
    {
        this.SId=SId;
        this.FName=FName;
        this.LName=LName;
        this.Email=Email;
        this.Gender=Gender;
        this.DOB=DOB;
        this.Contact=Contact;
        this.Address=Address;       
    }
    public int getSId()
    {
        return SId;
    }
    public String getFName()
    {
        return FName;
    }
    public String getLName()
    {
        return LName;
    }
    public String getEmail()
    {
        return Email;
    }
    public String getGender()
    {
        return Gender;
    }
    public String getDOB()
    {
        return DOB;
    }
    public String getContact()
    {
        return Contact;
    }
    public String getAddress()
    {
        return Address;
    }
}
