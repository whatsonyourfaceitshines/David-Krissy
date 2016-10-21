/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import byui.cit260.gladiator.model.Game;
import java.io.Serializable;
import byui.cit260.gladiator.gladiator.Gladiator; //Why is this here?? ~Krissy

/**
 *
 * @author David
 */
public class GameControl implements Serializable {
    
    // I. AM. CONSTRUCTOOOOOR!!!!
    public GameControl() {
    }
    
    // Use to increase by 1 when important main quests are completed.
    public int updateMQP(int currentMQP) {
        currentMQP++;
    
        return currentMQP;
    }
    
    // Use to increase by 1 when active floor quests are completed.
    public int updateFQP(int currentFQP) {
        currentFQP++;
        
        return currentFQP;
    }
    
    // Use to keep track of the player's highest unlocked floor.
    public int updateAF(int currentAF) {
        currentAF++;
        
        return currentAF;
    }
    
    // Can't determine how to write or form a startNewGame function right now.
    // Can't determine how to write or form a quitGame function right now.
    
    public void saveGame(int mqp, int fqp, int af, String weapon, String armor, Game gameVariables) {
        System.out.println("Save File Name?");
        
        int mqpp = gameVariables.getMainQuestProgress();
    }
    
}
