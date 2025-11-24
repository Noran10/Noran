package noran_446000744__mai_446000766;
/*
 * Group:25
 */
import java.util.Scanner;


public class APP {
public static void main(String[] args) {
   
//يستقبل مدخلات المستخم
         Scanner user=new Scanner(System.in);
         
         System.out.println("--------------------------------------------------------------------------------------------------------------");
         System.out.println("------------------------------------------Welcome To SCARF Store-----------------------------------------------");
         System.out.println("--------------------------------------------------------------------------------------------------------------");
         
         
//الطلب من المستخدم ادخال معلوماته
         System.out.println("\n enter your name:");
          String name=user.nextLine();
         
         System.out.println("enter your email:");
          String email=user.nextLine();
         
         System.out.println("enter your address:");
          String address=user.nextLine();
         
         System.out.println("enter your ID:");
          int ID=user.nextInt();
         
         System.out.println("enter your mobile number:");
          int mobileNumber=user.nextInt();
         
         
         
//كائن للعميل باستخدام المعلوات الي دخلها
   Customer C=new Customer( name,  address,email,  ID, mobileNumber);
         
//كائن للمنتجات المتوفرة في المتجر
         Product  scarf1=new Product("A blue scarf",11,123);
         Product  scarf2=new Product("A black scarf",12,1234);
         Product  scarf3=new Product("A Green scarf",13,12345);     
         Product  scarf4=new Product("A Brown scarf",14,123456);     
         Product  scarf5=new Product("A  Red  scarf" ,15,1234567);     

//مصفوفة تحتوي كائنات العميل والمنتجات
         Customer [] c={C}; 
         Product [] p={scarf1,scarf2,scarf3,scarf4,scarf5};
         
//كائن للمتجر
Organization scarf_store=new Organization("scarf_store","makkah",23456,p,c);
         
//طباعة البيانات
        System.out.println("\n------------------customer------------------");
        System.out.println(C);
     
        System.out.println("\n------------------Product------------------");
        System.out.println("Product information:  ");
        
        for(int i=0;i<p.length;i++){
            System.out.println(p[i]);
        }
        
        System.out.println("\n------------------Organization------------------");
        System.out.println(scarf_store);
        
    }
    
}
