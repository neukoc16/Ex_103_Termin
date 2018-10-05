
import java.io.File;
import javax.swing.JOptionPane;

public class AppointmentGUI extends javax.swing.JFrame {

    AppointmentModel model = new AppointmentModel();
    File file = new File("./appointments.bin");

    public AppointmentGUI() {
        initComponents();
        try {
            model.load(file);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Konnte keine Items laden!");
        }
        lilist.setModel(model);
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
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
        AppointmentDia dia = new AppointmentDia(this, true);
        dia.setVisible(true);
        if (dia.getAppointment() != null) {
            lilist.setSelectedIndex(model.add(dia.getAppointment()));
        }
    }//GEN-LAST:event_miaddActionPerformed

    private void mideleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mideleteActionPerformed
        if (lilist.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(this, "Item zum Löschen auswählen");
            return;
        }
        model.remove(lilist.getSelectedIndices());
    }//GEN-LAST:event_mideleteActionPerformed

    private void michangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_michangeActionPerformed
        int idx = lilist.getSelectedIndex();
        if (idx < 0) {
            JOptionPane.showMessageDialog(this, "Auszuwähldendes Item auswählen");
            return;
        }
        AppointmentDia dlg = new AppointmentDia(this, true, (Appointment) model.getElementAt(idx));
        dlg.setVisible(true);
        if (dlg.getAppointment() != null) {
            lilist.setSelectedIndex(model.update(idx, dlg.getAppointment()));
        }
    }//GEN-LAST:event_michangeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            model.save(file);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Konnte keine Termine laden");
        }
    }//GEN-LAST:event_formWindowClosing

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
