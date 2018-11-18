package flexbox.boxtypes;

/**
 *
 * @author matt
 */
public abstract class BoxValidator {
    public abstract boolean isValidForThisType(BoxData data);
    public abstract int getBoxType();
}
