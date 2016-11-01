package byui.cit260.gladiator.gladiator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import byui.cit260.gladiator.model.Player;
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

    private static Player player = null;
    private static Game currentGame = null;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Gladiator.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Gladiator.currentGame = currentGame;
    }
    
    public static void main(String[] args) throws IOException {
        
        // Display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }
    
}
