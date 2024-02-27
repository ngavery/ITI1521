/**********************Q2-Devoir2 ITI1521....*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI extends JFrame implements ActionListener { 
Calculator  cal;
JFrame frame;
JTextField input;
JButton[] BoutonsNum = new JButton[10];
JButton[] BoutonsFonction = new JButton[12];
JButton BoutonPlus, BoutonMoins, BoutonMul, BoutonDiv, BoutonEXP, BoutonFact, BoutonSQRT, BoutonLog, BoutonÉgal, BoutonClear, BoutonDel;
JPanel panel;

Font font = new Font("", Font.BOLD,30);


GUI(Calculator p) {

  frame = new JFrame("Calculatrice");
  frame.setSize(420, 550);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setTitle("Calculatrice");

  //Display
  JTextField textfield = new JTextField();
  textfield.setEditable(false);
 
  //Définir les boutons
  BoutonPlus = new JButton("+");
  BoutonMoins = new JButton("-");
  BoutonMul = new JButton("x");
  BoutonDiv = new JButton("/");
  BoutonEXP = new JButton("^");
  BoutonFact = new JButton("!");
  BoutonSQRT = new JButton("sqrt");
  BoutonLog = new JButton("log");
  BoutonÉgal = new JButton("=");
  BoutonClear = new JButton("Clear");
  BoutonDel = new JButton("Delete");

  BoutonsFonction[0] = BoutonPlus;
  BoutonsFonction[1] = BoutonMoins;
  BoutonsFonction[2] = BoutonMul;
  BoutonsFonction[3] = BoutonDiv;
  BoutonsFonction[4] = BoutonEXP;
  BoutonsFonction[5] = BoutonFact;
  BoutonsFonction[6] = BoutonSQRT;
  BoutonsFonction[7] = BoutonLog;
  BoutonsFonction[8] = BoutonPlus;
  BoutonsFonction[9] = BoutonÉgal;
  BoutonsFonction[10] = BoutonClear;
  BoutonsFonction[11] = BoutonDel;

  for(int i = 0;i < 11;i++) {
    BoutonsFonction[i].addActionListener(this);
    BoutonsFonction[i].setFocusable(false);

   }
   for(int i = 0;i < 10;i++) {
    BoutonsNum[i] = new JButton(String.valueOf(i));
    BoutonsNum[i].setFocusable(false);



 }

  //Set bounds
  textfield.setBounds(50, 25, 300, 50);
  BoutonDel.setBounds(50,430,145,50);
  BoutonClear.setBounds(205,430,145,50);

  //Panel
  panel = new JPanel();
  panel.setBounds(50,100,300,300);
  panel.setLayout(new GridLayout(4,4,10,10));
  panel.add(BoutonsNum[1]);
  panel.add(BoutonsNum[2]);
  panel.add(BoutonsNum[3]);
  panel.add(BoutonPlus);
  panel.add(BoutonsNum[4]);
  panel.add(BoutonsNum[5]);
  panel.add(BoutonsNum[6]);
  panel.add(BoutonMoins);
  panel.add(BoutonsNum[7]);
  panel.add(BoutonsNum[8]);
  panel.add(BoutonsNum[9]);
  panel.add(BoutonMul);
  panel.add(BoutonDiv);
  panel.add(BoutonEXP);
  panel.add(BoutonsNum[0]);


  frame.add(panel);
  frame.add(BoutonDel);
  frame.add(BoutonClear);
  frame.add(textfield);
  frame.setVisible(true); 



}

public void actionPerformed(ActionEvent e) {
  
  String str = e.getActionCommand(); 

  for(int i =0;i<10;i++) {


  }
  switch (str) {
    case "+":
      cal.add();
      break;
    case "-":
      cal.subtract();
      break;
  }
  }


public static void main(String arg[]) {
  GUI gui;
  gui = new GUI(new Calculator());
  
  }
}