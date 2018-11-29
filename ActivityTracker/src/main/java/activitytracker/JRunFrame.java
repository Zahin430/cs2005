package activitytracker;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JRunFrame extends JFrame {

    /**
     * Creates new form runJFrame
     */
    public JRunFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // df = new SimpleDateFormat("dd-MM-yyyy");
        dateParser = new SimpleDateFormat("dd-MM-yyyy");
        mainPanel = new javax.swing.JPanel();
        validateDate = new javax.swing.JButton();
        endDate = new JDatePickerImpl(endDatePanel);
        startDate = new JDatePickerImpl(startDatePanel);
        topPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        returnLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		validateDate.setText("Filter");
        validateDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    onValidateClick(evt);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        topPanel.setBackground(new java.awt.Color(96, 83, 150));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(240, 240, 240));
        title.setText("Detailed Running Statistics");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        returnLabel.setBackground(new java.awt.Color(96, 83, 150));
        returnLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        returnLabel.setForeground(new java.awt.Color(96, 83, 150));
        returnLabel.setText("Return to Main Menu");
        returnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnLabelMouseClicked(evt);
            }
        });
		jScrollPane1.setBackground(new java.awt.Color(247, 247, 247));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		ClassData[] data = Singleton.loadedProfile.getRunDatas();

        if (data != null) {
            Object[][] tableData = new Object[data.length][4];
            for (int i = 0; i < data.length; i++) {
                tableData[i][0] = data[i].getFormattedDate();
                tableData[i][1] = data[i].getDistance();
                tableData[i][2] = data[i].getDuration();
                tableData[i][3] = data[i].getAltitude();
			}
            makeTable(tableData);
        } else {
            makeTable(null);
        }
        
        
        jScrollPane1.setViewportView(runTable);
		packup();
	}
	private void packup() {
        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
         mainPanelLayout.setHorizontalGroup(mainPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        mainPanelLayout.createSequentialGroup().addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18).addComponent(validateDate)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(returnLabel))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888,
                                                Short.MAX_VALUE))
                                .addContainerGap()));
        mainPanelLayout.setVerticalGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(returnLabel)
                                .addGroup(mainPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(validateDate)))
                        .addGap(50, 50, 50).addComponent(jScrollPane1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(410, 410, 410)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnLabelMouseClicked
        Home h = new Home();
        h.setVisible(true);
        h.pack();
        h.setLocationRelativeTo(null);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_returnLabelMouseClicked

    private void makeTable(Object[][] inputData) {
        String[] columnNames = { "Date", "Distance Covered (meter)", "Duration (second)", "Inclination (meter)" };

        if (inputData == null) {
            dataForTable = new Object[][] { { "Empty!", "Empty!", "Empty!", "Empty!" },
                    { "Empty!", "Empty!", "Empty!", "Empty!" } };
        }

        else {
            dataForTable = inputData;
        }

        runTable = new JTable(dataForTable, columnNames);
        runTable.setGridColor(new java.awt.Color(247, 247, 247));
        runTable.setBackground(new java.awt.Color(247, 247, 247));
        runTable.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        runTable.setRowHeight(20);
        runTable.setSelectionBackground(new java.awt.Color(96, 83, 150));

    }

    private Object[][] returnAs2DArray(ClassData[] input) {

        Object[][] important = new Object[input.length][4];
        for (int i = 0; i < input.length; i++) {
            important[i][0] = input[i].getFormattedDate();
            important[i][1] = input[i].getDistance();
            important[i][2] = input[i].getDuration();
            important[i][3] = input[i].getAltitude();
        }
        return important;
    }

    private void onValidateClick(ActionEvent evt) throws ParseException {//GEN-FIRST:event_validateDateMouseClicked
        Date startDateDate = (Date) startDate.getModel().getValue();
        Date endDateDate = (Date) endDate.getModel().getValue();

        // Calendar today = Calendar.getInstance();
        LocalDate today = LocalDate.now();
        if (startDateDate == null && endDateDate == null) {
            makeTable(null);
        }

        if (startDateDate == null) {
            Date endDate = endDateDate;
            ClassData[] filteredRunData = Singleton.loadedProfile
                    .getRunDatas(Singleton.loadedProfile.getRunManger().getStartDate(), endDate);
            Object[][] runsData = returnAs2DArray(filteredRunData);
            makeTable(runsData);
        }
        else if (startDateDate == null) {
            Date startDate = startDateDate;

            ClassData[] filteredRunData = Singleton.loadedProfile.getRunDatas(startDate, new Date(today.getYear(), today.getMonthValue(), today.getDayOfYear()));
            Object[][] runsData = returnAs2DArray(filteredRunData);
            makeTable(runsData);
        } else {
            Date startDate = startDateDate;
            Date endDate = endDateDate;

            ClassData[] filteredRunData = Singleton.loadedProfile.getRunDatas(startDate, endDate);
            Object[][] runsData = returnAs2DArray(filteredRunData);
            makeTable(runsData);
        }
        jScrollPane1.setViewportView(runTable);
        packup();
    }//GEN-LAST:event_validateDateMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JRunFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRunFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRunFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRunFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRunFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JTable runTable;
    private javax.swing.JLabel title;
    private javax.swing.JPanel topPanel;
	private javax.swing.JButton validateDate;
    private Object[][] dataForTable;
    DateFormat dateParser;
    private JDatePickerImpl endDate;
    private JDatePickerImpl startDate;

    UtilDateModel startDateModel = new UtilDateModel();
    JDatePanelImpl startDatePanel = new JDatePanelImpl(startDateModel);
    UtilDateModel endDateModel = new UtilDateModel();
    JDatePanelImpl endDatePanel = new JDatePanelImpl(endDateModel);
	// End of variables declaration//GEN-END:variables
}
