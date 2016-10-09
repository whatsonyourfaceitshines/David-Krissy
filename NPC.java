/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Krissy
 */
public class NPC implements Serializable{
    
    //class instance variables
    private String guards;
    private String servants;
    private String boss;
    private String Casaer;

    public String getGuards() {
        return guards;
    }

    public void setGuards(String guards) {
        this.guards = guards;
    }

    public String getServants() {
        return servants;
    }

    public void setServants(String servants) {
        this.servants = servants;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public String getCasaer() {
        return Casaer;
    }

    public void setCasaer(String Casaer) {
        this.Casaer = Casaer;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
