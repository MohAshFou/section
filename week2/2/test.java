/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author USER
 */
public class test {
    public static void main(String[] args) {
        Address a = new Address("10","Alex","Egypt");
        Subject sub = new Subject("Math","scHUO",3);
        student s = new student();
        s.setName("Ahmed");
        s.setId("102");
        s.setGPA(3.5);
        s.setAddress(a);
        s.setSubject(sub);
        System.out.println("______________________________________________________________________");
        s.getName();
        s.getId();
        s.getAddress();
        s.getSubject();
        s.getGPA();
        System.out.println("______________________________________________________________________");
        System.out.println("______________________________________________________________________");
        s.print();
    }
    
}
