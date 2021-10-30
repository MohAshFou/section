/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec2;

/**
 *
 * @author USER
 */
public class faculty  extends Employee{
    protected double office_hours,rank;

    public faculty(double office_hours, double rank, String office, String data_hired, double salary, MyDate mydata) {
        super(office, data_hired, salary, mydata);
        this.office_hours = office_hours;
        this.rank = rank;
    }

    
    public void get_office_hours(double o_h)
    {
        office_hours = o_h;
            }
    public void get_rank (double r)
    {
        rank = r;
            }
    public void set_office_hours()
    {
    
        System.out.println(office_hours);
    }
     public void set_rank()
    {
    
        System.out.println(rank);
    }
    @Override
 public void ToString(){
   
   System.out.println(this.getClass().getName() + ":"+name) ;
   
   }

    
}
