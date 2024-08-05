/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Student
 */
public class TicketsFrame extends JFrame{
    //panels
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel cellPhonePnl;
    private JPanel customerDetailsPnl;
    private JPanel homeTeamPnl;
    private JPanel awayTeamPnl;
    private JPanel ticketCostPnl;
    private JPanel numTicketsPnl;
    private JPanel totAmtDuePnl;
    private JPanel ticketsPnl;
    private JPanel btnsPnl;
    private JPanel ticketsBtnsCombinedPnl;
    private JPanel mainPnl;
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel cellPhoneLbl;
    private JLabel homeTeamLbl;
    private JLabel awayTeamLbl;
    private JLabel ticketCostLbl;
    private JLabel numTicketsLbl;
    private JLabel totAmtDueLbl;
    
    //textfields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField cellphoneTxtFld;
    private JTextField homeTeamTxtFld;
    private JTextField awayTeamTxtFld;
    private JTextField ticketCostTxtField;
    private JTextField totAmtDueTxtFld;
    
    private JSlider numTicketsSld;
    
    //buttons
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public TicketsFrame(){
        //set up the frame
        setTitle("ticket sales");
        setSize(600, 650);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
        
        //create panels
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cellPhonePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        customerDetailsPnl = new JPanel(new GridLayout(3,1,1,1));
        customerDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2), "Customer Details"));
        
        homeTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ticketCostPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numTicketsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totAmtDuePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        ticketsPnl = new JPanel(new GridLayout(5,1,1,1));
        ticketsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Tickets Details"));
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ticketsBtnsCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        //labels
        headingLbl = new JLabel("Soccer Match Tickets");
        headingLbl.setFont(new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 40));
        headingLbl.setForeground(Color.CYAN);
        
        nameLbl = new JLabel("Name:       ");
        surnameLbl = new JLabel("surname: ");
        cellPhoneLbl = new JLabel("Cellphone: ");
        homeTeamLbl = new JLabel("Home team: ");
        awayTeamLbl = new JLabel("Away Team: ");
        ticketCostLbl = new JLabel("Cost price: R");
        numTicketsLbl = new JLabel("number of tickets required: ");
        totAmtDueLbl = new JLabel("Total amount due: R");
        
        //textfields
        nameTxtFld = new JTextField(10);
        nameTxtFld.setFocusable(true);
        
        surnameTxtFld = new JTextField(10);
        cellphoneTxtFld = new JTextField(10);
        homeTeamTxtFld = new JTextField(10);
        awayTeamTxtFld = new JTextField(10);
        ticketCostTxtField = new JTextField(10);
        
        totAmtDueTxtFld = new JTextField(20);
        totAmtDueTxtFld.setText("To be calculated later.");
        totAmtDueTxtFld.setEditable(false);
        
        numTicketsSld = new JSlider(1, 20);
        
        //create buttons
        buyBtn = new JButton("buy");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //add components to panel
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        cellPhonePnl.add(cellPhoneLbl);
        cellPhonePnl.add(cellphoneTxtFld);
        
        customerDetailsPnl.add(namePnl);
        customerDetailsPnl.add(surnamePnl);
        customerDetailsPnl.add(cellPhonePnl);
        
        homeTeamPnl.add(homeTeamLbl);
        homeTeamPnl.add(homeTeamTxtFld);
        
        awayTeamPnl.add(awayTeamLbl);
        awayTeamPnl.add(awayTeamTxtFld);
        
        ticketCostPnl.add(ticketCostLbl);
        ticketCostPnl.add(ticketCostTxtField);
        
        numTicketsPnl.add(numTicketsLbl);
        numTicketsPnl.add(numTicketsSld);
        
        totAmtDuePnl.add(totAmtDueLbl);
        totAmtDuePnl.add(totAmtDueTxtFld);
        
        ticketsPnl.add(homeTeamPnl);
        ticketsPnl.add(awayTeamPnl);
        ticketsPnl.add(ticketCostPnl);
        ticketsPnl.add(numTicketsPnl);
        ticketsPnl.add(totAmtDuePnl);
        
        btnsPnl.add(buyBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        ticketsBtnsCombinedPnl.add(ticketsPnl, BorderLayout.CENTER);
        ticketsBtnsCombinedPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(customerDetailsPnl, BorderLayout.CENTER);
        mainPnl.add(ticketsBtnsCombinedPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        
        setVisible(true);
        
    }
    
}
