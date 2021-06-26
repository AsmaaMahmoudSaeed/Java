/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author asmaa
 */
public class Assignment3 {

    public static void main(String[] args) {
   
alphapet a=(s)->{
 for(int j=0;j<s.length();j++)
       {
       if(!Character.isLetter(s.charAt(j)) )
           return false;
       } 
        return true;
};
System.out.println("test 1  "+a.alphapet_func("java"))  ; 
System.out.println("test 2 "+a.alphapet_func("5454"))  ; 

System.out.println("test 3 "+a.alphapet_func("sssss54"))  ; 

    }
    
}
