package fabrics;
import constants.*;
import protections.*;
/**
 * Created by zm1994 on 17.06.2017.
 */
public class ProtectionFabric {
    public static Protection CreateProtection(String type){
        if(type.equals(TypeProtections.BREASTPLATE)){
            return new Breastplate();
        }
        else if(type.equals(TypeProtections.POLEYN)){
            return new Poleyn();
        }
        else if(type.equals(TypeProtections.VENTAIL)){
            return new Ventail();
        }
        else {
            return new Breastplate();
        }
    }
}
