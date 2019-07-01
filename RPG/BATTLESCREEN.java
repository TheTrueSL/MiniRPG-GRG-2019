import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 23.06.2019
 * @author 
 */

public class BATTLESCREEN extends JDialog {
  // Anfang Attribute
  private Canvas canvas1 = new Canvas();
  private JTextArea jTextArea1 = new JTextArea();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JTextArea jTextArea2 = new JTextArea();
  private Canvas canvas2 = new Canvas();
  private JTextArea jTextArea3 = new JTextArea();
  // Ende Attribute
  
  public BATTLESCREEN() { 
    // Dialog-Initialisierung
    
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 950; 
    int frameHeight = 600;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("MINI RPG");
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    canvas1.setBounds(216, 16, 505, 225);
    cp.add(canvas1);
    jTextArea1.setBounds(8, 440, 921, 113);
    
    jButton1.setBounds(32, 392, 153, 41);
    jButton1.setText("Angriff");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(224, 392, 153, 41);
    jButton2.setText("Magie");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(560, 392, 153, 41);
    jButton3.setText("Item");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(752, 392, 153, 41);
    jButton4.setText("Glück");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jTextArea2.setBounds(416, 264, 113, 25);
    jTextArea2.setText("");
    
    canvas2.setBounds(448, 320, 49, 49);
    cp.add(canvas2);
    jTextArea3.setBounds(424, 392, 89, 41);
    jTextArea3.setText("");
    
 
    
    // Ende Komponenten
    
    setResizable(false);
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton4_ActionPerformed

  // Ende Methoden
  
} // end of class GUI