import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * Holds starting panel for player to begin the game
 *
 * @author Anna C-O, Keer Sun, Lily Chu
 * @version 12/07/18
 */
public class StartPanel extends JPanel
{
   private JTextField wname;
   private JPanel top, middle, bottom, authors;
   private ImageIcon image;
   private JLabel imgpath;
   private JLabel instructions;
   private gamePanel gPan;
   private Wendy wendy;
   private StoryTree tree;
   public StartPanel(gamePanel gPan,StoryTree t,Wendy w)
   {
      this.gPan = gPan;
      wendy = w;
      tree = t;
      Color wBlue = Color.decode("#002776");
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      setBackground (wBlue);
      setPreferredSize(new Dimension(900,700));
      top = new JPanel();
      middle = new JPanel();
      bottom = new JPanel();
      authors = new JPanel();
      // imgpath = new ImageIcon("IMG_1675.jpg");
      // image = new JLabel(imgpath);
      
      //ImageIcon icon = new ImageIcon("instructions.gif");
      //image = new JLabel(character, icon, JLabel.CENTER);
      
      image = new ImageIcon("tower_tablet.jpg");
      
      Image intimage = image.getImage(); // transform it into an Image object 
      Image newimg = intimage.getScaledInstance(700, 500,  java.awt.Image.SCALE_SMOOTH); //resize
      image = new ImageIcon(newimg); //put it back
      imgpath = new JLabel(image);
      
      JLabel l1 = new JLabel ("Wendy's World");
      l1.setFont(new Font("Monaco", Font.PLAIN, 36));
      l1.setForeground(Color.white);
      JLabel l2 = new JLabel ("Enter your name:");
      l2.setFont(new Font("Monaco", Font.PLAIN, 18));
      l2.setForeground(Color.white);
      wname = new JTextField (14);
      wname.setMaximumSize(new Dimension(300,10));
      
      NameListener nlistener = new NameListener();
      wname.addActionListener(nlistener);
      JButton next = new JButton("START GAME");
      ButtonListener blistener = new ButtonListener();
      next.addActionListener(blistener);
      JLabel l3 = new JLabel ("Created by Anna Caldwell-Overdier, Lily Chu,"
      + " and Keer Sun");
      l3.setFont(new Font("Monaco", Font.PLAIN, 12));
      l3.setForeground(Color.white);
      top.setPreferredSize(new Dimension(900,100));
      top.setBackground(wBlue);
      middle.setPreferredSize(new Dimension(900, 350));
      middle.setBackground(wBlue);
      bottom.setPreferredSize(new Dimension(900, 150));
      bottom.setBackground(wBlue);
      authors.setPreferredSize(new Dimension(900, 100));
      authors.setBackground(wBlue);
      top.add (l1);
      middle.add(imgpath);
      bottom.add (l2);
      bottom.add(wname);
      bottom.add(next);
      authors.add (l3);
      add(top);
      add(middle);
      add(bottom);
      add(authors);
   }
   private class NameListener implements ActionListener{
     public void actionPerformed (ActionEvent event)
      {
        
      }
   }
   private class ButtonListener implements ActionListener
   {
      //Panel2 pan2 = new Panel2();
      public void actionPerformed (ActionEvent event)
      {
         String wendyName = wname.getText();
         wendy.setName(wendyName);
         System.out.println(wname.getText());
         System.out.print(wendy.getName());
         gPan.remove(StartPanel.this);
         JPanel pan2 = new Panel2(tree,gPan,wendy);
         gPan.add(pan2);
         gPan.revalidate();
         gPan.repaint();
         revalidate();
         repaint();
      }
   }
}
