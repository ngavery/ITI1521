/**********************Q2-Devoir2 ITI1521....*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
    Calculator cal;
    JFrame frame;
    JTextField textfield;
    JButton[] BoutonsNum = new JButton[10];
    JButton[] BoutonsFonction = new JButton[12];
    JButton BoutonPlus, BoutonMoins, BoutonMul, BoutonDiv, BoutonEXP, BoutonFact, BoutonSQRT, BoutonLog, BoutonÉgal, BoutonClear, BoutonDel;
    JPanel panel;

    public GUI(Calculator p) {
        cal = p;

        frame = new JFrame("Calculatrice");
        frame.setSize(420, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // input
        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setEditable(false);

        // Définir les boutons
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
        BoutonsFonction[8] = BoutonÉgal;
        BoutonsFonction[9] = BoutonClear;
        BoutonsFonction[10] = BoutonDel;

        for (int i = 0; i < 11; i++) {
            BoutonsFonction[i].addActionListener(this);
            BoutonsFonction[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            BoutonsNum[i] = new JButton(String.valueOf(i));
            BoutonsNum[i].addActionListener(this);
            BoutonsNum[i].setFocusable(false);
        }

        // Set bounds
        BoutonDel.setBounds(50, 430, 145, 50);
        BoutonClear.setBounds(205, 430, 145, 50);

        // Panel
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Ajouter les boutons
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
        panel.add(BoutonÉgal);

        frame.add(panel);
        frame.add(BoutonDel);
        frame.add(BoutonClear);
        frame.add(textfield);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
    
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == BoutonsNum[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
                return;  // Exit the method after handling the number button
            }
        }
    
        // Boutons opération
        if (e.getSource() == BoutonPlus || e.getSource() == BoutonMoins ||
            e.getSource() == BoutonMul || e.getSource() == BoutonDiv ||
            e.getSource() == BoutonEXP || e.getSource() == BoutonFact ||
            e.getSource() == BoutonSQRT || e.getSource() == BoutonLog) {
            cal.setOperand(Double.parseDouble(textfield.getText()));
            cal.setOperation(str);
            textfield.setText("");
        }
    
        // BoutonÉgal
        if (e.getSource() == BoutonÉgal) {
            cal.setOperand(Double.parseDouble(textfield.getText()));
            cal.compute();
            textfield.setText(String.valueOf(cal.display()));
        }
    
        // BoutonClear
        if (e.getSource() == BoutonClear) {
            textfield.setText("");
            cal.clear();
        }
    
        // BoutonDel
        if (e.getSource() == BoutonDel) {
            String string = textfield.getText();
            textfield.setText("");
            for(int i=0;i<string.length()-1;i++) {
              textfield.setText(textfield.getText()+string.charAt(i));
            }
        }
    }
    

  public static void main(String arg[]) {
      GUI gui = new GUI(new Calculator());
  }
}
