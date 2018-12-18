import javafoundations.*;
/**
 * Driver for the game; hold decision trees
 * containing the storyline
 * @author Anna C-O
 * @version 12/15/18
 */
//MAKE A FOLDER CONTAINING ALL OF THE IMAGES LABELED
//IN A USEFUL WAY
import java.awt.*;
import javax.swing.*;
public class StoryDriver {
    public static void main(String[] args){
        JFrame frame = new JFrame ("Wendy's World");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Wendy wendy = new Wendy("Wendy");
        StoryTree tree = new StoryTree(wendy);
        gamePanel gPanel = new gamePanel(wendy,tree);
        
        frame.getContentPane().add(gPanel);
        frame.pack();
        frame.setVisible(true);
        
        
    }
}
