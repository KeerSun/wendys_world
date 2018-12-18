
/**
 * Write a description of class gamePanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.*;
import javax.swing.*;
import java.util.*;
public class gamePanel extends JPanel 
{
    /**
     * Constructor for objects of class gamePanel
     */
    private Wendy wendy;
    private StoryTree tree;
    public gamePanel(Wendy w, StoryTree t)
    {
        wendy = w;
        tree = t;
        JPanel panel = new StartPanel(this,tree,wendy);
        setPreferredSize (new Dimension(800, 600));//controls"window"size
        setMinimumSize(new Dimension(800, 600));
        setMaximumSize(new Dimension(800, 600));
        add(panel);
        
    }
}
