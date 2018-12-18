import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel2 extends JPanel 
{
   private JPanel textPanel;
   private JButton b1,b2,b3;
   private JLabel lPriority;
   private String priority;
   private gamePanel gPan;
   private Wendy wendy;
   private StoryTree tree;
   //-----------------------------------------------------------------
   //  Sets up this panel with two labels.
   //-----------------------------------------------------------------
   public Panel2(StoryTree t,gamePanel g, Wendy w)
   {
      this.gPan = g;
      wendy = w;
      tree = t;
      
      setBackground (Color.cyan);
      JLabel l1 = new JLabel ("Welcome "+ wendy.getName());                         
      JLabel l1_1 = new JLabel (" to Wellesley College! You will ");
      JLabel l1_2 = new JLabel ("spend your next 4 years here.");
      JLabel l1_3 = new JLabel (" Your future is in your hands!");
      
      JLabel l2 = new JLabel ("Rank your priorities in life below");
      JLabel l2_1 = new JLabel (" what you rank your prioriteis will help" );
      JLabel l2_2 = new JLabel (" gage how successful you are by your");
      JLabel l2_3 = new JLabel (" own standards. Choose wisely!");
          
      textPanel = new JPanel();
      
      //textPanel.setPreferredSize (new Dimension(200, 40)); does not work
      textPanel.setBackground (Color.cyan);
      textPanel.add (l1); 
      textPanel.add (l1_1); 
      textPanel.add (l1_2); 
      textPanel.add (l1_3); 
      textPanel.add (l2); 
      textPanel.add (l2_1); 
      textPanel.add (l2_2); 
      textPanel.add (l2_3); 
      
      //set font           
      Font monaco = new Font ("Monaco", Font.PLAIN, 20);
      l1.setFont (monaco);
      l1_1.setFont (monaco);
      l1_2.setFont (monaco);
      l1_3.setFont (monaco);
      l2.setFont (monaco);
      l2_1.setFont (monaco);
      l2_2.setFont (monaco);
      l2_3.setFont (monaco);

      setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
      b1 = new JButton ("Academics");
      b2 = new JButton ("    Health   ");
      b3 = new JButton ("    Social    ");
      
      
      priority = "Priority List: ";
      lPriority = new JLabel(priority);
      
      ButtonListener listener = new ButtonListener();
      b1.addActionListener (listener);
      b2.addActionListener (listener);
      b3.addActionListener (listener);
      
      
      add (textPanel);
      
      add (lPriority);
      add (b1);
      add (b2);
      add (b3);  

      setPreferredSize (new Dimension(800, 600));
    }
   private class ButtonListener implements ActionListener
   {
      int count = 0;
      public void actionPerformed (ActionEvent event)
      {
         if (event.getSource() == b1){
         priority+="Academics ";
         lPriority.setText(priority);
         b1.setEnabled(false);
         wendy.enqueueRank("academic");
         count+=1;
        }
        if (event.getSource() == b2){
         priority+="Health ";
         lPriority.setText(priority);
         b2.setEnabled(false);
         wendy.enqueueRank("health");
         count+=1;
        }
         if (event.getSource() == b3){
         priority+="Social ";
         lPriority.setText(priority);
         b3.setEnabled(false);
         wendy.enqueueRank("social");
         count+=1;
        }
         if (count==3){
         gPan.remove(Panel2.this);
         JPanel Opan = new optionPanel(tree,gPan,wendy);
         gPan.add(Opan);
         gPan.revalidate();
         gPan.repaint();
         revalidate();
         repaint();
        }
      }
      }
   
}
