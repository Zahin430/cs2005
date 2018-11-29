package activitytracker; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author zahin
 */
public class JFriendsFrame extends JFrame {

    /**
     * Creates new form JFriendsFrame
     */
    public JFriendsFrame() {
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

        topPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        JReturnLabel = new javax.swing.JLabel();
        JMainPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JHoldingPanel = new javax.swing.JPanel();
        JFriendPanel = new javax.swing.JPanel();
        JSidePanel = new javax.swing.JPanel();
        AddLabel = new javax.swing.JLabel();
        RemoveLabel = new javax.swing.JLabel();
        JViewLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topPanel.setBackground(new java.awt.Color(96, 83, 150));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(240, 240, 240));
        title.setText("Friends");

        JReturnLabel.setBackground(new java.awt.Color(96, 83, 150));
        JReturnLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JReturnLabel.setForeground(new java.awt.Color(255, 255, 255));
        JReturnLabel.setText("Return to Main Menu");
        JReturnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JReturnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JReturnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        JMainPanel.setBackground(java.awt.SystemColor.activeCaption);
        JMainPanel.setForeground(java.awt.SystemColor.activeCaption);


        String[] friendsList = Singleton.loadedProfile.getFriends();
        JPanel allFriends = new JPanel();

        if (friendsList != null) {
            allFriends.setLayout(new BoxLayout(allFriends, BoxLayout.Y_AXIS));
            JPanel eachFriend;
            for (String friendName:friendsList){
                eachFriend= JFriendPanel(friendName);
                allFriends.add(eachFriend);
            }
            JScrollPane scrollFriend = new JScrollPane(allFriends);
            scrollFriend.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scrollFriend.setPreferredSize(new Dimension(1000,750));
            scrollFriend.setBounds(50, 30, 300, 50);

            JMainPanel.add(scrollFriend);
        }
        else {
            JOptionPane.showMessageDialog(null, "You do not have any friends!");
        }



        javax.swing.GroupLayout JHoldingPanelLayout = new javax.swing.GroupLayout(JHoldingPanel);
        JHoldingPanel.setLayout(JHoldingPanelLayout);
        JHoldingPanelLayout.setHorizontalGroup(
            JHoldingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JHoldingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JFriendPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(386, Short.MAX_VALUE))
        );
        JHoldingPanelLayout.setVerticalGroup(
            JHoldingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JHoldingPanelLayout.createSequentialGroup()
                .addComponent(JFriendPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 729, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(JHoldingPanel);

        JSidePanel.setBackground(new java.awt.Color(0, 102, 102));
        JSidePanel.setForeground(new java.awt.Color(0, 102, 102));

        AddLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddLabel.setForeground(new java.awt.Color(240, 240, 240));
        AddLabel.setText("Add Friends");
        AddLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddLabelMouseClicked(evt);
            }
        });

        RemoveLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RemoveLabel.setForeground(new java.awt.Color(240, 240, 240));
        RemoveLabel.setText("Remove Friends");
        RemoveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveLabelMouseClicked(evt);
            }
        });

        JViewLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JViewLabel.setForeground(new java.awt.Color(240, 240, 240));
        JViewLabel.setText("View Friends");

        javax.swing.GroupLayout JSidePanelLayout = new javax.swing.GroupLayout(JSidePanel);
        JSidePanel.setLayout(JSidePanelLayout);
        JSidePanelLayout.setHorizontalGroup(
            JSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JSidePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(JSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveLabel)
                    .addComponent(AddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        JSidePanelLayout.setVerticalGroup(
            JSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JSidePanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(JViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RemoveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLabelMouseClicked
        String friendName = JOptionPane.showInputDialog(null, "Enter the your friend's username: ");
        ClassProfile friendProfile = Singleton.dataManager.loadProfile(friendName);

        if (friendProfile == null) {
            // Profile doesn't exist
            JOptionPane.showMessageDialog(null, "There are no records of this username!");
            return;
        }
        else {
            Singleton.loadedProfile.addFriend(friendName);
            Singleton.dataManager.saveProfile(Singleton.loadedProfile);
            this.dispose();
            JFriendsFrame fr = new JFriendsFrame();
            fr.setVisible(true);
        }


    }//GEN-LAST:event_AddLabelMouseClicked

    private void returnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnLabelMouseClicked
        Home h = new Home();
        h.setVisible(true);
        h.pack();
        h.setLocationRelativeTo(null);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_returnLabelMouseClicked

    private void RemoveLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveLabelMouseClicked
        String friendName = JOptionPane.showInputDialog(null, "Enter the your friend's username: ");
        ClassProfile friendProfile = Singleton.dataManager.loadProfile(friendName);

        if (friendProfile == null) {
            // Profile doesn't exist
            JOptionPane.showMessageDialog(null, "There are no records of this username!");
            return;
        }
        else {
            Singleton.loadedProfile.removeFriend(friendName);
            Singleton.dataManager.saveProfile(Singleton.loadedProfile);
            this.dispose();
            JFriendsFrame fr = new JFriendsFrame();
            fr.setVisible(true);
        }




    }//GEN-LAST:event_RemoveLabelMouseClicked

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
            java.util.logging.Logger.getLogger(JFriendsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFriendsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFriendsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFriendsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFriendsFrame().setVisible(true);
            }
        });
    }



    public JPanel JFriendPanel(String username) {
        ClassProfile friendProfile = Singleton.dataManager.loadProfile(username);

        JPanel friendPanel = new JPanel();
        JLabel friendName = new JLabel(friendProfile.getFirstName());
        friendName.setFont(new java.awt.Font("Tahoma", 1, 14));

        JLabel friendPic = new JLabel();
        friendPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activitytracker/Images/user.png")));

        ClassData[] data = friendProfile.getRunDatas();
        Object[][] tableData = {
                {"Empty!", "Empty!", "Empty!", "Empty!"},
                {"Empty!", "Empty!", "Empty!", "Empty!"}
        };

        if (data != null) {
            int ite = data.length-1;
            tableData = new Object[data.length][4];
            for (int i = 0; i < data.length; i++) {
                tableData[i][0] = data[ite].getFormattedDate();
                tableData[i][1] = data[ite].getDistance();
                tableData[i][2] = data[ite].getDuration();
                tableData[i][3] = data[ite].getAltitude();
                ite--;}
        }

        String[] columnNames = {"Date", "Distance covered", "Duration", "Inclination"};

        JTable friendTable = new JTable(tableData, columnNames);
        friendTable.setGridColor(new java.awt.Color(247, 247, 247));
        friendTable.setRowHeight(20);
        friendTable.setSelectionBackground(new java.awt.Color(96, 83, 150));
        friendTable.setBackground(new java.awt.Color(247, 247, 247));
        friendTable.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        JScrollPane scrollpane = new JScrollPane(friendTable);
        scrollpane.setViewportView(friendTable);

        JPanel leftSide = new JPanel();
        leftSide.setLayout(new BorderLayout());
        leftSide.add(friendPic, BorderLayout.NORTH);
        leftSide.add(friendName, BorderLayout.SOUTH);

        JPanel rightside = new JPanel();
        rightside.add(scrollpane);

        friendPanel.add(leftSide);
        friendPanel.add(rightside);

        return friendPanel;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddLabel;
    private javax.swing.JPanel JFriendPanel;
    private javax.swing.JPanel JHoldingPanel;
    private javax.swing.JPanel JMainPanel;
    private javax.swing.JLabel JReturnLabel;
    private javax.swing.JPanel JSidePanel;
    private javax.swing.JLabel JViewLabel;
    private javax.swing.JLabel RemoveLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel title;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
