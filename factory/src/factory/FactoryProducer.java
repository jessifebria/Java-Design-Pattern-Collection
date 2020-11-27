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
public class FactoryProducer {

    AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factory.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else {
            return null;
        }

    }

}
