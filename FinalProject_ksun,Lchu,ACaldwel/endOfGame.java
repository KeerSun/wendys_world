import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Holds final result of whether player is successful or not
 *
 * @author Anna C-O, Keer Sun, Lily Chu
 * @version 12/07/18
 */
public class endOfGame extends JPanel
{
   private JPanel textPanel,buttonPanel;
   private JButton bYes,bNo;
   private JLabel l1;
   private StoryTree sTree;
   private JLabel imageLabel;
   private Wendy wendy;
   private gamePanel gPan;
   //-----------------------------------------------------------------
   //  Sets up this panel with two labels.
   //-----------------------------------------------------------------
   public endOfGame(StoryTree tree,gamePanel g, Wendy w)
   {
      setBackground (Color.cyan);
      sTree = tree;
      gPan = g;
      wendy = w;
      
      
      l1 = new JLabel ();
      imageLabel = new JLabel();
      textPanel = new JPanel();
      textPanel.setBackground (Color.cyan);
      textPanel.add (l1); 
      
      //determine success 
      if (wendy.isSuccessful())
        l1.setText("<html><body>You have had a very successful 4 years at Wellesley. <br>You will go on and do great things!</body></html>");
      else l1.setText("<html><body>You haven't quite met your goals... <br>Keep in mind your priorities in the furture!</body></html>");
      
      //set font           
      Font monaco = new Font ("Monaco", Font.PLAIN, 20);
      l1.setFont (monaco);

      
      
      add (imageLabel);
      add (textPanel);
      
      setPreferredSize (new Dimension(800, 600));//controls"window"size
      setMinimumSize(new Dimension(800, 600));
      setMaximumSize(new Dimension(800, 600));
    }
}

