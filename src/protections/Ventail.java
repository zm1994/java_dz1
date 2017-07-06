package protections;

import constants.ProtectionConstants;

public class Ventail implements Protection {
    public int Defence(int hit){
        return ProtectionConstants.VENTAIL - hit;
    }
}
