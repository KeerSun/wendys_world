
/**
 * Representation of character's avatar object
 *
 * @author Anna C-O, Keer Sun, Lily Chu
 * @version v1 12/05/18
 */
import javafoundations.*;
/**
 * Class that creates the player of the game
 *
 * @author Anna C-O, Keer Sun, Lily Chu
 * @version 12/07/18
 */
public class Wendy
{
    // instance variables - replace the example below with your own
    private String name; //ask user for name
    private LinkedQueue<String> rank; //player's priorities for life
    //rank in order of academics, social, health always
    private int academic;
    private int social;
    private int health;
    private String major;
    private boolean fluvac;


    /**
     * Constructor for objects of class Wendy
     */

    public Wendy(String name)
    {
        // initialise instance variables
        this.rank = new LinkedQueue<String>();
        this.name = name;
        academic = 0; //start at 0 for all points
        social = 0;
        health = 0;
        major = null; //set this later!
    }

    public LinkedQueue<String> enqueueRank(String a){
      rank.enqueue(a);
      return rank;
    }

    public int getAcademic()
    {
        return this.academic;
    }
    public int getSocial()
    {
        return this.social;
    }
    public int getHealth()
    {
        return this.health;
    }
    public void setAcademic(int a)
    {
        academic = a;
    }
    public void setSocial(int s)
    {
        social = s;
    }
    public void setHealth(int h)
    {
        health = h;
    }
    public void updateAcademic(int a)
    {
        setAcademic(academic + a);
    }
    public void updateSocial(int s)
    {
        setSocial(social + s);
    }
    public void updateHealth(int h)
    {
        setHealth(health + h);
    }
    public String getName(){
      return this.name;
    }
    public void setName(String n){
      name = n;
    }
    public String getMajor(){
      if (major != null){
        return this.major;
      }
      else{
        return "undeclared";
      }
    }
    public void setMajor(String m){
      major = m;
    }
    public boolean isSuccessful(){
      String priority1 = rank.dequeue();
      String priority2 = rank.dequeue();
      String priority3 = rank.dequeue();
      return getPoints(priority1) > getPoints(priority2) && getPoints(priority2)> getPoints(priority3);
    }
    private int getPoints(String s){
        if (s.equals("academic"))
            return academic;
        if (s.equals("social"))
            return social;
        else return health;    
    }
    public void addPoints(String s,int p){
        if (s.equals("Academics"))
            academic+=p;
        else if (s.equals("Social"))
            social+=p;
        else health+=p;    
    }
    public String toString(){
      String result = "My name is ";
      result+= name+"\n";
      result+= "Social: " + social + "\n";
      result+= "Academics: " + academic + "\n";
      result+= "Health: " + health + "\n";
      result+= "Priorities: " + rank;
      return result;
    }
    
    public static void main(String[] args){
      Wendy w = new Wendy("Wendy");
      System.out.println(w);
    }
}
