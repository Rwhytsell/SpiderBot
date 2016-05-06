/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiderBot;

/**
 *
 * @author Ryan Whytsell
 */
@SuppressWarnings("serial")
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }
    
    private void initComponents() {

        StrtButtonPanel = new javax.swing.JPanel();
        StrtButton = new javax.swing.JButton();
        OptionPanel = new javax.swing.JPanel();
        ThrdLabel = new javax.swing.JLabel();
        ThrdVar = new javax.swing.JFormattedTextField();
        lkDpth = new javax.swing.JLabel();
        linkDepthVar = new javax.swing.JFormattedTextField();
        Title = new javax.swing.JLabel();
        OrURL = new javax.swing.JLabel();
        OrURLVar = new javax.swing.JTextField();
        
        ThrdVar.setValue(new Double(-1));
        linkDepthVar.setValue(new Double(10.0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SpiderBot");
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 500));
        setLocationRelativeTo(null);
        
        StrtButton.setText("Start");
        StrtButton.addMouseListener(new java.awt.event.MouseAdapter() {
        	
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StrtButtonMousePressed(evt); 								//Start button pressed
            }
        });

        javax.swing.GroupLayout StrtButtonPanelLayout = new javax.swing.GroupLayout(StrtButtonPanel);
        StrtButtonPanel.setLayout(StrtButtonPanelLayout);
        StrtButtonPanelLayout.setHorizontalGroup(
            StrtButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StrtButtonPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(StrtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        StrtButtonPanelLayout.setVerticalGroup(
            StrtButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StrtButtonPanelLayout.createSequentialGroup()
                .addComponent(StrtButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        OptionPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ThrdLabel.setText("Max threads:");

        lkDpth.setText("Link depth:");

        javax.swing.GroupLayout OptionPanelLayout = new javax.swing.GroupLayout(OptionPanel);
        OptionPanel.setLayout(OptionPanelLayout);
        OptionPanelLayout.setHorizontalGroup(
            OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lkDpth)
                    .addComponent(ThrdLabel))
                .addGap(18, 18, 18)
                .addGroup(OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ThrdVar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(linkDepthVar))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        OptionPanelLayout.setVerticalGroup(
            OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThrdLabel)
                    .addComponent(ThrdVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lkDpth)
                    .addComponent(linkDepthVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Title.setFont(new java.awt.Font("Leelawadee UI", 0, 48));
        Title.setText("SpiderBot");

        OrURL.setText("Origin URL:");

        OrURLVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrURLVarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OrURL)
                            .addComponent(StrtButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OrURLVar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(OrURL)
                .addGap(18, 18, 18)
                .addComponent(OrURLVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(StrtButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }

    private void OrURLVarActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void StrtButtonMousePressed(java.awt.event.MouseEvent evt) {
    	
    	orgURL = OrURLVar.getText();
    	mxThreads = Double.parseDouble(ThrdVar.getText());
    	lnkDepth = Double.parseDouble(linkDepthVar.getText());						//Parses text from URL text field and JFormTextFields into double
    	
		spiderBot.Spider.initSpider(mxThreads, lnkDepth, orgURL);					//Passes doubles and URL from ^ to spider
    }

    public static void main(String args[]) {
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JPanel OptionPanel;
    private javax.swing.JLabel OrURL;
    private javax.swing.JTextField OrURLVar;
    private javax.swing.JButton StrtButton;
    private javax.swing.JPanel StrtButtonPanel;
    private javax.swing.JLabel ThrdLabel;
    private javax.swing.JFormattedTextField ThrdVar;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel lkDpth;
    private javax.swing.JFormattedTextField linkDepthVar;
    Double mxThreads;
    Double lnkDepth;
    String orgURL;
    // End of variables declaration
}