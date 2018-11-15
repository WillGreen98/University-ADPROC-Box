package flexbox;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Some global utility functions
 * @author Group D4
 */
public class Util {
    /**
     * Round a double to 2 decimal places
     * @param nToRound The double to round
     * @return The rounded double
     */
    public static double roundDoubleTo2dp(double nToRound) {
        BigDecimal dec = BigDecimal.valueOf(nToRound);
        dec = dec.setScale(2, RoundingMode.HALF_UP);
        return dec.doubleValue();
    }
}
