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
    
    public double getTotalCost() {
        return totalCost;
    }
    
    public int getTotalBoxQuantity() {
        return totalBoxes;
    }
    
    public boolean validateBoxType1(BoxData boxData) {
        if (boxData.getGrade() > 3 ||
           (boxData.getColour() == 1 || boxData.getColour() == 2) ||
            boxData.isBottomReinforced() ||
            boxData.isCornerReinforced()) {
            
            return false;
        }
        else {
            return true;
        }
    }
    
    public boolean validateBoxType2(BoxData boxData) {
        if (boxData.getGrade() < 2 || boxData.getGrade() > 4 ||
           (boxData.getColour() == 0 || boxData.getColour() == 2) ||
            boxData.isBottomReinforced() ||
            boxData.isCornerReinforced()) {
           
            return false;
        }
        else {
            return true;
        }
    }
    
    
    public boolean validateBoxType3(BoxData boxData) {
        if (boxData.getGrade() < 2 ||
           (boxData.getColour() == 0 || boxData.getColour() == 1) ||
            boxData.isBottomReinforced() ||
            boxData.isCornerReinforced()) {
            return false;
        }
        else {
            return true;
        }
        
    }
    
    public boolean validateBoxType4(BoxData boxData) {
        if (boxData.getGrade() < 2 ||
           (boxData.getColour() == 0 || boxData.getColour() == 1) ||
            boxData.isBottomReinforced() == false ||
            boxData.isCornerReinforced() == true) {
            
            return false;
        }
        else {
            return true;
        }
        
    }
    
    public boolean validateBoxType5(BoxData boxData) {
        if (boxData.getGrade() < 3 || 
           (boxData.getColour() == 0 || boxData.getColour() == 1) ||
            boxData.isBottomReinforced() == false || 
            boxData.isCornerReinforced() == false) {
            
            return false;
        }
        else {
            return true;
        }
    }
    
    void addBox(Box box) {
        boxes.add(box);
        totalCost += box.calculateCost();
        totalBoxes += box.getQuantity();
    }
    
    public Box tryAddBox(BoxData boxData, int quantity) {
        Box box = new Box(boxData, quantity);
        if (this.validateBoxType1(boxData) == true) {
            addBox(box);
            return box;//1
        }
        else if (this.validateBoxType2(boxData) == true) {
           addBox(box);
           return box;//2
        }
        else if (this.validateBoxType3(boxData) == true) {
            addBox(box);
            return box;//3
        }
        else if (this.validateBoxType4(boxData) == true) {
            addBox(box);
            return box;//4
        }
        else if (this.validateBoxType5(boxData) == true) {
            addBox(box);
            return box;//5
        }
        else {
            return null;
        }
        
        
        
    }
}
