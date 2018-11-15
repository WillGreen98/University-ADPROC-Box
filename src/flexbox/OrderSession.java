package flexbox;

import flexbox.Util;
import flexbox.boxtypes.Box;
import java.util.ArrayList;

/**
 *
 * @author Matthew Hopson
 */
public class OrderSession {
    private ArrayList<Box> boxes;
    
    public OrderSession() {
        boxes = new ArrayList<>();
    }
    
    public double getTotalCost() {
        double total = 0;
        for (Box box : boxes) {
            total += box.calculateCost();
        }
        return Util.roundDoubleTo2dp(total);
    }
}
