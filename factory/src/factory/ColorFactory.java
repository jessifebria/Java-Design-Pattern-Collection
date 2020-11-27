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
public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        else if (color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        else if(color.equalsIgnoreCase("RED")){
            return new Red();
        }
        else{
            return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
    
}
