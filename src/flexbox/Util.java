package flexbox;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Matthew Hopson
 */
public class Util {
    public static double roundDoubleTo2dp(double nToRound) {
        BigDecimal dec = BigDecimal.valueOf(nToRound);
        dec = dec.setScale(2, RoundingMode.HALF_UP);
        return dec.doubleValue();
    }
}
