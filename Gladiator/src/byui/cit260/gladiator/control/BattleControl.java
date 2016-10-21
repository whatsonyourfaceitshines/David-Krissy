/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

/**
 *
 * @author Krissy
 */
public class BattleControl {
    public int characterHP (int armor, int baseHP){
        int health = armor + baseHP;
        return health;}
    public int charaterAT (int weapon, int baseAT){
        int attack = weapon + baseAT;
        return attack;}
    public int damageToEnemy (int characterAT, int weapon, int enemyArmor){
        int damage = characterAT + weapon - enemyArmor;
        return damage;}
    public int damageToCharacter (int enemyAT, int armor, int health){
        int characterDamage = enemyAT - armor;
        return characterDamage;}
}
