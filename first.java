package swinging;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class first {
  public static void main(String args[]) {
    
	  JLabel testLabel  = new JLabel("Color Test");
	  testLabel.setForeground(Color.BLACK);
	  JFrame f = new JFrame("Text Analyzer Software");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton button = new JButton("Choose an Article");
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        Component source = (Component) actionEvent.getSource();
        Object response = JOptionPane.showInputDialog(source,
            "Choose One?", "JOptionPane Sample",
            JOptionPane.QUESTION_MESSAGE, null, new String[] { "NYT Article", "Guardian Article", "Britannica Article" },
            "B");
        System.out.println("Analysis " + response);
      }
    };
    button.addActionListener(actionListener);
    f.add(button, BorderLayout.CENTER);
    f.setSize(300, 200);
    f.setVisible(true);
  }
}