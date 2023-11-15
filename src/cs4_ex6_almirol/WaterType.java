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
/* WaterType: a Monster that has a type "water", strong against "fire", weak 
against "grass", and whose atk is 0.7 times the base value and def is 1.3 times 
the base value. The special of WaterTypes increase their def by 2 points at the 
cost of reducing their HP by 10% of their maxHP.

If implemented correctly, the constructors of the subtypes will only require a 
name, HP value, and base value. You will also need to override the special 
method so that it functions according to what was specified. */
    
public class WaterType extends Monster {
    protected final String name;
    protected double maxHP, hp, atk, def, xp, lvl;
    protected boolean guard, charge;
    
    public WaterType(String n, int m, int base) {
        super(n, "water", "fire", "grass", m, base);
        name = n;
        maxHP = m;
        hp = m;
        atk = 0.7 * base;
        def = 1.3 * base;
        xp = 0;
        lvl = 1;
        monsterList.add(this);
        guard = false;
        charge = false;
    }
    
    @Override
    public void special(){
        def += 2;
        hp = maxHP - (maxHP*0.10);
        System.out.println(name + " did a pose.");
    }
}