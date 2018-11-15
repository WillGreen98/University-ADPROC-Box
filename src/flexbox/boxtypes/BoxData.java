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
