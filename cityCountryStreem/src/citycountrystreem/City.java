/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citycountrystreem;

import java.util.ArrayList;

public class City implements Comparable<City>{
    public String name;
    public int code;
    public String continent;
    public int surfaceArea;
    public Integer population;

    public City(String[] arr) {
        this.name = arr[1];
        this.code = Integer.parseInt(arr[0]);
        this.continent = arr[2];
        this.surfaceArea = Integer.parseInt(arr[3]);
        this.population = Integer.parseInt(arr[4]);
    }

    @Override
    public String toString() {
        return "City=" + name ;
    }



    @Override
    public int compareTo(City o) {
        return this.population.compareTo(o.population);
    }

    public Integer getPopulation() {
        return population;
    }
}
