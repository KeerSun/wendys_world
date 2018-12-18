import javafoundations.*;
/**
 * Holds our story line that is contained in nodes in trees
 *
 * @author Anna C-O, Keer Sun, Lily Chu
 * @version 12/07/18
 */
public class StoryTree 
{
    /**
     * Constructor for objects of class StoryTree
     */
    private LinkedQueue<LinkedBinaryTree<StoryNode>> storyQ;
    private LinkedBinaryTree<StoryNode> currentTree;
    private StoryNode currentNode;
    private Wendy wendy;
    public StoryTree(Wendy w)
    {
        wendy = w;
        StoryNode n1root, n1a, n1aa, n1ab, n1b, n1ba, n1bb;
        //tree1
        
        
                n1root = new StoryNode("<html><body>Hi! You must be " + wendy.getName() +
                 "! <br>I’m your new roommate. :) Are you excited for orientation " +
                 "today?</body></html>", "orientation.jpg", false, 0, "Social", "Yes", "No");
        
        //add buttons (yes) (no)
        
        //under (yes)
        n1a = new StoryNode("<html><body>After a long day of panels, " +
              "workshops, and activities,<br> your house president convenes " +
              "all of the first-years<br>in the living room.It’s time for " +
              "the <br>most secret Wellesley tradition, lake jump!<br> How are " +
              "you going to participate?</body></html>", "orientation.jpg", false, 10, "Social", 
              "dive right in", "cheer on your housemates" );
        
        //add buttons (dive right in) (cheer on your housemates)
        
        //under (dive right in)
        n1aa = new StoryNode("<html><body>You throw your penny into the lake<br> " +
               "and dive in after it. Unfortunately, the lakeweed is too thick<br> " +
               "to find the coin again, but you enjoy a nice swim in the lake<br> " +
               "with your new friends.</body></html>", "waban.jpg", true, 10, "Social", "Next", "Next");
        //under (cheer on your housemates)       
        n1ab = new StoryNode("<html><body>Your enthusiasm for your dorm is unmatched " +
               "and you<br> lose your voice from screaming.</body></html>", 
               "waban.jpg",true, 10, "Social", "Next", "Next"); 
        
        //under (no)       
        n1b = new StoryNode("<html><body>You skip most of the orientation events <br>and decide " +
              "to explore campus instead. <br>In the arboretum, you meet another <br>" +
              "first-year who has ditched. <br>Do you: </body></html>", "arboretum.jpg", false, 5, "Social",
              "Make a new friend", "Keep exploring");    
        
        //add buttons (make a new friend) (keep exploring)
        
        //under (make a new friend)
        n1ba = new StoryNode("<html><body>It turns out that your new friend is dead-set on <br>" +
               "attending Yale Law School <br>and she’s skipping orientation to study <br>" +
               "for the LSAT. Chances are, you’re <br>going to have to keep searching <br>" +
               "for a bestie. </body></html>", "arboretum.jpg", true, 5, "Social", "Next", "Next");  
            
        //under (keep exploring)
        n1bb = new StoryNode("<html><body>After your walk, you head back to your dorm <br>" +
               "to finish unpacking and decorating your room. <br>It’s time for a well-deserved " +
               "nap!</body></html>", "arboretum.jpg", true, 10, "Health", "Next", "Next");
            
        LinkedBinaryTree<StoryNode> tree1, t1a, t1b;
        
        //left subtree
        t1a = new LinkedBinaryTree<StoryNode>(n1a, new LinkedBinaryTree<StoryNode>(n1aa), 
                                              new LinkedBinaryTree<StoryNode>(n1ab));
        //right subtree                                      
        t1b = new LinkedBinaryTree<StoryNode>(n1b, new LinkedBinaryTree<StoryNode>(n1ba),
                                              new LinkedBinaryTree<StoryNode>(n1bb));
        //combine subtrees                                      
        tree1 = new LinkedBinaryTree<StoryNode>(n1root, t1a, t1b);
        
        System.out.println(tree1);
        
        //tree2: lake day
        
        StoryNode n2root, n2a, n2aa, n2ab, n2b, n2ba, n2bb;
        
        n2root = new StoryNode("<html><body>It’s Lake Day! Once a celebrated tradition, <br> " +
                "Lake Day is now a sad incarnation of its former glory. <br>"  +
                "You still have to go to class today,<br> and the lines " +
                "for everything are long. <br>What will you do?</html></body>", "lakeday.jpg", false, 0, 
                "Social", "Get fried dough", "Get a flu shot");
        
        //add buttons (get fried dough) (get a flu shot)
               
        //under (get fried dough)
        n2a = new StoryNode("<html><body>The line was definitely worth it, because<br> " + 
                            "the fried dough  is delicious! <br>You’re short " + 
                            "on time now though. What do you do?</html></body>", "frieddough.jpg", false, 5, 
                            "Health", "Head straight to class", "Risk being late to get a flu shot");
        
        //add buttons (head straight to class) (risk being late to get a flu shot)
        
        //under (head straight to class)
        n2aa = new StoryNode("<html><body>You get to class right on time and grab your <br>" +
                             "favorite seat in the classroom. <br>Good thing you came straight here!</html></body>", 
                             "classroom.jpg", true, 10, "Academics", "Next", "Next");
        
        //under (risk being late to get a flu shot)                     
        n2ab = new StoryNode("<html><body>The flu shot line has shortened, and you reach <br>" +
                             "the front quickly. <br>After you get the shot, you " +
                             "realize that you still have time to <br>make it to class if you hurry.</html></body>", 
                             "flushot.jpg", true, 10, "Health", "Next", "Next");
        
        //under (get a flu shot)                     
        n2b = new StoryNode("<html><body>Being proactive has its benefits! <br>Avoiding illness " +
                            "is one of the best things <br>you can do to ensure your " +
                            "academic <br>success. You still have some time <br>left before class. " +
                            "What do you do?</html></body>", "flushot.jpg", false, 10, "Health",
                            "Get some fried dough to take with you to class", "Join your friends " +
                            "in the bouncy castle");
        
        //add buttons (get some fried dough to take with you to class) (join your friends in the bouncy castle)
        
        //under (get some fried dough to take with you to class)
        n2ba = new StoryNode("<html><body>The fried dough is delicious, <br>and you’re looking forward " +
                             "<br>to finishing it during your lecture!</html></body>", "frieddough.jpg", true, 10, 
                             "Health", "Next", "Next");
        //under (join your friends in the bouncy castle)
        n2bb = new StoryNode("<html><body>This really brings you back. Who doesn’t <br>like a bouncy castle? " +
                             "You have a great time <br>with your friends and head to class in a good mood</html></body>", 
                             "bouncycastle.jpg", true, 10, "Social", "Next", "Next");
        
        LinkedBinaryTree<StoryNode> tree2, t2a, t2b;
        
        //left subtree
        t2a = new LinkedBinaryTree<StoryNode>(n2a, new LinkedBinaryTree<StoryNode>(n2aa), 
                                              new LinkedBinaryTree<StoryNode>(n2ab));
        //right subtree                                      
        t2b = new LinkedBinaryTree<StoryNode>(n2b, new LinkedBinaryTree<StoryNode>(n2ba),
                                              new LinkedBinaryTree<StoryNode>(n2bb));
        //combine subtrees                                      
        tree2 = new LinkedBinaryTree<StoryNode>(n2root, t2a, t2b);
        
        System.out.println(tree2);
        
        //tree3: research paper

        StoryNode n3root, n3a, n3aa, n3ab, n3b, n3ba, n3bb;
        
        n3root = new StoryNode("<html><body>You have been assigned a research <br>paper for your " +
                               "American Studies course. <br>It is due in three weeks from today, " +
                               "<br>and your professor has provided a recommended schedule/ timeline<br> " +
                               "for you and your classmates to indicate <br>where you should be with " +
                               "your paper in the weeks to come. <br>Do you:</html></body>", "researchnotes.jpg", 
                               false, 0, "Social", "Start your paper early", "Wait until a week before " +
                               "the due date to start");
        
        //add buttons (start your paper early) (wait until a week before the due date to start)
               
        //under (start your paper early)
        n3a = new StoryNode("<html><body>You decide to start your paper early. <br>You look over " + 
                            "the recommended schedule <br>" +
                            "that your professor has provided for you, <br>and you consider whether you " +
                            "should <br>follow his schedule or stick to your <br>own personalized timeline " +
                            "that works for you. <br>Do you: </html></body>", "researchnotes.jpg", false, 10, 
                            "Academics", "Follow the Professor's schedule", "Follow your own schedule");
        
        //add buttons (follow the professor's schedule) (follow your own schedule)
        
        //under (follow your professor's schedule)
        n3aa = new StoryNode("<html><body>You Follow the recommended schedule that <br>your professor gave you " +
                             "<br>You get your paper done in a <br>timely fashion, and feel confident " + 
                             "about it when submitting it. <br>Your professor is happy you followed " +
                             "their timeline, <br>and gives you an A!</html></body>", "researchnotes.jpg", true, 10, 
                             "Academics", "Next", "Next");       
        //under (follow your own schedule)                     
        n3ab = new StoryNode("<html><body>You make your own schedule and <br>follow that. You feel good about " +
                             "making a <br>solid plan to finish the paper in good <br>time and sticking to it. " +
                             "You feel <br>confident when submitting it, and <br>you get an A!</html></body>", 
                             "researchnotes.jpg", true, 10, "Health", "Next", "Next");
        
        //under (wait until a week before the due date to start)                     
        n3b = new StoryNode("<html><body>You wait until 4 days before the <br>research paper is due to begin researching " +
                            "<br>and writing the actual paper. You can go about <br>getting this in on time in " +
                            "one of two ways:</html></body>", "researchnotes.jpg", false, -5, "Academics",
                            "Pull four all nighters to finish", "Wing it");
        
        //add buttons (pull 4 all nighters to finish) (wing it)
        
        //under (pull 4 all nighters)
        n2ba = new StoryNode("<html><body>You pull 4 all nighters in a row to get a paper that<br> " +
                             "required 3 weeks of time and research finished on time. <br>You finish " +
                             "the paper, and feel pretty good about <br>it because of the 96 hours you " +
                             "spent on it in a row. <br>You get a good grade, but are incredibly sleep " +
                             "deprived</html></body>", "researchnotes.jpg", true, -10, "Health", "Next", "Next");
        //under (wing it)
        n3bb = new StoryNode("<html><body>You wing the paper, and just get <br>as much information down as you can " +
                             "<br>You submit the paper feeling pretty <br>uneasy about it, and end up getting a bad " +
                             "<br>grade on the paper</html></body>", "researchnotes.jpg", true, -10, "Academics",
                             "Next", "Next");
        
        LinkedBinaryTree<StoryNode> tree3, t3a, t3b;
        
        //left subtree
        t3a = new LinkedBinaryTree<StoryNode>(n3a, new LinkedBinaryTree<StoryNode>(n3aa), 
                                              new LinkedBinaryTree<StoryNode>(n3ab));
        //right subtree                                      
        t3b = new LinkedBinaryTree<StoryNode>(n3b, new LinkedBinaryTree<StoryNode>(n3ab),
                                              new LinkedBinaryTree<StoryNode>(n3bb));
        //combine subtrees                                      
        tree3 = new LinkedBinaryTree<StoryNode>(n3root, t3a, t3b);
        
        System.out.println(tree3);
        
        //tree4: declare major

        StoryNode n4root, n4a, n4aa, n4ab, n4b, n4ba, n4bb;
        
        n4root = new StoryNode("<html><body>The time has come to declare your major! <br>Since you want to go " +
                               "abroad in the spring of <br>your junior year, you have to <br>make a decision soon. " +
                               "You’ve taken a <br>CS course every semester so far in <br>your time at Wellesley, as " +
                               "well as a sociology <br>course every semester. When you declare <br>your major, " +
                               "do you:</html></body>", "major.jpg", false, 0, "Social", "Declare CS Major", 
                               "Declare MAS Major");
        
        //add buttons (Declare CS Major) (Declare MAS Major)
               
        //under (Declare CS Major)
        n4a = new StoryNode("<html><body>After taking CS 115, CS 111, <br>and CS 230, you realize you are good at " +
                            "<br>coding, and also really enjoy it. <br>You fill out your major declaration form <br>with " +
                            "Computer Science as your major! <br>Next, you have to either</html></body>", 
                            "computerscience.jpg", false, 10, "Academics", "Post your declaration onto Facebook",
                            "Keep your declaration private because you <br>are unsure if you want to stick to it");
        
        //add buttons (post your declaration onto facebook) (keep your declaration on the DL because you are 
        //unsure if you want to stick to it)
        
        //under (post your declaration onto facebook)
        n4aa = new StoryNode("<html><body>Your post gets 300 likes, and <br>everyone congratulates you " +
                             "for embarking on such a difficult <br>but rewarding major! </html></body>", 
                             "faceboook.jpg", true, 10, "Social", "Next", "Next");       
        //under (keep your declaration on the DL)                     
        n4ab = new StoryNode("<html><body>You don’t tell anyone because you <br>are unsure if you will " +
                             "stick <br>with it or not. You continue pursuing <br>the major, and stay open " +
                             "minded in case <br>you decide to change your mind</html></body>", 
                             "secret.jpg", true, 10, "Health", "Next", "Next");
        
        //under (Declare MAS major)                     
        n4b = new StoryNode("<html><body>After taking a few CS classes as well <br>as some more art classes, you " +
                            "can't decide between a STEM <br>major and humanities major. <br>To compromise " +
                            "you declare MAS! Do you: </html></body>", "MAS.jpg", false, 10, "Academics",
                            "Post your declaration onto Facebook",
                            "Keep your declaration private because you are unsure if you want to stick to it");
        
        //add buttons (post your declaration onto facebook) (keep your declaration on the DL because you are 
        //unsure if you want to stick to it)
        
        //under (post your declaration onto facebook)
        n4ba = new StoryNode("<html><body>Your post gets 300 likes, and everyone <br>congratulates you " +
                             "for embarking on such an <br>interesting and fun major! </html></body>", 
                             "facebook.jpg", true, 10, "Social", "Next", "Next");       
        //under (keep your declaration on the DL)                     
        n4bb = new StoryNode("<html><body>You don’t tell anyone because <br>you are unsure if you will " +
                             "stick with <br>it or not. You continue pursuing <br>the major, and stay open " +
                             "minded <br>in case you decide to change your mind</html></body>", 
                             "secret.jpg", true, 10, "Health", "Next", "Next");
        
        LinkedBinaryTree<StoryNode> tree4, t4a, t4b;
        
        //left subtree
        t4a = new LinkedBinaryTree<StoryNode>(n4a, new LinkedBinaryTree<StoryNode>(n4aa), 
                                              new LinkedBinaryTree<StoryNode>(n4ab));
        //right subtree                                      
        t4b = new LinkedBinaryTree<StoryNode>(n4b, new LinkedBinaryTree<StoryNode>(n4ba),
                                              new LinkedBinaryTree<StoryNode>(n4bb));
        //combine subtrees                                      
        tree4 = new LinkedBinaryTree<StoryNode>(n4root, t4a, t4b);
        
        System.out.println(tree4);
        
        //adding all of the trees to the queue
        storyQ = new LinkedQueue<LinkedBinaryTree<StoryNode>>();
        storyQ.enqueue(tree1);
        storyQ.enqueue(tree2);
        storyQ.enqueue(tree3);
        storyQ.enqueue(tree4);
        
        //storyQ.enqueue(tree2);
        currentTree = storyQ.dequeue();
        currentNode = currentTree.getRootElement();
    }
    public StoryNode getCurrentNode(){
        return currentNode;
    }
    public StoryNode getNextNode(boolean b){
        if (currentNode.isEnd()){
            if (storyQ.isEmpty())
            return null;
            currentTree = storyQ.dequeue();
        }
        else if (b)
            currentTree = currentTree.getLeft();
         
        else
            currentTree = currentTree.getRight();
        currentNode = currentTree.getRootElement();
        return currentNode;
    }
    
}
