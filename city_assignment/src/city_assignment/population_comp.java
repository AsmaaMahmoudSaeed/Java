/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_assignment;

import java.util.Comparator;
import java.util.*;
/**
 *
 * @author asmaa
 */
 class  population_comp implements  Comparator<city>
{
List<city>mylistcity=DAOcity.DAOcity1( "citys1.csv");


@Override
 public int  compare(city c1, city c2)
  {
   return  c1.getPopulation().compareTo(c2.getPopulation());
   
  }
    
}