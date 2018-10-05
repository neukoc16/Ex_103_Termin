
public class AppointmentGUI extends javax.swing.JFrame {

    public AppointmentGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupmenu = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        miadd = new javax.swing.JMenuItem();
        midelete = new javax.swing.JMenuItem();
        michange = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        lilist = new javax.swing.JList<>();

        jMenu1.setText("Termin");

        miadd.setText("hinzufügen");
        miadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miaddActionPerformed(evt);
            }
        });
        jMenu1.add(miadd);

        midelete.setText("löschen");
        midelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mideleteActionPerformed(evt);
            }
        });
        jMenu1.add(midelete);

        michange.setText("ändern");
        michange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                michangeActionPerformed(evt);
            }
        });
        jMenu1.add(michange);

        popupmenu.add(jMenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lilist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lilist.setComponentPopupMenu(popupmenu);
        jScrollPane2.setViewportView(lilist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miaddActionPerformed

    private void mideleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mideleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mideleteActionPerformed

    private void michangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_michangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_michangeActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AppointmentGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lilist;
    private javax.swing.JMenuItem miadd;
    private javax.swing.JMenuItem michange;
    private javax.swing.JMenuItem midelete;
    private javax.swing.JPopupMenu popupmenu;
    // End of variables declaration//GEN-END:variables
}
