package flexbox.ui;

import flexbox.boxtypes.Box;

/**
 *
 * @author Matthew Hopson
 */
public class BasketItemInfo {
    private Box box;
    private int boxType;
    
    public BasketItemInfo (Box box, int boxType) {
        this.box = box;
        this.boxType = boxType;
    }
    
    public Box getBox() {
        return box;
    }
    
    public int getBoxType() {
        return boxType;
    }
}
