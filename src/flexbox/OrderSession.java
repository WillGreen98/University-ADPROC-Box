package flexbox;

import flexbox.Util;
import flexbox.boxtypes.Box;
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
    
    public boolean validateBoxType3(Box box) {
        
        if (box.getData().getGrade() < 2 ||
           (box.getData().getColour() == 0 || box.getData().getColour() == 1) ||
            box.getData().isBottomReinforced() == true ||
            box.getData().isCornerReinforced() == true) {
            
            return false;
        }
        else {
            return true;
        }
        
    }
    
    public boolean validateBoxType4(Box box) {
        
        if (box.getData().getGrade() < 2 ||
           (box.getData().getColour() == 0 || box.getData().getColour() == 1) ||
            box.getData().isBottomReinforced() == false ||
            box.getData().isCornerReinforced() == true) {
            
            return false;
        }
        else {
            return true;
        }
        
    }
    
    public boolean validateBoxType5(Box box) {
        
        if (box.getData().getGrade() < 3 || 
           (box.getData().getColour() == 0 || box.getData().getColour() == 1) ||
            box.getData().isBottomReinforced() == false || 
            box.getData().isCornerReinforced() == false) {
            
            return false;
        }
        else {
            return true;
        }
        
    }
    
    public String addBox(Box box) {
        
        
//        if (this.validateBoxType1(box) == true) {
//            boxes.add(box);
//            return ("Box type 1 added.");
//        }
//        else if (this.validateBoxType2(box) == true) {
//            boxes.add(box);
//            return ("Box type 2 added.");
//        }
        else if (this.validateBoxType3(box) == true) {
            boxes.add(box);
            return ("Box type 3 added.");
        }
        else if (this.validateBoxType4(box) == true) {
            boxes.add(box);
            return ("Box type 4 added.");
        }
        else if (this.validateBoxType5(box) == true) {
            boxes.add(box);
            return ("Box type 5 added.");
        }
        else {
            System.out.println(boxes.size());
            return ("Invalid box type");
        }
        
        
        
    }
}
