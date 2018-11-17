package flexbox.ui;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * Helper functions for the GUI
 * @author Matthew Hopson
 */
public class GUIUtil {
    /**
     * Creates a JPanel where the JComponenets added will be vertically aligned
     * using BoxLayout
     * @return Vertically aligned JPanel
     */
    public static JPanel createStackPanel() {
        JPanel sect = new JPanel();
        sect.setLayout(new BoxLayout(sect, BoxLayout.Y_AXIS));
        return sect;
    }
}
