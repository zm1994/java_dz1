package fabrics;

import constants.*;
import weapons.*;

/**
 * Created by zm1994 on 17.06.2017.
 */
public class WeaponFabric {
    static Weapon CreateWeapon(String type){
        if(type.equals(TypeWeapons.SWORD)){
            return new Sword();
        }
        else if(type.equals(TypeWeapons.PISTOL)){
            return new Pistol();
        }
        else if(type.equals(TypeWeapons.BOW)){
            return new Bow();
        }
        else {
            return new Sword();
        }
    }
}