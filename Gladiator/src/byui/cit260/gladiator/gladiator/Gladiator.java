package byui.cit260.gladiator.gladiator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import byui.cit260.gladiator.model.CharacterInfo;
import byui.cit260.gladiator.model.Game;
import byui.cit260.gladiator.model.Items;
import byui.cit260.gladiator.model.Location;
import byui.cit260.gladiator.model.NPC;
import byui.cit260.gladiator.control.GameControl;
import byui.cit260.gladiator.view.StartProgramView;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author David
 */
public class Gladiator {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        // Display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }
    
}
