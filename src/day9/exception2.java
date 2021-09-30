package day9;

import java.io.IOException;

public class exception2{  
  void m() {   
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handeled");}  
  }  
  public static void main(String args[]){  
   exception2 obj=new exception2();  
   obj.p();  
   System.out.println("normal flow");  
  }  
}  