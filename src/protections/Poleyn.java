package protections;

import constants.ProtectionConstants;

public class Poleyn implements Protection {
    public int Defence(int hit){
        return ProtectionConstants.POLEYN - hit;
    }
}
