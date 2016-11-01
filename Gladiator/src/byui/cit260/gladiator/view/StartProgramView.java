/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.control.GameControl;
import byui.cit260.gladiator.model.Player;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class StartProgramView {
    private String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        
        this.displayBanner();

    }

    private void displayBanner() {
        System.out.println("\nKrissy\'s banner goes here.");
    }

    public void displayStartProgramView() {
       /* displayView(): void 
        BEGIN 
        do  
         Prompt for and get the input value 
         if (value == “Q”) then 
          return  
         do requested action and display the next view 
       while the view is not done
        END */
              
       boolean done = false;
       do {
           
           String playersName = this.getPlayersName();
           if (playersName.toUpperCase().equals("Q"))
               return;
           
           done = this.doAction(playersName);
           
       } while (!done);
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
       // doAction(playersName): boolean 
       // BEGIN 
           // if the length of the playersName < 2 then 
               // display “Invalid name: The name must be > 1 character” 
               // return false 
                        
           // create Player with specified name 
           // if unsuccessful then 
               // display “Invalid name: The name is too short” 
               // return false 
                        
           // display customized welcome message 
           // display mainMenuView 
           // return true 
       // END
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid player name: "
                    + "The name must be greater than one character in length");
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        
        // display a custom welcome message
        System.out.println("\n====================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you enjoy the fruits of our"
                          + "\n soul-crushing labor!"
                          + "\n===================================="
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
    
}
