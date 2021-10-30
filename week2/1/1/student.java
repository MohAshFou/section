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
public class student extends person{
    protected String statu ;

    public student(String s) {
        this.statu = s;
    }
     public void get_statu (String s)
    {
       statu = s;
            }
    public void set_statu()
    {
    
        System.out.println(statu);
    }
    
 @Override
 public void ToString(){
   
   System.out.println(this.getClass().getName() + " :"+name) ;
   
   }
}
