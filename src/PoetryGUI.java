/* Joshua Ruebusch
 * This program uses code that makes poems from radonly generated words to make a 
 * GUI with buttons that will fuction as the methods of how the program runs. 
 * 3/19/2010
 */ 

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PoetryGUI extends JFrame
{
  //Make needed tools to be inserted into GUI
  private JTextArea jtxtArea;
  private JButton jbtnBlue;
  private JButton jbtnGreen;
  private JButton jbtnPurple;
  private JButton jbtnRed;
  private JButton jbtnYellow;
  private JButton clearBtn;
  private JButton option1Btn;
  private JButton option2Btn;
  private JButton option3Btn;
  private JPanel optionBtnPanel;
  private JTextArea infoPanel;
  //Bring in a global Poetry Generator
  PoetryGenerator poetGen = new PoetryGenerator();
  
  //Make GUI constructor
  public PoetryGUI()
  {
    JFrame jfrm = new JFrame();
    jfrm.setLayout(new BorderLayout());
    
    JPanel btnPanel = new JPanel();
    btnPanel.setLayout(new GridLayout(1,5));
    
    //Makes new color for purple button
    Color purple = new Color(225,0,225);
    
    //Creates buttons and gives each a proper color
    jbtnBlue = new JButton("Phrase 1");
    jbtnBlue.setBackground(Color.blue);
    jbtnGreen = new JButton("Phrase 2");
    jbtnGreen.setBackground(Color.green);
    jbtnPurple = new JButton("Phrase 3");
    jbtnPurple.setBackground(purple);
    jbtnRed = new JButton("Phrase 4");
    jbtnRed.setBackground(Color.red);
    jbtnYellow = new JButton("Phrase 5");
    jbtnYellow.setBackground(Color.yellow);
    
    //Enables button listener for each colored button
    jbtnBlue.addActionListener(new ButtonListener());
    jbtnGreen.addActionListener(new ButtonListener());
    jbtnPurple.addActionListener(new ButtonListener());
    jbtnRed.addActionListener(new ButtonListener());
    jbtnYellow.addActionListener(new ButtonListener());
    
    //enables MouseListener for each colored button
    jbtnBlue.addMouseListener(new MouseMoveListener());
    jbtnGreen.addMouseListener(new MouseMoveListener());
    jbtnPurple.addMouseListener(new MouseMoveListener());
    jbtnRed.addMouseListener(new MouseMoveListener());
    jbtnYellow.addMouseListener(new MouseMoveListener());
    
    //adds the buttons to a button panel
    btnPanel.add(jbtnBlue);
    btnPanel.add(jbtnGreen);
    btnPanel.add(jbtnPurple);
    btnPanel.add(jbtnRed);
    btnPanel.add(jbtnYellow);
    
    //makes another panel for vertical buttons
    optionBtnPanel = new JPanel();
    optionBtnPanel.setLayout(new GridLayout(4,1));
    
    //creates vertical buttons and gives them a color
    option1Btn = new JButton("Option 1");
    option1Btn.setBackground(Color.cyan);
    option2Btn = new JButton("Option 2");
    option2Btn.setBackground(Color.cyan);
    option3Btn = new JButton("Option 3");
    option3Btn.setBackground(Color.cyan);
    clearBtn = new JButton("Clear");
    clearBtn.setBackground(Color.cyan);
    
    //adds ButtonListener and MouseListener for each vertical button
    option1Btn.addActionListener(new ButtonListener());
    option2Btn.addActionListener(new ButtonListener());
    option3Btn.addActionListener(new ButtonListener());
    clearBtn.addActionListener(new ButtonListener());
    
    option1Btn.addMouseListener(new MouseMoveListener());
    option2Btn.addMouseListener(new MouseMoveListener());
    option3Btn.addMouseListener(new MouseMoveListener());
    clearBtn.addMouseListener(new MouseMoveListener());
    
    //adds vertical buttons to a side panel
    optionBtnPanel.add(option1Btn);
    optionBtnPanel.add(option2Btn);
    optionBtnPanel.add(option3Btn);
    optionBtnPanel.add(clearBtn);
   
    //central text area
    jtxtArea = new JTextArea();
    
    //side information text area
    infoPanel = new JTextArea("This panel will tell you what  \nkind of poem you will get");
    infoPanel.setEditable(false);
    infoPanel.setLineWrap(true);
    infoPanel.setWrapStyleWord(true);
    infoPanel.setBackground(Color.lightGray);
    
    //positions each component to a spot on the frame
    add(infoPanel, BorderLayout.WEST);
    add(jtxtArea, BorderLayout.CENTER);
    add(optionBtnPanel, BorderLayout.EAST);
    add(btnPanel, BorderLayout.SOUTH);
    
    //estimated correct size
    pack();
  }
  
  //make functionallity of the all buttons
  public class ButtonListener implements ActionListener
  {
    public void actionPerformed (ActionEvent e)
    {
      if (e.getSource() == jbtnBlue)
      {
        poetGen.poemBlue();
        jtxtArea.append(poetGen + "\n");
      }
      else if (e.getSource() == jbtnGreen)
      {
        poetGen.poemGreen();
        jtxtArea.append(poetGen + "\n");
      }
      else if (e.getSource() == jbtnPurple)
      {
        poetGen.poemPurple();
        jtxtArea.append(poetGen + "\n");
      }
      else if (e.getSource() == jbtnRed)
      {
        poetGen.poemRed();
        jtxtArea.append(poetGen + "\n");
      }
      else if (e.getSource() == jbtnYellow)
      {
        poetGen.poemYellow();
        jtxtArea.append(poetGen + "\n");
      }
      else if (e.getSource() == option1Btn)
      {
        poetGen.poemOption1();
        jtxtArea.append(poetGen + "\n");
      }
      else if (e.getSource() == option2Btn)
      {
        poetGen.poemOption2();
        jtxtArea.append(poetGen + "\n");
      }
      else if (e.getSource() == option3Btn)
      {
        poetGen.randomPoem();
        jtxtArea.append(poetGen + "\n");
      }
      else
      {
        jtxtArea.setText("");
      }
      
    }
  }
  
  //make details of buttons come up when mouse is over that button
   private class MouseMoveListener implements MouseListener
  {
    public void mousePressed(MouseEvent event){}
    public void mouseReleased(MouseEvent event){}
    public void mouseClicked(MouseEvent event){}
    public void mouseEntered(MouseEvent event) 
    {
      if (event.getSource() == jbtnBlue)
        infoPanel.setText("Make a phrase with one verb and one adverb.");
      else if(event.getSource() == jbtnGreen)
        infoPanel.setText("Make a phrase with one article, one noun and one verb.");
      else if (event.getSource() == jbtnPurple)
        infoPanel.setText("Make a phrase with one preposition, one article and one noun.");
      else if (event.getSource() == jbtnRed)
        infoPanel.setText("Make a phrase with one adjective and one noun.");
      else if (event.getSource() == jbtnYellow)
        infoPanel.setText("Make one word chosen randomly from nouns, verbs, adjectives, or adverbs.");
      else if (event.getSource() == option1Btn)
        infoPanel.setText("This makes a poem with the red, blue and purple buttons.");
      else if (event.getSource() == option2Btn)
        infoPanel.setText("This makes a poem with the red, blue, purple, green and yellow buttons.");
      else if (event.getSource() == option3Btn)
        infoPanel.setText("This makes a poem choosing random phrases.");
      else if (event.getSource() == clearBtn)
        infoPanel.setText("This will clear all the text.");
    }
    //generic text that the info text area says
    public void mouseExited(MouseEvent event) 
    {
      if (event.getSource() == jbtnBlue || event.getSource() == jbtnGreen || event.getSource() == jbtnPurple
            || event.getSource() == jbtnRed || event.getSource() == jbtnYellow || event.getSource() == option1Btn
            || event.getSource() == option2Btn || event.getSource() == option3Btn || event.getSource() == clearBtn)
        infoPanel.setText("Move arrow over button for details.");
    }
  }
  
   //creates GUI and makes it visible
  public static void main (String[]args)
  {
    PoetryGUI pGUI = new PoetryGUI();
    pGUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    pGUI.setVisible(true);
  }
}