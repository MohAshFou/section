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
public class Employee extends person {
    protected String office ,data_hired;
    protected  double salary;
    MyDate mydata;

    public Employee(String office, String data_hired, double salary, MyDate mydata) {
        this.office = office;
        this.data_hired = data_hired;
        this.salary = salary;
        this.mydata = mydata;
    }
    @Override
 public void ToString(){
   
   System.out.println(this.getClass().getName() + " : "+name) ;
   
   }
public void print ()
{


    System.out.println(mydata.day + "/" + mydata.month + "/"+mydata.year);

}
}


