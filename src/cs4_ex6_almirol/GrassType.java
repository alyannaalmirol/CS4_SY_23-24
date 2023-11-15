/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_ex6_almirol;
import java.util.ArrayList;
/**
 *
 * @author macbookair
 */
/*
GrassType: a Monster that has a type "grass", strong against "water", weak 
against "fire", and whose atk and def is equal to the base value. The rest() of 
GrassTypes heal by half the maxHP. The special of GrassTypes raise their 
health by 20% of the maxHP.

If implemented correctly, the constructors of the subtypes will only require a 
name, HP value, and base value. 
You will also need to override the special method 
so that it functions according to what was specified.
*/
public class GrassType extends Monster {
    protected final String name;
    protected double maxHP, hp, atk, def, xp, lvl;
    protected boolean guard, charge;
  
    public GrassType(String n, int m, int base) {
        super(n, "grass", "water", "fire", m, base);
        name = n;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        xp = 0;
        lvl = 1;
        monsterList.add(this);
        guard = false;
        charge = false;
    }

    @Override
    public void rest(){
        hp += maxHP * 0.50;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }
    
    @Override
    public void special(){
        hp += (maxHP*0.20);
        System.out.println(name + " did a pose.");
    }
    
  
}
