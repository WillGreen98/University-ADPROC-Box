package flexbox;

public class Box {
    
    private double bLenght, bHeight, bWidth;
    private int bGrade, bColour, bQuantity;
    private boolean bBottomReinforcement, bCornerReinforcement, bSealableTop;
    
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
        bSealableTop = sealableTop;
    }
    
    public double getLength () {
        return bLenght;
    }
    public void setLength (double newLength) {
        bLenght = newLength;
    }
    
    public double getHeight () {
        return bHeight;
    }
    public void setHeight (double newHeight) {
        bHeight = newHeight;
    }
    
    public double getWidth () {
        return bWidth;
    }
    public void setWidth (double newWidth) {
        bWidth = newWidth;
    }
    
    public int getGrade () {
        return bGrade;
    }
    public void setGrade (int newGrade) {
        bGrade = newGrade;
    }
    
    public int getColour () {
        return bColour;
    }
    public void setColour (int newColour) {
        bColour = newColour;
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
}
