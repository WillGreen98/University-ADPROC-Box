/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox.boxtypes;

/**
 *
 * @author matt
 */
public abstract class BoxValidator {
    public abstract boolean isValidForThisType(BoxData data);
    public abstract int getBoxType();
}
