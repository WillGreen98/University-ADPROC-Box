package flexbox;

import flexbox.Util;
import flexbox.boxtypes.Box;
import flexbox.boxtypes.BoxData;
import flexbox.boxtypes.BoxTypeOneValidator;
import flexbox.boxtypes.BoxTypeTwoValidator;
import flexbox.boxtypes.BoxTypeThreeValidator;
import flexbox.boxtypes.BoxTypeFourValidator;
import flexbox.boxtypes.BoxTypeFiveValidator;
import flexbox.boxtypes.BoxValidator;
import flexbox.ui.BasketItemInfo;

import java.util.ArrayList;

/**
 * The session of this box order
 * @author Group D4
 */
public class OrderSession {
    private ArrayList<BoxValidator> boxValidators;
    private ArrayList<Box> boxes;
    double totalCost = 0;
    int totalBoxes = 0;
    
    /**
     * Creates a new order session object
     */
    public OrderSession() {
        boxes = new ArrayList<>();
        boxValidators = new ArrayList(5);
        boxValidators.add(new BoxTypeOneValidator());
        boxValidators.add(new BoxTypeTwoValidator());
        boxValidators.add(new BoxTypeThreeValidator());
        boxValidators.add(new BoxTypeFourValidator());
        boxValidators.add(new BoxTypeFiveValidator());
    }

    /**
     * Gets the total cost of all the boxes (including their quantity considered
     * in the cost). stored in the basket
     * @return Total cost of all boxes
     */
    public double getTotalCost() {
        return Util.roundDoubleTo2dp(totalCost);
    }
    
    /**
     * Gets the total box count, with the quantity considered
     * @return Total boxes stored
     */
    public int getTotalBoxQuantity() {
        return totalBoxes;
    }
    
    /**
     * Gets the total number of items in the basket
     * @return Total items in basket
     */
    public int getNumberItemsInBasket() {
        return boxes.size();
    }    

    /**
     * Adds a box to the basket, also recalculating the basket stats eg total cost 
     * @param box The box to add to the basket
     */
    private void addBox(Box box) {
        boxes.add(box);
        totalCost += box.calculateCost();
        totalBoxes += box.getQuantity();
    }
    
    /**
     * Tries to add the box to the basket, given FlexBox supplis this type of box
     * @param boxData The data of the box
     * @param quantity The amount of said box
     * @return The box and box type if it was added, else null
     */
    public BasketItemInfo tryAddBox(BoxData boxData, int quantity) {
        Box box = new Box(boxData, quantity);

        //Validate FlexBox supplies this box type
        for (BoxValidator validator : boxValidators) {
            if (validator.isValidForThisType(box.getData())) {
                addBox(box);
                return new BasketItemInfo(box, validator.getBoxType());
            }
        }
        //return null if the box type is not supplied
        return null;
    }
}
