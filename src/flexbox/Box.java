package flexbox;

public class Box {
    
    private double bLenght, bHeight, bWidth;
    private int bGrade, bColour, bQuantity;
    private boolean bBottomReinforcement, bCornerReinforcement;
    
    public Box () {};
    
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
}