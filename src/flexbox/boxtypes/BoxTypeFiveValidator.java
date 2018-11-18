package flexbox.boxtypes;

/**
 * Box validator for Box Type 5
 * @author Group D4
 */
public class BoxTypeFiveValidator extends BoxValidator {
    @Override
    public boolean isValidForThisType(BoxData data) {
        return 
            data.getGrade() >= 3 && 
            data.getColour() == 2 &&
            data.isBottomReinforced() && 
            data.isCornerReinforced();
    }

}
