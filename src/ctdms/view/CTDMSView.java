/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctdms.view;

import ctdms.presenter.CTDMSPresenter;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormatSymbols;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;

/**
 *
 * @author Nimius
 */
public class CTDMSView extends JFrame implements ICTDMSView {

    private CTDMSPresenter presenter;
    
    int patientId = 0;
    String fName = "";
    String lName = "";
    String dob = "";
    String phone = "";
    String [] gender = {"Male", "Female", "Other"};

    private JButton browseButton;
    private JButton updateButton;
    
    private JLabel testIdLabel;
    private JTextField testIdTextField;
    private JLabel lastNameLabel;
    private JTextField lastNameTextField;
    private JLabel firstNameLabel;
    private JTextField firstNameTextField;
    private JLabel patientIdLabel;
    private JTextField patientIdTextField;
    private JTextField indexTextField;

    private JLabel phoneLabel;
    private JTextField phoneTextField;
    private JLabel resultLabel;
    private JTextField resultTextField;
    private JLabel testDateLabel;
    private JTextField testYearTextField;
    private JLabel methodLabel;
    private JTextField testDateTextField;
    private JTextField maxTextField;
    private JButton nextButton;
    private JLabel ofLabel;
    private JLabel titleLabel;
    private JTextField methodTextField;
    private JButton previousButton;
    private JButton queryByNameButton;
    private JButton queryByTfnButton;
    private JLabel queryByNameLabel;
    private JLabel queryByTfnLabel;
    private JTextArea displayArea;
    private JPanel displayAreaPanel;
    private JPanel queryPanel;
    private JPanel queryLeftPanel;
    private JPanel queryRightPanel;
    
    private JLabel genderLabel;
    private JComboBox<String> genderCombo = new JComboBox<>(gender);
    
    private JLabel dobLabel;
    private JTextField yearTextField;
    String[] months = new DateFormatSymbols().getMonths();
    String[] actualMonth = Arrays.copyOf(months, months.length-1);
    private JComboBox<String> monthCombo= new JComboBox<>(actualMonth);
    private JComboBox day = new JComboBox();
    
 
    

    private JPanel navigatePanel;
    private JPanel displayPanel;
    private JPanel titlePanel;
    private JPanel mainFramePanel;
    private JPanel rightDataPanel;

    private JPanel rightPanel1;
    private JPanel rightPanel2;
    private JPanel namePanel;
    private JButton addButton;
    private JButton exitButton;
    private JTable displayTable;
    private JScrollPane scrollPane;
    

    private JPanel testDataPanel;
    private JPanel patientDataPanel;
    private JPanel personalDataPanel;
    
    private CardLayout crd;
    private Container cpane;
    
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel22;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel testingCard;

    private JPanel bottomPanel;
    private JPanel mainPanel;
    private JTextField queryByNameTextField;
    private JTextField queryByTfnTextField;
    private JButton insertButton;



    public CTDMSView() {
        super("Covid Testing");

        // create GUI
        navigatePanel = new JPanel();
        previousButton = new JButton();
        indexTextField = new JTextField(2);
        ofLabel = new JLabel();
        maxTextField = new JTextField(2);
        nextButton = new JButton();
        updateButton = new JButton();
        displayPanel = new JPanel();
        titlePanel = new JPanel();
        mainFramePanel = new JPanel();
        rightDataPanel = new JPanel();
        rightPanel1 = new JPanel();
        rightPanel2 = new JPanel();
        namePanel = new JPanel();

        displayAreaPanel = new JPanel();

        displayArea = new JTextArea();
        displayArea.setWrapStyleWord(true);
        displayArea.setLineWrap(true);
        
        

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel22 = new JPanel();
        
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        
        patientDataPanel = new JPanel();
        testDataPanel = new JPanel();
        personalDataPanel = new JPanel();
        testingCard = new JPanel(new CardLayout());



        //JScrollPane jsp = new JScrollPane(displayArea);
        queryPanel = new JPanel();
        queryLeftPanel = new JPanel();
        queryRightPanel = new JPanel();
        bottomPanel = new JPanel();

        queryByNameLabel = new JLabel("Last Name");
        queryByNameTextField = new JTextField(10);
        queryByTfnLabel = new JLabel("TFN:");
        queryByTfnTextField = new JTextField(10);
        queryByNameButton = new JButton("Search");
        queryByTfnButton = new JButton("Search");
        browseButton = new JButton();
        insertButton = new JButton();
        exitButton = new JButton();

        patientIdLabel = new JLabel("Patient ID");
        patientIdTextField = new JTextField(5);

        firstNameLabel = new JLabel("First Name");
        firstNameTextField = new JTextField(10);

        lastNameLabel = new JLabel("Last Name");
        lastNameTextField = new JTextField(10);
        
        genderLabel = new JLabel ("Gender");
        

        dobLabel = new JLabel("DOB(YYYY/MM/DD)");
        yearTextField = new JTextField(4);
        


        phoneLabel = new JLabel("Phone");
        phoneTextField = new JTextField(10);

        testIdLabel = new JLabel("Test ID");
        testIdTextField = new JTextField(10);
        methodLabel = new JLabel("Method");
        testYearTextField = new JTextField(10);

        resultLabel = new JLabel("Result");
        resultTextField = new JTextField(10);
        testDateLabel = new JLabel("Test Date");
        testDateTextField = new JTextField(10);
        

        titleLabel = new JLabel("Covid Testing Results System");
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 20));
        methodTextField = new JTextField(10);

        mainPanel = new JPanel();
        mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        displayTable = new JTable();
        DefaultTableModel myModel = new DefaultTableModel(new Object[][]{}, new String[]{"TFN", "First Name", "Last Name", "Address", "Phone", "Income", "Deductible", "Tax Held", "Tax Returned"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        displayTable.setModel(myModel);
        displayTable.setPreferredScrollableViewportSize(new Dimension(500, 200));
        displayTable.setFillsViewportHeight(true);
        scrollPane = new JScrollPane(displayTable);

        displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.PAGE_AXIS));
        displayPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        displayAreaPanel.add(insertButton);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        displayArea.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        displayPanel.add(scrollPane);

        testDataPanel.setLayout(new BoxLayout(testDataPanel, BoxLayout.PAGE_AXIS));
        //panel1.setLayout(new FlowLayout());
        panel1.add(patientIdLabel);
        panel1.add(Box.createHorizontalStrut(2));
        panel1.add(patientIdTextField);
        panel1.add(Box.createHorizontalStrut(118));
        
        genderCombo.setSelectedIndex(-1);
        panel1.add(genderLabel);
        panel1.add(genderCombo);
        
        panel22.add(firstNameLabel);
        panel22.add(firstNameTextField);
        panel22.add(lastNameLabel);
        panel22.add(lastNameTextField);

        panel2.setLayout(new FlowLayout());
        panel2.add(Box.createHorizontalStrut(5));
        panel2.add(dobLabel);
        panel2.add(yearTextField);
        monthCombo.setSelectedIndex(-1);
        panel2.add(monthCombo);
        panel2.add(day);
        panel2.add(Box.createHorizontalStrut(55));
        
        
        panel5.add(phoneLabel);
        panel5.add(Box.createHorizontalStrut(20));
        panel5.add(phoneTextField);
        panel5.add(Box.createHorizontalStrut(180));


        panel3.setLayout(new FlowLayout());
        panel3.add(Box.createHorizontalStrut(5));
        panel3.add(testIdLabel);
        panel3.add(Box.createHorizontalStrut(1));
        panel3.add(testIdTextField);
        panel3.add(Box.createHorizontalStrut(1));
        panel3.add(testDateLabel);
        panel3.add(testYearTextField);
        panel3.add(Box.createHorizontalStrut(1));

        panel4.setLayout(new FlowLayout());
        panel4.add(Box.createHorizontalStrut(2));
        panel4.add(resultLabel);
        panel4.add(resultTextField);
        panel4.add(Box.createHorizontalStrut(1));
        panel4.add(methodLabel);
        panel4.add(methodTextField);
        panel4.add(Box.createHorizontalStrut(2));
        


        //testDataPanel.setPreferredSize(new Dimension(310,200));
        patientDataPanel.add(panel1);
        patientDataPanel.add(panel22);
        patientDataPanel.add(panel2);
        patientDataPanel.add(panel5);
        
        testingCard.add(patientDataPanel, "a");
        testingCard.add(firstNameLabel, "b");
        testingCard.add(firstNameTextField, "c");

        TitledBorder patientTitle;
        patientTitle = BorderFactory.createTitledBorder("Patient Data");
        patientDataPanel.setBorder(patientTitle);
        

        testDataPanel.add(panel3);
        testDataPanel.add(panel4);
        TitledBorder testTitle;
        testTitle = BorderFactory.createTitledBorder("Test Data");
        testDataPanel.setBorder(testTitle);

        personalDataPanel.setLayout(new GridLayout(0, 2));
        personalDataPanel.setPreferredSize(new Dimension(800,200));
        personalDataPanel.add(testingCard);
        personalDataPanel.add(testDataPanel);

        displayPanel.add(Box.createVerticalStrut(10));
        displayTable.setAutoCreateRowSorter(true);
        displayPanel.add(displayAreaPanel);

        //indexTextField.setMaximumSize( indexTextField.getPreferredSize() );
        //indexTextField.setPreferredSize(new Dimension(80, 20) );
        // maxTextField.setMaximumSize( maxTextField.getPreferredSize() );
        navigatePanel.setLayout(new FlowLayout());
        navigatePanel.add(browseButton);
        navigatePanel.add(previousButton);
        navigatePanel.add(indexTextField);
        navigatePanel.add(ofLabel);

        navigatePanel.add(maxTextField);
        navigatePanel.add(nextButton);
        navigatePanel.add(updateButton);

        testIdTextField.setEditable(false);
        testDateTextField.setEditable(false);
        indexTextField.setEditable(false);
        maxTextField.setEditable(false);
        
        browseButton.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                browseButtonActionPerformed(evt);
            } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener
        /*
        nextButton.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                nextButtonActionPerformed(evt);
            } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener

        previousButton.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                previousButtonActionPerformed(evt);
            } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener

        queryByNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                queryByNameButtonActionPerformed(evt);
            } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener
        
                queryByTfnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                queryByTfnButtonActionPerformed(evt);
            } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitButtonActionPerformed(evt);
            } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                updateButtonActionPerformed(evt);
            } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener

        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertButtonActionPerformed(evt);
            } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener
        displayTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                tableEventListened(event);
            }
        });*/

        TitledBorder tfnQueryTitle;
        tfnQueryTitle = BorderFactory.createTitledBorder("Find Entry by TFN");
        queryLeftPanel.setBorder(tfnQueryTitle);
        queryLeftPanel.add(queryByTfnLabel);
        queryLeftPanel.add(queryByTfnTextField);
        queryLeftPanel.add(queryByTfnButton);

        TitledBorder nameQueryTitle;
        nameQueryTitle = BorderFactory.createTitledBorder("Find Entry by Last Name");
        queryRightPanel.setBorder(nameQueryTitle);
        queryRightPanel.add(queryByNameLabel);
        queryRightPanel.add(queryByNameTextField);
        queryRightPanel.add(queryByNameButton);
        queryPanel.setLayout(new GridLayout(1, 2, 4, 4));
        queryPanel.add(queryLeftPanel);
        queryPanel.add(queryRightPanel);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setSize(1200, 755);
        setResizable(true);

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.setPreferredSize(new Dimension(900, 600));
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(personalDataPanel);
        mainPanel.add(Box.createVerticalStrut(50));
        mainPanel.add(displayPanel);
        TitledBorder dataTitleMain;
        dataTitleMain = BorderFactory.createTitledBorder("Data Entry, Browse & Query");
        //mainPanel.setBorder(dataTitleMain);
        bottomPanel.add(exitButton);
        mainFramePanel.setBorder(dataTitleMain);
        mainFramePanel.add(Box.createHorizontalStrut(40));
        mainFramePanel.add(mainPanel);
        mainFramePanel.add(Box.createHorizontalStrut(40));

        // setBrowsing(false);
        browseButton.setText("Browse All");
        updateButton.setText("Update");
        insertButton.setText("Add");
        exitButton.setText("EXIT!");

        previousButton.setText("<<Previous");
        nextButton.setText("Next>>");
        ofLabel.setText("OF");
        navigatePanel.add(Box.createHorizontalStrut(10));

        indexTextField.setHorizontalAlignment(JTextField.CENTER);

        navigatePanel.add(Box.createHorizontalStrut(10));
        mainPanel.add(navigatePanel);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(queryPanel);
        mainPanel.add(bottomPanel);
        titlePanel.add(titleLabel);

        add(titlePanel);
        add(mainFramePanel);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                //presenter.close();
                System.exit(0);
            } // end method windowClosing
        } // end anonymous inner class
        ); // end call to addWindowListener

    }
      private void browseButtonActionPerformed( ActionEvent evt ) 
   {
       CardLayout cL = (CardLayout) testingCard.getLayout();
       cL.show(testingCard,"b");
       
   }
    public void bind(CTDMSPresenter pp) {
        presenter = pp;
    }
}//end of class
