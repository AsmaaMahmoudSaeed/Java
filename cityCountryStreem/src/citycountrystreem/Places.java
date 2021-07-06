/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citycountrystreem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
public class Places {
    public static ArrayList<City> readCity(String path) {

        ArrayList<City> city=new ArrayList<>();
    try {
        BufferedReader buffer = new BufferedReader(new FileReader(path));
        String line=buffer.readLine();
        if(line!=null){
            line= buffer.readLine();
        }
        while(line!=null){
            String[] atrib=line.split(",");
            city.add(new City(atrib));
            line=buffer.readLine();
        }

    }catch (Exception exp){}

     return city;
    }

    public static ArrayList<Country> readCountry(String path) {

        ArrayList<Country> country=new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line=br.readLine();
            if(line!=null){
                line= br.readLine();
            }
            while(line!=null){
                String[] atrib=line.split(",");
                country.add(new Country(atrib));
                line=br.readLine();
            }

        }catch (Exception exp){}

        return country;
    }
    public static Map<Integer,ArrayList<City>> cityClassifier(String cityPath,String countryPath){

        ArrayList<City> cityList = Places.readCity(cityPath);
        Iterator<City> cityIt;

        ArrayList<Country> countryList = Places.readCountry(countryPath);
        Iterator<Country> country_iterator=countryList.iterator();

        Map<Integer,ArrayList<City>>my_map=new HashMap<>();

        while(country_iterator.hasNext()){
            int countryCode=country_iterator.next().code;
            cityIt=cityList.iterator();
            while(cityIt.hasNext()){
                City city=cityIt.next();
                if(city.code==countryCode){
                    if(my_map.get(countryCode)!=null){
                        my_map.get(countryCode).add(city);

                    }
                    else{
                        ArrayList<City> cities_list=new ArrayList<>();
                        cities_list.add(city);
                        my_map.put(countryCode,cities_list);
                    }

                }
            }
        }
        my_map.forEach((k,v)-> Collections.sort(v));
        return my_map;
    }
    }

