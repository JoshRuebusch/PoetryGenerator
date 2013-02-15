//Joshua Ruebusch
/* This class creates all of the robot objects and puts the various toString() methods into different orders. 
 * 2/26/10
 * Some code added to this one to get individual lines from each robot. 
 */ 

import java.util.Random;

public class PoetryGenerator
{
  private Robots robots;
  private RedRobots rr; 
  private BlueRobots br;
  private GreenRobots gr;
  private PurpleRobots pr;
  private YellowRobots yr;
  private String poem = "";
  private Robots robotArray[];
  
  Random rand = new Random();
  
  //creates objects to be used to make poems
  PoetryGenerator()
  {
    rr = new RedRobots();
    br = new BlueRobots();
    gr = new GreenRobots();
    pr = new PurpleRobots();
    yr = new YellowRobots();
    
    robotArray = new Robots[5];
    robotArray[0] = rr;
    robotArray[1] = br;
    robotArray[2] = gr;
    robotArray[3] = pr;
    robotArray[4] = yr;
  }
  
  //makes the different types of poems with differing orders of strings
  //(these added to get each robots string individually)
  public void poemRed()
  {
    poem = (rr) + "";
  }
  
  public void poemBlue()
  {
    poem = br + "";
  }
  
  public void poemGreen()
  {
    poem = gr + "";
  }
  
  public void poemPurple()
  {
    poem = pr + "";
  }
  
  public void poemYellow()
  {
    poem = yr + "";
  }
  //end of added code
  public void poemOption1()
  {
    poem = (rr + " " + br + " " + pr);
  }
  
  public void poemOption2()
  {
    poem = (rr.toString() + " " + br.toString() + " " + pr.toString() + " " +
           gr.toString()+ " " + yr.toString());
  }
  
  public void randomPoem()
  {
    int a;
    int b;
    int c;
    int d;
   
    a = rand.nextInt(4);
    b = rand.nextInt(4);
    c = rand.nextInt(4);
    d = rand.nextInt(4);
    
    poem = (robotArray[a].toString() + " " + robotArray[b].toString() + " " + robotArray[c].toString() + " " +
            robotArray[d].toString());
  }
  
  public void customPoem(int r1, int r2, int r3, int r4)
  {
    poem = (robotArray[(r1-1)].toString() + " " + robotArray[(r2-1)].toString() + " " + robotArray[(r3-1)].toString() + " " +
            robotArray[(r4-1)].toString());
  }
    
  //puts all of the strings into one toString()
  public String toString()
  {
    String s = String.format("%s", poem);
    return s;
  }
  
  public static void main (String[]args)
  {
    PoetryGenerator pg = new PoetryGenerator();
    //pg.poemOption1();
    //System.out.println(pg);
    for (int i = 0; i < 50; i++)
    {
    pg.poemOption2();
    System.out.println(pg);
    }
    //pg.randomPoem();
    //System.out.println(pg);
    //pg.customPoem(1,2,3,5);
    //System.out.println(pg);
  }
  
}