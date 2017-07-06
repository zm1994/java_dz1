package wariors;

import protections.Protection;
import weapons.Weapon;

public abstract class Warior {
    private String name;
    private Weapon weapon;
    private Protection protection;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void setProtection(Protection protection){
        this.protection = protection;
    }

    public Protection getProtection(){
        return this.protection;
    }

    Warior(String name, Weapon weapon, Protection protection){
        this.setName(name);
        this.setWeapon(weapon);
        this.setProtection(protection);
    }

    public int Attack(){
        return this.weapon.Hit();
    }
}