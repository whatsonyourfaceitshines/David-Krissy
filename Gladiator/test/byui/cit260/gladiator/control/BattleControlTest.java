/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import java.io.Serializable;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Krissy
 */
public class BattleControlTest implements Serializable {
    
    public BattleControlTest() {
    }

    /**
     * Test of characterHP method, of class BattleControl.
     */
    @Test
    public void testCharacterHP() {
        System.out.println("characterHP");
        int armor = 5;
        int baseHP = 10;
        BattleControl instance = new BattleControl();
        int expResult = 15;
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
        int weapon = 5;
        int baseAT = 5;
        BattleControl instance = new BattleControl();
        int expResult = 10;
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
        int characterAT = 5;
        int weapon = 5;
        int enemyArmor = 5;
        BattleControl instance = new BattleControl();
        int expResult = 5;
        int result = instance.damageToEnemy(characterAT, weapon, enemyArmor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of enemyDamage method, of class BattleControl.
     */
    @Test
    public void testEnemyDamage() {
        System.out.println("enemyDamage");
        int enemyAT = 1;
        int enemyWeapon = 2;
        int armor = 5;
        BattleControl instance = new BattleControl();
        int expResult = 02;
        int result = instance.enemyDamage(enemyAT, enemyWeapon, armor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of damageToCharacter method, of class BattleControl.
     */
    @Test
    public void testDamageToCharacter() {
        System.out.println("damageToCharacter");
        int enemyAT = 3;
        int armor = 5;
        int health = 10;
        BattleControl instance = new BattleControl();
        int expResult = 12;
        int result = instance.damageToCharacter(enemyAT, armor, health);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
