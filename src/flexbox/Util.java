package flexbox;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Some utility functions that are used throughout the program
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
    
    /**
     * Take a number such as 10393.12 and converts to a more readable format such
     * as as 10,393.12
     * @param value
     * @return 
     */
    public static String formatMoneyValue(double value) {
        String nString = Double.toString(value);
        
        //Find the decimal point location
        int location = 0;
        for (; location < nString.length(); location++) {
            //Found the decimal point, so break out
            if (nString.charAt(location) == '.') {
                break; 
            }
        }
        
        //Get number of , to insert into the string
        int seperatorCount = nString.substring(0, location).length() / 3;
        
        //Create a string builder to create a new string
        StringBuilder outputCreator = new StringBuilder(nString);
        for (int i = 0; i < seperatorCount; i++) {
            int insertLocation = location - 3 * (i + 1);
            //Do not allow , to be placed at very start of the string
            if (insertLocation > 0) { 
                outputCreator.insert(insertLocation, ',');
            }
        }
        return outputCreator.toString();
    }
}
