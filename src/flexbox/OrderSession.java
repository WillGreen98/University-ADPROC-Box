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
    
    public OrderSession() {
        boxes = new ArrayList<>();
        boxValidators = new ArrayList(5);
        boxValidators.push(new BoxTypeOneValidator());
        boxValidators.push(new BoxTypeTwoValidator());
        boxValidators.push(new BoxTypeThreeValidator());
        boxValidators.push(new BoxTypeFourValidator());
        boxValidators.push(new BoxTypeFiveValidator());
    }

    public double getTotalCost() {
        return Util.roundDoubleTo2dp(totalCost);
    }
    
    public int getTotalBoxQuantity() {
        return totalBoxes;
    }
    
    public int getItemsSize() {
        return boxes.size();
    }    

    void addBox(Box box) {
        boxes.add(box);
        totalCost += box.calculateCost();
        totalBoxes += box.getQuantity();
    }
    
    public Box tryAddBox(BoxData boxData, int quantity) {
        Box box = new Box(boxData, quantity);

        //Validate FlexBox supplies this box type
        for (BoxValidator validator : boxValidators) {
            if (validator.isValidForThisType(box.getData())) {
                return box;
            }
        }
        //return null if the box type is not supplied
        return null;
    }
}
