/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLbuilder;

/**
 *
 * @author JESSI
 */
public class KomputerBuilder {
    
    Komputer getkomputer(String komputer){
        if (komputer.equalsIgnoreCase("PC")) {
            return new PersonalComputer();
        }else if(komputer.equalsIgnoreCase("Netbook")){
            return new Netbook();
        }else if(komputer.equalsIgnoreCase("Notebook")){
            return new Notebook();
        }else{
            return null;
        }
    }
    
    
}
