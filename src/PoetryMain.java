//Joshua Ruebusch
/* This class provides a menu to be used as a means of choosing and creating differnt poems. 
 * 2/26/10
 */ 

import java.util.Scanner;

public class PoetryMain
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner(System.in);
    PoetryGenerator pg = new PoetryGenerator();
    
    boolean done = false;
    int selection;
    int [] customSelection = new int[4];
    
    
    String menu = ("1. Poem pattern 1(red, blue, purple)\n"
      + "2. Poem pattern 2(red, blue, purple, green, yellow)\n"
      + "3. Random poem\n"
      + "4. Customized poem\n"
      + "5. Quit");
    
    while(!done)
    {
      System.out.println(menu);
      selection = in.nextInt();
      
      if(selection == 1)
      {
        pg.poemOption1();
        System.out.println(pg);
        System.out.println("");
      }
      else if(selection == 2)
      {
        pg.poemOption2();
        System.out.println(pg);
        System.out.println("");
      }
      else if(selection == 3)
      {
        pg.randomPoem();
        System.out.println(pg);
        System.out.println("");
      }
      else if(selection == 4)
      {
          for(int i = 0; i < 4; i++)
          {
            System.out.println("Pick a robot:\n"
                                 + "red = 1\n" + "blue = 2\n" + "green = 3\n" + 
                               "purple = 4\n" + "yellow = 5\n");
            customSelection[i] = in.nextInt();
            
            while (customSelection[i] <= 0 || customSelection[i] > 5)
            {
              System.out.println("Number must be between 1 and 5");
              customSelection[i] = in.nextInt();
            }
              
          }
          
          pg.customPoem(customSelection[0],customSelection[1],customSelection[2],customSelection[3]);
          System.out.println(pg);
      }
      else if(selection == 5)
        done = true;
      else
        System.out.println("Enter a number from the menu");
    }
  }
}
      
      
        