package FirstAidApp.GUI;


import java.awt.Color;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuizButton = new javax.swing.JButton();
        FirstAidLessonButton = new javax.swing.JButton();
        PreviewResultsButton = new javax.swing.JButton();
        ScoresButton = new javax.swing.JButton();
        EmergencyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(360, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(360, 640));

        QuizButton.setBackground(new java.awt.Color(249, 6, 6));
        QuizButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/iconQuiz_transparent.png"))); // NOI18N
        QuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizButtonActionPerformed(evt);
            }
        });

        FirstAidLessonButton.setBackground(new java.awt.Color(249, 6, 6));
        FirstAidLessonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/iconLessons_transparent.png"))); // NOI18N
        FirstAidLessonButton.setMaximumSize(new java.awt.Dimension(159, 169));
        FirstAidLessonButton.setMinimumSize(new java.awt.Dimension(159, 169));
        FirstAidLessonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstAidLessonButtonActionPerformed(evt);
            }
        });

        PreviewResultsButton.setBackground(new java.awt.Color(249, 6, 6));
        PreviewResultsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/iconResults_transparent.png"))); // NOI18N
        PreviewResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviewResultsButtonActionPerformed(evt);
            }
        });

        ScoresButton.setBackground(new java.awt.Color(249, 6, 6));
        ScoresButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/iconScores_transparent.png"))); // NOI18N
        ScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoresButtonActionPerformed(evt);
            }
        });

        EmergencyButton.setBackground(new java.awt.Color(249, 6, 6));
        EmergencyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/iconEmergency_transparent.png"))); // NOI18N
        EmergencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmergencyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PreviewResultsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FirstAidLessonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QuizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(EmergencyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstAidLessonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviewResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(EmergencyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FirstAidLessonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstAidLessonButtonActionPerformed
        new Lesson().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FirstAidLessonButtonActionPerformed

    private void QuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizButtonActionPerformed
        new Quiz().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_QuizButtonActionPerformed

    private void ScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoresButtonActionPerformed
        //new Scores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ScoresButtonActionPerformed

    private void EmergencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmergencyButtonActionPerformed
        new Emergency().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EmergencyButtonActionPerformed

    private void PreviewResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviewResultsButtonActionPerformed
        //new PreviewResults().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PreviewResultsButtonActionPerformed
    

    

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmergencyButton;
    private javax.swing.JButton FirstAidLessonButton;
    private javax.swing.JButton PreviewResultsButton;
    private javax.swing.JButton QuizButton;
    private javax.swing.JButton ScoresButton;
    // End of variables declaration//GEN-END:variables

}
