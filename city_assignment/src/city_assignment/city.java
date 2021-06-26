/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_assignment;
public class city
{
private int code;
private String name;
private String continent;
private double Surface_Area;
private Integer population;

public city(int code,String name,String continent,double Surface_Area,Integer population){
super();
this.code=code;
this.name=name;
this.continent=continent;
this.Surface_Area=Surface_Area;
this.population=population;




}
    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setSurface_Area(double Surface_Area) {
        this.Surface_Area = Surface_Area;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public double getSurface_Area() {
        return Surface_Area;
    }

    public Integer getPopulation() {
        return population;
    }

}
