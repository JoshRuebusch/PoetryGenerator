//Joshua Ruebusch
/* This class extends Robots to make decide which words will be selected and how they will be put together. 
 * 2/26/10
 */ 

public class BlueRobots extends Robots
{
  BlueRobots()
  {
    super();
  }
  
  //gets specified words for robot to be used in toString()
   public String getVerb()
  {
    return vocab.selectVerb();
  }
  
  public String getAdverb()
  {
    return vocab.selectAdverb();
  }
  
  public String toString()
  {
    String s = String.format("%s %s", getVerb(), getAdverb());
    return s;
  }
}
  