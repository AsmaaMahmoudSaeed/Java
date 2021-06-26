/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_assignment;
import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author asmaa
 */
public class City_assignment {

  public static void main(String[] args)
{
List<city>mylistcity=DAOcity.DAOcity1( "citys1.csv");
List <country> mycountry =DAOcountry.DAOcountry1("country.csv");
Map<Integer, List<city>> mymap = new HashMap<>(); 
for(int i=0;i<mycountry.size();i++)
{
 mymap.put(mycountry.get(i).getCode(),new ArrayList<>()); 
}
for(int i=0;i<mylistcity.size();i++)
{
List<city> arr= mymap.get(mylistcity.get(i).getCode());
arr.add(mylistcity.get(i));
mymap.put(mylistcity.get(i).getCode(),arr);

}

List<city> sorted=null;
for(int i =1 ;i<mymap.size()+1;i++)
{
 sorted=sorted_city(mymap.get(i));

}
for(int i =0 ;i<mymap.get(1).size();i++)
{
System.out.println(mymap.get(1).get(i).getName());
System.out.println("-------------");
}
System.out.println("egypt sorted ");
System.out.println("-------------");

for(int i =0 ;i<mymap.get(2).size();i++)
{
System.out.println(mymap.get(2).get(i).getName());
System.out.println("-------------");
}
System.out.println("saudi arabia sorted ");



}
public static List<city> sorted_city(List<city> c)
{

c.sort(new population_comp());
return  c;
}
  




}
