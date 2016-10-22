/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import byui.cit260.gladiator.model.Items;
import java.io.Serializable;

/**
 *
 * @author David
 */
public class ItemControl implements Serializable {
    // This function checks to see if the new weapon in question is better than what is equipped. If it is, it returns true.
    // The true/false from this function can then be used where this function is called to determine if the new weapon in question
    // will be equipped or not. I feel it's better to do equipping this way since it might be more complicated to allow the player
    // to carry all weapons/armor etc and let them equip whatever. This also makes it so we don't have to display weapon/armor stats.
    // It will all be handled internally, and the player will never be equipped with weaker gear.
    public boolean wBetterCheck(String newWeapon, Items playerItems) {
        int newWeaponRank = 0;
        int currentWeaponRank = 0;
        String[] weaponRanks = {"Bronze Dagger", "Steel Dagger", "Bronze Sword", "Steel Sword", "Wood Bow",
                                "Steel Bow", "Obsidian Sword", "Marshmallow Gun"};
        
        for (int i=0; i<weaponRanks.length; i++) {
            if (weaponRanks[i] == newWeapon) {
                newWeaponRank = i;
            } else if (weaponRanks[i] == playerItems.getWeapon()) {
                currentWeaponRank = i;
            }
        }
        
        if (newWeaponRank > currentWeaponRank) {
            return true;
        } else {
            return false;
        }
    }
}
