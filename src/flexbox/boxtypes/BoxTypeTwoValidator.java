package flexbox.boxtypes;

/**
 * Box validator for Box Type 2
 * @author Group D4
 */
public class BoxTypeTwoValidator extends BoxValidator {
    @Override
    public boolean isValidForThisType(BoxData data) {
        return 
            data.getGrade() >= 2 && data.getGrade() <= 4 &&
            data.getColour() == 1 &&
            !data.isBottomReinforced() &&
            !data.isCornerReinforced();
    }

}
