package ruptest;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahe
 */
public class Bus extends javax.swing.JFrame {

    /**
     * Creates new form Bus
     */
    static String source ;
    static String destination;
    static String date;
    static int cost1,cost2,cost3,cost4,cost5,cost6;
    Random rand = new Random();
    
    public Bus() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Source");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mumbai", "Delhi", "Kolkata", "Bangalore", "Hyderabad", "Chennai" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Destination");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Kolkata", "Bangalore", "Mumbai", "Hyderabad", "Chennai" }));

        jLabel3.setText("Date");

        jLabel4.setText("Format : DD/MM/YYYY");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, 138, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Bus().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        source = (String) jComboBox1.getSelectedItem();
        destination = (String) jComboBox2.getSelectedItem();
        date = (String) jTextField1.getText();
        
        if(source.equals(destination))
        {
            jLabel5.setText("Source and Destination are same");
        }
        
        else
        {
           if(source.equals("Mumbai"))
           {
               if(destination.equals("Bangalore") || destination.equals("Hyderabad") || destination.equals("Kolkata"))
               {
                   cost1 = rand.nextInt(600) + 500;
                   cost2 = rand.nextInt(600) + 500;
                   cost6 = rand.nextInt(600) + 500;
                   cost3 = rand.nextInt(900) + 700;
                   cost4 = rand.nextInt(900) + 700;
                   cost5 = rand.nextInt(900) + 700;
               }
               else
               {
                   cost1 = rand.nextInt(900) + 700;
                   cost2 = rand.nextInt(900) + 700;
                   cost3 = rand.nextInt(900) + 700;
                   cost4 = rand.nextInt(900) + 700;
                   cost5 = rand.nextInt(900) + 700;
                   cost6 = rand.nextInt(900) + 700;
                   
               }
           }
           else if (source.equals("Delhi"))
                {
                   if(destination.equals("Bangalore") || destination.equals("Hyderabad") || destination.equals("Kolkata"))
                   {
                       cost1 = rand.nextInt(600) + 500;
                       cost2 = rand.nextInt(600) + 500;
                       cost6 = rand.nextInt(600) + 500;
                       cost3 = rand.nextInt(900) + 700;
                       cost4 = rand.nextInt(900) + 700;
                       cost5 = rand.nextInt(900) + 700;
                   }
                   else
                   {
                       cost1 = rand.nextInt(900) + 700;
                       cost2 = rand.nextInt(900) + 700;
                       cost3 = rand.nextInt(900) + 700;
                       cost4 = rand.nextInt(900) + 700;
                       cost5 = rand.nextInt(900) + 700;
                       cost6 = rand.nextInt(900) + 700;
                   }
                }
           else if (source.equals("Kolkata"))
           {
               if(destination.equals("Hyderabad") || destination.equals("Chennai"))
               {
                       cost4 = rand.nextInt(600) + 500;
                       cost5 = rand.nextInt(600) + 500;
                       cost3 = rand.nextInt(600) + 500;
                       cost6 = rand.nextInt(900) + 700;
                       cost1 = rand.nextInt(900) + 700;
                       cost2 = rand.nextInt(900) + 700;
               }
               else
               {
                       cost1 = rand.nextInt(900) + 700;
                       cost2 = rand.nextInt(900) + 700;
                       cost3 = rand.nextInt(900) + 700;
                       cost4 = rand.nextInt(900) + 700;
                       cost5 = rand.nextInt(900) + 700;
                       cost6 = rand.nextInt(900) + 700;
               }
           }
           else if (source.equals("Bangalore"))
           {
               if(destination.equals("Hyderabad") || destination.equals("Chennai"))
               {
                       cost4 = rand.nextInt(600) + 500;
                       cost5 = rand.nextInt(600) + 500;
                       cost3 = rand.nextInt(600) + 500;
                       cost6 = rand.nextInt(900) + 700;
                       cost1 = rand.nextInt(900) + 700;
                       cost2 = rand.nextInt(900) + 700;
               }
               else
               {
                       cost1 = rand.nextInt(900) + 700;
                       cost2 = rand.nextInt(900) + 700;
                       cost3 = rand.nextInt(900) + 700;
                       cost4 = rand.nextInt(900) + 700;
                       cost5 = rand.nextInt(900) + 700;
                       cost6 = rand.nextInt(900) + 700;
               }
           }
           else if (source.equals("Hyderabad"))
           {
               if(destination.equals("Chennai") || destination.equals("Bangalore"))
               {
                       cost4 = rand.nextInt(600) + 500;
                       cost5 = rand.nextInt(600) + 500;
                       cost3 = rand.nextInt(600) + 500;
                       cost6 = rand.nextInt(900) + 700;
                       cost1 = rand.nextInt(900) + 700;
                       cost2 = rand.nextInt(900) + 700;
               }
               else
               {
                       cost1 = rand.nextInt(900) + 700;
                       cost2 = rand.nextInt(900) + 700;
                       cost3 = rand.nextInt(900) + 700;
                       cost4 = rand.nextInt(900) + 700;
                       cost5 = rand.nextInt(900) + 700;
                       cost6 = rand.nextInt(900) + 700;
               }
           }
           else if (source.equals("Chennai"))
           {
               if(destination.equals("Bangalore") || destination.equals("Hyderabad") || destination.equals("Mumbai"))
               {
                   cost1 = rand.nextInt(600) + 500;
                   cost2 = rand.nextInt(600) + 500;
                   cost6 = rand.nextInt(600) + 500;
                   cost3 = rand.nextInt(900) + 700;
                   cost4 = rand.nextInt(900) + 700;
                   cost5 = rand.nextInt(900) + 700;
               }
               else
               {
                    cost1 = rand.nextInt(900) + 700;
                    cost2 = rand.nextInt(900) + 700;
                    cost3 = rand.nextInt(900) + 700;
                    cost4 = rand.nextInt(900) + 700;
                    cost5 = rand.nextInt(900) + 700;
                    cost6 = rand.nextInt(900) + 700;
               }
           }
           this.hide();
           new BusResults().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
