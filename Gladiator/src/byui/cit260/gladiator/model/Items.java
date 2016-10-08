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
 * @author David
 */
public class Items implements Serializable {
    
    // class instance variables
    private String weapon;
    private String armor;
    private String restore;
    private String misc;

    public Items() {
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getRestore() {
        return restore;
    }

    public void setRestore(String restore) {
        this.restore = restore;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.weapon);
        hash = 83 * hash + Objects.hashCode(this.armor);
        hash = 83 * hash + Objects.hashCode(this.restore);
        hash = 83 * hash + Objects.hashCode(this.misc);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Items other = (Items) obj;
        if (!Objects.equals(this.weapon, other.weapon)) {
            return false;
        }
        if (!Objects.equals(this.armor, other.armor)) {
            return false;
        }
        if (!Objects.equals(this.restore, other.restore)) {
            return false;
        }
        if (!Objects.equals(this.misc, other.misc)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Items{" + "weapon=" + weapon + ", armor=" + armor + ", restore=" + restore + ", misc=" + misc + '}';
    }
    
}
