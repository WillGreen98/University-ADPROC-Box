package flexbox.boxtypes;

import flexbox.Util;

/**
 * Class to represent a singular box from the order
 * @author Group D4
 */
public class Box {
    
    private BoxData data;
    private int quantity;
    
    public Box() { 
        data = new BoxData();
        quantity = 0;
    }  
    
    public Box(BoxData data, int quantity) {
        this.data = data;
        this.quantity = quantity;
    }
    
    public BoxData getData() {
        return data;
    }
    
    public void setData(BoxData data) {
        this.data = data;
    }
        
    public int getQuantity() {
        return quantity;
    }

    public double calculateCost() {
        double area = (
                data.getLength() * data.getLength() + 
                data.getHeight() * data.getHeight() + 
                data.getWidth()  * data.getWidth()) * 2;
        
        double cost = 0;

        switch (data.getGrade()) {
            case 1:
                cost = area * 55;
                break;
            case 2:
                cost = area * 65;
                break;
            case 3:
                cost = area * 82;
                break;
            case 4:
                cost = area * 98;
                break;
            default:
                cost = area * 150;
                break;
        }

  
        if(data.getColour() == 1) {
            cost *= 1.12;
        } else if (data.getColour() == 2) {
            cost *= 1.15;
        }
        
        if(data.isBottomReinforced()) {
            cost *= 1.13;
        }
        
        if(data.isCornerReinforced()) {
            cost *= 1.12;
        }
        
        if(data.isTopSealable()) {
            cost *= 1.10;
        }
        
        //Convert pennies into pounds
        cost /= 100;
        
        //Get total cost from box quantities
        cost *= quantity;
        
        return Util.roundDoubleTo2dp(cost);
    }
}
