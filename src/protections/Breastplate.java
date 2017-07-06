package protections;

import constants.ProtectionConstants;

public class Breastplate implements Protection {
    public int Defence(int hit){
        return ProtectionConstants.BREASTPLATE - hit;
    }
}
