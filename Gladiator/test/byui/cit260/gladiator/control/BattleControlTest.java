/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Krissy
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }

    /**
     * Test of characterHP method, of class BattleControl.
     */
    @Test
    public void testCharacterHP() {
        System.out.println("characterHP");
        int armor = 0;
        int baseHP = 0;
        BattleControl instance = new BattleControl();
        int expResult = 0;
        int result = instance.characterHP(armor, baseHP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of charaterAT method, of class BattleControl.
     */
    @Test
    public void testCharaterAT() {
        System.out.println("charaterAT");
        int weapon = 0;
        int baseAT = 0;
        BattleControl instance = new BattleControl();
        int expResult = 0;
        int result = instance.charaterAT(weapon, baseAT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of damageToEnemy method, of class BattleControl.
     */
    @Test
    public void testDamageToEnemy() {
        System.out.println("damageToEnemy");
        int characterAT = 0;
        int weapon = 0;
        int enemyArmor = 0;
        BattleControl instance = new BattleControl();
        int expResult = 0;
        int result = instance.damageToEnemy(characterAT, weapon, enemyArmor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of damageToCharacter method, of class BattleControl.
     */
    @Test
    public void testDamageToCharacter() {
        System.out.println("damageToCharacter");
        int enemyAT = 0;
        int enemyWeapon = 0;
        int armor = 0;
        int health = 0;
        BattleControl instance = new BattleControl();
        int expResult = 0;
        int result = instance.damageToCharacter(enemyAT, enemyWeapon, armor, health);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
