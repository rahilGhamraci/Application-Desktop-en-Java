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
public class Cmd_valide extends javax.swing.JFrame {
Statement stmt;
 
   Connecter maConnection=new Connecter();
      ResultSet rs;
    /**
     * Creates new form Cmd_valide
     */
    public Cmd_valide() {
        initComponents();
        Table();
        jTextField1.setEnabled(false);jTextField2.setEnabled(false);jTextField10.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(180, 133, 113));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Supprimer");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(180, 133, 113));
        jButton1.setText("Modifier");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 225, 120, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 191, 120, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 225, 120, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 120, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 225, 120, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 120, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 141, 120, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 141, 120, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel2.setText("num_com");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 144, 69, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 141, 120, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "num_com", "num_client", "produit1", "quantite1", "produit2", "quantite2", "produit3", "quantite3"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(180, 133, 113));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 1000, 160));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 278, 130, -1));

        jButton3.setBackground(new java.awt.Color(180, 133, 113));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Rechercher");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 310, -1, -1));

        jButton4.setBackground(new java.awt.Color(180, 133, 113));
        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Etablir Facture");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 555, -1, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(180, 133, 113));
        jLabel11.setText("Traitement des commandes");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,80));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 82, 82));
        jLabel1.setText("num_client");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(82, 82, 82));
        jLabel8.setText("Ref Produit 3");

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(82, 82, 82));
        jLabel9.setText("Quantite3");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(82, 82, 82));
        jLabel5.setText("Recherche par numero de commande :");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(82, 82, 82));
        jLabel7.setText("Quantite2");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(82, 82, 82));
        jLabel6.setText("Ref Produit 2");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(82, 82, 82));
        jLabel3.setText("Ref Produit 1");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(82, 82, 82));
        jLabel4.setText("Quantite1");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\BabaAhmed_Ghamraci\\pic\\icons8-ref30.png")); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\BabaAhmed_Ghamraci\\pic\\icons8.png")); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(222, 222, 222))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(378, 378, 378)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(149, 149, 149)
                                .addComponent(jLabel6)
                                .addGap(154, 154, 154)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 910, 300));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(180, 133, 113));
        jLabel14.setText("Etablir la facture pour ce client");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\BabaAhmed_Ghamraci\\pic\\azerCm.jpg")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        setSize(new java.awt.Dimension(1014, 674));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String numCom= jTextField1.getText();
        String numCl= jTextField2.getText();
        String desProduit1= jTextField3.getText();
        String quantite1= jTextField4.getText();
       String desProduit2= jTextField6.getText();
        String quantite2= jTextField7.getText();
        String desProduit3= jTextField8.getText();
       String quantite3= jTextField9.getText();
       
       
        int numClient=Integer.parseInt(numCl);
        int numCm=Integer.parseInt(numCom);
        int q1=Integer.parseInt(quantite1);
           int q2=Integer.parseInt(quantite2);
            int q3=Integer.parseInt(quantite3);
           
        String requete2="UPDATE `commandes` SET `num_client`="+numClient+",`des_produit1`='"+desProduit1+"',`quantite1`="+q1+",`des_produit2`='"+desProduit2+"',`quantite2`="+q2+",`des_produit3`='"+desProduit3+"',`quantite3`="+q3+" WHERE `num_com`="+numCm;
           String requete1="select* from `commandes` WHERE `num_com`="+numCm;
        try{
          stmt=maConnection.obtenirconnexion().createStatement();
          rs=stmt.executeQuery(requete1);
          if(rs.next()){
          stmt.executeUpdate(requete2);
           JOptionPane.showMessageDialog(null,"requete executée avec succès");
          Table();}else{
          JOptionPane.showMessageDialog(null,"la commande que vous voulez modifier n'existe pas!");
          }
        }catch(SQLException ex){
        System.err.println(ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        int i=jTable1.getSelectedRow();
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        jTextField10.setText(model.getValueAt(i,0).toString());
        jTextField1.setText(model.getValueAt(i,1).toString());
        jTextField2.setText(model.getValueAt(i,2).toString());
       jTextField3.setText(model.getValueAt(i,3).toString());
        jTextField4.setText(model.getValueAt(i,4).toString());
        jTextField6.setText(model.getValueAt(i,5).toString());
         jTextField7.setText(model.getValueAt(i,6).toString());
          jTextField8.setText(model.getValueAt(i,7).toString());
           jTextField9.setText(model.getValueAt(i,8).toString());
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String numCom= jTextField1.getText();
           int numCm=Integer.parseInt(numCom);
          String requete1="select* from `commandes` WHERE `num_com`='"+numCm+"'";  
            String requete2="delete from `commandes` WHERE `num_com`='"+numCm+"'";
           try{
         
          stmt=maConnection.obtenirconnexion().createStatement();
            rs=stmt.executeQuery(requete1);
            if(rs.next()){
          stmt.executeUpdate(requete2);
          JOptionPane.showMessageDialog(null,"requete executée avec succès");
          Table();
            }else{
                JOptionPane.showMessageDialog(null,"la commande que vous voulez supprimer  n'existe pas");
            }
         
          }catch(SQLException ex){
         
           System.err.println(ex);
         
          }
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String numCom=jTextField5.getText();
        int numCm=Integer.parseInt(numCom);
         String requete="select* from `commandes` WHERE `num_com`="+numCm;
         try{
             
              stmt=maConnection.obtenirconnexion().createStatement();
             rs=stmt.executeQuery(requete);
             if(rs.next()){
                 
             jTextField1.setText(rs.getString("num_com"));
             jTextField2.setText(rs.getString("num_client"));
             jTextField3.setText(rs.getString("des_produit1"));
             jTextField4.setText(rs.getString("quantite1"));
              jTextField6.setText(rs.getString("des_produit2"));
             jTextField7.setText(rs.getString("quantite2"));
              jTextField8.setText(rs.getString("des_produit3"));
             jTextField9.setText(rs.getString("quantite3"));
                 
          }else{
             
             JOptionPane.showMessageDialog(null,"la commande n'existe pas");
             }
             
         }catch(SQLException ex){
            System.err.println(ex);
         }
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int seuil=0,remise=0;
        String prix1="";   String prix2="";  String prix3="";
        String TVA1="";   String TVA2="";  String TVA3="";
        String typeCl="";
        Facture fenetreFacture= new Facture();
        
         fenetreFacture.jTextField1.setText(jTextField1.getText());
        fenetreFacture.jTextField2.setText(jTextField2.getText());
       fenetreFacture.jTextField12.setText(jTextField10.getText());
        // recuperer la designation en utilisant  num client
        int numCl=Integer.parseInt(jTextField2.getText());
       
       String requete="select* from `clients` WHERE `numero`="+numCl;
         try{
             
              stmt=maConnection.obtenirconnexion().createStatement();
             rs=stmt.executeQuery(requete);
             if(rs.next()){
                  fenetreFacture.jTextField3.setText(rs.getString("designation"));
                typeCl=rs.getString("type");
         
          }else{
            JOptionPane.showMessageDialog(null,"le client pour lequel vous voulez etablir une facture n'existe pas");
             }
         }catch(SQLException ex){
            System.err.println(ex);
         }
         
         fenetreFacture.jTextField4.setText(jTextField3.getText());
         fenetreFacture.jTextField5.setText(jTextField4.getText());
         fenetreFacture.jTextField6.setText(jTextField6.getText());
         fenetreFacture.jTextField7.setText(jTextField7.getText());
         fenetreFacture.jTextField8.setText(jTextField8.getText());
         fenetreFacture.jTextField9.setText(jTextField9.getText());
         int q1=Integer.parseInt(jTextField4.getText());
         int q2=Integer.parseInt(jTextField7.getText());
         int q3=Integer.parseInt(jTextField9.getText());
         int q=q1+q2+q3;
         Integer Q=new Integer(q);
         String quantite=Q.toString();
         fenetreFacture.jTextField10.setText(quantite);
          //.....................................................
         
         
         // ............... CETTE PARTIE COMMANT2EON L4AJOUTE APRES L4ATTRIBUTION DES PRIX AUX PRODUITS...................
         prix1=jTextField3.getText(); 
         if(prix1.equals("null")){
             prix1="0";TVA1="0";
         }else{
             String requete1="select* from `prixproduits` WHERE `references`='"+jTextField3.getText()+"'";
         try{
             
              stmt=maConnection.obtenirconnexion().createStatement();
             rs=stmt.executeQuery(requete1);
             if(rs.next()){
                  prix1= rs.getString("prix_sans_TVA");
                 if(typeCl.equals("Non Revendeur")){
                  TVA1= rs.getString("TVA");
                 
                 }
         
          }else{
            JOptionPane.showMessageDialog(null,"112le produit pour lequel vous voulez etablir une facture n'existe pas");
             }
         }catch(SQLException ex){
            System.err.println(ex);
         }
         
         }
              
         
          
         //.....................................................................................
         //String az =jTextField6.getText();
         prix2=jTextField6.getText();
         if(prix2.equals("null")){
             prix2="0";TVA2="0";
         }else{
             String requete2="select* from `prixproduits` WHERE `references`='"+jTextField6.getText()+"'";
         try{
             
              stmt=maConnection.obtenirconnexion().createStatement();
             rs=stmt.executeQuery(requete2);
             if(rs.next()){
                 prix2= rs.getString("prix_sans_TVA");
                 if(typeCl.equals("Non Revendeur")){
                  TVA2= rs.getString("TVA");
                 
                 }
         
          }else{
            JOptionPane.showMessageDialog(null,"1123le produit pour lequel vous voulez etablir une facture n'existe pas");
             }
         }catch(SQLException ex){
            System.err.println(ex);
         }
         
         }
             
             
          //.....................................................
          
         prix3=jTextField8.getText();
         if(prix3.equals("null")){
             prix3="0";TVA3="0";
         }else{
             String requete3="select* from `prixproduits` WHERE `references`='"+jTextField8.getText()+"'";
         try{
             
              stmt=maConnection.obtenirconnexion().createStatement();
             rs=stmt.executeQuery(requete3);
             if(rs.next()){
                  prix3= rs.getString("prix_sans_TVA");
                 if(typeCl.equals("Non Revendeur")){
                  TVA3= rs.getString("TVA");
                 
                 }
         
          }else{
            JOptionPane.showMessageDialog(null,"11234le produit pour lequel vous voulez etablir une facture n'existe pas");
             }
         }catch(SQLException ex){
            System.err.println(ex);
         }
         }
              
          
             
        //  ..........
            int p1=Integer.parseInt(prix1);
            int p2=Integer.parseInt(prix2);
            int p3=Integer.parseInt(prix3);
         
          int t1=0,t2=0,t3=0;
         
          if(typeCl.equals("Non Revendeur")){
              t1=Integer.parseInt(TVA1);
               t2=Integer.parseInt(TVA2);
               t3=Integer.parseInt(TVA3);
          }
         
         
           
          String req="select* from `inforeduction`";
         
         
           try{
             
              stmt=maConnection.obtenirconnexion().createStatement();
             rs=stmt.executeQuery(req);
             if(rs.next()){
                  seuil=Integer.parseInt(rs.getString("seuil"));
                remise=Integer.parseInt(rs.getString("remise"));
         
          }else{
            JOptionPane.showMessageDialog(null,"manque des informations pour effectuer une reduction");
             }
         }catch(SQLException ex){
            System.err.println(ex);
         }
         
         
           // int p=p1*q1+p2*q2+p3*q3+(p1*t1)/100+(p2*t2)/100+(p3*t3)/100;
           int p=(p1+(p1*t1)/100)*q1+(p2+(p2*t2)/100)*q2+(p3+(p3*t3)/100)*q3;
           if(p>seuil && remise!=0){
           p=p-(remise*p)/100;
            JOptionPane.showMessageDialog(null,"le client a beneficié d'une reduction et il va etre notifié de cela");
           }
           
           Integer P=new Integer(p);
          String prix=P.toString();
         
         
         
         
          fenetreFacture.jTextField11.setText(prix);
     
     
     
    //.................................
      String numCom= jTextField1.getText();
           int numCm=Integer.parseInt(numCom);
          String requete4="select* from `commandes` WHERE `num_com`="+numCm;  
            String requete5="delete from `commandes` WHERE `num_com`="+numCm;
           try{
         
          stmt=maConnection.obtenirconnexion().createStatement();
            rs=stmt.executeQuery(requete4);
            if(rs.next()){
          stmt.executeUpdate(requete5);
          JOptionPane.showMessageDialog(null,"requete executée avec succès");
          Table();
            }else{
                JOptionPane.showMessageDialog(null,"la commande que vous voulez supprimer  n'existe pas");
            }
         
          }catch(SQLException ex){
         
           System.err.println(ex);
         
          }
         
        fenetreFacture.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        Agent fenetreAg = new Agent();
        fenetreAg.show();dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
    }//GEN-LAST:event_jLabel13MouseClicked

      public void Table(){
   String [] commandeValide={"date","num_com","num client","des_produit1","quantite1","des_produit2","quantite2","des_produit3","quantite3"};
    String [] afficher=new String[9];
     DefaultTableModel model =new DefaultTableModel(null,commandeValide);
     try{
     stmt=maConnection.obtenirconnexion().createStatement();
         rs=stmt.executeQuery("select* from `commandes` where `valide`='oui' ");
         while(rs.next()){
         afficher[0]=rs.getString("date");
         afficher[1]=rs.getString("num_com");
         afficher[2]=rs.getString("num_client");
         afficher[3]=rs.getString("des_produit1");
         afficher[4]=rs.getString("quantite1");
          afficher[5]=rs.getString("des_produit2");
         afficher[6]=rs.getString("quantite2");
           afficher[7]=rs.getString("des_produit3");
         afficher[8]=rs.getString("quantite3");
         
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
            java.util.logging.Logger.getLogger(Cmd_valide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cmd_valide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cmd_valide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cmd_valide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cmd_valide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}