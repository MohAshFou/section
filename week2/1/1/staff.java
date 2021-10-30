
package sec2;


public class staff extends Employee {
    protected  String title;

    public staff(String t,String office, String data_hired, double salary, MyDate mydata) {
        super(office, data_hired, salary, mydata);
        title = t;
    }
    public void get_staff(String t)
    {
    
    title=t;
    }
    public void set_staff()
    {
    
        System.out.println(title);
    }
     @Override
 public void ToString(){
   
   System.out.println(this.getClass().getName() + ":"+name) ;
   
   }
}
