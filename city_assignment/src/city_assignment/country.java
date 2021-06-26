/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_assignment;

/**
 *
 * @author asmaa
 */
public class country {
    private int code;
private String name;

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public country(int code, String name) {
        this.code = code;
        this.name = name;
    }

}
