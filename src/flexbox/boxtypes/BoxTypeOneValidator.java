package flexbox.boxtypes;

/**
 * Box validator for Box Type 1
 * @author Group D4
 */
public class BoxTypeOneValidator extends BoxValidator {
    @Override
    public boolean isValidForThisType(BoxData data) {
        return 
        data.getGrade() <= 3 &&
        data.getColour() == 0 &&
        !data.isBottomReinforced() &&
        !data.isCornerReinforced();
    }

}
