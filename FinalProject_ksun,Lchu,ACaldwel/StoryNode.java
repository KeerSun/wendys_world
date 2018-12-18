import java.util.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

/**
 * Holds decision tree nodes containing the storyline text, and images
 *
 * @author Anna C-O, Keer Sun, Lily Chu
 * @version 12/07/18
 */
public class StoryNode
{
    // instance variables - replace the example below with your own
    private String text;
    private String image; //path to image file(?)
    private boolean end;
    private int addedScore;
    private String catagory;
    private String but1;
    private String but2;
    /**
     * Constructor for objects of class StoryNode
     */
    public StoryNode(String t, String i,boolean e,int num,String s,String b1, String b2)
    {
        // initialise instance variables
        text = t;
        image = i;
        end = e;
        addedScore = num;
        catagory = s;
        but1 = b1;
        but2 = b2;
        }
    
    public boolean isEnd(){
        return end;
    }

    public String getText(){
      return text;
    }

    public String getImage(){
      return image;
    }
    
    public String getCatagory(){
        return catagory;
    }
    
    public String getButText1(){
        return but1;
    }
    
    public String getButText2(){
        return but2;
    }
    
    public int getScoreValue(){
        return addedScore;
    }
    
    public String toString(){
        return "node text: " + this.getText();
    }
}
