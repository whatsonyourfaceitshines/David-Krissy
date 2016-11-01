/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.control.GameControl;
import byui.cit260.gladiator.gladiator.Gladiator;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class MainMenuView {

    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n-------------------------------------"
                  + "\n| Main Menu                         |"
                  + "\n-------------------------------------"
                  + "\nN - Start new game"
                  + "\nG - Get and start saved game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n-------------------------------------";
    }
    
    void displayMainMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get menu input
            System.out.println(menu);
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1
               || value.length() > 1) {
                System.out.println("\nInvalid value: value must be a single letter");
                continue;
            }
            
            switch (value.toUpperCase()) {
                case "N":
                    break;
                case "G":
                    break;
                case "H":
                    break;
                case "S":
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("\nInvalid value: value not on menu");
                    continue;
            }
           
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String choice) {
        
        switch (choice.toUpperCase()) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\nInvalid selection");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(Gladiator.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
