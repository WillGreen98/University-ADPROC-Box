package flexbox;

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
}
