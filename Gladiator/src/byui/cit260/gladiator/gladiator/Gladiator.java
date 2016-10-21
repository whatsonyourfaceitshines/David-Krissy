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

/**
 *
 * @author David
 */
public class Gladiator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        CharacterInfo testChara = new CharacterInfo();
        
        testChara.setName("Mr. Tibbs");
        testChara.setGender(1);
        testChara.setHomeCountry("Texas");
        testChara.setCoordinates("2, 10");
        testChara.setStatus("Great!");
        
        System.out.println(testChara.toString());
        
        // test Items class
        Items testItem = new Items();
        
        testItem.setWeapon("Sword");
        testItem.setArmor("Iron");
        testItem.setRestore("Rainbow Sauce");
        testItem.setMisc("Saxaphone");
        
        System.out.println(testItem.toString());
        
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
        CharacterInfo player = new CharacterInfo();
        
        // gameVariables is Game instance currently
        
        Items playerItems = new Items();
        
        Location playerLocation = new Location();
        
        NPC npcMark = new NPC();
        
        NPC npcJudy = new NPC();
        
        NPC npcDavid = new NPC();
    }
    
}
