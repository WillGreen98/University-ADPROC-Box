package flexbox.boxtypes;

/**
 * Box validator for Box Type 4
 * @author Group D4
 */
public class BoxTypeFourValidator extends BoxValidator {
    @Override
    public boolean isValidForThisType(BoxData data) {
        return 
            data.getGrade() >= 2 &&
            data.getColour() == 2 &&
            data.isBottomReinforced() &&
            !data.isCornerReinforced();
    }
    
    /**
     * Gets the box type for this validator
     * @return The box type
     */
    @Override
    public int getBoxType() {
        return 4;
    }
}
