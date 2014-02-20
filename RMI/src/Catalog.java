/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirill
 */
public class Catalog implements java.io.Serializable  {
    public String name;
    public int number;
    
    public Catalog(String name, int number)
    {
        this.name = name;
        this.number = number;
    }
    
    public Catalog getCatalog()
    {
        return this;
    }
    
    public void print(){
        System.out.println("Name: " + name + ", Num: " + number);
    }
}
