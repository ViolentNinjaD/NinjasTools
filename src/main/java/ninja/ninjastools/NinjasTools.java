package ninja.ninjastools;

import javax.swing.*;

/**
    @author ViolentNinjaD
    (NinjasTools)
    Class = NinjasTools
    Licensed under LGPLv3
**/

public class NinjasTools
{
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                MainGUI.showGUI();
            }
        });
    }
}
