//Joshua Ruebusch
/* This class extends Robots to make decide which words will be selected and how they will be put together. 
 * 2/26/10
 */ 

public class GreenRobots extends Robots
{
  GreenRobots()
  {
    super();
  }
  
   //gets specified words for robot to be used in toString()
   public String getArticle()
  {
    return vocab.selectArticle();
  }
  
  public String getNoun()
  {
    return vocab.selectNoun();
  }
  
  public String getVerb()
  {
    return vocab.selectVerb();
  }
  
  public String toString()
  {
    String s = String.format("%s %s %s", getArticle(), getNoun(), getVerb());
    return s;
  }
}
  