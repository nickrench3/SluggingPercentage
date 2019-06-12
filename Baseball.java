// This program will ask for inputs and compute the slugging percentage of a baseball player.
// Name: Nick Rentschler
// Date: 6-12-2019

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Baseball extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH    = 350;
    private static final int FRAME_HEIGHT   = 350;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH   = 100;
    private static final int BUTTON_HEIGHT  = 20;
    private JButton clearButton, computeButton;
    private JLabel singles, doubles, triples, homeRuns, timesAtBat,  slug, playerName;
    private JTextField firstInput, secondInput, thirdInput, fourthInput, fifthInput, slugPer, playerInput;
    
    //Initializes the frame 
    public static void main (String [] args) {
        Baseball frame = new Baseball();
        frame.setVisible(true);
    }
    
    //Constructor to create contentPane and its objects.
    public Baseball () {
        Container contentPane = getContentPane();
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        clearButton = new JButton("CLEAR");
        clearButton.setBounds(60, 220, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(clearButton);
        computeButton = new JButton("COMPUTE");
        computeButton.setBounds(180, 220, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(computeButton);
        
        setLayout(new BorderLayout(10, 10));
        JPanel top = new JPanel();
        top.add(new JLabel("Compute slugging percentage"));
        add(top, BorderLayout.NORTH);
        
        playerName = new JLabel("Enter name of player:        ");
        singles = new JLabel("Number of singles:        ");
        doubles = new JLabel("Number of doubles:       ");
        triples = new JLabel("Number of triples:        ");
        homeRuns = new JLabel("Number of home runs:     ");
        timesAtBat = new JLabel("Number of times at bat:     ");
        slug = new JLabel("The slugging percentage is:");
        
       
        firstInput = new JTextField();
        firstInput.setColumns(8);
        secondInput = new JTextField();
        secondInput.setColumns(8);
        thirdInput = new JTextField();
        thirdInput.setColumns(8);
        fourthInput = new JTextField();
        fourthInput.setColumns(8);
        fifthInput = new JTextField();
        fifthInput.setColumns(8);
        slugPer = new JTextField();
        slugPer.setColumns(8);
        slugPer.setEditable(false);
     
        JPanel panel = new JPanel();
        panel.add(singles);
        panel.add(firstInput);
        panel.add(doubles);
        panel.add(secondInput);
        panel.add(triples);
        panel.add(thirdInput);
        panel.add(homeRuns);
        panel.add(fourthInput);
        panel.add(timesAtBat);
        panel.add(fifthInput);
        panel.add(slug);
        panel.add(slugPer);
        add(panel, BorderLayout.CENTER);
        
        computeButton.addActionListener(this);
        clearButton.addActionListener(this);
        
     
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        
    }
    
    //Action method for the button that is pressed.
    public void actionPerformed(ActionEvent event) {
      if(event.getSource() == computeButton) {
          int firstBase = Integer.parseInt(firstInput.getText());
          int secondBase = Integer.parseInt(secondInput.getText());
          int thirdBase = Integer.parseInt(thirdInput.getText());
          int  fourthBase = Integer.parseInt(fourthInput.getText());
          
          secondBase = secondBase * 2;
          thirdBase = thirdBase * 3;
          fourthBase = fourthBase * 4;
          
          int sum = (firstBase + secondBase + thirdBase + fourthBase);
          int slugg = Integer.parseInt(fifthInput.getText());
          double total = (double)sum / (double)slugg;
          
          slugPer.setText(String.format("%.3f", total));
      }
        
      if(event.getSource() == clearButton) {
          firstInput.setText(" ");
          secondInput.setText(" ");
          thirdInput.setText(" ");
          fourthInput.setText(" ");
          fifthInput.setText(" ");
          slugPer.setText(" ");
       }
    }
} 

        
        
