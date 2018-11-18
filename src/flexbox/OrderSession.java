package flexbox;

import flexbox.Util;
import flexbox.boxtypes.Box;
import flexbox.boxtypes.BoxData;
import java.util.ArrayList;

/**
 * The session of this box order
 * @author Group D4
 */
public class OrderSession {
    
    private ArrayList<Box> boxes;
    double totalCost = 0;
    int totalBoxes = 0;
    
    public OrderSession() {
        boxes = new ArrayList<>();
    }
    
    public boolean validateBoxType1(BoxData data) {
        if (data.getGrade() <= 3 &&
            data.getColour() == 0 &&
            !data.isBottomReinforced() &&
            !data.isCornerReinforced()) {
          return true;
        } 
      return false;
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
    

    public boolean validateBoxType2(BoxData data) {
        
        if (data.getGrade() >= 2 && data.getGrade() <= 4 &&
            data.getColour() == 1 &&
            !data.isBottomReinforced() &&
            !data.isCornerReinforced()) {
            return true;
        }
        return false;
    }
    
    

    public boolean validateBoxType3(BoxData data) {
        if (data.getGrade() >= 2 &&
            data.getColour() == 2 &&
            !data.isBottomReinforced() &&
            !data.isCornerReinforced()) {
            return true;
        }
        return false;
    }
    

    public boolean validateBoxType4(BoxData data) {
        
        if (data.getGrade() >= 2 &&
            data.getColour() == 2 &&
            data.isBottomReinforced() &&
            !data.isCornerReinforced()) {
            
            return true;
        }
        return false;
    }
    
    public boolean validateBoxType5(BoxData data) {
        if (data.getGrade() >= 3 && 
            data.getColour() == 2 &&
            data.isBottomReinforced() && 
            data.isCornerReinforced()) {
            return true;
        }
       return false;
    }
    

    void addBox(Box box) {
        boxes.add(box);
        totalCost += box.calculateCost();
        totalBoxes += box.getQuantity();
    }
    
    public Box tryAddBox(BoxData boxData, int quantity) {
        Box box = new Box(boxData, quantity);
        if (this.validateBoxType1(boxData)) {
            addBox(box);
            return box;//1
        }
        else if (this.validateBoxType2(boxData)) {
           addBox(box);
           return box;//2
        }
        else if (this.validateBoxType3(boxData)) {
            addBox(box);
            return box;//3
        }
        else if (this.validateBoxType4(boxData)) {
            addBox(box);
            return box;//4
        }
        else if (this.validateBoxType5(boxData)) {
            addBox(box);
            return box;//5
        }
        else {
            return null;
        }
        
    }
}
