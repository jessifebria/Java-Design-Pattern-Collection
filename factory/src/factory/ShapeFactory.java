/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author JESSI
 */
public class ShapeFactory extends AbstractFactory{
    
    public Shape getShape(String shape){
        if (shape.equalsIgnoreCase("KOTAK")) {
            return new Kotak();
        }
        else if(shape.equalsIgnoreCase("LINGKARAN")){
            return new Lingkaran();
        }
        else if(shape.equalsIgnoreCase("SEGITIGA")){
            return new Segitiga();
        }
        else{
            return null;
        }
    
    }

    @Override
    Color getColor(String color) {
        return null;
    }
    
}
