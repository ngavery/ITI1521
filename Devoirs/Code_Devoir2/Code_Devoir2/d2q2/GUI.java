/**********************Q2-Devoir2 ITI1521....*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI extends JFrame implements ActionListener { 
Calculator  cal;
JTextField input;

GUI(Calculator p) {
  add(new JLabel("was good"));
  input = new JTextField();
  
  setTitle("Calculatrice");
  setSize(400, 600);

  setLayout(null);
 
  //Les boutons

  JButton BoutonPlus = new JButton("+");
  BoutonPlus.setBounds(10, 50, 50, 50);

  JButton BoutonMOINS = new JButton("-");
  BoutonMOINS.setBounds(10, 50, 50, 50);

  

  add(BoutonPlus);
  add(BoutonMOINS);

  
}



public void actionPerformed(ActionEvent e) {
//VOTRE CODE VIENT ICI
  
  
   String str = e.getActionCommand(); 
   if (str == "+") { 
    cal.add();
  }
  
}

public static void main(String arg[]) {
  GUI gui;
  gui = new GUI(new Calculator());
  gui.setVisible(true);
  
}
}