
package newpackage;


public class student {
    
    private String name ,id;
    private Double GPA;
    Subject  subject ;
    Address  address ;

    public void setName(String n) {
       name = n;
    }

    public void setId(String i) {
        id = i;
    }

    public void setGPA(Double G) {
        GPA = G;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void getName() {
        System.out.println(name) ;
    }

    public void getId() {
       System.out.println("the ID Of "+ name + " is :" +id) ;
    }

    public void getGPA() {
        System.out.println("the ID GPA "+ name + " is :" +GPA) ; 
    }

    public void getSubject() {
        System.out.println("Subject ") ;
        System.out.println(" Name_Subject : " + subject.Name_Subject + " ID_Subject :" + subject.ID_Subject + " hours : " + subject.hours) ;
        
    }

    public void getAddress() {
         System.out.println(" the Address  of " + name ) ;
        System.out.println(" streeNO : " + address.streeNO + " city :" + address.city + " country : " + address.country) ;
        
    }
    
public void  print() {

this.getName();
this.getId();
this.getAddress();
this.getSubject();
this.getGPA();

}
}
