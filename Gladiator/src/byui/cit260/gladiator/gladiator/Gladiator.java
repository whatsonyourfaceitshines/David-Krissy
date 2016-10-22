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
        
        // test Location class
        Location locationVariables = new Location();
        
        locationVariables.setRoom(5);
        locationVariables.setFloor(6);
        
        // test Game class
        Game gameVariables = new Game();
        
        gameVariables.setMainQuestProgress(4);
        gameVariables.setFloorQuestProgress(5);
        gameVariables.setActiveFloor(6);
        
        System.out.println(gameVariables.toString());
        
        // test CharacterInfo class
        CharacterInfo player = new CharacterInfo();
        
        player.setName("Mr. Tibbs");
        player.setGender(1);
        player.setHomeCountry("Texas");
        player.setCoordinates("2, 10");
        player.setStatus("Great!");
        
        System.out.println(player.toString());
        
        // test Items class
        Items playerItems = new Items();
        
        playerItems.setWeapon("Sword");
        playerItems.setArmor("Iron");
        playerItems.setRestore("Rainbow Sauce");
        playerItems.setMisc("Saxaphone");
        
        System.out.println(playerItems.toString());
        
        // Test GameControl class
        GameControl controlGame = new GameControl();
        
        // Test updateMQP function
        int passMQP;
        
        passMQP = controlGame.updateMQP(gameVariables.getMainQuestProgress());
        
        gameVariables.setMainQuestProgress(passMQP);
        
        System.out.println(gameVariables.toString());
        
        // Test updateFQP function as well as FQP reset
        int passFQP;
        
        passFQP = controlGame.updateFQP(gameVariables.getFloorQuestProgress());
        
        gameVariables.setFloorQuestProgress(passFQP);
        
        System.out.println(gameVariables.toString());
        
        gameVariables.setFloorQuestProgress(0);
        
        System.out.println(gameVariables.toString());
        
        // Test updateAF function
        int passAF;
        
        passAF = controlGame.updateAF(gameVariables.getActiveFloor());
        
        gameVariables.setActiveFloor(passAF);
        
        System.out.println(gameVariables.toString());
        
        // Test saveGame function
        new File("C:\\GladiatorSaves").mkdirs();
        
        // player is CharacterInfo instance currently
        
        // gameVariables is Game instance currently
        
        // playerItems is Items instance currently
        
        // locationVariables is Location instance currently
        
        controlGame.saveGame(player, gameVariables, playerItems);
        
        // Test loadGame function
        controlGame.loadGame(player, gameVariables, playerItems);
    }
    
}
