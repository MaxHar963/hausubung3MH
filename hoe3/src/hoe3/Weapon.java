/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoe3;

/**
 *
 * @author Max
 */
public class Weapon {
    
      CombatType ct;
      DamageType dt;
      String name;
      int damage;
      int speed;
      int strenght;
      int value;

    public Weapon(CombatType ct, DamageType dt, String name, int damage, int speed, int strenght, int value) {
        this.ct = ct;
        this.dt = dt;
        this.name = name;
        this.damage = damage;
        this.speed = speed;
        this.strenght = strenght;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Weapon{" + "ct=" + ct + ", dt=" + dt + ", name=" + name + ", damage=" + damage + ", speed=" + speed + ", strenght=" + strenght + ", value=" + value + '}';
    }
      
    
      
    
}
