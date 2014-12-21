package ninja.ninjastools;

import ninja.ninjastools.reference.GUIDimensions;
import ninja.ninjastools.reference.NTNames;

import javax.swing.*;
import java.awt.*;

/**
    @author ViolentNinjaD
    (NinjasTools)
    Class = MainGUI
    Licensed under LGPLv3
**/

public class MainGUI extends JComponent
{
    public static JFrame mainFrame = new JFrame(NTNames.MAIN_GUI);
    public static void showGUI()
    {
        JPanel panel = null;
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(GUIDimensions.MAIN_GUI_WIDTH, GUIDimensions.MAIN_GUI_HEIGHT));

        mainFrame.setPreferredSize(new Dimension(GUIDimensions.MAIN_GUI_WIDTH, GUIDimensions.MAIN_GUI_HEIGHT));
        mainFrame.pack();

        mainFrame.setVisible(true);
    }
}
