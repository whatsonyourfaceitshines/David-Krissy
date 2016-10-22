/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import byui.cit260.gladiator.model.Game;
import java.io.Serializable;
import byui.cit260.gladiator.model.CharacterInfo;
import byui.cit260.gladiator.model.Items;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
    
    public void saveGame(CharacterInfo player, Game gameVariables, Items playerItems) throws IOException {
        System.out.println("Save File Name?");
        
        Scanner scan = new Scanner(System.in);
        String saveFile = scan.next();
        
        FileWriter writeSave = new FileWriter("C:\\GladiatorSaves\\" + saveFile + ".txt");
        
        String name = player.getName();
        int gender = player.getGender();
        String home = player.getHomeCountry();
        String coordinates = player.getCoordinates();
        String status = player.getStatus();
        int mqp = gameVariables.getMainQuestProgress();
        int fqp = gameVariables.getFloorQuestProgress();
        int af = gameVariables.getActiveFloor();
        String weapon = playerItems.getWeapon();
        String armor = playerItems.getArmor();
        String restore = playerItems.getRestore();
        String misc = playerItems.getMisc();
        
        for (int i = 0; i < 1; i++) {
            writeSave.write(name + "\n" +
                            gender + "\n" +
                            home + "\n" +
                            coordinates + "\n" +
                            status + "\n" +
                            mqp + "\n" +
                            fqp + "\n" +
                            af + "\n" +
                            weapon + "\n" +
                            armor + "\n" +
                            restore + "\n" +
                            misc);
        }
        
        writeSave.close();
    }
    
    public void loadGame(CharacterInfo player, Game gameVariables, Items playerItems) throws IOException {
        System.out.println("Load File Name?");
        
        Scanner scan = new Scanner(System.in);
        String loadFile = scan.next();
        
        player.setName(null);
        player.setGender(0);
        player.setHomeCountry(null);
        player.setCoordinates(null);
        player.setStatus(null);
        gameVariables.setMainQuestProgress(0);
        gameVariables.setFloorQuestProgress(0);
        gameVariables.setActiveFloor(0);
        playerItems.setWeapon(null);
        playerItems.setArmor(null);
        playerItems.setRestore(null);
        playerItems.setMisc(null);
        System.out.println("Name is: " + player.getName());
        System.out.println("Gender is: " + player.getGender());
        System.out.println("Home is: " + player.getHomeCountry());
        System.out.println("Coord is: " + player.getCoordinates());
        System.out.println("Status is: " + player.getStatus());
        System.out.println("MQP is: " + gameVariables.getMainQuestProgress());
        System.out.println("FQP is: " + gameVariables.getFloorQuestProgress());
        System.out.println("AF is: " + gameVariables.getActiveFloor());
        System.out.println("Weapon is: " + playerItems.getWeapon());
        System.out.println("Armor is: " + playerItems.getArmor());
        System.out.println("Restore is: " + playerItems.getRestore());
        System.out.println("Misc is: " + playerItems.getMisc());
        
        FileReader readSave = new FileReader("C:\\GladiatorSaves\\" + loadFile + ".txt");
        BufferedReader buff = new BufferedReader(readSave);
        
        player.setName(buff.readLine());
        player.setGender(Integer.parseInt(buff.readLine()));
        player.setHomeCountry(buff.readLine());
        player.setCoordinates(buff.readLine());
        player.setStatus(buff.readLine());
        gameVariables.setMainQuestProgress(Integer.parseInt(buff.readLine()));
        gameVariables.setFloorQuestProgress(Integer.parseInt(buff.readLine()));
        gameVariables.setActiveFloor(Integer.parseInt(buff.readLine()));
        playerItems.setWeapon(buff.readLine());
        playerItems.setArmor(buff.readLine());
        playerItems.setRestore(buff.readLine());
        playerItems.setMisc(buff.readLine());
        
        System.out.println("Name is: " + player.getName());
        System.out.println("Gender is: " + player.getGender());
        System.out.println("Home is: " + player.getHomeCountry());
        System.out.println("Coord is: " + player.getCoordinates());
        System.out.println("Status is: " + player.getStatus());
        System.out.println("MQP is: " + gameVariables.getMainQuestProgress());
        System.out.println("FQP is: " + gameVariables.getFloorQuestProgress());
        System.out.println("AF is: " + gameVariables.getActiveFloor());
        System.out.println("Weapon is: " + playerItems.getWeapon());
        System.out.println("Armor is: " + playerItems.getArmor());
        System.out.println("Restore is: " + playerItems.getRestore());
        System.out.println("Misc is: " + playerItems.getMisc());
        
        buff.close();
    }
/*    Thinking this should all go in the View layer...
    
    public void menuSelection(String input, CharacterInfo player, Game gameVariables, Items playerItems) throws IOException {
        if (input == "S" || input == "s") {
            saveGame(player, gameVariables, playerItems);
        } else if (input == "L" || input == "l") {
            loadGame(player, gameVariables, playerItems);
        } else if (input == "H" || input == "h") {
            // View.help();
        } else if (input == "E" || input == "e") {
            // View.
        } else {
            System.out.println("Invalid Selection! Type H for help.");
        }
    }
*/
}
