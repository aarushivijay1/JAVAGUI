package abc;


import java.awt.Container;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class c{
  public static void main(String[] args) {
    String title = "GridBagLayout";
    JFrame frame = new JFrame(title);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new GridBagLayout());

      contentPane.add(new JButton("Number of Words"));
      contentPane.add(new JButton("Number of Characters"));
      contentPane.add(new JButton("Top Ten Words "));
      contentPane.add(new JButton("Vocabulary Richness"));
      contentPane.add(new JButton("Longest Word"));
      contentPane.add(new JButton("Sentiment Analysis"));

    
    frame.pack();
    frame.setVisible(true);
  }
}
