/*
 * Group:25
 */
package noran_446000744__mai_446000766;

//تعريف خصائص العميل
public class Customer {
    private String name;
    private String address;
    private String email;
    private int ID; 
    private int mobileNumber;

    
// انشاء كونسركتور لتعيين القيم الابتدائية للعميل
    
public Customer (  String name, String address,String email, int ID,int mobileNumber){
    this.name=name;
    this.address=address;
    this.email=email;
    this.ID=ID;
    this.mobileNumber= mobileNumber;
    }
   

// للحصول والتعديل على البيانات
//-----------------------------------------------------------------------------------------------------------------------------------------------------//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//-----------------------------------------------------------------------------------------------------------------------------------------------------//
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//-----------------------------------------------------------------------------------------------------------------------------------------------------//
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//--------------------- --------------------------------------------------------------------------------------------------------------------------------//
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

//-----------------------------------------------------------------------------------------------------------------------------------------------------//
    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

// دالة (toString) لطباعة معلومات العميل  بشكل نصي
//-----------------------------------------------------------------------------------------------------------------------------------------------------//

public String toString(){

        return "customer information:  "+"\nname : "+name+" , address : "+address+" , email : "+email+" , ID : "+ID+" ,  mobileNumber : "+mobileNumber;
}
}


