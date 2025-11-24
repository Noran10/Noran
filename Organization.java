/*
 * Group:25
 */
package noran_446000744__mai_446000766;


public class Organization {
//رقم التعريف,العنوان,الاسم:المتغيرات الخاصة بالمؤسسة
    private String name;
    private String address;
    private int ID;
    
//مصفوفة  تحتوي على المنتجات والعملاء المرتبطين بالمؤسسة
    private Product [] products;
    private Customer [] customers;
    
    
    
// تعيين القيم الابتدائية لمتغيرات المؤسسة
public Organization (  String name, String address, int ID,Product [] products, Customer [] customers){
    this.name=name;
    this.address=address;
    this.ID=ID;
    this. products= products;
    this.customers= customers;  
    }
   

//للحصول والتعديل على البيانات
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
    public int getID() {
    return ID;
}
    
    public void setID(int ID) {
        this.ID = ID;
    }

//-----------------------------------------------------------------------------------------------------------------------------------------------------//

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    
    
//-----------------------------------------------------------------------------------------------------------------------------------------------------//
    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }



// دالة (toString) لطباعة معلومات المنتجات بشكل نصي
public String toString(){

String result = "\nOrganization information:\nName: " + name + "\nAddress: " + address + "\nID: " + ID + "\n\nProducts:\n";
      //-----------------------------------------------------------------------------------------------------------------------------------------------------//
    
      for(int i=0;i<products.length;i++){
       result += products[i].toString() + "\n";  
       }    
      
      //----------------------
      result += "\nCustomers:\n";
      //----------------------
      
    for(int i=0;i<customers.length;i++){
       result+=customers[i].toString() + "\n"; 
    }
        return result;
 
}



   }
    
    
    
    

