/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import java.io.Serializable;

/**
 *
 * @author Krissy
 */
public class BattleControl implements Serializable {
    public int characterHP (int armor, int baseHP){
        int health = armor + baseHP;
        return health;
    }
    public int charaterAT (int weapon, int baseAT){
        int attack = weapon + baseAT;
        return attack;
    }
    public int damageToEnemy (int characterAT, int weapon, int enemyArmor){
        int damage = characterAT + weapon - enemyArmor;
        return damage;
    }
    public int enemyDamage (int enemyAT, int enemyWeapon, int armor, int health){
        int newHealth = health - (armor - (enemyAT + enemyWeapon));
        return newHealth;
    }
    public int damageToCharacter (int enemyAT, int armor, int health){
        int characterDamage = enemyAT - armor;
        return characterDamage;}
    
    //Since we need at least 3 complex equations, the battle one will count as one, I was thinking about having a locked door that 
    //the key to was distroyed (because of the escaped Gladiator) and the character needs to find a strong sword, maybe a shield too,
    //and the character has the do a specific amount of damage to break the door down. This door could be the door to the final boss.
    //I don't know if that will work considering the fact that it is very similar to the complex equation for battles...
    //Another equation could be that the door is a puzzle. Like there is a weight sensitive plate in the room that 1 of 3 barrels
    //in the room will weight enough to keep the plate down.
}
