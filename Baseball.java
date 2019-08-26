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
    private static final int BUTTON_HEIGHT  = 30;
    private JButton clearButton, computeButton;
    private JLabel singles, doubles, triples, homeRuns, timesAtBat,  slug;
    private JTextField singlesInput, doublesInput, triplesInput, homeRunInput, atBatInput, slugPer;
    
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
        
        singles = new JLabel("Number of singles:                ");
        doubles = new JLabel("Number of doubles:                ");
        triples = new JLabel("Number of triples:                   ");
        homeRuns = new JLabel("Number of home runs:           ");
        timesAtBat = new JLabel("Number of times at bat:          ");
        slug = new JLabel("The slugging percentage is:");
        
      
        singlesInput = new JTextField();
        singlesInput.setColumns(8);
        doublesInput = new JTextField();
        doublesInput.setColumns(8);
        triplesInput = new JTextField();
        triplesInput.setColumns(8);
        homeRunInput = new JTextField();
        homeRunInput.setColumns(8);
        atBatInput = new JTextField();
        atBatInput.setColumns(8);
        slugPer = new JTextField();
        slugPer.setColumns(8);
        slugPer.setEditable(false);
     
        JPanel panel = new JPanel();
        panel.add(singles);
        panel.add(singlesInput);
        panel.add(doubles);
        panel.add(doublesInput);
        panel.add(triples);
        panel.add(triplesInput);
        panel.add(homeRuns);
        panel.add(homeRunInput);
        panel.add(timesAtBat);
        panel.add(atBatInput);
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
          int firstBase = Integer.parseInt(singlesInput.getText());
          int secondBase = Integer.parseInt(doublesInput.getText());
          int thirdBase = Integer.parseInt(triplesInput.getText());
          int  fourthBase = Integer.parseInt(homeRunInput.getText());
          
          secondBase = secondBase * 2;
          thirdBase = thirdBase * 3;
          fourthBase = fourthBase * 4;
          
          int sum = (firstBase + secondBase + thirdBase + fourthBase);
          int slugg = Integer.parseInt(atBatInput.getText());
          double total = (double)sum / (double)slugg;
          
          slugPer.setText(String.format("%.3f", total));
      }
        
      if(event.getSource() == clearButton) {
          singlesInput.setText(" ");
          doublesInput.setText(" ");
          triplesInput.setText(" ");
          homeRunInput.setText(" ");
          atBatInput.setText(" ");
          slugPer.setText(" ");
       }
    }
} 

        
        
