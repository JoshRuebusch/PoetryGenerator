//Joshua Ruebusch
/* This class provides the derived classes from Robots with a common vocabulary.
 * 2/26/10
 */ 

public abstract class Robots
{
  protected Vocabulary vocab;
  
  //constructs all robots with a common vocab
  public Robots()
  {
    vocab = new Vocabulary();
  }
}