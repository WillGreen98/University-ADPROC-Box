package flexbox;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Box {
    
    private double bLenght, bHeight, bWidth;
    private int bGrade, bColour, bQuantity;
    private boolean bBottomReinforcement, bCornerReinforcement, bSealableTop;
    
    public Box () {}
    
    public Box (double length, double height, double width, int grade, 
                int colour, boolean bottomReinforcement, boolean cornerReinforcement,  
                boolean sealableTop, int quantity) {
        
        bLenght = length;
        bHeight = height;
        bWidth = width;
        bGrade = grade;
        bColour = colour;
        bQuantity = quantity;
        bBottomReinforcement = bottomReinforcement;
        bCornerReinforcement = cornerReinforcement;
        bSealableTop = sealableTop;
    }
    
    public double getLength () {
        return bLenght;
    }
    public void setLength (double newLength) {
        if (newLength > 0){
            bLenght = newLength;
        }
        else {
            bLenght = 0;
        }
    }
    
    public double getHeight () {
        return bHeight;
    }
    public void setHeight (double newHeight) {
        if (newHeight > 0) {
            bHeight = newHeight;
        }
        else {
            bHeight = 0;
        }
    }
    
    public double getWidth () {
        return bWidth;
    }
    public void setWidth (double newWidth) {
        if (newWidth > 0) {
            bWidth = newWidth;
        }
        else {
            bWidth = 0;
        }
    }
    
    public int getGrade () {
        return bGrade;
    }
    public void setGrade (int newGrade) {
        if (newGrade >=1 && newGrade <= 5){
            bGrade = newGrade;
        }
        else if (newGrade < 1) { 
            bGrade = 1;
        }
        else {
            bGrade = 5;
        }
    }
    
    public int getColour () {
        return bColour;
    }
    public void setColour (int newColour) {
        if (newColour >= 0 && newColour <= 2) {
            bColour = newColour;
        }
        else if (newColour < 0) {
            bColour = 0;
        }
        else {
            bColour = 2;
        }
    }
    
    public boolean getBottomReinforcement(){
        return bBottomReinforcement;
    }
    public void setBottomReinforcement (boolean newBottomReinforcement){
        bBottomReinforcement = newBottomReinforcement;
    }
    
    public boolean getCornerReinforcement(){
        return bCornerReinforcement;
    }
    public void setCornerReinforcement(boolean newCornerReinforcement){
        bCornerReinforcement = newCornerReinforcement;
    }
    
    public boolean getSealableTop(){
        return bSealableTop;
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
