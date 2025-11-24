/*
 * Group:25
 */
package noran_446000744__mai_446000766;

//تعريف خصائص المنتج
public class Product {
    private String name;
    private double price;
    private int ID;

    
        
// انشاء كونسركتور لتعيين القيم الابتدائية للمنتجات
   
public Product (  String name,double price, int ID){
    this.name=name;
    this.price=price;
    this.ID=ID;
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
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------//
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
// دالة (toString) لطباعة معلومات  بشكل نصي
//-----------------------------------------------------------------------------------------------------------------------------------------------------//

    public String toString(){

        return "\nname : "+name+",  price : "+price+",  ID : "+ID;
}
}

