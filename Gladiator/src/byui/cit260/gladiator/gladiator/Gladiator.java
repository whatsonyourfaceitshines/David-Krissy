package byui.cit260.gladiator.gladiator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import byui.cit260.gladiator.model.Game;

/**
 *
 * @author David
 */
public class Gladiator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameVariables = new Game();
        
        gameVariables.setMainQuestProgress(4);
        gameVariables.setFloorQuestProgress(5);
        gameVariables.setHighestFloor(6);
        
        System.out.println(gameVariables.toString());
    }
    
}
