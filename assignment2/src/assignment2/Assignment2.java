/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

public class Assignment2 {
public static void main(String args[])
{
    String a="asmaa";
    String b ="mahmoud";
    String output1=StringUtils.betterString(a,b,(aa,bb)->aa.length()>bb.length());
    System.out.println(output1);
    String result2=StringUtils.betterString(a,b,(aa,bb)->true);
    System.out.println(result2);

}   
}
