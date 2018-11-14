package flexbox;

public class Box {
    
    private double length, height, width;
    private int grade, colour, quantity;
    private boolean bottomReinforcement, cornerReinforcement, sealableTop;
    
    public Box() {}
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

    public void setLength(double newLength) {
        length = (newLength > 0) ? newLength : 0;
    }

    public void setHeight(double newHeight) {
        height = (newHeight > 0) ? newHeight : 0;
    }

    public void setWidth(double newWidth) {
        width = (newWidth > 0) ? newWidth : 0;
    }

    public void setGrade(int newGrade) {
        if(newGrade >=1 && newGrade <= 5) {
            grade = newGrade;
        } else if(newGrade < 1) {
            grade = 1;
        } else {
            grade = 5;
        }
    }

    public void setColour(int newColour) {
        if(newColour >= 0 && newColour <= 2) {
            colour = newColour;
        } else if (newColour < 0) {
            colour = 0;
        } else {
            colour = 2;
        }
    }

    public void setQuantity(int newQuantity) {
        quantity = (newQuantity > 0) ? newQuantity : 0;
    }

    public void setBottomReinforcement (boolean newBottomReinforcement){
        bottomReinforcement = newBottomReinforcement;
    }

    public void setCornerReinforcement(boolean newCornerReinforcement){
        cornerReinforcement = newCornerReinforcement;
    }

    public void setSealableTop(boolean newSealableTop){
        sealableTop = newSealableTop;
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
}
