/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;
import java.sql.*;
 import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Fayçal
 */
public class Admin extends javax.swing.JFrame {
   Statement stmt;
  Connecter maConnection=new Connecter();
      ResultSet rs;
    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
         Table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setForeground(new java.awt.Color(180, 133, 113));
        jTabbedPane1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 164, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(82, 82, 82));
        jLabel5.setText("Recherche par numero employé :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, -1, -1));

        jButton4.setBackground(new java.awt.Color(180, 133, 113));
        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Rechercher");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255,80));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Num_employé", "Poste", "Email", "Nom_utilisateur", "Mot de passe"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setFocusable(false);
        jTable1.setSelectionBackground(new java.awt.Color(180, 133, 113));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, 310));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 135, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nom d'utilisateur");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(82, 82, 82));
        jLabel2.setText("Mot de passe");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 235, 110, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 235, 135, -1));

        jComboBox1.setBackground(new java.awt.Color(180, 133, 113));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent de vente", "Agent commercial", "Directeur" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setFocusable(false);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 135, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(82, 82, 82));
        jLabel3.setText("Poste");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 110, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(82, 82, 82));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 110, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 135, -1));

        jButton1.setBackground(new java.awt.Color(180, 133, 113));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ajouter");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(180, 133, 113));
        jButton2.setText("Modifier");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jButton3.setBackground(new java.awt.Color(180, 133, 113));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Supprimer");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,80));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\BabaAhmed_Ghamraci\\pic\\icons8-ref30.png")); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 370, 310));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(180, 133, 113));
        jLabel6.setText("Gestion des Employés");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 460, 60));

        jButton5.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(180, 133, 113));
        jButton5.setText("Déconnecter");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\BabaAhmed_Ghamraci\\pic\\azerCm.jpg")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1010, 670));

        jTabbedPane1.addTab("Gestion Employé", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1013, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        int i=jTable1.getSelectedRow();
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        jTextField1.setText(model.getValueAt(i,3).toString());
        jTextField2.setText(model.getValueAt(i,4).toString());
        jComboBox1.setSelectedItem(model.getValueAt(i,1).toString());
        jTextField3.setText(model.getValueAt(i,2).toString());
        jTextField3.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        String emp=jTextField4.getText();

        int num_emp =Integer.parseInt(emp);

        String requete="select* from `employés` WHERE `num_employé`='"+num_emp+"'";
        try{
            stmt=maConnection.obtenirconnexion().createStatement();
            rs=stmt.executeQuery(requete);
            if(rs.next()){

                jTextField1.setText(rs.getString("nom_utilisateur"));
                jTextField2.setText(rs.getString("mot_de_passe"));
                jComboBox1.setSelectedItem(rs.getString("poste"));
                jTextField3.setText(rs.getString("email"));

            }

        }catch(SQLException ex){
            System.err.println(ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String email=jTextField3.getText();

        String requete1="select* from `employés` WHERE `email`='"+email+"'";

        String requete2="delete from `employés` WHERE `email`='"+email+"'";
        try{
            stmt=maConnection.obtenirconnexion().createStatement();
            rs=stmt.executeQuery(requete1);
            if(rs.next()){
                stmt.executeUpdate(requete2);
                JOptionPane.showMessageDialog(null,"requete executée avec succès");
                jTextField1.setText("");jTextField2.setText("");jTextField3.setText("");jTextField4.setText("");
                Table();}else{
                JOptionPane.showMessageDialog(null,"l'employé n'existe");
            }
        }catch(SQLException ex  ){
            System.err.println(ex);

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String nomUtilisateur= jTextField1.getText();
        String motDePasse= jTextField2.getText();
        String poste= jComboBox1.getSelectedItem().toString();
        String email= jTextField3.getText();

        String requete1="select* from `employés` WHERE `email`='"+email+"'";
        String requete2="UPDATE `employés` SET `nom_utilisateur`='"+nomUtilisateur+"',`mot_de_passe`='"+motDePasse+"',`poste`='"+poste+"',`nom_utilisateur`='"+nomUtilisateur+"' WHERE `email`='"+email+"'";
        try{
            stmt=maConnection.obtenirconnexion().createStatement();
            rs=stmt.executeQuery(requete1);
            if(rs.next()){
                stmt.executeUpdate(requete2);
                JOptionPane.showMessageDialog(null,"requete executée avec succès");jTextField3.setEnabled(true);
                Table();}else{
                JOptionPane.showMessageDialog(null,"l'employé n'existe pas");
            }
        }catch(SQLException ex ){
            System.err.println(ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nomUtilisateur= jTextField1.getText();
        String motDePasse= jTextField2.getText();
        String poste= jComboBox1.getSelectedItem().toString();
        String email= jTextField3.getText();

        String requete="INSERT INTO `employés`(`num_employé`, `nom_utilisateur`, `mot_de_passe`, `poste`, `email`) VALUES (Null,'"+nomUtilisateur+"','"+motDePasse+"','"+ poste+"','"+email+"')";

        try{
            stmt=maConnection.obtenirconnexion().createStatement();
            stmt.executeUpdate(requete);
            JOptionPane.showMessageDialog(null,"requete executée avec succès");
            Table();
        }catch(SQLException ex  ){
            System.err.println(ex);
            JOptionPane.showMessageDialog(null,"changer le Nom d'utilisateur ou l'Email");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Accueil fenetreAcc=new Accueil();
         fenetreAcc.show();dispose(); fenetreAcc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
          jTextField1.setText("");jTextField2.setText("");jTextField3.setText("");jTextField4.setText(""); jTextField3.setEnabled(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    
     public void Table(){
    String [] employé={"num_employé","nom utilisateur","mot de passe","poste","email"};
    String [] afficher=new String[5];
     DefaultTableModel model =new DefaultTableModel(null,employé);
     try{
     stmt=maConnection.obtenirconnexion().createStatement();
         rs=stmt.executeQuery("select* from `employés`");
         while(rs.next()){
         afficher[0]=rs.getString("num_employé");
         afficher[1]=rs.getString("poste");
            afficher[2]=rs.getString("email");
        afficher[3]=rs.getString("nom_utilisateur");
         afficher[4]=rs.getString("mot_de_passe");
          
         model.addRow(afficher);
         }
             
             jTable1.setModel(model);
          //maConnection.close();
     }catch(Exception e){
            System.err.println(e);
     }
   
      }
   
   
   
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
