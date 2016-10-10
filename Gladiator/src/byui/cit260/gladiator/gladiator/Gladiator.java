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
        gameVariables.setHighestFloor(6);
        
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
    }
    
}
