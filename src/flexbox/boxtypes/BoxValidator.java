package flexbox.boxtypes;

/**
 * @author Group D4
 */

public abstract class BoxValidator {
    public abstract boolean isValidForThisType(BoxData data);
    public abstract int getBoxType();
}
