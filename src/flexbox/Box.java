package flexbox;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Box {
    
    private double length, height, width;
    private int grade, colour, quantity;
    private boolean bottomReinforcement, cornerReinforcement, sealableTop;
    

    public Box() {}  // Empty Constructor for default Values
    public Box(double length, double height, double width, int grade, int colour, int quantity, boolean bottomReinforcement, boolean cornerReinforcement, boolean sealableTop) {
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.colour = colour;
        this.quantity = quantity;
        this.bottomReinforcement = bottomReinforcement;
        this.cornerReinforcement = cornerReinforcement;
        this.sealableTop = sealableTop;

    }

    public void setLength(double length) {
        this.length = (length > 0) ? length : 0;
    }

    public void setHeight(double height) {
        this.height = (height > 0) ? height : 0;
    }

    public void setWidth(double width) {
        this.width = (width > 0) ? width : 0;
    }

    public void setGrade(int grade) {
        if(grade >=1 && grade <= 5) {
            this.grade = grade;
        } else if(grade < 1) {
            this.grade = 1;
        } else {
            this.grade = 5;
        }
    }

    public void setColour(int colour) {
        if(colour >= 0 && colour <= 2) {
            this.colour = colour;
        } else if (colour < 0) {
            this.colour = 0;
        } else {
            this.colour = 2;
        }
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public void setBottomReinforcement (boolean bottomReinforcement){
        this.bottomReinforcement = bottomReinforcement;
    }

    public void setCornerReinforcement(boolean cornerReinforcement){
        this.cornerReinforcement = cornerReinforcement;
    }

    public void setSealableTop(boolean sealableTop){
        this.sealableTop = sealableTop;
    }

    public double getHeight () {
        return height;
    }
    public double getLength () {
        return length;
    }
    public double getWidth () {
        return width;
    }
    public int getGrade () {
        return grade;
    }
    public int getColour () {
        return colour;
    }
    public int getQuantity(){
        return quantity;
    }
    public boolean getBottomReinforcement(){
        return bottomReinforcement;
    }
    public boolean getCornerReinforcement(){
        return cornerReinforcement;
    }
    public boolean getSealableTop(){
        return sealableTop;
    }
    public void setSealableTop(boolean newSealableTop){
        bSealableTop = newSealableTop;
    }
    
    public int getQuantity(){
        return bQuantity;
    }
    public void setQuantity(int newQuantity){
        if (newQuantity > 0){
            bQuantity = newQuantity;
        }
        else {
            bQuantity = 0;
        }
    }
    
    public double calculateCost() {
        double area = (bLenght * bLenght + bHeight * bHeight + bWidth * bWidth) * 2;
        double singularCost = 0;
        double totalCost = 0;
        
        if (bGrade == 1) {
            singularCost = area * 0.55;
        }
        else if (bGrade == 2) {
            singularCost = area * 0.65;
        }
        else if (bGrade == 3) {
            singularCost = area * 0.82;
        }
        else if (bGrade == 4) {
            singularCost = area * 0.98;
        }
        else {
            singularCost = area * 1.50;
        }
  
        if (bColour == 1) {
            singularCost *= 1.12;
        }
        else if (bColour == 2) {
            singularCost *= 1.15;
        }
        
        if (bBottomReinforcement == true) {
            singularCost *= 1.13;
        }
        
        if (bCornerReinforcement == true) {
            singularCost *= 1.12;
        }
        
        if (bSealableTop == true) {
            singularCost *= 1.10;
        }
        
        totalCost = singularCost * bQuantity;
        
        //totalCost = Math.round((totalCost * 100.0) / 100.0);
        BigDecimal dec = BigDecimal.valueOf(totalCost);
        dec = dec.setScale(2, RoundingMode.HALF_UP);
        
        return dec.doubleValue();
    }
}
