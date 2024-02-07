/**********************Q2-Devoir2 ITI1521....*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI extends JFrame implements ActionListener { 
Calculator  cal;
JTextField input;

GUI(Calculator p) {
//VOTRE CODE VIENT ICI
}



public void actionPerformed(ActionEvent e) {
//VOTRE CODE VIENT ICI
  
  /* Exemple:
   String str = e.getActionCommand(); 
   if (str == "+") { cal.add();}
  */
}

public static void main(String arg[]) {
  GUI gui;
  gui = new GUI(new Calculator());
  gui.setVisible(true);
}
}