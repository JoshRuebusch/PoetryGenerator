//Joshua Ruebusch
/* This class extends Robots to make decide which words will be selected and how they will be put together. 
 * 2/26/10
 */ 

public class PurpleRobots extends Robots
{
  PurpleRobots()
  {
    super();
  }
  
   //gets specified words for robot to be used in toString()
   public String getPreposition()
  {
    return vocab.selectPreposition();
  }
  
  public String getArticle()
  {
    return vocab.selectArticle();
  }
  
  public String getNoun()
  {
    return vocab.selectNoun();
  }
  
  public String toString()
  {
    String s = String.format("%s %s %s", getPreposition(), getArticle(), getNoun());
    return s;
  }
}
  