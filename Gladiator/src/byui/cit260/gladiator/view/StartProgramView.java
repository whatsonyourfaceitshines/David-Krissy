/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

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
        this.promptMessage = "\nPlease enter your name: ";
    
        this.displayBanner();
        
        System.out.println("\nIt works, yo!");
    }
    
}
