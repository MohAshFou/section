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
public class test {
    public static void main(String[] args) {
                                  person p = new person();
                                   p.setName("ahmed");
                                  p.setEmail_address("ahmed11@gmail.com");
                                  p.setAddress("cairo");
                                  p.setPhone_number(010000000003);
//                                          p.getName();
//                                           p.getAddress();
//                                            p.getPhone_number();
//                                            p.getEmail_address();
          System.err.println("___________________________________________");
                                            p.ToString();
 System.err.println("___________________________________________________________________________________");
        student  s = new student("freshman");  
                                  s.setName("mohamed");
                                  s.setEmail_address("ahmed11@gmail.com");
                                  s.setAddress("cairo");
                                  s.setPhone_number(010000000003);
                                       s.ToString();
     System.err.println("___________________________________________________________________________________");
         MyDate m = new MyDate("2000","2","20");
        Employee e =  new Employee("manager","nnn",7000.00,m);
                                  e.setName("mohamed");
                                  e.setEmail_address("ahmed11@gmail.com");
                                  e.setAddress("cairo");
                                  e.setPhone_number(010000000003) ;
                                  e.print();
                                      e.ToString();
      System.err.println("___________________________________________________________________________________");
      faculty f = new faculty(5,2000,"manager","nnn",2000,m);
                                  f.setName("mohamed");
                                  f.setEmail_address("ahmed11@gmail.com");
                                  f.setAddress("cairo");
                                  f.setPhone_number(010000000003) ;
      f.ToString();
      System.err.println("___________________________________________________________________________________");
                          staff st = new staff("mmm","manager","mmmm",2000,m);
                          st.setName("mohamed");
                                  st.setEmail_address("ahmed11@gmail.com");
                                  st.setAddress("cairo");
                                  st.setPhone_number(010000000003) ;
                                  st.ToString();
      
    }
    
}
    

 
