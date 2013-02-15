//Joshua Ruebusch
/* This class extends Robots to make decide which words will be selected and how they will be put together. 
 * 2/26/10
 */ 

import java.util.Random;

public class YellowRobots extends Robots
{
  Random random = new Random();
  
  YellowRobots()
  {
    super();
  }
  
   //gets specified words for robot to be used in toString()
  public String getNoun()
  {
    return vocab.selectNoun();
  }
  
  public String getAdjective()
  {
    return vocab.selectAdjective();
  }
  
   public String getVerb()
  {
    return vocab.selectVerb();
  }
  
  public String getAdverb()
  {
    return vocab.selectAdverb();
  }
  
  //randomly chooses which part of speech is chosen
  public String getPartOfSpeech()
  {
    int selector = random.nextInt(4);
    
    if ((selector + 1) == 1)
      return getNoun();
    else if ((selector + 1) == 2)
      return getAdjective();
    else if ((selector + 1) == 3)
      return getVerb();
    else 
      return getAdverb();
  }
    
  
  public String toString()
  {
    String s = String.format("%s", getPartOfSpeech());
    return s;
  }
  
  public static void main (String[]args)
  {
    YellowRobots yr = new YellowRobots();
    System.out.println(yr);
  }
}
  