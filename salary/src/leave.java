
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class leave extends javax.swing.JFrame {

  Connection con=null;
    
    Statement st=null;
    public leave() {
        initComponents();
        connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        emp_id = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        l_type = new javax.swing.JComboBox<>();
        save_bt = new javax.swing.JButton();
        f_date = new com.toedter.calendar.JDateChooser();
        t_date = new com.toedter.calendar.JDateChooser();
        delete_bt1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resonn = new javax.swing.JTextArea();
        validation1 = new javax.swing.JLabel();
        update_bt = new javax.swing.JButton();
        se = new javax.swing.JButton();
        lea_tab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managed-services-banner.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1359, 201));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("LEAVE  TYPE :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jLabel14.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("FROM  DATE :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("TO  DATE  :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        jLabel16.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("EMPLOYEE  ID :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel17.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setText("REASON  :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        emp_id.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        emp_id.setForeground(new java.awt.Color(255, 0, 102));
        emp_id.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        emp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_idActionPerformed(evt);
            }
        });
        emp_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emp_idKeyPressed(evt);
            }
        });
        jPanel1.add(emp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 190, -1));

        jLabel20.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 102));
        jLabel20.setText("Leave  Status");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/butter.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 610, 540));

        l_type.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        l_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECT>", "Sick Leave", "Casual Leave", "Annual Leave", "Study Leave", "Other" }));
        l_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_typeActionPerformed(evt);
            }
        });
        jPanel1.add(l_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 190, 40));

        save_bt.setBackground(new java.awt.Color(153, 255, 255));
        save_bt.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        save_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save2.gif"))); // NOI18N
        save_bt.setText("Save");
        save_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btActionPerformed(evt);
            }
        });
        jPanel1.add(save_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 190, 70));

        f_date.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jPanel1.add(f_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 190, 40));

        t_date.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jPanel1.add(t_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 190, 40));

        delete_bt1.setBackground(new java.awt.Color(153, 255, 255));
        delete_bt1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        delete_bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete1.png"))); // NOI18N
        delete_bt1.setText("Delete");
        delete_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(delete_bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 190, 70));

        resonn.setColumns(20);
        resonn.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        resonn.setForeground(new java.awt.Color(204, 0, 51));
        resonn.setRows(5);
        jScrollPane1.setViewportView(resonn);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 190, 120));

        validation1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        validation1.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 160, 20));

        update_bt.setBackground(new java.awt.Color(153, 255, 255));
        update_bt.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        update_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update10.png"))); // NOI18N
        update_bt.setText("Update");
        update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btActionPerformed(evt);
            }
        });
        jPanel1.add(update_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 190, 70));

        se.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        se.setText("Search");
        se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seActionPerformed(evt);
            }
        });
        jPanel1.add(se, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        lea_tab.setBackground(new java.awt.Color(153, 255, 255));
        lea_tab.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lea_tab.setText("Display");
        lea_tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lea_tabActionPerformed(evt);
            }
        });
        jPanel1.add(lea_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 190, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1360, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void emp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_idActionPerformed

    private void l_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l_typeActionPerformed

    private void save_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btActionPerformed
        // TODO add your handling code here:
          String empid = emp_id.getText().toString();
        String leavetype =(String) l_type.getSelectedItem();
        
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        String fromdate=sdf.format(f_date.getDate());
        String todate=sdf.format(t_date.getDate());
        
        String Reason = resonn.getText().toString();
        
        String insert2="insert into abs values('"+Integer.parseInt(empid)+"','"+leavetype+"','"+fromdate+"','"+todate+"','"+Reason+"');";
        try{
            st.execute(insert2);
            JOptionPane.showMessageDialog(null,"value inserted successfully");
            
            emp_id.setText("");
       
        l_type.setSelectedItem(null);
        f_date.setCalendar(null);
        t_date.setCalendar(null);
        resonn.setText("");
        
           
        }
        
         catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
    }//GEN-LAST:event_save_btActionPerformed

    private void delete_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bt1ActionPerformed
        // TODO add your handling code here:
        String empid=emp_id.getText().toString();
        String del="delete from abs where emp_id='"+empid+"';";
        try{
            st.executeUpdate(del);
            JOptionPane.showMessageDialog(null,"Value Deleted Successfully");
            
            emp_id.setText("");
       
        l_type.setSelectedItem(null);
        f_date.setCalendar(null);
        t_date.setCalendar(null);
        resonn.setText("");

        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_delete_bt1ActionPerformed

    private void emp_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emp_idKeyPressed
        // TODO add your handling code here:
        try{
            int i=Integer.parseInt(emp_id.getText());
            validation1.setText(""); 
        }
        catch(NumberFormatException e){
          validation1.setText("Invalid number");  
        }
    }//GEN-LAST:event_emp_idKeyPressed

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed
        // TODO add your handling code here:
        String empid=emp_id.getText();
        String leavetype=(String)l_type.getSelectedItem();
        
         SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
         String fromdate=sdf.format(f_date.getDate());
         String todate=sdf.format(t_date.getDate());
         String Reason=resonn.getText();
        try{
           
            String query="update abs set leave_name='"+leavetype+"',from_date='"+fromdate+"',to_date='"+todate+"',reason='"+Reason+"'  where emp_id='"+Integer.parseInt(empid)+"';";
           
            st.executeUpdate(query);
           JOptionPane.showMessageDialog(null,"successfully updated");
              emp_id.setText(null);
           f_date.setCalendar(null);
           t_date.setCalendar(null);
           resonn.setText(null);
           
           emp_id.setText("");
       
        l_type.setSelectedItem(null);
        f_date.setCalendar(null);
        t_date.setCalendar(null);
        resonn.setText("");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_update_btActionPerformed

    private void seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seActionPerformed
        // TODO add your handling code here:
         try{
          String sql="select * from abs where emp_id=?";
          PreparedStatement pstmt=con.prepareStatement(sql);
          pstmt.setInt(1,Integer.parseInt(emp_id.getText()));
          ResultSet rs=pstmt.executeQuery();
          
          if(rs.next())
          {
              l_type.setSelectedItem(rs.getString("leave_name"));
              String date=rs.getString("from_date");
              ((JTextField)f_date.getDateEditor().getUiComponent()).setText(date);
              String date1=rs.getString("to_date");
              ((JTextField)t_date.getDateEditor().getUiComponent()).setText(date1);
              resonn.setText(rs.getString("reason"));
              
              
              
          }
           
          else
          
          {
            JOptionPane.showMessageDialog(null,"Record not found ");  
          }
            
        }
        catch (Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  
    }//GEN-LAST:event_seActionPerformed

    private void lea_tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lea_tabActionPerformed
        // TODO add your handling code here:
        new leave_table().setVisible(true);
        dispose();
    }//GEN-LAST:event_lea_tabActionPerformed

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
            java.util.logging.Logger.getLogger(leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leave().setVisible(true);
            }
        });
    }
    
     public void connect()
    {
       try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pay","root","root");
                   st=con.createStatement();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_bt1;
    private javax.swing.JTextField emp_id;
    private com.toedter.calendar.JDateChooser f_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> l_type;
    private javax.swing.JButton lea_tab;
    private javax.swing.JTextArea resonn;
    private javax.swing.JButton save_bt;
    private javax.swing.JButton se;
    private com.toedter.calendar.JDateChooser t_date;
    private javax.swing.JButton update_bt;
    private javax.swing.JLabel validation1;
    // End of variables declaration//GEN-END:variables
}
