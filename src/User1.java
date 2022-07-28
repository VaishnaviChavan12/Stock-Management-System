
/**
 *
 * @author Vaishnavi Chavan
 */
class User1 {
     private int CId;
    private String FName,LName,Email,Gender,DOB,Address,Contact;
    public User1(int CId,String FName,String LName,String Contact,String Email,String Gender,String DOB,String Address)
    {
        this.CId=CId;
        this.FName=FName;
        this.LName=LName;
        this.Email=Email;
        this.Gender=Gender;
        this.DOB=DOB;
        this.Contact=Contact;
        this.Address=Address;       
    }
    public int getCId()
    {
        return CId;
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
