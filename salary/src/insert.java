
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.regex.*;
import javax.swing.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class insert extends javax.swing.JFrame {
    Connection con=null;
    String gender;
    
    Statement st=null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    /**
     * Creates new form insert
     */
    public insert() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emp_id = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ph = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        save_bt = new javax.swing.JButton();
        clear_bt = new javax.swing.JButton();
        emp_name = new javax.swing.JTextField();
        basic_salary = new javax.swing.JTextField();
        delete_bt1 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        validation1 = new javax.swing.JLabel();
        val2 = new javax.swing.JLabel();
        vali3 = new javax.swing.JLabel();
        jdc = new com.toedter.calendar.JDateChooser();
        update_bt1 = new javax.swing.JButton();
        em_table = new javax.swing.JButton();
        designation = new javax.swing.JTextField();
        valid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managed-services-banner.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 180));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("EMPLOYEE  NAME :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 180, 40));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("GENDER :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("BASIC  SALARY :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("CITY :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("ADDRESS :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("DESIGNATION :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("HIRE  DATE  :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("EMPLOYEE  ID :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

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
        jPanel1.add(emp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 190, -1));

        city.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        city.setForeground(new java.awt.Color(255, 0, 102));
        city.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 190, -1));

        address.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        address.setForeground(new java.awt.Color(255, 0, 102));
        address.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 190, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Adding  New  Empolyee");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        male.setBackground(new java.awt.Color(102, 255, 255));
        buttonGroup2.add(male);
        male.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        male.setForeground(new java.awt.Color(51, 0, 51));
        male.setText("MALE");
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        female.setBackground(new java.awt.Color(102, 255, 255));
        buttonGroup2.add(female);
        female.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        female.setForeground(new java.awt.Color(51, 0, 51));
        female.setText("FEMALE");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("PHONE :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("EMAIL :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        ph.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        ph.setForeground(new java.awt.Color(255, 0, 102));
        ph.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phActionPerformed(evt);
            }
        });
        ph.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phKeyReleased(evt);
            }
        });
        jPanel1.add(ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 190, -1));

        email.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 0, 102));
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 190, -1));

        save_bt.setBackground(new java.awt.Color(153, 255, 255));
        save_bt.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        save_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save2.gif"))); // NOI18N
        save_bt.setText("Save");
        save_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btActionPerformed(evt);
            }
        });
        jPanel1.add(save_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 440, 200, 70));

        clear_bt.setBackground(new java.awt.Color(153, 255, 255));
        clear_bt.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        clear_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear2.gif"))); // NOI18N
        clear_bt.setText("Clear");
        clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btActionPerformed(evt);
            }
        });
        jPanel1.add(clear_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 410, 140, 70));

        emp_name.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        emp_name.setForeground(new java.awt.Color(255, 0, 102));
        emp_name.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        emp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_nameActionPerformed(evt);
            }
        });
        jPanel1.add(emp_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 190, -1));

        basic_salary.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        basic_salary.setForeground(new java.awt.Color(255, 0, 102));
        basic_salary.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        basic_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basic_salaryActionPerformed(evt);
            }
        });
        basic_salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                basic_salaryKeyPressed(evt);
            }
        });
        jPanel1.add(basic_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 190, -1));

        delete_bt1.setBackground(new java.awt.Color(153, 255, 255));
        delete_bt1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        delete_bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete1.png"))); // NOI18N
        delete_bt1.setText("Delete");
        delete_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(delete_bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, 200, 70));

        search.setBackground(new java.awt.Color(153, 255, 255));
        search.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update10.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, 200, 70));

        validation1.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        validation1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 110, 20));

        val2.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        val2.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(val2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 140, 20));

        vali3.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        vali3.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(vali3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 100, 20));

        jdc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jdc, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 190, 40));

        update_bt1.setBackground(new java.awt.Color(153, 255, 255));
        update_bt1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        update_bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update10.png"))); // NOI18N
        update_bt1.setText("Update");
        update_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(update_bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 240, 200, 70));

        em_table.setBackground(new java.awt.Color(153, 255, 255));
        em_table.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        em_table.setText("Display");
        em_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em_tableActionPerformed(evt);
            }
        });
        jPanel1.add(em_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 70, 200, 60));

        designation.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        designation.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 190, 40));

        valid.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        valid.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(valid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1350, 580));

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

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void phActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void hdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hdateKeyReleased

        
    }//GEN-LAST:event_hdateKeyReleased

    private void clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btActionPerformed
        // TODO add your handling code here:
        emp_id.setText("");
        emp_name.setText("");
        ph.setText("");
        email.setText("");
        city.setText("");
        address.setText("");
        designation.setText("");
        jdc.setCalendar(null);
        basic_salary.setText("");
       

    }//GEN-LAST:event_clear_btActionPerformed

    private void save_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btActionPerformed
        // TODO add your handling code here:
      String empid = emp_id.getText().toString();
       String empname = emp_name.getText().toString();
       if(male.isSelected()){
               gender="Male";
               
           }
           if(female.isSelected()){
               gender="Female";
           }
           
       String phone = ph.getText().toString();
       String Email = email.getText().toString();
       String cityy = city.getText().toString();
       String Address = address.getText().toString();
     //  String Designation =(String) qqqqqq.getSelectedItem();
       String Designation = designation.getText().toString();
     //  String Designation =(String) designation.getSelectedItem();
       SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        String Hire_Date=sdf.format(jdc.getDate());
       
       String Salary = basic_salary.getText().toString();
       //String insert="insert into employee values('"+emp_id+"','"+emp_name+"','"+gender+"','"+ph+"','"+email+"','"+city+"','"+address+"','"+designation+"','"+h_date+"','"+basic_salary+"');"; 
       
       String insert="insert into employee values('"+Integer.parseInt(empid)+"','"+empname+"','"+gender+"','"+phone+"','"+Email+"','"+cityy+"','"+Address+"','"+Designation+"','"+Hire_Date +"','"+Double.valueOf(Salary).doubleValue()+"');"; 
       
       
        try{
            st.execute(insert);
            JOptionPane.showMessageDialog(null,"value inserted successfully");
            emp_id.setText("");
        emp_name.setText("");
        ph.setText("");
        email.setText("");
        city.setText("");
        address.setText("");
        designation.setText("");
        jdc.setCalendar(null);
        basic_salary.setText("");
           
        }
        
         catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
         }  
     
    }//GEN-LAST:event_save_btActionPerformed

    private void emp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_nameActionPerformed

    private void basic_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basic_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basic_salaryActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here
           
        try{
          String sql="select * from employee where emp_id=?";
          PreparedStatement pstmt=con.prepareStatement(sql);
          pstmt.setInt(1,Integer.parseInt(emp_id.getText()));
          ResultSet rs=pstmt.executeQuery();
           
          if(rs.next())
             
          {
              String date=rs.getString("h_date");
              emp_name.setText(rs.getString("emp_name"));
              ph.setText(rs.getString("Phone"));
              email.setText(rs.getString("Email"));
              city.setText(rs.getString("city"));
              address.setText(rs.getString("Address"));
               //qqqqqq.setSelectedItem(rs.getString("designation"));
              designation.setText(rs.getString("designation"));
              basic_salary.setText(rs.getString("basic_salary")); 
             ((JTextField)jdc.getDateEditor().getUiComponent()).setText(date);
             
           
              
          }
          else
          
          {
            JOptionPane.showMessageDialog(null,"Record not found ");  
          }
            
        }
        catch (Exception e){
             JOptionPane.showMessageDialog(null,e);
         }       
        
    }//GEN-LAST:event_searchActionPerformed

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

    private void phKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phKeyPressed
        // TODO add your handling code here:
       // try{
         //   int i=Integer.parseInt(ph.getText());
           // val2.setText(""); 
        //}
        //catch(NumberFormatException e){
          //val2.setText("Invalid number");  
        //}
    }//GEN-LAST:event_phKeyPressed

    private void basic_salaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_basic_salaryKeyPressed
        // TODO add your handling code here:
        try{
            int i=Integer.parseInt(basic_salary.getText());
            vali3.setText(""); 
        }
        catch(NumberFormatException e){
          vali3.setText("Invalid number");  
        }
    }//GEN-LAST:event_basic_salaryKeyPressed

    private void delete_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bt1ActionPerformed
        // TODO add your handling code here:
        String empid=emp_id.getText().toString();
        String del="delete from employee where emp_id='"+empid+"';";
        try{
            st.executeUpdate(del);
            JOptionPane.showMessageDialog(null,"Value Deleted Successfully");
            
            emp_id.setText("");
        emp_name.setText("");
        ph.setText("");
        email.setText("");
        city.setText("");
        address.setText("");
        designation.setText("");
        jdc.setCalendar(null);
        basic_salary.setText("");

        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_delete_bt1ActionPerformed

    private void update_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_bt1ActionPerformed
        // TODO add your handling code here:
        try{
            String sql="update employee set emp_name=?,phone=?,email=?,city=?,address=?,designation=?,h_date=?,basic_salary=? where emp_id=?";
            PreparedStatement pstmt=con.prepareStatement(sql);
          pstmt.setString(1,emp_name.getText());
          pstmt.setString(2,ph.getText());
          pstmt.setString(3,email.getText());
          pstmt.setString(4,city.getText());
          pstmt.setString(5,address.getText());
         // pstmt.setString(6, designation.getSelectedItem();
          
       
          
        pstmt.setString(6,designation.getText());
          SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        String h_date=sdf.format(jdc.getDate());
         pstmt.setString(7,h_date);
        pstmt.setString(8,basic_salary.getText());
          pstmt.setInt(9,Integer.parseInt(emp_id.getText()));
          pstmt.executeUpdate();
          JOptionPane.showMessageDialog(null, "Record Updated Successfully");
          
          emp_id.setText("");
        emp_name.setText("");
        ph.setText("");
        email.setText("");
        city.setText("");
        address.setText("");
        designation.setText("");
        jdc.setCalendar(null);
        basic_salary.setText("");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_update_bt1ActionPerformed

    private void em_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em_tableActionPerformed
        // TODO add your handling code here:
        new emp_table().setVisible(true);
        dispose();
    }//GEN-LAST:event_em_tableActionPerformed

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
         
        String PATTERN="^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(email.getText());
        if(!match.matches()){
            valid.setText("Incorrect Email");
            
        }
        else{
             valid.setText("Valid");
        }
    }//GEN-LAST:event_emailKeyReleased

    private void phKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phKeyReleased
        // TODO add your handling code here:
        Pattern patt=Pattern.compile("^[0-9]{10}$");
        
         Matcher match=patt.matcher(ph.getText());
         if(!match.matches()){
            val2.setText("InValid");
            
        }
        else{
             val2.setText("Valid");
        }
        
    }//GEN-LAST:event_phKeyReleased

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
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert().setVisible(true);
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
    private javax.swing.JTextField address;
    private javax.swing.JTextField basic_salary;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField city;
    private javax.swing.JButton clear_bt;
    private javax.swing.JButton delete_bt1;
    private javax.swing.JTextField designation;
    private javax.swing.JButton em_table;
    private javax.swing.JTextField email;
    private javax.swing.JTextField emp_id;
    private javax.swing.JTextField emp_name;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdc;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField ph;
    private javax.swing.JButton save_bt;
    private javax.swing.JButton search;
    private javax.swing.JButton update_bt1;
    private javax.swing.JLabel val2;
    private javax.swing.JLabel vali3;
    private javax.swing.JLabel valid;
    private javax.swing.JLabel validation1;
    // End of variables declaration//GEN-END:variables
}
