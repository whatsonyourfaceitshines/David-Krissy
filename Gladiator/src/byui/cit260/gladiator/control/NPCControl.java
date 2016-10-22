/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class NPCControl implements Serializable {
    // Class instance variables
    // Increase to change NPC message, i.e. 0 = "Help! I lost my son!", 1 = "Have you found my son yet?!",
    // 2 = "Thank you so much for finding my son! Good luck!", etc.
    private int stage;

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
}
