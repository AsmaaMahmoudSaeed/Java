/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_assignment;
import java.io.*;
import java.nio.file.Files;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asmaa
 */
public class DAOcity {
    	

public static  List<city> DAOcity1(String ss)
{
List<city> mylistcity=new ArrayList<>();
File fi=new File(ss);
List <String>lines1= new ArrayList<>();
try {
lines1=Files.readAllLines(fi.toPath());

        } 
 catch (IOException n)
 {
  System.out.println("Error in city  CsvFileReader !!!");
 }
for(int i=0;i<lines1.size();i++)
{
String line1=lines1.get(i);
String [] fieldsa=line1.split(",");
for(int j=0 ;j<fieldsa.length;j++)
{
fieldsa[j]=fieldsa[j].trim();
}    
city c1=new city(Integer.parseInt(fieldsa[0]),fieldsa[1],fieldsa[2],Double.parseDouble(fieldsa[3]),Integer.valueOf(fieldsa[4]));
mylistcity.add(c1);  
}
return mylistcity;
}
	
}
