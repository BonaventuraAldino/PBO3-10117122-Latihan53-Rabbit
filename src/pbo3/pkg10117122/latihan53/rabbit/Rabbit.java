/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan53.rabbit;

/**
 *
 * @author Aldy Senda
 */
public class Rabbit extends Animal{
    private String color, name;

    public Rabbit(String name, boolean vegetarian, String food, int legs) {
        super(vegetarian, food, legs);
    }
    public String getColor (){
        color = "grey";
        return color;
    }
    public String getNama (){
        name = "Peter";
        return name;
    }
}
