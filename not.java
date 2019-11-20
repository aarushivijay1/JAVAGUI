package abc;


import java.awt.*; import javax.swing.*;
//Comment omitted.
public class a {
private JFrame frame;
 /**
  * Create an ImageViewer and show it on screen.
  */
public a() {
     makeFrame();
 }
 /**
  * Create the Swing frame and its content.
  */
private void makeFrame()

{
frame = new JFrame("ImageViewer");
Container contentPane = frame.getContentPane();
JLabel label = new JLabel("I am a label."); contentPane.add(label);
        frame.pack();
frame.setVisible(true); 

}
}
