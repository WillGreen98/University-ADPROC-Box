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
    
    public OrderSession() {
        boxes = new ArrayList<>();
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
    
    public int tryAddBox(BoxData boxData, int quantity) {
        if (this.validateBoxType1(boxData) == true) {
            boxes.add(new Box(boxData, quantity));
            return 1;
        }
        else if (this.validateBoxType2(boxData) == true) {
           boxes.add(new Box(boxData, quantity));
           return 2;
        }
        else if (this.validateBoxType3(boxData) == true) {
            boxes.add(new Box(boxData, quantity));
            return 3;
        }
        else if (this.validateBoxType4(boxData) == true) {
            boxes.add(new Box(boxData, quantity));
            return 4;
        }
        else if (this.validateBoxType5(boxData) == true) {
            boxes.add(new Box(boxData, quantity));
            return 5;
        }
        else {
            return -1;
        }
        
        
        
    }
}
