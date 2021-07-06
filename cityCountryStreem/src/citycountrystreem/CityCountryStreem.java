/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citycountrystreem;
import java.util.*;
import java.util.stream.Collectors;
public class CityCountryStreem {
    public static void main(String[] args) {
        String cityPath="citys.csv";
        String countryPath="countries.csv";

        System.out.println("this is cities grouped by country sorted by population without stream :\n"+Places.cityClassifier(cityPath,countryPath)+"\n");
        ArrayList<Country> countries_list =Places.readCountry(countryPath);
        ArrayList<City> cities_list =Places.readCity(cityPath);

        Map<Integer,ArrayList<City>> countryCity;
        countryCity =new HashMap<>();

        Map<Integer, City> maxPopulation;
        maxPopulation=new HashMap<>();

        Map<String, City> maxPopulationByContinent;
        maxPopulationByContinent=new HashMap<>();

        Map<String,ArrayList<City>> continentCity =new HashMap<>();
        Set<String> continents=new HashSet<>();

        cities_list.stream().forEach(city -> continents.add(city.continent));

        countries_list.stream().forEach(country -> countryCity.put(country.code, cities_list.stream().filter(city -> city.code==country.code).sorted(Comparator.comparing(City::getPopulation)).collect(Collectors.toCollection(ArrayList::new))));
        continents.stream().forEach(continent -> continentCity.put(continent, cities_list.stream().filter(city -> city.continent.equals(continent)).sorted(Comparator.comparing(City::getPopulation)).collect(Collectors.toCollection(ArrayList::new))));
        continents.stream().forEach(continent -> maxPopulationByContinent.put(continent, cities_list.stream().filter(city -> city.continent.equals(continent)).max(Comparator.comparing(City::getPopulation)).get()));



                countries_list.stream().forEach(country ->maxPopulation.put(country.code, cities_list.stream().filter(city -> city.code==country.code).max(Comparator.comparing(City::getPopulation)).get()));



        System.out.println("this is Cities grouped by Countries sorted by Population:\n"+countryCity+"\n");
        System.out.println("this is  city with highest population in each country:\n"+maxPopulation+"\n");
        System.out.println("this is Cities grouped by Continents sorted by Population:\n"+continentCity+"\n");
        System.out.println("this is city with highest population in each continent:\n"+maxPopulationByContinent+"\n");
    }
}
