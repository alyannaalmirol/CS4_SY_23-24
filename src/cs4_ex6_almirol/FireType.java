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
FireType: a Monster that has a type "fire", strong against "grass", weak against 
"water", and whose atk is 1.3 times the base value and def is 0.7 times the base 
value. The special of FireTypes increase their atk by 2 points at the cost of 
reducing their HP by 10% of their maxHP.

If implemented correctly, the constructors of the subtypes will only require a 
name, HP value, and base value. 
You will also need to override the special method 
so that it functions according to what was specified.
*/
public class FireType extends Monster {    
    protected final String name;
    protected double maxHP, hp, atk, def, xp, lvl;
    protected boolean guard, charge;
    
    public FireType(String n, int m, int base) {
        super(n, "fire", "grass", "water", m, base);
        name = n;
        maxHP = m;
        hp = m;
        atk = 1.3 * base;
        def = 0.7 * base;
        xp = 0;
        lvl = 1;
        monsterList.add(this);
        guard = false;
        charge = false;
    }
 
    @Override
    public void special(){
        atk += 2;
        hp = maxHP - (maxHP*0.10);
        System.out.println(name + " did a pose.");
    }
    
    
}