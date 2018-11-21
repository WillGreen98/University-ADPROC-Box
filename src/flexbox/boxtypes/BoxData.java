package flexbox.boxtypes;

/**
 * Class to handle box data
 * @author Group D4
 */
public class BoxData {
    private double length, height, width;
    private int grade, colour;
    private boolean bottomReinforcement, cornerReinforcement, sealableTop;
    
    public BoxData() {}
    public BoxData(double length, double height, double width, 
            int grade, int colour, 
            boolean bottomReinforcement, boolean cornerReinforcement, boolean sealableTop) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.grade = grade;
        this.colour = colour;
        this.bottomReinforcement = bottomReinforcement;
        this.cornerReinforcement = cornerReinforcement;
        this.sealableTop = sealableTop;
    }

    // ============== Setters ===============
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
        } else if(colour < 0) {
            this.colour = 0;
        } else {
            this.colour = 2;
        }
    }

    public void setBottomReinforcement (boolean bottomReinforcement){
        this.bottomReinforcement = bottomReinforcement;
    }

    public void setCornerReinforcement(boolean cornerReinforcement){
        this.cornerReinforcement = cornerReinforcement;
    }

    public void setTopSealable(boolean sealableTop){
        this.sealableTop = sealableTop;
    }
    
    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int getGrade() {
        return grade;
    }

    public int getColour() {
        return colour;
    }

    public boolean isBottomReinforced(){
        return bottomReinforcement;
    }

    public boolean isCornerReinforced(){
        return cornerReinforcement;
    }

    public boolean isTopSealable(){
        return sealableTop;
    }
}
