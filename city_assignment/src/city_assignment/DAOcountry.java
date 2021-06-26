/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_assignment;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asmaa
 */
public class DAOcountry {
   	
public static   List <country> DAOcountry1(String fileName)
{
List <country>mylist=new ArrayList<>();
File f=new File(fileName);
List <String>countrylist;
countrylist= new ArrayList<String>();
try {
countrylist=Files.readAllLines(f.toPath());
        } 
 catch (IOException e)
 {
  System.out.println("Error in country CsvFileReader !!!");
 }
for(int i=0;i<countrylist.size();i++)
{
String line=countrylist.get(i);
String [] fields=line.split(",");
for(int j=0 ;j<fields.length;j++)
{
fields[j]=fields[j].trim();
}    
country co1=new country(Integer.parseInt(fields[0]),fields[1]);
mylist.add(co1);  
}

return mylist;
}
	
}
