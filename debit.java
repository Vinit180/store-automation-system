
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1405180
 */
public class debit extends javax.swing.JFrame {

    /**
     * Creates new form debit
     */
    public debit() {
        
        initComponents();
        showDate();
        getMax();
        
    }
    void showDate()
    {
        Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("dd-MMM-yy");
        datetf.setText(s.format(d));
    }
       public void getMax()
    {
        String strng=null;
       try
        { 
       //  Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","akash","akash1780");
         Statement s =con.createStatement();
        // Statement s1 =con.createStatement();
         //sql="select BILLNO from bill" ;
         
          ResultSet rs=s.executeQuery("select billno from bills order by billno desc ");
          // ResultSet rs1=s.executeQuery("select billno from debit order by billno desc ");
             // System.out.println("asda");
  rs.next();
  //rs1.next();
  //rs.next();
          // String x=r.getString("BILLNO");
             // System.out.println(r.getString(1));
               int b=rs.getInt(1);
               ResultSet rs1=s.executeQuery("select billno from debit order by billno desc ");
               rs1.next();
               int b1=rs1.getInt(1);
               if(b>b1)
                   b=b+1;
               else b=b1+1;
               strng=""+b;
               billtf.setText(strng);
          
       //int b= r.getInt("BILLNO");
     //System.out.println(b);
       //String v=r.toString();
      // billtf.setText(""+r.getInt("BILLNO"));
        // r.close();
        // s.close();
          con.close();
       }
       catch(Exception e)
       {
            System.out.println(e);
           billtf.setText("exe");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        billtf = new javax.swing.JTextField();
        amounttf = new javax.swing.JTextField();
        nametf = new javax.swing.JTextField();
        datetf = new javax.swing.JTextField();
        receivertf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1650, 1080));
        getContentPane().setLayout(null);

        jButton4.setText("HOME");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 100, 230, 30);

        jButton5.setText("CUSTOMER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(310, 100, 220, 30);

        jButton6.setText("LIST");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(570, 100, 210, 30);

        jButton7.setText("LEDGER");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(830, 100, 220, 30);

        jButton8.setText("STOCK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1080, 100, 200, 30);

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setText("BHAI BHAI TRADERS..");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 10, 228, 64);

        jLabel2.setText("BILL NO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 190, 60, 30);

        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(870, 210, 60, 30);

        jLabel4.setText("AMOUNT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 250, 80, 30);

        jLabel5.setText("DATE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(870, 260, 60, 40);

        jLabel6.setText("RECEIVER");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 300, 80, 40);

        billtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billtfActionPerformed(evt);
            }
        });
        getContentPane().add(billtf);
        billtf.setBounds(270, 180, 170, 40);
        getContentPane().add(amounttf);
        amounttf.setBounds(270, 240, 170, 40);
        getContentPane().add(nametf);
        nametf.setBounds(950, 200, 150, 40);
        getContentPane().add(datetf);
        datetf.setBounds(950, 260, 150, 40);
        getContentPane().add(receivertf);
        receivertf.setBounds(270, 300, 170, 40);

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(570, 410, 149, 51);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
this.setVisible(false);
new NewJFrame().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
this.setVisible(false);
new customer().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
this.setVisible(false);
new list().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
this.setVisible(false);
new today().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     this.setVisible(false);
new stock().setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void billtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billtfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String billno,name,date,receiver,amount;
        billno=billtf.getText();
        name=nametf.getText();
        date=datetf.getText();
        receiver=receivertf.getText();
        amount=amounttf.getText();
     int    Bill=Integer.parseInt(billno) ;
     int Amount=Integer.parseInt(amount) ;
                    
        String qury="INSERT INTO debit (billno,name,dates,receiver,amount) VALUES"  + "("+Bill+",'"+name+"','"+date+"','"+receiver+"',"+Amount+")";
                
            try{
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","akash","akash1780");
                Statement stmt =con.createStatement();
                stmt.executeQuery(qury);
                stmt.executeQuery("commit");
            }catch(Exception e){System.out.println(e);}
            getMax();
            nametf.setText("");
            receivertf.setText("");
           amounttf.setText("");
            JOptionPane.showMessageDialog(null, "UPDATED");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new debit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amounttf;
    private javax.swing.JTextField billtf;
    private javax.swing.JTextField datetf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField receivertf;
    // End of variables declaration//GEN-END:variables
}
