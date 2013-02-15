//Joshua Ruebusch
/* This class extends Robots to make decide which words will be selected and how they will be put together. 
 * 2/26/10
 */ 

public class RedRobots extends Robots
{
  public RedRobots()
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
  
  public String toString()
  {
    String s = String.format("%s %s", getAdjective(), getNoun());
    return s;
  }
}
  
  