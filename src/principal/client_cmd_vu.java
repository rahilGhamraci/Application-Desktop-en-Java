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
public class client_cmd_vu extends javax.swing.JFrame {
Statement stmt;
    Connecter maConnection=new Connecter();
    ResultSet rs;
    /**
     * Creates new form client_cmd_vu
     */
    public client_cmd_vu() {
        initComponents(); jTextField2.setEditable(false);
        Table();
        Table1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(180, 133, 113));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mes commandes en cours de traitement");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 820, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 971, 118));

        jButton2.setBackground(new java.awt.Color(180, 133, 113));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Supprimer");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(180, 133, 113));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mes commandes validées");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, 971, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable2.setFocusable(false);
        jTable2.setSelectionBackground(new java.awt.Color(180, 133, 113));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 971, 171));

        jButton1.setBackground(new java.awt.Color(180, 133, 113));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Modifier");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Pour toute modification ou suppression apres la validation ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 100, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(82, 82, 82));
        jLabel4.setText("Numero de la commande : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(180, 133, 113));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prouit 1", "Quantité 1", "Prouit 2", "Quantité 2", "Prouit 3", "Quantité 3" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setFocusable(false);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 119, -1));

        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 120, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("vous devez nous contacter soit par :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 563, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Mail : lactal_societe@gmail.com");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 586, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Numero du téléphone : 0560446395");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 609, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\BabaAhmed_Ghamraci\\pic\\icons8.png")); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\BabaAhmed_Ghamraci\\pic\\azer2.jpg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1014, 667));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String mod =jComboBox1.getSelectedItem().toString();String modif =jTextField1.getText();int num=0,num_com=0;int q=0;
        switch (mod){
            
            case "Quantité 1" : mod="quantite1";q=Integer.parseInt(modif) ;break;
            
            case "Quantité 2" : mod="quantite2";q=Integer.parseInt(modif); break;
            
            case "Quantité 3" : mod="quantite3";q=Integer.parseInt(modif);break;
        }
        
          
       String requete1="select* from `clients` WHERE `nom_utilisateur`='"+Login.nomUtilisateur+"'";
     String num_co=jTextField2.getText(); num_com=Integer.parseInt(num_co);
     
      try{
          stmt=maConnection.obtenirconnexion().createStatement();
            rs=stmt.executeQuery(requete1);
         if(rs.next()){
               num=Integer.parseInt(rs.getString("numero"));
               
         }
         
       }catch(SQLException ex){
       
        System.err.println(ex);
       }
     
          String requete2="UPDATE `commandes` SET `"+mod+"`="+q+" WHERE `num_com`="+num_com;
          
          try{
                    stmt=maConnection.obtenirconnexion().createStatement();

                    stmt.executeUpdate(requete2);
                    JOptionPane.showMessageDialog(null,"requete executée avec succès");
                  Table();
                }catch(SQLException ex){
                    System.err.println(ex);JOptionPane.showMessageDialog(null,"Numero commande n'existe pas");
                }
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        int i=jTable1.getSelectedRow();
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
     jTextField2.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_jTable1MouseReleased

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        Fclient fenetreC=new Fclient();
         fenetreC.show();dispose(); fenetreC.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String numero= jTextField2.getText();
         
       
          int numCom=Integer.parseInt(numero);
 
          String requete1="select* from `commandes` WHERE `num_com`="+numCom;

          String requete2="delete from `commandes` WHERE `num_com`="+numCom;
          try{
         stmt=maConnection.obtenirconnexion().createStatement();
            rs=stmt.executeQuery(requete1); // refuser la commande => la supprimer de la table commandes
                                             
            if(rs.next()){
          stmt.executeUpdate(requete2);
          JOptionPane.showMessageDialog(null,"requete executée avec succès");
          Table();
            }else{
                JOptionPane.showMessageDialog(null,"la commande n'existe pas");
            }
      }catch(SQLException ex  ){
        System.err.println(ex);
      }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseReleased

    
     public void Table(){
   String [] commandeValide={"num_com","ref_produit1","quantite1","ref_produit2","quantite2","ref_produit3","quantite3"};
    String [] afficher=new String[7];
     DefaultTableModel model =new DefaultTableModel(null,commandeValide);
     int num=-1;
       String requete1="select* from `clients` WHERE `nom_utilisateur`='"+Login.nomUtilisateur+"'";
     System.out.print("1-"+requete1);
     
      try{
          stmt=maConnection.obtenirconnexion().createStatement();
            rs=stmt.executeQuery(requete1);
         if(rs.next()){
               num=Integer.parseInt(rs.getString("numero"));
         
         }
         
         
         
           
       }catch(SQLException ex){
       
        System.err.println(ex);
       }
     
     
     
     
     try{
     stmt=maConnection.obtenirconnexion().createStatement();
         rs=stmt.executeQuery("select* from `commandes` WHERE `num_client`="+num+" AND `valide`!='oui'");
         System.out.print("select* from `commandes` WHERE `num_client`="+num+" AND `valide`!='oui'");
         while(rs.next()){
         afficher[0]=rs.getString("num_com");
        // afficher[1]=rs.getString("num_client");
         afficher[1]=rs.getString("des_produit1");
         afficher[2]=rs.getString("quantite1");
          afficher[3]=rs.getString("des_produit2");
         afficher[4]=rs.getString("quantite2");
           afficher[5]=rs.getString("des_produit3");
         afficher[6]=rs.getString("quantite3");
          //afficher[8]=rs.getString("valide");
         model.addRow(afficher);
         }
             
             jTable1.setModel(model);
          //maConnection.close();
     }catch(Exception e){
            System.err.println(e);
     }
}
   

   
   
     public void Table1(){
   String [] commandeValide={"num_com","ref_produit1","quantite1","ref_produit2","quantite2","ref_produit3","quantite3"};
    String [] afficher=new String[7];
     DefaultTableModel model =new DefaultTableModel(null,commandeValide);
     int num=-1;
       String requete1="select* from `clients` WHERE `nom_utilisateur`='"+Login.nomUtilisateur+"'";
     
     
      try{
          stmt=maConnection.obtenirconnexion().createStatement();
            rs=stmt.executeQuery(requete1);
         if(rs.next()){
               num=Integer.parseInt(rs.getString("numero"));
         
         }
         
         
         
           
       }catch(SQLException ex){
       
        System.err.println(ex);
       }
     
     
     
     
     try{
     stmt=maConnection.obtenirconnexion().createStatement();
         rs=stmt.executeQuery("select* from `commandes` WHERE `num_client`="+num+" AND `valide`='oui'");
         while(rs.next()){
         afficher[0]=rs.getString("num_com");
        // afficher[1]=rs.getString("num_client");
         afficher[1]=rs.getString("des_produit1");
         afficher[2]=rs.getString("quantite1");
          afficher[3]=rs.getString("des_produit2");
         afficher[4]=rs.getString("quantite2");
           afficher[5]=rs.getString("des_produit3");
         afficher[6]=rs.getString("quantite3");
          //afficher[8]=rs.getString("valide");
         model.addRow(afficher);
         }
             
             jTable2.setModel(model);
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
            java.util.logging.Logger.getLogger(client_cmd_vu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client_cmd_vu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client_cmd_vu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client_cmd_vu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client_cmd_vu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
