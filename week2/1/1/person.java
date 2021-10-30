
package sec2;


public class person {
    protected  String name ,address,email_address;
    protected int phone_number;

//    public person() {
//         name = " ";
//         address= " ";
//         email_address= " ";
//         phone_number= 0;
//    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public void setEmail_address(String e) {
        this.email_address = e;
    }

    public void setPhone_number(int p) {
        this.phone_number = p;
    }

    public void getName() {
        System.out.println(name); 
    }

    public void getAddress() {
        System.out.println(address)  ;
    }

    public void getEmail_address() {
        System.out.println(email_address) ;
    }

    public void getPhone_number() {
        System.out.println(phone_number) ;
    }
   
   public void ToString(){
   String u = this.getClass().getName();
   System.out.println( u +":"+name) ;
   
   }
   public void print(){
  
   System.out.println( name) ;
   System.out.println( address) ;
   System.out.println( email_address) ;
   System.out.println( phone_number) ;
   
   }
}
