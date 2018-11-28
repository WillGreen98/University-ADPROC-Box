package flexbox.boxtypes;

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
    
    public double calculateSingleBoxCost() {
        double totalCost, baseCost, colourCost, bottomReinforcementCost, cornerReinforcementCost, sealableTopCost = 0;
       
        
        //Convert the values into millimeters
        double lengthInMillimeters = (double)data.getLength() / 1000.0;
        double heightInMillimeters = (double)data.getHeight() / 1000.0;
        double widthInMillimeters  = (double)data.getWidth()  / 1000.0;

        //Calulcate the surface area of all 6 sides of the box
        double area = (
                Math.pow(lengthInMillimeters, 2) + 
                Math.pow(heightInMillimeters, 2) + 
                Math.pow(widthInMillimeters,  2)) * 2;

        switch(data.getGrade()) {
            case 1:
                baseCost = area * 0.55;
                break;
            case 2:
                baseCost = area * 0.65;
                break;
            case 3:
                baseCost = area * 0.82;
                break;
            case 4:
                baseCost = area * 0.98;
                break;
            default:
                baseCost = area * 1.50;
                break;
        }

        if(data.getColour() == 1) {
            colourCost = baseCost * 0.12;
        } else if(data.getColour() == 2) {
            colourCost = baseCost * 0.15;
        }
        else {
            colourCost = 0;
        }
        
        if(data.isBottomReinforced()) {
            bottomReinforcementCost = baseCost * 0.13;
        }
        else {
            bottomReinforcementCost = 0;
        }
        
        if(data.isCornerReinforced()) {
            cornerReinforcementCost = baseCost * 0.12;
        }
        else {
            cornerReinforcementCost = 0;
        }
        
        if(data.isTopSealable()) {
            sealableTopCost = baseCost * 0.10;
        }
        else {
            sealableTopCost = 0;
        }
        
        totalCost = baseCost + colourCost + bottomReinforcementCost + cornerReinforcementCost + sealableTopCost;
        return totalCost;
    }

    public double calculateCost() {
        return calculateSingleBoxCost() * quantity;
    }
}