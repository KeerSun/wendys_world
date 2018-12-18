import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Displays buttons for options to lead to different scenarios
 *
 * @author Anna C-O, Keer Sun, Lily Chu
 * @version 12/07/18
 */
public class optionPanel extends JPanel
{
   private JPanel textPanel,buttonPanel;
   private JButton bYes,bNo;
   private JLabel l1;
   private StoryTree sTree;
   private JPanel imagePanel;
   private Wendy wendy;
   private gamePanel gPan;
   //-----------------------------------------------------------------
   //  Sets up this panel with two labels.
   //-----------------------------------------------------------------
   public optionPanel(StoryTree tree,gamePanel g, Wendy w)
   {
      setBackground (Color.cyan);
      sTree = tree;
      gPan = g;
      wendy = w;
      
      l1 = new JLabel ();
      imagePanel = new JPanel();
      textPanel = new JPanel();
      textPanel.setBackground (Color.cyan);
      textPanel.add (l1); 
      
      
      //set font           
      Font monaco = new Font ("Monaco", Font.PLAIN, 20);
      l1.setFont (monaco);

      setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
      bYes = new JButton ("Yes");
      bNo = new JButton ("No");
      
      
    
      
      ButtonListener listener = new ButtonListener();
      bYes.addActionListener (listener);
      bNo.addActionListener (listener);
      
      add (imagePanel);
      add (textPanel);
      add (bYes);
      add (bNo);
      setPreferredSize (new Dimension(800, 600));//controls"window"size
      setMinimumSize(new Dimension(800, 600));
      setMaximumSize(new Dimension(800, 600));
      update(sTree.getCurrentNode());
    }
   public void update(StoryNode n){
       String nextText = n.getText();
       bYes.setText(n.getButText1());
       bNo.setText(n.getButText2());
       wendy.addPoints(n.getCatagory(),n.getScoreValue());
       l1.setText(nextText);
       imagePanel.removeAll();
       ImageIcon image = new ImageIcon(n.getImage());
       
       Image intimage = image.getImage(); // transform it into an Image object 
       Image newimg = intimage.getScaledInstance(400, 300,  java.awt.Image.SCALE_SMOOTH); //resize
       image = new ImageIcon(newimg); //put it back
       imagePanel.add(new JLabel(image));
       gPan.revalidate();
       gPan.repaint();
       revalidate();
       repaint();
    }
   private class ButtonListener implements ActionListener{
      public void actionPerformed (ActionEvent event)
      {
        StoryNode nextNode = null;
          if (event.getSource() == bYes){
          nextNode = sTree.getNextNode(true);
          
        }
          if (event.getSource() == bNo){
          nextNode = sTree.getNextNode(false);
          
        }
        if (nextNode==null){
          gPan.remove(optionPanel.this);
          JPanel end = new endOfGame(sTree,gPan,wendy);
          gPan.add(end);
          gPan.revalidate();
          gPan.repaint();
          revalidate();
          repaint();
        }
        
        else update(nextNode);
      }
    }
}

