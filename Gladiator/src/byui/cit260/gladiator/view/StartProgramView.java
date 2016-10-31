/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class StartProgramView {
    private String promptMessage;
    
    public void StartProgramView() {
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
       
       this.promptMessage = "\nPlease enter your name: ";
       
       boolean done = false;
       do {
           this.displayBanner();
           
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
        System.out.println("\n*** doAction() called ***");
        return true;
    }
    
}
