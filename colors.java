package swinging;


//Java program to illustrate the GridLayout 
//Java program to illustrate the GridLayout 
import java.awt.*; 
import javax.swing.*; 

//create a class b 
public class frame1 {

//Main Method 
public static void main(String[] args) 
{ 

// Creating Object of JFrame class  
// with new name frame 
JFrame frame = new JFrame("Text Analyser"); 

frame.setBackground(Color.BLUE);


// Initialization of object  
// "btn1" of JButton class. 
JButton btn1 = new JButton("New York Times"); 

btn1.setBackground(Color.GREEN);
// Initialization of object  
// "btn2" of JButton class. 
JButton btn2 = new JButton("Washington Post"); 

btn2.setBackground(Color.GREEN);

// Initialization of object  
// "btn3" of JButton class. 
JButton btn3 = new JButton("Bloomberg"); 

btn3.setBackground(Color.GREEN);

// Initialization of object 
// "btn4" of JButton class. 
JButton btn4 = new JButton("The Times"); 

btn4.setBackground(Color.GREEN);

// Initialization of object  
// "btn5" of JButton class. 
JButton btn5 = new JButton("Business Insider"); 

btn5.setBackground(Color.GREEN);

// Creating Object Panel of JPanel class 
// create grid layout with 3 rows,  
// 2 columns with horizontal and  
// vertical gap set to 10 
JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10)); 

panel.setBackground(Color.BLACK);

// Adding JButton "btn1" on JPanel. 
panel.add(btn1); 

// Adding JButton "btn2" on JPanel. 
panel.add(btn2); 

// Adding JButton "btn3" on JPanel. 
panel.add(btn3); 

// Adding JButton "btn4" on JPanel. 
panel.add(btn4); 

// Adding JButton "btn5" on JPanel. 
panel.add(btn5); 

// Function to close the operation of JFrame. 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

// Function to set size of JFrame. 
frame.setSize(300, 150); 

// Function to get the content of JFrame. 
frame.getContentPane().add(panel); 

// Function to set visible status of JFrame. 
frame.setVisible(true); 
} 
} 
