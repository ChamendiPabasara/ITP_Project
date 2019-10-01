
package interF;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import myCodes.DBconnect;
import net.proteanit.sql.DbUtils;



public class registration_form1 extends javax.swing.JFrame {

    Connection con = null;
    com.mysql.jdbc.PreparedStatement pst1 ;
    com.mysql.jdbc.PreparedStatement pst2 ;
     com.mysql.jdbc.PreparedStatement pst;
    ResultSet rs;
    ResultSet rs1 ;
     ResultSet rs2 ;
    
    public registration_form1() {
        initComponents();
        
        //table 1
          table1.setRowHeight(40);
          table1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
          table1.setOpaque(false);
          table1.getTableHeader().setForeground(Color.BLACK);
          update1.setBackground(Color.BLACK);
          
           //table 2
        table2.setRowHeight(40);
        table2.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
        table2.setOpaque(false);
        table2.getTableHeader().setForeground(Color.BLACK);
        
        
        //table 3
        table3.setRowHeight(40);
        table3.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
        table3.setOpaque(false);
        table3.getTableHeader().setForeground(Color.BLACK);
        
        //table 4
          table4.setRowHeight(40);
          table4.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
          table4.setOpaque(false);
          table4.getTableHeader().setForeground(Color.BLACK);
        
        
        
        //table 5
        table5.setRowHeight(40);
        table5.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
        table5.setOpaque(false);
        table5.getTableHeader().setForeground(Color.BLACK);
        
        //table 6
          table6.setRowHeight(40);
          table6.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
          table6.setOpaque(false);
          table6.getTableHeader().setForeground(Color.BLACK);
         
        
        
        //table 7
        table7.setRowHeight(40);
        table7.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
        table7.setOpaque(false);
        table7.getTableHeader().setForeground(Color.BLACK);
        
        //table 8
          table8.setRowHeight(40);
          table8.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
          table8.setOpaque(false);
          table8.getTableHeader().setForeground(Color.BLACK);
          
           //Connect to DB
        con = DBconnect.connect();
         
        tableLoad1(); //load table
        tableLoad2(); //load table
         tableLoad3(); //load table
//         tableLoad4(); //load table
//         tableLoad5(); //load table
//         tableLoad6(); //load table
//         tableLoad7(); //load table
//         tableLoad8(); //load table
//          
       
    }
    
    
    private void tableLoad1() {
       
         try {
             String sql = "SELECT year1sem1.SID,year1sem1.ENGL11013,year1sem1.ENGL11263,year1sem1.PCEN11323,year1sem1.PCEN12333,results.gpa,results.sem_status FROM year1sem1,results WHERE results.SID=year1sem1.SID";
             
             pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            //pst2 = (PreparedStatement) con.prepareStatement(sql);
             
             rs=pst.executeQuery();
           
              
             
             table1.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             System.out.println(ex.toString());
         }
    }
    
     private void tableLoad2() {
       
         try {
             String sql = "SELECT year1sem2.SID,year1sem2.ENGL12023,year1sem2.ENGL12273,year1sem2.PCEN11323,year1sem2.PCEN12333,results.gpa,results.sem_status FROM year1sem2,results WHERE results.SID=year1sem2.SID";
             
             pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            //pst2 = (PreparedStatement) con.prepareStatement(sql);
             
             rs=pst.executeQuery();
           
              
             
             table2.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             System.out.println(ex.toString());
         }
    }
     
      private void tableLoad3() {
       
         try {
             String sql = "SELECT year2sem1.SID,year2sem1.ENGL21033,year2sem1.ENGL21043,ENGL21053,year2sem1.ENGL21063,year2sem1.ENGL21293,year2sem1.PCEN12333,year2sem1.PCEN11323,results.gpa,results.sem_status FROM year2sem1,results WHERE results.SID=year2sem1.SID";
             
             pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            //pst2 = (PreparedStatement) con.prepareStatement(sql);
             
             rs=pst.executeQuery();
           
              
             
             table3.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             System.out.println(ex.toString());
         }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        SIDbox1 = new javax.swing.JTextField();
        s1 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        s4 = new javax.swing.JTextField();
        s3 = new javax.swing.JTextField();
        update1 = new javax.swing.JButton();
        search1 = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        gpa4 = new javax.swing.JLabel();
        st1 = new javax.swing.JTextField();
        gpa1 = new javax.swing.JTextField();
        delete1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        SIDbox2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        s5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        s6 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        s7 = new javax.swing.JTextField();
        gpa2 = new javax.swing.JLabel();
        s8 = new javax.swing.JTextField();
        update2 = new javax.swing.JButton();
        search2 = new javax.swing.JButton();
        delete2 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        st2 = new javax.swing.JLabel();
        gpa3 = new javax.swing.JLabel();
        clear2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        SIDbox3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        s9 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        s10 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        s11 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        s12 = new javax.swing.JTextField();
        search3 = new javax.swing.JButton();
        delete3 = new javax.swing.JButton();
        update3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        SIDbox4 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        s13 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        s14 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        s15 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        s16 = new javax.swing.JTextField();
        search4 = new javax.swing.JButton();
        update4 = new javax.swing.JButton();
        delete4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table8 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        SIDbox5 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        s17 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        s18 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        s19 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        s20 = new javax.swing.JTextField();
        delete5 = new javax.swing.JButton();
        update5 = new javax.swing.JButton();
        search5 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table5 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        SIDbox25 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        s21 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        s22 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        s23 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        s24 = new javax.swing.JTextField();
        update6 = new javax.swing.JButton();
        delete6 = new javax.swing.JButton();
        search6 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        table6 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        SIDbox30 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        s25 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        s26 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        s27 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        s28 = new javax.swing.JTextField();
        search7 = new javax.swing.JButton();
        delete7 = new javax.swing.JButton();
        update7 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        table7 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        SIDbox35 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        s29 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        s30 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        s31 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        s32 = new javax.swing.JTextField();
        search8 = new javax.swing.JButton();
        delete8 = new javax.swing.JButton();
        update8 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Year 1 Semester 1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Year 1 Semester 2");

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(76, 74, 77));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 0));
        jLabel15.setText("Student Reg No:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jLabel16.setText("ENGL11263");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 0));
        jLabel17.setText("PCEN11323");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 0));
        jLabel18.setText("PCEN12333");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 0));
        jLabel19.setText("ENGL11013");

        SIDbox1.setBackground(new java.awt.Color(76, 74, 77));
        SIDbox1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SIDbox1.setForeground(new java.awt.Color(255, 153, 0));
        SIDbox1.setCaretColor(new java.awt.Color(51, 51, 51));
        SIDbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDbox1ActionPerformed(evt);
            }
        });

        s1.setBackground(new java.awt.Color(76, 74, 77));
        s1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 153, 0));
        s1.setCaretColor(new java.awt.Color(51, 51, 51));
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        s2.setBackground(new java.awt.Color(76, 74, 77));
        s2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 153, 0));
        s2.setCaretColor(new java.awt.Color(51, 51, 51));
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        s4.setBackground(new java.awt.Color(76, 74, 77));
        s4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 153, 0));
        s4.setCaretColor(new java.awt.Color(51, 51, 51));
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });

        s3.setBackground(new java.awt.Color(76, 74, 77));
        s3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s3.setForeground(new java.awt.Color(255, 153, 0));
        s3.setCaretColor(new java.awt.Color(51, 51, 51));
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });

        update1.setBackground(new java.awt.Color(0, 0, 0));
        update1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update1.setText("Update");
        update1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        search1.setBackground(new java.awt.Color(0, 0, 0));
        search1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search1.setText("Search");
        search1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        clear1.setBackground(new java.awt.Color(0, 0, 0));
        clear1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-erase-50.png"))); // NOI18N
        clear1.setText("Clear");
        clear1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clear1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        gpa4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gpa4.setForeground(new java.awt.Color(255, 153, 0));
        gpa4.setText("GPA");

        st1.setBackground(new java.awt.Color(76, 74, 77));
        st1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        st1.setForeground(new java.awt.Color(255, 153, 0));
        st1.setCaretColor(new java.awt.Color(51, 51, 51));
        st1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st1ActionPerformed(evt);
            }
        });

        gpa1.setBackground(new java.awt.Color(76, 74, 77));
        gpa1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gpa1.setForeground(new java.awt.Color(255, 153, 0));
        gpa1.setCaretColor(new java.awt.Color(51, 51, 51));
        gpa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa1ActionPerformed(evt);
            }
        });

        delete1.setBackground(new java.awt.Color(0, 0, 0));
        delete1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete1.setText("Delete");
        delete1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SIDbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(gpa4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(st1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(167, 167, 167)
                    .addComponent(gpa1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(479, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(SIDbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(9, 9, 9))
                            .addComponent(s2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(st1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gpa4)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(339, Short.MAX_VALUE)
                    .addComponent(gpa1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)))
        );

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        table1.setAutoCreateRowSorter(true);
        table1.setBackground(new java.awt.Color(51, 51, 51));
        table1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        table1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SID", "ENGL11013", "ENGL11263", "PCEN11323", "PCEN12333"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setAlignmentX(1.0F);
        table1.setAlignmentY(1.0F);
        table1.setGridColor(new java.awt.Color(255, 153, 0));
        table1.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        table1.setShowVerticalLines(false);
        table1.getTableHeader().setReorderingAllowed(false);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table1);

        table3.setAutoCreateRowSorter(true);
        table3.setBackground(new java.awt.Color(51, 51, 51));
        table3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        table3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        table3.setForeground(new java.awt.Color(255, 255, 255));
        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SID", "ENGL11013", "ENGL11263", "PCEN11323", "PCEN12333"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table3.setAlignmentX(1.0F);
        table3.setAlignmentY(1.0F);
        table3.setGridColor(new java.awt.Color(255, 153, 0));
        table3.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table3.setSelectionForeground(new java.awt.Color(51, 51, 51));
        table3.setShowVerticalLines(false);
        table3.getTableHeader().setReorderingAllowed(false);
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table3);

        jPanel7.setBackground(new java.awt.Color(76, 74, 77));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 0));
        jLabel20.setText("Student Reg No:");

        SIDbox2.setBackground(new java.awt.Color(76, 74, 77));
        SIDbox2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SIDbox2.setForeground(new java.awt.Color(255, 153, 0));
        SIDbox2.setCaretColor(new java.awt.Color(51, 51, 51));
        SIDbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDbox2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 153, 0));
        jLabel21.setText("ENGL 12023(C)");

        s5.setBackground(new java.awt.Color(76, 74, 77));
        s5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s5.setForeground(new java.awt.Color(255, 153, 0));
        s5.setCaretColor(new java.awt.Color(51, 51, 51));
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 153, 0));
        jLabel22.setText("ENGL 12273(E)");

        s6.setBackground(new java.awt.Color(76, 74, 77));
        s6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s6.setForeground(new java.awt.Color(255, 153, 0));
        s6.setCaretColor(new java.awt.Color(51, 51, 51));
        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 153, 0));
        jLabel23.setText("PCEN11323");

        s7.setBackground(new java.awt.Color(76, 74, 77));
        s7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s7.setForeground(new java.awt.Color(255, 153, 0));
        s7.setCaretColor(new java.awt.Color(51, 51, 51));
        s7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s7ActionPerformed(evt);
            }
        });

        gpa2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gpa2.setForeground(new java.awt.Color(255, 153, 0));

        s8.setBackground(new java.awt.Color(76, 74, 77));
        s8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s8.setForeground(new java.awt.Color(255, 153, 0));
        s8.setCaretColor(new java.awt.Color(51, 51, 51));
        s8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s8ActionPerformed(evt);
            }
        });

        update2.setBackground(new java.awt.Color(0, 0, 0));
        update2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update2.setText("Update");
        update2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });

        search2.setBackground(new java.awt.Color(0, 0, 0));
        search2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search2.setText("Search");
        search2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });

        delete2.setBackground(new java.awt.Color(0, 0, 0));
        delete2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete2.setText("Delete");
        delete2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete2ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 153, 0));
        jLabel55.setText("PCEN12333");

        st2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        st2.setForeground(new java.awt.Color(255, 153, 0));

        gpa3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gpa3.setForeground(new java.awt.Color(255, 153, 0));
        gpa3.setText("GPA");

        clear2.setBackground(new java.awt.Color(0, 0, 0));
        clear2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-erase-50.png"))); // NOI18N
        clear2.setText("Clear");
        clear2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clear2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(52, 52, 52)
                                .addComponent(SIDbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(gpa3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(gpa2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(SIDbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel55)
                                    .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gpa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(st2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gpa3)))
                        .addGap(23, 23, 23))))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Year 2 Semester 1");

        table2.setAutoCreateRowSorter(true);
        table2.setBackground(new java.awt.Color(51, 51, 51));
        table2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        table2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        table2.setForeground(new java.awt.Color(255, 255, 255));
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "SID", "ENGL12023    ", "ENGL12273  ", "PCEN11323", "PCEN12333", "GPA", "Semester Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setAlignmentX(1.0F);
        table2.setAlignmentY(1.0F);
        table2.setGridColor(new java.awt.Color(255, 153, 0));
        table2.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table2.setSelectionForeground(new java.awt.Color(51, 51, 51));
        table2.setShowVerticalLines(false);
        table2.getTableHeader().setReorderingAllowed(false);
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table2);

        jPanel8.setBackground(new java.awt.Color(76, 74, 77));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 153, 0));
        jLabel25.setText("Student Reg No:");

        SIDbox3.setBackground(new java.awt.Color(76, 74, 77));
        SIDbox3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SIDbox3.setForeground(new java.awt.Color(255, 153, 0));
        SIDbox3.setCaretColor(new java.awt.Color(51, 51, 51));
        SIDbox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDbox3ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 153, 0));
        jLabel26.setText("ENGL 12023(C)");

        s9.setBackground(new java.awt.Color(76, 74, 77));
        s9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s9.setForeground(new java.awt.Color(255, 153, 0));
        s9.setCaretColor(new java.awt.Color(51, 51, 51));
        s9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s9ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 153, 0));
        jLabel27.setText("ENGL 12273(E)");

        s10.setBackground(new java.awt.Color(76, 74, 77));
        s10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s10.setForeground(new java.awt.Color(255, 153, 0));
        s10.setCaretColor(new java.awt.Color(51, 51, 51));
        s10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s10ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 153, 0));
        jLabel28.setText("PCEN11323");

        s11.setBackground(new java.awt.Color(76, 74, 77));
        s11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s11.setForeground(new java.awt.Color(255, 153, 0));
        s11.setCaretColor(new java.awt.Color(51, 51, 51));
        s11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s11ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 153, 0));
        jLabel29.setText("PCEN12333");

        s12.setBackground(new java.awt.Color(76, 74, 77));
        s12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s12.setForeground(new java.awt.Color(255, 153, 0));
        s12.setCaretColor(new java.awt.Color(51, 51, 51));
        s12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s12ActionPerformed(evt);
            }
        });

        search3.setBackground(new java.awt.Color(0, 0, 0));
        search3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search3.setText("Search");
        search3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        delete3.setBackground(new java.awt.Color(0, 0, 0));
        delete3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete3.setText("Delete");
        delete3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        update3.setBackground(new java.awt.Color(0, 0, 0));
        update3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update3.setText("Update");
        update3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s12, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(52, 52, 52)
                        .addComponent(SIDbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(search3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(SIDbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel26))
                            .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(search3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(update3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(s12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Year 2 Semester 2");

        table4.setAutoCreateRowSorter(true);
        table4.setBackground(new java.awt.Color(51, 51, 51));
        table4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        table4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        table4.setForeground(new java.awt.Color(255, 255, 255));
        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SID", "ENGL11013", "ENGL11263", "PCEN11323", "PCEN12333"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table4.setAlignmentX(1.0F);
        table4.setAlignmentY(1.0F);
        table4.setGridColor(new java.awt.Color(255, 153, 0));
        table4.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table4.setSelectionForeground(new java.awt.Color(51, 51, 51));
        table4.setShowVerticalLines(false);
        table4.getTableHeader().setReorderingAllowed(false);
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table4MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table4);

        jPanel9.setBackground(new java.awt.Color(76, 74, 77));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 153, 0));
        jLabel30.setText("Student Reg No:");

        SIDbox4.setBackground(new java.awt.Color(76, 74, 77));
        SIDbox4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SIDbox4.setForeground(new java.awt.Color(255, 153, 0));
        SIDbox4.setCaretColor(new java.awt.Color(51, 51, 51));
        SIDbox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDbox4ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 153, 0));
        jLabel31.setText("ENGL 12023(C)");

        s13.setBackground(new java.awt.Color(76, 74, 77));
        s13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s13.setForeground(new java.awt.Color(255, 153, 0));
        s13.setCaretColor(new java.awt.Color(51, 51, 51));
        s13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s13ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 153, 0));
        jLabel32.setText("ENGL 12273(E)");

        s14.setBackground(new java.awt.Color(76, 74, 77));
        s14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s14.setForeground(new java.awt.Color(255, 153, 0));
        s14.setCaretColor(new java.awt.Color(51, 51, 51));
        s14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s14ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 153, 0));
        jLabel33.setText("PCEN11323");

        s15.setBackground(new java.awt.Color(76, 74, 77));
        s15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s15.setForeground(new java.awt.Color(255, 153, 0));
        s15.setCaretColor(new java.awt.Color(51, 51, 51));
        s15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s15ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 153, 0));
        jLabel34.setText("PCEN12333");

        s16.setBackground(new java.awt.Color(76, 74, 77));
        s16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s16.setForeground(new java.awt.Color(255, 153, 0));
        s16.setCaretColor(new java.awt.Color(51, 51, 51));
        s16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s16ActionPerformed(evt);
            }
        });

        search4.setBackground(new java.awt.Color(0, 0, 0));
        search4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search4.setText("Search");
        search4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        update4.setBackground(new java.awt.Color(0, 0, 0));
        update4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update4.setText("Update");
        update4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        delete4.setBackground(new java.awt.Color(0, 0, 0));
        delete4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete4.setText("Delete");
        delete4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s13, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s14, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s16, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s15, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(52, 52, 52)
                        .addComponent(SIDbox4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(SIDbox4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel31))
                            .addComponent(s13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(s14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(s15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(delete4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(s16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(search4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(update4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Year 4 Semester 2");

        table8.setAutoCreateRowSorter(true);
        table8.setBackground(new java.awt.Color(51, 51, 51));
        table8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        table8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        table8.setForeground(new java.awt.Color(255, 255, 255));
        table8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SID", "ENGL11013", "ENGL11263", "PCEN11323", "PCEN12333"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table8.setAlignmentX(1.0F);
        table8.setAlignmentY(1.0F);
        table8.setGridColor(new java.awt.Color(255, 153, 0));
        table8.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table8.setSelectionForeground(new java.awt.Color(51, 51, 51));
        table8.setShowVerticalLines(false);
        table8.getTableHeader().setReorderingAllowed(false);
        table8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table8MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(table8);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 153, 0));
        jPanel11.setPreferredSize(new java.awt.Dimension(1807, 5));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1819, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(76, 74, 77));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 153, 0));
        jLabel35.setText("Student Reg No:");

        SIDbox5.setBackground(new java.awt.Color(76, 74, 77));
        SIDbox5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SIDbox5.setForeground(new java.awt.Color(255, 153, 0));
        SIDbox5.setCaretColor(new java.awt.Color(51, 51, 51));
        SIDbox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDbox5ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 153, 0));
        jLabel36.setText("ENGL 12023(C)");

        s17.setBackground(new java.awt.Color(76, 74, 77));
        s17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s17.setForeground(new java.awt.Color(255, 153, 0));
        s17.setCaretColor(new java.awt.Color(51, 51, 51));
        s17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s17ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 153, 0));
        jLabel37.setText("ENGL 12273(E)");

        s18.setBackground(new java.awt.Color(76, 74, 77));
        s18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s18.setForeground(new java.awt.Color(255, 153, 0));
        s18.setCaretColor(new java.awt.Color(51, 51, 51));
        s18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s18ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 153, 0));
        jLabel38.setText("PCEN11323");

        s19.setBackground(new java.awt.Color(76, 74, 77));
        s19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s19.setForeground(new java.awt.Color(255, 153, 0));
        s19.setCaretColor(new java.awt.Color(51, 51, 51));
        s19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s19ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 153, 0));
        jLabel39.setText("PCEN12333");

        s20.setBackground(new java.awt.Color(76, 74, 77));
        s20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s20.setForeground(new java.awt.Color(255, 153, 0));
        s20.setCaretColor(new java.awt.Color(51, 51, 51));
        s20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s20ActionPerformed(evt);
            }
        });

        delete5.setBackground(new java.awt.Color(0, 0, 0));
        delete5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete5.setText("Delete");
        delete5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        update5.setBackground(new java.awt.Color(0, 0, 0));
        update5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update5.setText("Update");
        update5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        search5.setBackground(new java.awt.Color(0, 0, 0));
        search5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search5.setText("Search");
        search5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s17, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s18, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s20, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s19, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(52, 52, 52)
                        .addComponent(SIDbox5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(SIDbox5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel36))
                            .addComponent(s17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(s18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(search5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(s19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(s20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(delete5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1924, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Year 3 Semester 1");

        table5.setAutoCreateRowSorter(true);
        table5.setBackground(new java.awt.Color(51, 51, 51));
        table5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        table5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        table5.setForeground(new java.awt.Color(255, 255, 255));
        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SID", "ENGL11013", "ENGL11263", "PCEN11323", "PCEN12333"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table5.setAlignmentX(1.0F);
        table5.setAlignmentY(1.0F);
        table5.setGridColor(new java.awt.Color(255, 153, 0));
        table5.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table5.setSelectionForeground(new java.awt.Color(51, 51, 51));
        table5.setShowVerticalLines(false);
        table5.getTableHeader().setReorderingAllowed(false);
        table5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table5MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(table5);

        jPanel14.setBackground(new java.awt.Color(76, 74, 77));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 153, 0));
        jLabel40.setText("Student Reg No:");

        SIDbox25.setBackground(new java.awt.Color(76, 74, 77));
        SIDbox25.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SIDbox25.setForeground(new java.awt.Color(255, 153, 0));
        SIDbox25.setCaretColor(new java.awt.Color(51, 51, 51));
        SIDbox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDbox25ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 153, 0));
        jLabel41.setText("ENGL 12023(C)");

        s21.setBackground(new java.awt.Color(76, 74, 77));
        s21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s21.setForeground(new java.awt.Color(255, 153, 0));
        s21.setCaretColor(new java.awt.Color(51, 51, 51));
        s21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s21ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 153, 0));
        jLabel42.setText("ENGL 12273(E)");

        s22.setBackground(new java.awt.Color(76, 74, 77));
        s22.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s22.setForeground(new java.awt.Color(255, 153, 0));
        s22.setCaretColor(new java.awt.Color(51, 51, 51));
        s22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s22ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 153, 0));
        jLabel43.setText("PCEN11323");

        s23.setBackground(new java.awt.Color(76, 74, 77));
        s23.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s23.setForeground(new java.awt.Color(255, 153, 0));
        s23.setCaretColor(new java.awt.Color(51, 51, 51));
        s23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s23ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 153, 0));
        jLabel44.setText("PCEN12333");

        s24.setBackground(new java.awt.Color(76, 74, 77));
        s24.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s24.setForeground(new java.awt.Color(255, 153, 0));
        s24.setCaretColor(new java.awt.Color(51, 51, 51));
        s24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s24ActionPerformed(evt);
            }
        });

        update6.setBackground(new java.awt.Color(0, 0, 0));
        update6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update6.setText("Update");
        update6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        delete6.setBackground(new java.awt.Color(0, 0, 0));
        delete6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete6.setText("Delete");
        delete6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        search6.setBackground(new java.awt.Color(0, 0, 0));
        search6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search6.setText("Search");
        search6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s21, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s22, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s24, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s23, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(52, 52, 52)
                        .addComponent(SIDbox25, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(SIDbox25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel41))
                            .addComponent(s21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(s22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(s23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(s24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(search6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(update6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(delete6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1816, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Year 3 Semester 2");

        jPanel16.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        table6.setAutoCreateRowSorter(true);
        table6.setBackground(new java.awt.Color(51, 51, 51));
        table6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        table6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        table6.setForeground(new java.awt.Color(255, 255, 255));
        table6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SID", "ENGL11013", "ENGL11263", "PCEN11323", "PCEN12333"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table6.setAlignmentX(1.0F);
        table6.setAlignmentY(1.0F);
        table6.setGridColor(new java.awt.Color(255, 153, 0));
        table6.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table6.setSelectionForeground(new java.awt.Color(51, 51, 51));
        table6.setShowVerticalLines(false);
        table6.getTableHeader().setReorderingAllowed(false);
        table6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table6MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(table6);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Year 4 Semester 1");

        jPanel17.setBackground(new java.awt.Color(76, 74, 77));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 153, 0));
        jLabel45.setText("Student Reg No:");

        SIDbox30.setBackground(new java.awt.Color(76, 74, 77));
        SIDbox30.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SIDbox30.setForeground(new java.awt.Color(255, 153, 0));
        SIDbox30.setCaretColor(new java.awt.Color(51, 51, 51));
        SIDbox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDbox30ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 153, 0));
        jLabel46.setText("ENGL 12023(C)");

        s25.setBackground(new java.awt.Color(76, 74, 77));
        s25.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s25.setForeground(new java.awt.Color(255, 153, 0));
        s25.setCaretColor(new java.awt.Color(51, 51, 51));
        s25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s25ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 153, 0));
        jLabel47.setText("ENGL 12273(E)");

        s26.setBackground(new java.awt.Color(76, 74, 77));
        s26.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s26.setForeground(new java.awt.Color(255, 153, 0));
        s26.setCaretColor(new java.awt.Color(51, 51, 51));
        s26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s26ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 153, 0));
        jLabel48.setText("PCEN11323");

        s27.setBackground(new java.awt.Color(76, 74, 77));
        s27.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s27.setForeground(new java.awt.Color(255, 153, 0));
        s27.setCaretColor(new java.awt.Color(51, 51, 51));
        s27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s27ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 153, 0));
        jLabel49.setText("PCEN12333");

        s28.setBackground(new java.awt.Color(76, 74, 77));
        s28.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s28.setForeground(new java.awt.Color(255, 153, 0));
        s28.setCaretColor(new java.awt.Color(51, 51, 51));
        s28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s28ActionPerformed(evt);
            }
        });

        search7.setBackground(new java.awt.Color(0, 0, 0));
        search7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search7.setText("Search");
        search7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        delete7.setBackground(new java.awt.Color(0, 0, 0));
        delete7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete7.setText("Delete");
        delete7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        update7.setBackground(new java.awt.Color(0, 0, 0));
        update7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update7.setText("Update");
        update7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        update7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s25, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s26, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s28, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s27, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(52, 52, 52)
                        .addComponent(SIDbox30, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(delete7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(SIDbox30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel46))
                            .addComponent(s25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(search7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(s26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(update7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(s27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(s28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(delete7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        table7.setAutoCreateRowSorter(true);
        table7.setBackground(new java.awt.Color(51, 51, 51));
        table7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        table7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        table7.setForeground(new java.awt.Color(255, 255, 255));
        table7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SID", "ENGL11013", "ENGL11263", "PCEN11323", "PCEN12333"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table7.setAlignmentX(1.0F);
        table7.setAlignmentY(1.0F);
        table7.setGridColor(new java.awt.Color(255, 153, 0));
        table7.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table7.setSelectionForeground(new java.awt.Color(51, 51, 51));
        table7.setShowVerticalLines(false);
        table7.getTableHeader().setReorderingAllowed(false);
        table7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table7MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(table7);

        jPanel18.setBackground(new java.awt.Color(76, 74, 77));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 153, 0));
        jLabel50.setText("Student Reg No:");

        SIDbox35.setBackground(new java.awt.Color(76, 74, 77));
        SIDbox35.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SIDbox35.setForeground(new java.awt.Color(255, 153, 0));
        SIDbox35.setCaretColor(new java.awt.Color(51, 51, 51));
        SIDbox35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDbox35ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 153, 0));
        jLabel51.setText("ENGL 12023(C)");

        s29.setBackground(new java.awt.Color(76, 74, 77));
        s29.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s29.setForeground(new java.awt.Color(255, 153, 0));
        s29.setCaretColor(new java.awt.Color(51, 51, 51));
        s29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s29ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 153, 0));
        jLabel52.setText("ENGL 12273(E)");

        s30.setBackground(new java.awt.Color(76, 74, 77));
        s30.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s30.setForeground(new java.awt.Color(255, 153, 0));
        s30.setCaretColor(new java.awt.Color(51, 51, 51));
        s30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s30ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 153, 0));
        jLabel53.setText("PCEN11323");

        s31.setBackground(new java.awt.Color(76, 74, 77));
        s31.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s31.setForeground(new java.awt.Color(255, 153, 0));
        s31.setCaretColor(new java.awt.Color(51, 51, 51));
        s31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s31ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 153, 0));
        jLabel54.setText("PCEN12333");

        s32.setBackground(new java.awt.Color(76, 74, 77));
        s32.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s32.setForeground(new java.awt.Color(255, 153, 0));
        s32.setCaretColor(new java.awt.Color(51, 51, 51));
        s32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s32ActionPerformed(evt);
            }
        });

        search8.setBackground(new java.awt.Color(0, 0, 0));
        search8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search8.setText("Search");
        search8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        delete8.setBackground(new java.awt.Color(0, 0, 0));
        delete8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete8.setText("Delete");
        delete8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        update8.setBackground(new java.awt.Color(0, 0, 0));
        update8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update8.setText("Update");
        update8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s29, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s30, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s32, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s31, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(52, 52, 52)
                        .addComponent(SIDbox35, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(SIDbox35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel51))
                            .addComponent(s29, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(s30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(search8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(update8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(s31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(s32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(delete8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1810, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1943, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1931, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1819, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Buddhist and Pali University of Sri Lanka");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Update Grades");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(789, 789, 789)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(853, 853, 853)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1809, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1909, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 4376, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked

        int r = table3.getSelectedRow();

        String sid = table3.getValueAt(r,0).toString();
        String subj1 = table3.getValueAt(r,1).toString();
        String subj2 = table3.getValueAt(r,2).toString();
        String subj3 = table3.getValueAt(r,3).toString();
        String subj4 = table3.getValueAt(r,4).toString();

//        SIDbox.setText(sid);
//        sub1.setSelectedItem(subj1);
//        sub2.setSelectedItem(subj2);
//        sub3.setSelectedItem(subj3);
//        sub4.setSelectedItem(subj4);
    }//GEN-LAST:event_table3MouseClicked

    private void SIDbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox1ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s4ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       
      int r = table1.getSelectedRow();
     
     String sid = table1.getValueAt(r,0).toString();
     String subj1 = table1.getValueAt(r,1).toString();
     String subj2 = table1.getValueAt(r,2).toString();
     String subj3 = table1.getValueAt(r,3).toString();
     String subj4 = table1.getValueAt(r,4).toString();
     String gp = table1.getValueAt(r,5).toString();
     String status = table1.getValueAt(r,6).toString();
     
     
     SIDbox1.setText(sid);
     s1.setText(subj1);
     s2.setText(subj2);
     s3.setText(subj3);
     s4.setText(subj4);
     gpa1.setText(gp);
     st1.setText(status);
        
        
    }//GEN-LAST:event_table1MouseClicked

    private void SIDbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox2ActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s5ActionPerformed

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s6ActionPerformed

    private void s7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s7ActionPerformed

    private void s8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s8ActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
       
       int r = table2.getSelectedRow();
     
     String sid = table2.getValueAt(r,0).toString();
     String subj1 = table2.getValueAt(r,1).toString();
     String subj2 = table2.getValueAt(r,2).toString();
     String subj3 = table2.getValueAt(r,3).toString();
     String subj4 = table2.getValueAt(r,4).toString();
     String gp = table2.getValueAt(r,5).toString();
     String status = table2.getValueAt(r,6).toString();
     
     
     SIDbox2.setText(sid);
     s5.setText(subj1);
     s6.setText(subj2);
     s7.setText(subj3);
     s8.setText(subj4);
     gpa2.setText(gp);
     st2.setText(status); 
        
        
    }//GEN-LAST:event_table2MouseClicked

    private void SIDbox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox3ActionPerformed

    private void s9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s9ActionPerformed

    private void s10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s10ActionPerformed

    private void s11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s11ActionPerformed

    private void s12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s12ActionPerformed

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table4MouseClicked

    private void SIDbox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox4ActionPerformed

    private void s13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s13ActionPerformed

    private void s14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s14ActionPerformed

    private void s15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s15ActionPerformed

    private void s16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s16ActionPerformed

    private void table8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table8MouseClicked

    private void SIDbox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox5ActionPerformed

    private void s17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s17ActionPerformed

    private void s18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s18ActionPerformed

    private void s19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s19ActionPerformed

    private void s20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s20ActionPerformed

    private void table5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table5MouseClicked

    private void SIDbox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox25ActionPerformed

    private void s21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s21ActionPerformed

    private void s22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s22ActionPerformed

    private void s23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s23ActionPerformed

    private void s24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s24ActionPerformed

    private void table6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table6MouseClicked

    private void SIDbox30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox30ActionPerformed

    private void s25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s25ActionPerformed

    private void s26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s26ActionPerformed

    private void s27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s27ActionPerformed

    private void s28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s28ActionPerformed

    private void table7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table7MouseClicked

    private void SIDbox35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox35ActionPerformed

    private void s29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s29ActionPerformed

    private void s30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s30ActionPerformed

    private void s31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s31ActionPerformed

    private void s32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s32ActionPerformed

    private void update7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update7ActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
    
        
        SIDbox1.setText("");
     s1.setText("");
     s2.setText("");
     s3.setText("");
     s4.setText("");
     gpa1.setText("");
     st1.setText("");
        
        tableLoad1();
        
    }//GEN-LAST:event_clear1ActionPerformed

    private void st1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st1ActionPerformed

    private void gpa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa1ActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
      String sid = SIDbox1.getText();
        String sql = "SELECT year1sem1.SID,year1sem1.ENGL11013,year1sem1.ENGL11263,year1sem1.PCEN11323,year1sem1.PCEN12333,results.gpa,results.sem_status FROM year1sem1,results WHERE results.SID=year1sem1.SID AND  year1sem1.SID Like '%"+sid+"%'";
        
        try {
              
             pst = (PreparedStatement) con.prepareStatement(sql);
             rs = pst.executeQuery();
             
              table1.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             Logger.getLogger(Searchvalue.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_search1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
      
        int x = JOptionPane.showConfirmDialog(null, "Do you Really want to UPDATE ?");
       
       if(x == 0)
       {
          String sid = SIDbox1.getText();
           String sub1 = s1.getText();
           String sub2 = s2.getText();
           String sub3 = s3.getText();
           String sub4 = s4.getText();
         
           String gp = gpa1.getText();
           String ss =st1.getText();
           
          
           try{
               
                String sql = "UPDATE year1sem1 SET ENGL11013 ='"+sub1+"',ENGL11263 ='"+sub2+"',PCEN11323 ='"+sub3+"',PCEN12333 ='"+sub4+"' WHERE SID = '"+sid+"'";
                String sq = "UPDATE results SET gpa ='"+gp+"',sem_status ='"+ss+"' WHERE SID = '"+sid+"'";
           
              
                
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               pst2.execute();
               tableLoad1(); //load table
                //JOptionPane.showMessageDialog(null, "Data UPDATED successfully in both tables..!");
           
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       }
        
        
    }//GEN-LAST:event_update1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
      
       int x = JOptionPane.showConfirmDialog(null, "Do You really want to DELETE this...?");
        
        if(x == 0)
        {
           String sid = SIDbox1.getText();
           String sub1 = s1.getText();
           String sub2 = s2.getText();
           String sub3 = s3.getText();
           String sub4 = s4.getText();
         
           String gp = gpa1.getText();
           String ss =st1.getText();
           
           
       try{
               
                String sql = "DELETE from year1sem1 WHERE SID = '"+sid+"'";
                String sq = "DELETE from UPDATE results  WHERE SID = '"+sid+"'";
           
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               tableLoad1();
               pst2.execute();
               tableLoad1(); //load table
              // JOptionPane.showMessageDialog(null, "Data REMOVED successfully in both tables..!");
              
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       }  
        
        
    }//GEN-LAST:event_delete1ActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        // TODO add your handling code here:
        
               SIDbox2.setText("");
     s5.setText("");
     s6.setText("");
     s7.setText("");
     s8.setText("");
     gpa2.setText("");
     st2.setText("");
        
        tableLoad2();
    }//GEN-LAST:event_clear2ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
       
        int x = JOptionPane.showConfirmDialog(null, "Do you Really want to UPDATE ?");
       
       if(x == 0)
       {
          String sid = SIDbox2.getText();
           String sub1 = s5.getText();
           String sub2 = s6.getText();
           String sub3 = s7.getText();
           String sub4 = s8.getText();
         
           String gp = gpa2.getText();
           String ss =st2.getText();
           
          
           try{
               
                String sql = "UPDATE year1sem2 SET ENGL12023  ='"+sub1+"',ENGL12273  ='"+sub2+"',PCEN11323 ='"+sub3+"',PCEN12333 ='"+sub4+"' WHERE SID = '"+sid+"'";
                String sq = "UPDATE results SET gpa ='"+gp+"',sem_status ='"+ss+"' WHERE SID = '"+sid+"'";
           
              
                
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               pst2.execute();
               tableLoad2(); //load table
                //JOptionPane.showMessageDialog(null, "Data UPDATED successfully in both tables..!");
           
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       } 
        
        
    }//GEN-LAST:event_update2ActionPerformed

    private void delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete2ActionPerformed
      
        int x = JOptionPane.showConfirmDialog(null, "Do You really want to DELETE this...?");
        
        if(x == 0)
        {
            String sid = SIDbox2.getText();
           String sub1 = s5.getText();
           String sub2 = s6.getText();
           String sub3 = s7.getText();
           String sub4 = s8.getText();
         
           String gp = gpa2.getText();
           String ss =st2.getText();
           
       try{
               
                String sql = "DELETE from year1sem2 WHERE SID = '"+sid+"'";
                String sq = "DELETE from UPDATE results  WHERE SID = '"+sid+"'";
           
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               tableLoad2();
               pst2.execute();
               tableLoad2(); //load table
              // JOptionPane.showMessageDialog(null, "Data REMOVED successfully in both tables..!");
              
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       }  
        
    }//GEN-LAST:event_delete2ActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
      
         String sid = SIDbox2.getText();
       String sql = "SELECT year1sem2.SID,year1sem2.ENGL12023,year1sem2.ENGL12273,year1sem2.PCEN11323,year1sem2.PCEN12333,results.gpa,results.sem_status FROM year1sem2,results WHERE results.SID=year1sem2.SID AND  year1sem2.SID Like '%"+sid+"%'";
        
        try {
              
             pst = (PreparedStatement) con.prepareStatement(sql);
             rs = pst.executeQuery();
             
              table2.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             Logger.getLogger(Searchvalue.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_search2ActionPerformed

  
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registration_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration_form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SIDbox1;
    private javax.swing.JTextField SIDbox2;
    private javax.swing.JTextField SIDbox25;
    private javax.swing.JTextField SIDbox3;
    private javax.swing.JTextField SIDbox30;
    private javax.swing.JTextField SIDbox35;
    private javax.swing.JTextField SIDbox4;
    private javax.swing.JTextField SIDbox5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear1;
    private javax.swing.JButton clear2;
    private javax.swing.JButton delete1;
    private javax.swing.JButton delete2;
    private javax.swing.JButton delete3;
    private javax.swing.JButton delete4;
    private javax.swing.JButton delete5;
    private javax.swing.JButton delete6;
    private javax.swing.JButton delete7;
    private javax.swing.JButton delete8;
    private javax.swing.JTextField gpa1;
    private javax.swing.JLabel gpa2;
    private javax.swing.JLabel gpa3;
    private javax.swing.JLabel gpa4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s10;
    private javax.swing.JTextField s11;
    private javax.swing.JTextField s12;
    private javax.swing.JTextField s13;
    private javax.swing.JTextField s14;
    private javax.swing.JTextField s15;
    private javax.swing.JTextField s16;
    private javax.swing.JTextField s17;
    private javax.swing.JTextField s18;
    private javax.swing.JTextField s19;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s20;
    private javax.swing.JTextField s21;
    private javax.swing.JTextField s22;
    private javax.swing.JTextField s23;
    private javax.swing.JTextField s24;
    private javax.swing.JTextField s25;
    private javax.swing.JTextField s26;
    private javax.swing.JTextField s27;
    private javax.swing.JTextField s28;
    private javax.swing.JTextField s29;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s30;
    private javax.swing.JTextField s31;
    private javax.swing.JTextField s32;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField s6;
    private javax.swing.JTextField s7;
    private javax.swing.JTextField s8;
    private javax.swing.JTextField s9;
    private javax.swing.JButton search1;
    private javax.swing.JButton search2;
    private javax.swing.JButton search3;
    private javax.swing.JButton search4;
    private javax.swing.JButton search5;
    private javax.swing.JButton search6;
    private javax.swing.JButton search7;
    private javax.swing.JButton search8;
    private javax.swing.JTextField st1;
    private javax.swing.JLabel st2;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JTable table4;
    private javax.swing.JTable table5;
    private javax.swing.JTable table6;
    private javax.swing.JTable table7;
    private javax.swing.JTable table8;
    private javax.swing.JButton update1;
    private javax.swing.JButton update2;
    private javax.swing.JButton update3;
    private javax.swing.JButton update4;
    private javax.swing.JButton update5;
    private javax.swing.JButton update6;
    private javax.swing.JButton update7;
    private javax.swing.JButton update8;
    // End of variables declaration//GEN-END:variables

    

    

//    private void tableLoad2() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void tableLoad3() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void tableLoad4() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void tableLoad5() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void tableLoad6() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void tableLoad7() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void tableLoad8() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
