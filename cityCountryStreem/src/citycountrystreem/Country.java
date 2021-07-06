/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citycountrystreem;

public class Country {
    public String name;
    public int code;


    public Country(String[] arr) {
        this.name = arr[0];
        this.code = Integer.parseInt(arr[1]);

    }
}