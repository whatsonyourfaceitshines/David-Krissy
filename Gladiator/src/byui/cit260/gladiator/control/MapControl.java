/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import java.io.Serializable;

/**
 *
 * @author Krissy
 */
public class MapControl implements Serializable {
    public int location (int row, int column){
        int location = row + column;
        return location;
    }
        
}
