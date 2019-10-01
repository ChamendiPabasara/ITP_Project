
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



public class updateAllGrades extends javax.swing.JFrame {

    Connection con = null;
    com.mysql.jdbc.PreparedStatement pst1 ;
    com.mysql.jdbc.PreparedStatement pst2 ;
     com.mysql.jdbc.PreparedStatement pst;
    ResultSet rs;
    ResultSet rs1 ;
     ResultSet rs2 ;
    
    public updateAllGrades() {
        initComponents();
        
        //table 1
          table1.setRowHeight(40);
          table1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
          table1.setOpaque(false);
          table1.getTableHeader().setForeground(Color.BLACK);
        
          
           //table 2
        table2.setRowHeight(40);
        table2.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
        table2.setOpaque(false);
        table2.getTableHeader().setForeground(Color.BLACK);
        
        
        //table 3
        table3.setRowHeight(40);
        table3.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,16));
        table3.setOpaque(false);
        table3.getTableHeader().setForeground(Color.BLACK);
        
        //table 4
          table4.setRowHeight(40);
          table4.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
          table4.setOpaque(false);
          table4.getTableHeader().setForeground(Color.BLACK);
        
        
        
        //table 5
        table5.setRowHeight(40);
        table5.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,16));
        table5.setOpaque(false);
        table5.getTableHeader().setForeground(Color.BLACK);
        
        //table 6
          table6.setRowHeight(40);
          table6.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,16));
          table6.setOpaque(false);
          table6.getTableHeader().setForeground(Color.BLACK);
         
        
        
        //table 7
        table7.setRowHeight(40);
        table7.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,16));
        table7.setOpaque(false);
        table7.getTableHeader().setForeground(Color.BLACK);
        
        //table 8
          table8.setRowHeight(40);
          table8.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,16));
          table8.setOpaque(false);
          table8.getTableHeader().setForeground(Color.BLACK);
          
           //Connect to DB
        con = DBconnect.connect();
         
        tableLoad1(); //load table
        tableLoad2(); //load table
         tableLoad3(); //load table
          tableLoad4(); //load table
         tableLoad5(); //load table
        tableLoad6(); //load table
         tableLoad7(); //load table
         tableLoad8(); //load table
          
       
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
             String sql = "SELECT year2sem1.SID,year2sem1.ENGL21033,year2sem1.ENGL21043,year2sem1.ENGL21053,year2sem1.ENGL21063,year2sem1.ENGL21293,year2sem1.PCEN12333,year2sem1.PCEN11323,results.gpa,results.sem_status FROM year2sem1,results WHERE results.SID=year2sem1.SID";
             
             pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            //pst2 = (PreparedStatement) con.prepareStatement(sql);
             
             rs=pst.executeQuery();
           
              
             
             table3.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             System.out.println(ex.toString());
         }
    }
      
      private void tableLoad4() {
       
         try {
             String sql = "SELECT year2sem2.SID,year2sem2.ENGL22073,year2sem2.ENGL22083,year2sem2.ENGL22093,year2sem2.ENGL22293,year2sem2.PCEN12333,year2sem2.PCEN11323,results.gpa,results.sem_status FROM year2sem2,results WHERE results.SID=year2sem2.SID";
             
             pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            //pst2 = (PreparedStatement) con.prepareStatement(sql);
             
             rs=pst.executeQuery();
           
              
             
             table4.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             System.out.println(ex.toString());
         }
    }
      
      private void tableLoad5() {
       
         try {
             String sql = "SELECT year3semi1.SID,year3semi1.ENGL31103,year3semi1.ENGL31113,year3semi1.ENGL31123,year3semi1.ENGL31303,year3semi1.PCEN11323,year3semi1.PCEN12333 ,results.gpa,results.sem_status FROM year3semi1,results WHERE results.SID=year3semi1.SID";
             
             pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            //pst2 = (PreparedStatement) con.prepareStatement(sql);
             
             rs=pst.executeQuery();
           
              
             
             table5.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             System.out.println(ex.toString());
         }
    }
      
      private void tableLoad6() {
       
         try {
             String sql = "SELECT year3sem2.SID,year3sem2.ENGL32133,year3sem2.ENGL32143,year3sem2.ENGL32153,year3sem2.ENGL32163,year3sem2.ENGL32313,year3sem2.PCEN12333,year3sem2.PCEN11323 ,results.gpa,results.sem_status FROM year3sem2,results WHERE results.SID=year3sem2.SID";
             
             pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            //pst2 = (PreparedStatement) con.prepareStatement(sql);
             
             rs=pst.executeQuery();
           
              
             
             table6.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             System.out.println(ex.toString());
         }
    }
      
      private void tableLoad7() {
       
         try {
             String sql = "SELECT year4semi1.SID,year4semi1.ENGL41173 ,year4semi1.ENGL41183,year4semi1.ENGL41193,year4semi1.ENGL41203,year4semi1.PCEN11323,year4semi1.PCEN12333 ,results.gpa,results.sem_status FROM year4semi1,results WHERE results.SID=year4semi1.SID";
             
             pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            //pst2 = (PreparedStatement) con.prepareStatement(sql);
             
             rs=pst.executeQuery();
           
              
             
             table7.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             System.out.println(ex.toString());
         }
    }
      
       private void tableLoad8() {
       
         try {
             String sql = "SELECT year4semi2.SID,year4semi2.ENGL42213 ,year4semi2.ENGL42223,year4semi2.ENGL42233,year4semi2.ENGL42243,year4semi2.ENGL43256 ,year4semi2.PCEN12333,year4semi2.PCEN11323 ,results.gpa,results.sem_status FROM year4semi2,results WHERE results.SID=year4semi2.SID";
             
             pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            //pst2 = (PreparedStatement) con.prepareStatement(sql);
             
             rs=pst.executeQuery();
           
              
             
             table8.setModel(DbUtils.resultSetToTableModel(rs));
             
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
        st2 = new javax.swing.JTextField();
        update2 = new javax.swing.JButton();
        search2 = new javax.swing.JButton();
        delete2 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        gpa3 = new javax.swing.JLabel();
        clear2 = new javax.swing.JButton();
        s8 = new javax.swing.JTextField();
        gpa2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        SIDbox3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        ss9 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        ss13 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ss14 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        ss15 = new javax.swing.JTextField();
        search3 = new javax.swing.JButton();
        delete3 = new javax.swing.JButton();
        update3 = new javax.swing.JButton();
        clear3 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        ss10 = new javax.swing.JTextField();
        ss11 = new javax.swing.JTextField();
        ss12 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        gp3 = new javax.swing.JTextField();
        st3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        SIDbox4 = new javax.swing.JTextField();
        ENGL22073 = new javax.swing.JLabel();
        ss16 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        ss17 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        ss20 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        ss21 = new javax.swing.JTextField();
        search4 = new javax.swing.JButton();
        update4 = new javax.swing.JButton();
        delete4 = new javax.swing.JButton();
        clear4 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        ENGL22093 = new javax.swing.JLabel();
        ss19 = new javax.swing.JTextField();
        ss18 = new javax.swing.JTextField();
        st4 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        gp4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table8 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        SIDbox5 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        ss22 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        ss23 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        ss26 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        ss27 = new javax.swing.JTextField();
        delete5 = new javax.swing.JButton();
        update5 = new javax.swing.JButton();
        search5 = new javax.swing.JButton();
        clear5 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        ss25 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        ss24 = new javax.swing.JTextField();
        st5 = new javax.swing.JTextField();
        gp5 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table5 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        SIDbox6 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        ss28 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        ss32 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        ss33 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        ss34 = new javax.swing.JTextField();
        update6 = new javax.swing.JButton();
        delete6 = new javax.swing.JButton();
        search6 = new javax.swing.JButton();
        clear6 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        ss29 = new javax.swing.JTextField();
        ss30 = new javax.swing.JTextField();
        ss31 = new javax.swing.JTextField();
        st6 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        gp6 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        table6 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        SIDbox7 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        ss35 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        ss38 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        ss39 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        ss40 = new javax.swing.JTextField();
        search7 = new javax.swing.JButton();
        delete7 = new javax.swing.JButton();
        update7 = new javax.swing.JButton();
        clear7 = new javax.swing.JButton();
        st7 = new javax.swing.JTextField();
        gp7 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        ss36 = new javax.swing.JTextField();
        ss37 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        table7 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        SIDbox8 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        ss41 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        ss45 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        ss46 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        ss47 = new javax.swing.JTextField();
        search8 = new javax.swing.JButton();
        delete8 = new javax.swing.JButton();
        update8 = new javax.swing.JButton();
        clear8 = new javax.swing.JButton();
        gp8 = new javax.swing.JTextField();
        st8 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        ss42 = new javax.swing.JTextField();
        ss43 = new javax.swing.JTextField();
        ss44 = new javax.swing.JTextField();
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

        update1.setBackground(new java.awt.Color(255, 255, 255));
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

        search1.setBackground(new java.awt.Color(255, 255, 255));
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

        clear1.setBackground(new java.awt.Color(255, 255, 255));
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

        delete1.setBackground(new java.awt.Color(255, 255, 255));
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
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(delete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
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
                                .addGap(41, 41, 41)
                                .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(st1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gpa4))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
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

        st2.setBackground(new java.awt.Color(76, 74, 77));
        st2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        st2.setForeground(new java.awt.Color(255, 153, 0));
        st2.setCaretColor(new java.awt.Color(51, 51, 51));
        st2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st2ActionPerformed(evt);
            }
        });

        update2.setBackground(new java.awt.Color(255, 255, 255));
        update2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update2.setText("Update");
        update2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        update2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });

        search2.setBackground(new java.awt.Color(255, 255, 255));
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

        delete2.setBackground(new java.awt.Color(255, 255, 255));
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

        gpa3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gpa3.setForeground(new java.awt.Color(255, 153, 0));
        gpa3.setText("GPA");

        clear2.setBackground(new java.awt.Color(255, 255, 255));
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

        s8.setBackground(new java.awt.Color(76, 74, 77));
        s8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        s8.setForeground(new java.awt.Color(255, 153, 0));
        s8.setCaretColor(new java.awt.Color(51, 51, 51));
        s8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s8ActionPerformed(evt);
            }
        });

        gpa2.setBackground(new java.awt.Color(76, 74, 77));
        gpa2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gpa2.setForeground(new java.awt.Color(255, 153, 0));
        gpa2.setCaretColor(new java.awt.Color(51, 51, 51));
        gpa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa2ActionPerformed(evt);
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
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(52, 52, 52)
                                .addComponent(SIDbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(gpa3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)))
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
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(183, 183, 183)
                    .addComponent(gpa2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(466, Short.MAX_VALUE)))
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
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel55)
                                            .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gpa3)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(360, Short.MAX_VALUE)
                    .addComponent(gpa2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
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
        jLabel26.setText("ENGL21033 ");

        ss9.setBackground(new java.awt.Color(76, 74, 77));
        ss9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss9.setForeground(new java.awt.Color(255, 153, 0));
        ss9.setCaretColor(new java.awt.Color(51, 51, 51));
        ss9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss9ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 153, 0));
        jLabel27.setText("ENGL21043 ");

        ss13.setBackground(new java.awt.Color(76, 74, 77));
        ss13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss13.setForeground(new java.awt.Color(255, 153, 0));
        ss13.setCaretColor(new java.awt.Color(51, 51, 51));
        ss13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss13ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 153, 0));
        jLabel28.setText("PCEN12333");

        ss14.setBackground(new java.awt.Color(76, 74, 77));
        ss14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss14.setForeground(new java.awt.Color(255, 153, 0));
        ss14.setCaretColor(new java.awt.Color(51, 51, 51));
        ss14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss14ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 153, 0));
        jLabel29.setText("PCEN11323 ");

        ss15.setBackground(new java.awt.Color(76, 74, 77));
        ss15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss15.setForeground(new java.awt.Color(255, 153, 0));
        ss15.setCaretColor(new java.awt.Color(51, 51, 51));
        ss15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss15ActionPerformed(evt);
            }
        });

        search3.setBackground(new java.awt.Color(255, 255, 255));
        search3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search3.setText("Search");
        search3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        search3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search3ActionPerformed(evt);
            }
        });

        delete3.setBackground(new java.awt.Color(255, 255, 255));
        delete3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete3.setText("Delete");
        delete3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete3ActionPerformed(evt);
            }
        });

        update3.setBackground(new java.awt.Color(255, 255, 255));
        update3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update3.setText("Update");
        update3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update3ActionPerformed(evt);
            }
        });

        clear3.setBackground(new java.awt.Color(255, 255, 255));
        clear3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-erase-50.png"))); // NOI18N
        clear3.setText("Clear");
        clear3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clear3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear3ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 153, 0));
        jLabel56.setText("ENGL21053");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 153, 0));
        jLabel57.setText("ENGL21063");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 153, 0));
        jLabel58.setText("ENGL21293");

        ss10.setBackground(new java.awt.Color(76, 74, 77));
        ss10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss10.setForeground(new java.awt.Color(255, 153, 0));
        ss10.setCaretColor(new java.awt.Color(51, 51, 51));
        ss10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss10ActionPerformed(evt);
            }
        });

        ss11.setBackground(new java.awt.Color(76, 74, 77));
        ss11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss11.setForeground(new java.awt.Color(255, 153, 0));
        ss11.setCaretColor(new java.awt.Color(51, 51, 51));
        ss11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss11ActionPerformed(evt);
            }
        });

        ss12.setBackground(new java.awt.Color(76, 74, 77));
        ss12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss12.setForeground(new java.awt.Color(255, 153, 0));
        ss12.setCaretColor(new java.awt.Color(51, 51, 51));
        ss12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss12ActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 153, 0));
        jLabel59.setText("GPA");

        gp3.setBackground(new java.awt.Color(76, 74, 77));
        gp3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gp3.setForeground(new java.awt.Color(255, 153, 0));
        gp3.setCaretColor(new java.awt.Color(51, 51, 51));
        gp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gp3ActionPerformed(evt);
            }
        });

        st3.setBackground(new java.awt.Color(76, 74, 77));
        st3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        st3.setForeground(new java.awt.Color(255, 153, 0));
        st3.setCaretColor(new java.awt.Color(51, 51, 51));
        st3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SIDbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss9, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss10, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ss11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ss12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(gp3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(st3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ss14, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ss15, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ss13, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(search3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SIDbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ss9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)))
                    .addComponent(search3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(ss10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(ss11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(update3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(ss12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(ss13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(ss14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ss15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(gp3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "SID", "ENGL22073 ", "ENGL22083 ", "ENGL22093", "ENGL22293 ", "PCEN11323", "PCEN12333"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, false, false
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

        ENGL22073.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ENGL22073.setForeground(new java.awt.Color(255, 153, 0));
        ENGL22073.setText("ENGL22073");

        ss16.setBackground(new java.awt.Color(76, 74, 77));
        ss16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss16.setForeground(new java.awt.Color(255, 153, 0));
        ss16.setCaretColor(new java.awt.Color(51, 51, 51));
        ss16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss16ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 153, 0));
        jLabel32.setText("ENGL22083");

        ss17.setBackground(new java.awt.Color(76, 74, 77));
        ss17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss17.setForeground(new java.awt.Color(255, 153, 0));
        ss17.setCaretColor(new java.awt.Color(51, 51, 51));
        ss17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss17ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 153, 0));
        jLabel33.setText("PCEN11323");

        ss20.setBackground(new java.awt.Color(76, 74, 77));
        ss20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss20.setForeground(new java.awt.Color(255, 153, 0));
        ss20.setCaretColor(new java.awt.Color(51, 51, 51));
        ss20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss20ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 153, 0));
        jLabel34.setText("PCEN12333");

        ss21.setBackground(new java.awt.Color(76, 74, 77));
        ss21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss21.setForeground(new java.awt.Color(255, 153, 0));
        ss21.setCaretColor(new java.awt.Color(51, 51, 51));
        ss21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss21ActionPerformed(evt);
            }
        });

        search4.setBackground(new java.awt.Color(255, 255, 255));
        search4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search4.setText("Search");
        search4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        search4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search4ActionPerformed(evt);
            }
        });

        update4.setBackground(new java.awt.Color(255, 255, 255));
        update4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update4.setText("Update");
        update4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        update4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update4ActionPerformed(evt);
            }
        });

        delete4.setBackground(new java.awt.Color(255, 255, 255));
        delete4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete4.setText("Delete");
        delete4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete4ActionPerformed(evt);
            }
        });

        clear4.setBackground(new java.awt.Color(255, 255, 255));
        clear4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-erase-50.png"))); // NOI18N
        clear4.setText("Clear");
        clear4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clear4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clear4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear4ActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 153, 0));
        jLabel60.setText("ENGL22293");

        ENGL22093.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ENGL22093.setForeground(new java.awt.Color(255, 153, 0));
        ENGL22093.setText("ENGL22093");

        ss19.setBackground(new java.awt.Color(76, 74, 77));
        ss19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss19.setForeground(new java.awt.Color(255, 153, 0));
        ss19.setCaretColor(new java.awt.Color(51, 51, 51));
        ss19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss19ActionPerformed(evt);
            }
        });

        ss18.setBackground(new java.awt.Color(76, 74, 77));
        ss18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss18.setForeground(new java.awt.Color(255, 153, 0));
        ss18.setCaretColor(new java.awt.Color(51, 51, 51));
        ss18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss18ActionPerformed(evt);
            }
        });

        st4.setBackground(new java.awt.Color(76, 74, 77));
        st4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        st4.setForeground(new java.awt.Color(255, 153, 0));
        st4.setCaretColor(new java.awt.Color(51, 51, 51));
        st4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st4ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 153, 0));
        jLabel61.setText("GPA");

        gp4.setBackground(new java.awt.Color(76, 74, 77));
        gp4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gp4.setForeground(new java.awt.Color(255, 153, 0));
        gp4.setCaretColor(new java.awt.Color(51, 51, 51));
        gp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gp4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(52, 52, 52)
                        .addComponent(SIDbox4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ENGL22093, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ENGL22073))
                        .addGap(52, 52, 52)
                        .addComponent(ss19, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(gp4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ss17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ss21, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(st4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(SIDbox4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ENGL22073)
                            .addComponent(ss16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ss17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ENGL22093)
                            .addComponent(ss18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(ss19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(search4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(update4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ss20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(ss21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(gp4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        jLabel36.setText("ENGL31103");

        ss22.setBackground(new java.awt.Color(76, 74, 77));
        ss22.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss22.setForeground(new java.awt.Color(255, 153, 0));
        ss22.setCaretColor(new java.awt.Color(51, 51, 51));
        ss22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss22ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 153, 0));
        jLabel37.setText("ENGL31113");

        ss23.setBackground(new java.awt.Color(76, 74, 77));
        ss23.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss23.setForeground(new java.awt.Color(255, 153, 0));
        ss23.setCaretColor(new java.awt.Color(51, 51, 51));
        ss23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss23ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 153, 0));
        jLabel38.setText("PCEN11323");

        ss26.setBackground(new java.awt.Color(76, 74, 77));
        ss26.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss26.setForeground(new java.awt.Color(255, 153, 0));
        ss26.setCaretColor(new java.awt.Color(51, 51, 51));
        ss26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss26ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 153, 0));
        jLabel39.setText("PCEN12333");

        ss27.setBackground(new java.awt.Color(76, 74, 77));
        ss27.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss27.setForeground(new java.awt.Color(255, 153, 0));
        ss27.setCaretColor(new java.awt.Color(51, 51, 51));
        ss27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss27ActionPerformed(evt);
            }
        });

        delete5.setBackground(new java.awt.Color(255, 255, 255));
        delete5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete5.setText("Delete");
        delete5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        delete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete5ActionPerformed(evt);
            }
        });

        update5.setBackground(new java.awt.Color(255, 255, 255));
        update5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update5.setText("Update");
        update5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        update5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update5ActionPerformed(evt);
            }
        });

        search5.setBackground(new java.awt.Color(255, 255, 255));
        search5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search5.setText("Search");
        search5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        search5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search5ActionPerformed(evt);
            }
        });

        clear5.setBackground(new java.awt.Color(255, 255, 255));
        clear5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-erase-50.png"))); // NOI18N
        clear5.setText("Clear");
        clear5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clear5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clear5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear5ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 153, 0));
        jLabel62.setText("ENGL31303 ");

        ss25.setBackground(new java.awt.Color(76, 74, 77));
        ss25.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss25.setForeground(new java.awt.Color(255, 153, 0));
        ss25.setCaretColor(new java.awt.Color(51, 51, 51));
        ss25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss25ActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 153, 0));
        jLabel63.setText("ENGL31123");

        ss24.setBackground(new java.awt.Color(76, 74, 77));
        ss24.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss24.setForeground(new java.awt.Color(255, 153, 0));
        ss24.setCaretColor(new java.awt.Color(51, 51, 51));
        ss24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss24ActionPerformed(evt);
            }
        });

        st5.setBackground(new java.awt.Color(76, 74, 77));
        st5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        st5.setForeground(new java.awt.Color(255, 153, 0));
        st5.setCaretColor(new java.awt.Color(51, 51, 51));
        st5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st5ActionPerformed(evt);
            }
        });

        gp5.setBackground(new java.awt.Color(76, 74, 77));
        gp5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gp5.setForeground(new java.awt.Color(255, 153, 0));
        gp5.setCaretColor(new java.awt.Color(51, 51, 51));
        gp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gp5ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 153, 0));
        jLabel64.setText("GPA");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ss24, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)
                            .addComponent(ss27, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ss23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ss22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel35)
                            .addGap(52, 52, 52)
                            .addComponent(SIDbox5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ss26, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ss25, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(gp5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(st5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(548, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(SIDbox5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(ss22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(ss23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(search5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(update5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(ss24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(ss25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ss26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel38)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel39)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clear5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(gp5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addComponent(jLabel63)
                    .addContainerGap(253, Short.MAX_VALUE)))
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

        SIDbox6.setBackground(new java.awt.Color(76, 74, 77));
        SIDbox6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SIDbox6.setForeground(new java.awt.Color(255, 153, 0));
        SIDbox6.setCaretColor(new java.awt.Color(51, 51, 51));
        SIDbox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDbox6ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 153, 0));
        jLabel41.setText("ENGL32133");

        ss28.setBackground(new java.awt.Color(76, 74, 77));
        ss28.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss28.setForeground(new java.awt.Color(255, 153, 0));
        ss28.setCaretColor(new java.awt.Color(51, 51, 51));
        ss28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss28ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 153, 0));
        jLabel42.setText("ENGL32143 ");

        ss32.setBackground(new java.awt.Color(76, 74, 77));
        ss32.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss32.setForeground(new java.awt.Color(255, 153, 0));
        ss32.setCaretColor(new java.awt.Color(51, 51, 51));
        ss32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss32ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 153, 0));
        jLabel43.setText("PCEN11323");

        ss33.setBackground(new java.awt.Color(76, 74, 77));
        ss33.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss33.setForeground(new java.awt.Color(255, 153, 0));
        ss33.setCaretColor(new java.awt.Color(51, 51, 51));
        ss33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss33ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 153, 0));
        jLabel44.setText("PCEN12333");

        ss34.setBackground(new java.awt.Color(76, 74, 77));
        ss34.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss34.setForeground(new java.awt.Color(255, 153, 0));
        ss34.setCaretColor(new java.awt.Color(51, 51, 51));
        ss34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss34ActionPerformed(evt);
            }
        });

        update6.setBackground(new java.awt.Color(255, 255, 255));
        update6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update6.setText("Update");
        update6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        update6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update6ActionPerformed(evt);
            }
        });

        delete6.setBackground(new java.awt.Color(255, 255, 255));
        delete6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete6.setText("Delete");
        delete6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        delete6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete6ActionPerformed(evt);
            }
        });

        search6.setBackground(new java.awt.Color(255, 255, 255));
        search6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search6.setText("Search");
        search6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        search6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search6ActionPerformed(evt);
            }
        });

        clear6.setBackground(new java.awt.Color(255, 255, 255));
        clear6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-erase-50.png"))); // NOI18N
        clear6.setText("Clear");
        clear6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clear6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clear6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear6ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 153, 0));
        jLabel65.setText("ENGL32313");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 153, 0));
        jLabel66.setText("ENGL32153 ");

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 153, 0));
        jLabel67.setText("ENGL32163 ");

        ss29.setBackground(new java.awt.Color(76, 74, 77));
        ss29.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss29.setForeground(new java.awt.Color(255, 153, 0));
        ss29.setCaretColor(new java.awt.Color(51, 51, 51));
        ss29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss29ActionPerformed(evt);
            }
        });

        ss30.setBackground(new java.awt.Color(76, 74, 77));
        ss30.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss30.setForeground(new java.awt.Color(255, 153, 0));
        ss30.setCaretColor(new java.awt.Color(51, 51, 51));
        ss30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss30ActionPerformed(evt);
            }
        });

        ss31.setBackground(new java.awt.Color(76, 74, 77));
        ss31.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss31.setForeground(new java.awt.Color(255, 153, 0));
        ss31.setCaretColor(new java.awt.Color(51, 51, 51));
        ss31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss31ActionPerformed(evt);
            }
        });

        st6.setBackground(new java.awt.Color(76, 74, 77));
        st6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        st6.setForeground(new java.awt.Color(255, 153, 0));
        st6.setCaretColor(new java.awt.Color(51, 51, 51));
        st6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st6ActionPerformed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 153, 0));
        jLabel68.setText("GPA");

        gp6.setBackground(new java.awt.Color(76, 74, 77));
        gp6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gp6.setForeground(new java.awt.Color(255, 153, 0));
        gp6.setCaretColor(new java.awt.Color(51, 51, 51));
        gp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gp6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(ss28, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SIDbox6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss34, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss33, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss29, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss30, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss32, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(ss31, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(gp6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(st6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addGap(40, 40, 40)
                        .addComponent(update6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(SIDbox6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ss28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(ss29, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(ss30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ss31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65))
                        .addGap(35, 35, 35)
                        .addComponent(clear6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ss33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ss34, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(gp6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        SIDbox7.setBackground(new java.awt.Color(76, 74, 77));
        SIDbox7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SIDbox7.setForeground(new java.awt.Color(255, 153, 0));
        SIDbox7.setCaretColor(new java.awt.Color(51, 51, 51));
        SIDbox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDbox7ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 153, 0));
        jLabel46.setText("ENGL41173");

        ss35.setBackground(new java.awt.Color(76, 74, 77));
        ss35.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss35.setForeground(new java.awt.Color(255, 153, 0));
        ss35.setCaretColor(new java.awt.Color(51, 51, 51));
        ss35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss35ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 153, 0));
        jLabel47.setText("ENGL41183 ");

        ss38.setBackground(new java.awt.Color(76, 74, 77));
        ss38.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss38.setForeground(new java.awt.Color(255, 153, 0));
        ss38.setCaretColor(new java.awt.Color(51, 51, 51));
        ss38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss38ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 153, 0));
        jLabel48.setText("PCEN11323");

        ss39.setBackground(new java.awt.Color(76, 74, 77));
        ss39.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss39.setForeground(new java.awt.Color(255, 153, 0));
        ss39.setCaretColor(new java.awt.Color(51, 51, 51));
        ss39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss39ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 153, 0));
        jLabel49.setText("PCEN12333");

        ss40.setBackground(new java.awt.Color(76, 74, 77));
        ss40.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss40.setForeground(new java.awt.Color(255, 153, 0));
        ss40.setCaretColor(new java.awt.Color(51, 51, 51));
        ss40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss40ActionPerformed(evt);
            }
        });

        search7.setBackground(new java.awt.Color(255, 255, 255));
        search7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search7.setText("Search");
        search7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        search7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search7ActionPerformed(evt);
            }
        });

        delete7.setBackground(new java.awt.Color(255, 255, 255));
        delete7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete7.setText("Delete");
        delete7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        delete7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete7ActionPerformed(evt);
            }
        });

        update7.setBackground(new java.awt.Color(255, 255, 255));
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

        clear7.setBackground(new java.awt.Color(255, 255, 255));
        clear7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-erase-50.png"))); // NOI18N
        clear7.setText("Clear");
        clear7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clear7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clear7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear7ActionPerformed(evt);
            }
        });

        st7.setBackground(new java.awt.Color(76, 74, 77));
        st7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        st7.setForeground(new java.awt.Color(255, 153, 0));
        st7.setCaretColor(new java.awt.Color(51, 51, 51));
        st7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st7ActionPerformed(evt);
            }
        });

        gp7.setBackground(new java.awt.Color(76, 74, 77));
        gp7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gp7.setForeground(new java.awt.Color(255, 153, 0));
        gp7.setCaretColor(new java.awt.Color(51, 51, 51));
        gp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gp7ActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 153, 0));
        jLabel69.setText("GPA");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 153, 0));
        jLabel70.setText("ENGL41203");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 153, 0));
        jLabel71.setText("ENGL41193");

        ss36.setBackground(new java.awt.Color(76, 74, 77));
        ss36.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss36.setForeground(new java.awt.Color(255, 153, 0));
        ss36.setCaretColor(new java.awt.Color(51, 51, 51));
        ss36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss36ActionPerformed(evt);
            }
        });

        ss37.setBackground(new java.awt.Color(76, 74, 77));
        ss37.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss37.setForeground(new java.awt.Color(255, 153, 0));
        ss37.setCaretColor(new java.awt.Color(51, 51, 51));
        ss37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ss35, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SIDbox7, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss40, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss39, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ss36, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ss37, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ss38, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(delete7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(search7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)))))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(gp7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(st7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(SIDbox7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(ss35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(search7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(update7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(ss36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ss39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ss40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(ss37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel70)
                                .addComponent(ss38, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(clear7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)
                    .addComponent(gp7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        SIDbox8.setBackground(new java.awt.Color(76, 74, 77));
        SIDbox8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SIDbox8.setForeground(new java.awt.Color(255, 153, 0));
        SIDbox8.setCaretColor(new java.awt.Color(51, 51, 51));
        SIDbox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDbox8ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 153, 0));
        jLabel51.setText("ENGL42213");

        ss41.setBackground(new java.awt.Color(76, 74, 77));
        ss41.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss41.setForeground(new java.awt.Color(255, 153, 0));
        ss41.setCaretColor(new java.awt.Color(51, 51, 51));
        ss41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss41ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 153, 0));
        jLabel52.setText("ENGL43256 ");

        ss45.setBackground(new java.awt.Color(76, 74, 77));
        ss45.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss45.setForeground(new java.awt.Color(255, 153, 0));
        ss45.setCaretColor(new java.awt.Color(51, 51, 51));
        ss45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss45ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 153, 0));
        jLabel53.setText("PCEN12333 ");

        ss46.setBackground(new java.awt.Color(76, 74, 77));
        ss46.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss46.setForeground(new java.awt.Color(255, 153, 0));
        ss46.setCaretColor(new java.awt.Color(51, 51, 51));
        ss46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss46ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 153, 0));
        jLabel54.setText("PCEN11323 ");

        ss47.setBackground(new java.awt.Color(76, 74, 77));
        ss47.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss47.setForeground(new java.awt.Color(255, 153, 0));
        ss47.setCaretColor(new java.awt.Color(51, 51, 51));
        ss47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss47ActionPerformed(evt);
            }
        });

        search8.setBackground(new java.awt.Color(255, 255, 255));
        search8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-search-52.png"))); // NOI18N
        search8.setText("Search");
        search8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        search8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search8ActionPerformed(evt);
            }
        });

        delete8.setBackground(new java.awt.Color(255, 255, 255));
        delete8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-trash-52.png"))); // NOI18N
        delete8.setText("Delete");
        delete8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        delete8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete8ActionPerformed(evt);
            }
        });

        update8.setBackground(new java.awt.Color(255, 255, 255));
        update8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-downloading-updates-52.png"))); // NOI18N
        update8.setText("Update");
        update8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        update8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update8ActionPerformed(evt);
            }
        });

        clear8.setBackground(new java.awt.Color(255, 255, 255));
        clear8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interF/icons8-erase-50.png"))); // NOI18N
        clear8.setText("Clear");
        clear8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clear8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clear8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear8ActionPerformed(evt);
            }
        });

        gp8.setBackground(new java.awt.Color(76, 74, 77));
        gp8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gp8.setForeground(new java.awt.Color(255, 153, 0));
        gp8.setCaretColor(new java.awt.Color(51, 51, 51));
        gp8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gp8ActionPerformed(evt);
            }
        });

        st8.setBackground(new java.awt.Color(76, 74, 77));
        st8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        st8.setForeground(new java.awt.Color(255, 153, 0));
        st8.setCaretColor(new java.awt.Color(51, 51, 51));
        st8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st8ActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 153, 0));
        jLabel72.setText("GPA");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 153, 0));
        jLabel73.setText("ENGL42223");

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 153, 0));
        jLabel74.setText("ENGL42233 ");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 153, 0));
        jLabel75.setText("ENGL42243");

        ss42.setBackground(new java.awt.Color(76, 74, 77));
        ss42.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss42.setForeground(new java.awt.Color(255, 153, 0));
        ss42.setCaretColor(new java.awt.Color(51, 51, 51));
        ss42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss42ActionPerformed(evt);
            }
        });

        ss43.setBackground(new java.awt.Color(76, 74, 77));
        ss43.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss43.setForeground(new java.awt.Color(255, 153, 0));
        ss43.setCaretColor(new java.awt.Color(51, 51, 51));
        ss43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss43ActionPerformed(evt);
            }
        });

        ss44.setBackground(new java.awt.Color(76, 74, 77));
        ss44.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ss44.setForeground(new java.awt.Color(255, 153, 0));
        ss44.setCaretColor(new java.awt.Color(51, 51, 51));
        ss44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SIDbox8, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel51)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ss41, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel50)
                                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(63, 63, 63)
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ss44, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ss43, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ss45, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ss46, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ss47, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(ss42, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(gp8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(st8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(571, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(search8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(SIDbox8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(ss41, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(delete8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(clear8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel74)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel75)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel52)
                                .addGap(131, 131, 131))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(ss43, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(ss44, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ss45, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ss46, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel53))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ss47, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel54))
                                .addGap(18, 18, 18)))))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72)
                    .addComponent(gp8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(156, 156, 156)
                    .addComponent(jLabel73)
                    .addContainerGap(350, Short.MAX_VALUE)))
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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6))
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 4720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void st2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st2ActionPerformed

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

    private void ss9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss9ActionPerformed

    private void ss13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss13ActionPerformed

    private void ss14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss14ActionPerformed

    private void ss15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss15ActionPerformed

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table4MouseClicked

    private void SIDbox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox4ActionPerformed

    private void ss16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss16ActionPerformed

    private void ss17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss17ActionPerformed

    private void ss20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss20ActionPerformed

    private void ss21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss21ActionPerformed

    private void table8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table8MouseClicked

    private void SIDbox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox5ActionPerformed

    private void ss22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss22ActionPerformed

    private void ss23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss23ActionPerformed

    private void ss26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss26ActionPerformed

    private void ss27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss27ActionPerformed

    private void table5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table5MouseClicked

    private void SIDbox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox6ActionPerformed

    private void ss28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss28ActionPerformed

    private void ss32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss32ActionPerformed

    private void ss33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss33ActionPerformed

    private void ss34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss34ActionPerformed

    private void table6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table6MouseClicked

    private void SIDbox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox7ActionPerformed

    private void ss35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss35ActionPerformed

    private void ss38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss38ActionPerformed

    private void ss39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss39ActionPerformed

    private void ss40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss40ActionPerformed

    private void table7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table7MouseClicked

    private void SIDbox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDbox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDbox8ActionPerformed

    private void ss41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss41ActionPerformed

    private void ss45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss45ActionPerformed

    private void ss46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss46ActionPerformed

    private void ss47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss47ActionPerformed

    private void update7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update7ActionPerformed
     
         int x = JOptionPane.showConfirmDialog(null, "Do you Really want to UPDATE ?");
       
       if(x == 0)
       {
          String sid = SIDbox7.getText();
           String sub1 = ss35.getText();
           String sub2 = ss36.getText();
           String sub3 = ss37.getText();
           String sub4 = ss38.getText();
           String sub5 = ss39.getText();
           String sub6 = ss40.getText();
          
         
         
           String gp = gp7.getText();
           String ss =st7.getText();
           
          
           try{
               
                String sql = "UPDATE year4semi1 SET ENGL41173  ='"+sub1+"',ENGL41183   ='"+sub2+"',ENGL41193  ='"+sub3+"',ENGL41203  ='"+sub4+"',PCEN11323  ='"+sub5+"',PCEN12333 ='"+sub6+"'  WHERE SID = '"+sid+"'";
                String sq = "UPDATE results SET gpa ='"+gp+"',sem_status ='"+ss+"' WHERE SID = '"+sid+"'";
           
              
                
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               pst2.execute();
               tableLoad7(); //load table
                //JOptionPane.showMessageDialog(null, "Data UPDATED successfully in both tables..!");
           
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       } 
        
        
        
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
                String sq = "DELETE from  results  WHERE SID = '"+sid+"'";
                 //String sq = "DELETE from  results,student  WHERE results.SID = '"+sid+"' AND results.SID =student.id AND results.year_sem =student.Batch ";
           
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
                String sq = "DELETE from results  WHERE SID = '"+sid+"'";
           
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

    private void search3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search3ActionPerformed
      
         String sid = SIDbox3.getText();
       String sql = "SELECT year2sem1.SID,year2sem1.ENGL21033,year2sem1.ENGL21043,year2sem1.ENGL21053,year2sem1.ENGL21063,year2sem1.ENGL21293,year2sem1.PCEN12333,year2sem1.PCEN11323,results.gpa,results.sem_status FROM year2sem1,results WHERE results.SID=year2sem1.SID AND  year2sem1.SID Like '%"+sid+"%'";
        
        try {
              
             pst = (PreparedStatement) con.prepareStatement(sql);
             rs = pst.executeQuery();
             
              table3.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             Logger.getLogger(Searchvalue.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_search3ActionPerformed

    private void search4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search4ActionPerformed
   
        String sid = SIDbox4.getText();
       String sql = "SELECT year2sem2.SID,year2sem2.ENGL22073,year2sem2.ENGL22083,year2sem2.ENGL22093,year2sem2.ENGL22293,year2sem2.PCEN12333,year2sem2.PCEN11323,results.gpa,results.sem_status FROM year2sem2,results WHERE results.SID=year2sem2.SID AND  year2sem2.SID Like '%"+sid+"%'";
        
        try {
              
             pst = (PreparedStatement) con.prepareStatement(sql);
             rs = pst.executeQuery();
             
              table4.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             Logger.getLogger(Searchvalue.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_search4ActionPerformed

    private void search5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search5ActionPerformed
      
        
        String sid = SIDbox5.getText();
       String sql = "SELECT year3semi1.SID,year3semi1.ENGL31103,year3semi1.ENGL31113,year3semi1.ENGL31123,year3semi1.ENGL31303,year3semi1.PCEN11323,year3semi1.PCEN12333 ,results.gpa,results.sem_status FROM year3semi1,results WHERE results.SID=year3semi1.SID AND  year3semi1.SID Like '%"+sid+"%'";
        
        try {
              
             pst = (PreparedStatement) con.prepareStatement(sql);
             rs = pst.executeQuery();
             
              table5.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             Logger.getLogger(Searchvalue.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_search5ActionPerformed

    private void search6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search6ActionPerformed
       
         String sid = SIDbox6.getText();
         String sql = "SELECT year3sem2.SID,year3sem2.ENGL32133,year3sem2.ENGL32143,year3sem2.ENGL32153,year3sem2.ENGL32163,year3sem2.ENGL32313,year3sem2.PCEN12333,year3sem2.PCEN11323 ,results.gpa,results.sem_status FROM year3sem2,results WHERE results.SID=year3sem2.SID AND  year3sem2.SID Like '%"+sid+"%'";
        
        try {
              
             pst = (PreparedStatement) con.prepareStatement(sql);
             rs = pst.executeQuery();
             
              table6.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             Logger.getLogger(Searchvalue.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_search6ActionPerformed

    private void search7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search7ActionPerformed
     
        String sid = SIDbox7.getText();
        
         String sql = "SELECT year4semi1.SID,year4semi1.ENGL41173 ,year4semi1.ENGL41183,year4semi1.ENGL41193,year4semi1.ENGL41203,year4semi1.PCEN11323,year4semi1.PCEN12333 ,results.gpa,results.sem_status FROM year4semi1,results WHERE results.SID=year4semi1.SID AND   year4semi1.SID Like '%"+sid+"%'";

        
        try {
              
             pst = (PreparedStatement) con.prepareStatement(sql);
             rs = pst.executeQuery();
             
              table7.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             Logger.getLogger(Searchvalue.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_search7ActionPerformed

    private void search8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search8ActionPerformed
       
        String sid = SIDbox8.getText();
        
         String sql = "SELECT year4semi2.SID,year4semi2.ENGL42213 ,year4semi2.ENGL42223,year4semi2.ENGL42233,year4semi2.ENGL42243,year4semi2.ENGL43256 ,year4semi2.PCEN12333,year4semi2.PCEN11323 ,results.gpa,results.sem_status FROM year4semi2,results WHERE results.SID=year4semi2.SID AND   year4semi2.SID Like '%"+sid+"%'";

        
        try {
              
             pst = (PreparedStatement) con.prepareStatement(sql);
             rs = pst.executeQuery();
             
              table8.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             Logger.getLogger(Searchvalue.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_search8ActionPerformed

    private void clear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear3ActionPerformed
             SIDbox3.setText("");
     ss9.setText("");
     ss10.setText("");
     ss11.setText("");
     ss12.setText("");
     ss13.setText("");
     ss14.setText("");
     ss15.setText("");
     gp3.setText("");
     st3.setText("");
        
        tableLoad3();
    }//GEN-LAST:event_clear3ActionPerformed

    private void clear4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear4ActionPerformed
     SIDbox4.setText("");
     ss16.setText("");
     ss17.setText("");
     ss18.setText("");
     ss19.setText("");
     ss20.setText("");
   
     ss21.setText("");
     gp4.setText("");
     st4.setText("");
        
        tableLoad4();
    }//GEN-LAST:event_clear4ActionPerformed

    private void clear5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear5ActionPerformed
      SIDbox5.setText("");
     ss22.setText("");
     ss23.setText("");
     ss24.setText("");
     ss25.setText("");
     ss26.setText("");
   
     ss27.setText("");
     gp5.setText("");
     st5.setText("");
        
        tableLoad5();
        
        
        
    }//GEN-LAST:event_clear5ActionPerformed

    private void clear6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear6ActionPerformed
      
        
         SIDbox6.setText("");
     ss28.setText("");
     ss29.setText("");
     ss30.setText("");
     ss31.setText("");
     ss32.setText("");
     ss33.setText("");
     ss34.setText("");
     gp6.setText("");
     st6.setText("");
        
        tableLoad6();
    }//GEN-LAST:event_clear6ActionPerformed

    private void clear7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear7ActionPerformed
      
            
         SIDbox7.setText("");
     ss35.setText("");
     ss36.setText("");
     ss37.setText("");
     ss38.setText("");
     ss39.setText("");
     ss40.setText("");
     gp7.setText("");
     st7.setText("");
        
        tableLoad7(); 
        
        
    }//GEN-LAST:event_clear7ActionPerformed

    private void clear8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear8ActionPerformed
      
                  
         SIDbox8.setText("");
     ss41.setText("");
     ss42.setText("");
     ss43.setText("");
     ss44.setText("");
     ss45.setText("");
     ss46.setText("");
     ss47.setText("");
     gp8.setText("");
     st8.setText("");
        
        tableLoad8();   
        
        
    }//GEN-LAST:event_clear8ActionPerformed

    private void ss10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss10ActionPerformed

    private void ss11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss11ActionPerformed

    private void ss12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss12ActionPerformed

    private void gp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gp3ActionPerformed

    private void s8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s8ActionPerformed

    private void gpa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa2ActionPerformed

    private void st3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st3ActionPerformed

    private void ss19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss19ActionPerformed

    private void ss18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss18ActionPerformed

    private void st4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st4ActionPerformed

    private void gp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gp4ActionPerformed

    private void ss25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss25ActionPerformed

    private void ss24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss24ActionPerformed

    private void gp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gp5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gp5ActionPerformed

    private void st5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st5ActionPerformed

    private void ss29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss29ActionPerformed

    private void ss30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss30ActionPerformed

    private void ss31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss31ActionPerformed

    private void st6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st6ActionPerformed

    private void gp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gp6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gp6ActionPerformed

    private void gp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gp7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gp7ActionPerformed

    private void st7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st7ActionPerformed

    private void ss36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss36ActionPerformed

    private void ss37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss37ActionPerformed

    private void gp8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gp8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gp8ActionPerformed

    private void st8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st8ActionPerformed

    private void ss42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss42ActionPerformed

    private void ss43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss43ActionPerformed

    private void ss44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss44ActionPerformed

    private void delete8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete8ActionPerformed
       
        int x = JOptionPane.showConfirmDialog(null, "Do You really want to DELETE this...?");
        
      
       
           if(x == 0)
       {
          String sid = SIDbox8.getText();
        
       try{
               
                String sql = "DELETE from year4semi2 WHERE SID = '"+sid+"'";
                String sq = "DELETE from results  WHERE SID = '"+sid+"'";
           
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               tableLoad8();
               pst2.execute();
               tableLoad8(); //load table
              // JOptionPane.showMessageDialog(null, "Data REMOVED successfully in both tables..!");
              
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
       }
        
    }//GEN-LAST:event_delete8ActionPerformed

    private void update8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update8ActionPerformed
      
        int x = JOptionPane.showConfirmDialog(null, "Do you Really want to UPDATE ?");
       
       if(x == 0)
       {
          String sid = SIDbox8.getText();
           String sub1 = ss41.getText();
           String sub2 = ss42.getText();
           String sub3 = ss43.getText();
           String sub4 = ss44.getText();
           String sub5 = ss45.getText();
           String sub6 = ss46.getText();
           String sub7 = ss47.getText();
          
         
         
           String gp = gp8.getText();
           String ss =st8.getText();
           
          
           try{
               
                String sql = "UPDATE year4semi2 SET ENGL42213  ='"+sub1+"',ENGL42223   ='"+sub2+"',ENGL42233  ='"+sub3+"',ENGL42243  ='"+sub4+"',ENGL43256  ='"+sub5+"',PCEN12333 ='"+sub6+"',PCEN11323 ='"+sub7+"'  WHERE SID = '"+sid+"'";
                String sq = "UPDATE results SET gpa ='"+gp+"',sem_status ='"+ss+"' WHERE SID = '"+sid+"'";
           
              
                
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               pst2.execute();
               tableLoad8(); //load table
                //JOptionPane.showMessageDialog(null, "Data UPDATED successfully in both tables..!");
           
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       } 
        
        
    }//GEN-LAST:event_update8ActionPerformed

    private void update4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update4ActionPerformed
      
      
        int x = JOptionPane.showConfirmDialog(null, "Do you Really want to UPDATE ?");
       
       if(x == 0)
       {
          String sid = SIDbox4.getText();
           String sub1 = ss16.getText();
           String sub2 = ss17.getText();
           String sub3 = ss18.getText();
           String sub4 = ss19.getText();
           String sub5 = ss20.getText();
           String sub6 = ss21.getText();
         
         
           String gp = gp4.getText();
           String ss =st4.getText();
           
          
           try{
               
                String sql = "UPDATE year2_semi2 SET ENGL22073  ='"+sub1+"',ENGL22083   ='"+sub2+"',ENGL22093  ='"+sub3+"',ENGL22293  ='"+sub4+"',PCEN11323  ='"+sub5+"',PCEN12333 ='"+sub6+"'  WHERE SID = '"+sid+"'";
                String sq = "UPDATE results SET gpa ='"+gp+"',sem_status ='"+ss+"' WHERE SID = '"+sid+"'";
           
              
                
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               pst2.execute();
               tableLoad4(); //load table
                //JOptionPane.showMessageDialog(null, "Data UPDATED successfully in both tables..!");
           
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       } 
          
        
    }//GEN-LAST:event_update4ActionPerformed

    private void update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update3ActionPerformed
       
        
        int x = JOptionPane.showConfirmDialog(null, "Do you Really want to UPDATE ?");
       
       if(x == 0)
       {
          String sid = SIDbox3.getText();
           String sub1 = ss9.getText();
           String sub2 = ss10.getText();
           String sub3 = ss11.getText();
           String sub4 = ss12.getText();
           String sub5 = ss13.getText();
           String sub6 = ss14.getText();
           String sub7 = ss15.getText();
         
           String gp = gp3.getText();
           String ss =st3.getText();
           
          
           try{
               
                String sql = "UPDATE year2sem1 SET ENGL21033  ='"+sub1+"',ENGL21043   ='"+sub2+"',ENGL21053  ='"+sub3+"',ENGL21063  ='"+sub4+"',ENGL21293  ='"+sub5+"',PCEN12333 ='"+sub6+"',PCEN11323  ='"+sub7+"'  WHERE SID = '"+sid+"'";
                String sq = "UPDATE results SET gpa ='"+gp+"',sem_status ='"+ss+"' WHERE SID = '"+sid+"'";
           
              
                
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               pst2.execute();
               tableLoad3(); //load table
                //JOptionPane.showMessageDialog(null, "Data UPDATED successfully in both tables..!");
           
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       } 
        
    }//GEN-LAST:event_update3ActionPerformed

    private void update5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update5ActionPerformed
     
        int x = JOptionPane.showConfirmDialog(null, "Do you Really want to UPDATE ?");
       
       if(x == 0)
       {
          String sid = SIDbox5.getText();
           String sub1 = ss22.getText();
           String sub2 = ss23.getText();
           String sub3 = ss24.getText();
           String sub4 = ss25.getText();
           String sub5 = ss26.getText();
           String sub6 = ss27.getText();
         
         
           String gp = gp5.getText();
           String ss =st5.getText();
           
          
           try{
               
                String sql = "UPDATE year3semi1 SET ENGL31103  ='"+sub1+"',ENGL31113   ='"+sub2+"',ENGL31123  ='"+sub3+"',ENGL31303  ='"+sub4+"',PCEN11323  ='"+sub5+"',PCEN12333 ='"+sub6+"'  WHERE SID = '"+sid+"'";
                String sq = "UPDATE results SET gpa ='"+gp+"',sem_status ='"+ss+"' WHERE SID = '"+sid+"'";
           
              
                
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               pst2.execute();
               tableLoad5(); //load table
                //JOptionPane.showMessageDialog(null, "Data UPDATED successfully in both tables..!");
           
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       } 
        
    }//GEN-LAST:event_update5ActionPerformed

    private void update6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update6ActionPerformed
        
         int x = JOptionPane.showConfirmDialog(null, "Do you Really want to UPDATE ?");
       
       if(x == 0)
       {
          String sid = SIDbox6.getText();
           String sub1 = ss28.getText();
           String sub2 = ss29.getText();
           String sub3 = ss30.getText();
           String sub4 = ss31.getText();
           String sub5 = ss32.getText();
           String sub6 = ss33.getText();
           String sub7 = ss34.getText();
         
         
           String gp = gp6.getText();
           String ss =st6.getText();
           
          
           try{
               
                String sql = "UPDATE year3sem2 SET ENGL32133  ='"+sub1+"',ENGL32143   ='"+sub2+"',ENGL32153  ='"+sub3+"',ENGL32163  ='"+sub4+"',ENGL32313  ='"+sub5+"',PCEN12333 ='"+sub6+"',PCEN11323 ='"+sub7+"'  WHERE SID = '"+sid+"'";
                String sq = "UPDATE results SET gpa ='"+gp+"',sem_status ='"+ss+"' WHERE SID = '"+sid+"'";
           
              
                
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               pst2.execute();
               tableLoad6(); //load table
                //JOptionPane.showMessageDialog(null, "Data UPDATED successfully in both tables..!");
           
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       } 
        
        
    }//GEN-LAST:event_update6ActionPerformed

    private void delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete3ActionPerformed
     
      int x = JOptionPane.showConfirmDialog(null, "Do You really want to DELETE this...?");
        
        if(x == 0)
        {
              String sid = SIDbox3.getText();
           String sub1 = ss9.getText();
           String sub2 = ss10.getText();
           String sub3 = ss11.getText();
           String sub4 = ss12.getText();
           String sub5 = ss13.getText();
           String sub6 = ss14.getText();
           String sub7 = ss15.getText();
         
           String gp = gp3.getText();
           String ss =st3.getText();
           
       try{
               
                String sql = "DELETE from year2sem1 WHERE SID = '"+sid+"'";
                String sq = "DELETE from results  WHERE SID = '"+sid+"'";
           
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               tableLoad3();
               pst2.execute();
               tableLoad3(); //load table
              // JOptionPane.showMessageDialog(null, "Data REMOVED successfully in both tables..!");
              
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       }    
        
    }//GEN-LAST:event_delete3ActionPerformed

    private void delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete4ActionPerformed
      
        int x = JOptionPane.showConfirmDialog(null, "Do You really want to DELETE this...?");
        
        if(x == 0)
        {
            String sid = SIDbox4.getText();
           String sub1 = ss16.getText();
           String sub2 = ss17.getText();
           String sub3 = ss18.getText();
           String sub4 = ss19.getText();
           String sub5 = ss20.getText();
           String sub6 = ss21.getText();
         
         
           String gp = gp4.getText();
           String ss =st4.getText();
       try{
               
                String sql = "DELETE from year2_semi2 WHERE SID = '"+sid+"'";
                String sq = "DELETE from results  WHERE SID = '"+sid+"'";
           
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               tableLoad4();
               pst2.execute();
               tableLoad4(); //load table
              // JOptionPane.showMessageDialog(null, "Data REMOVED successfully in both tables..!");
              
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       }    
        
        
    }//GEN-LAST:event_delete4ActionPerformed

    private void delete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete5ActionPerformed
      
        int x = JOptionPane.showConfirmDialog(null, "Do You really want to DELETE this...?");
        
        if(x == 0)
        {
            String sid = SIDbox5.getText();
           String sub1 = ss22.getText();
           String sub2 = ss23.getText();
           String sub3 = ss24.getText();
           String sub4 = ss25.getText();
           String sub5 = ss26.getText();
           String sub6 = ss27.getText();
         
         
           String gp = gp5.getText();
           String ss =st5.getText();
       try{
               
                String sql = "DELETE from year3semi1 WHERE SID = '"+sid+"'";
                String sq = "DELETE from results  WHERE SID = '"+sid+"'";
           
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               tableLoad5();
               pst2.execute();
               tableLoad5(); //load table
              // JOptionPane.showMessageDialog(null, "Data REMOVED successfully in both tables..!");
              
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
           
           
       }    
        
        
    }//GEN-LAST:event_delete5ActionPerformed

    private void delete6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete6ActionPerformed
     
         int x = JOptionPane.showConfirmDialog(null, "Do You really want to DELETE this...?");
        
      
       
           if(x == 0)
       {
          String sid = SIDbox6.getText();
           String sub1 = ss28.getText();
           String sub2 = ss29.getText();
           String sub3 = ss30.getText();
           String sub4 = ss31.getText();
           String sub5 = ss32.getText();
           String sub6 = ss33.getText();
           String sub7 = ss34.getText();
         
         
           String gp = gp6.getText();
           String ss =st6.getText();
           
       try{
               
                String sql = "DELETE from year3sem2 WHERE SID = '"+sid+"'";
                String sq = "DELETE from results  WHERE SID = '"+sid+"'";
           
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               tableLoad6();
               pst2.execute();
               tableLoad6(); //load table
              // JOptionPane.showMessageDialog(null, "Data REMOVED successfully in both tables..!");
              
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
       }
           
       
        
    }//GEN-LAST:event_delete6ActionPerformed

    private void delete7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete7ActionPerformed
       
            int x = JOptionPane.showConfirmDialog(null, "Do You really want to DELETE this...?");
        
      
       
           if(x == 0)
       {
          String sid = SIDbox7.getText();
        
       try{
               
                String sql = "DELETE from year4semi1 WHERE SID = '"+sid+"'";
                String sq = "DELETE from results  WHERE SID = '"+sid+"'";
           
               pst1 = (PreparedStatement) con.prepareStatement(sql);
               pst2 = (PreparedStatement) con.prepareStatement(sq);
               pst1.execute();
               tableLoad7();
               pst2.execute();
               tableLoad7(); //load table
              // JOptionPane.showMessageDialog(null, "Data REMOVED successfully in both tables..!");
              
           
           }
           catch(Exception e)
           {
               System.out.println(e.toString());
           }
          
       }
        
    }//GEN-LAST:event_delete7ActionPerformed

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
            java.util.logging.Logger.getLogger(updateAllGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateAllGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateAllGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateAllGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateAllGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ENGL22073;
    private javax.swing.JLabel ENGL22093;
    private javax.swing.JTextField SIDbox1;
    private javax.swing.JTextField SIDbox2;
    private javax.swing.JTextField SIDbox3;
    private javax.swing.JTextField SIDbox4;
    private javax.swing.JTextField SIDbox5;
    private javax.swing.JTextField SIDbox6;
    private javax.swing.JTextField SIDbox7;
    private javax.swing.JTextField SIDbox8;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear1;
    private javax.swing.JButton clear2;
    private javax.swing.JButton clear3;
    private javax.swing.JButton clear4;
    private javax.swing.JButton clear5;
    private javax.swing.JButton clear6;
    private javax.swing.JButton clear7;
    private javax.swing.JButton clear8;
    private javax.swing.JButton delete1;
    private javax.swing.JButton delete2;
    private javax.swing.JButton delete3;
    private javax.swing.JButton delete4;
    private javax.swing.JButton delete5;
    private javax.swing.JButton delete6;
    private javax.swing.JButton delete7;
    private javax.swing.JButton delete8;
    private javax.swing.JTextField gp3;
    private javax.swing.JTextField gp4;
    private javax.swing.JTextField gp5;
    private javax.swing.JTextField gp6;
    private javax.swing.JTextField gp7;
    private javax.swing.JTextField gp8;
    private javax.swing.JTextField gpa1;
    private javax.swing.JTextField gpa2;
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
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
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
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField s6;
    private javax.swing.JTextField s7;
    private javax.swing.JTextField s8;
    private javax.swing.JButton search1;
    private javax.swing.JButton search2;
    private javax.swing.JButton search3;
    private javax.swing.JButton search4;
    private javax.swing.JButton search5;
    private javax.swing.JButton search6;
    private javax.swing.JButton search7;
    private javax.swing.JButton search8;
    private javax.swing.JTextField ss10;
    private javax.swing.JTextField ss11;
    private javax.swing.JTextField ss12;
    private javax.swing.JTextField ss13;
    private javax.swing.JTextField ss14;
    private javax.swing.JTextField ss15;
    private javax.swing.JTextField ss16;
    private javax.swing.JTextField ss17;
    private javax.swing.JTextField ss18;
    private javax.swing.JTextField ss19;
    private javax.swing.JTextField ss20;
    private javax.swing.JTextField ss21;
    private javax.swing.JTextField ss22;
    private javax.swing.JTextField ss23;
    private javax.swing.JTextField ss24;
    private javax.swing.JTextField ss25;
    private javax.swing.JTextField ss26;
    private javax.swing.JTextField ss27;
    private javax.swing.JTextField ss28;
    private javax.swing.JTextField ss29;
    private javax.swing.JTextField ss30;
    private javax.swing.JTextField ss31;
    private javax.swing.JTextField ss32;
    private javax.swing.JTextField ss33;
    private javax.swing.JTextField ss34;
    private javax.swing.JTextField ss35;
    private javax.swing.JTextField ss36;
    private javax.swing.JTextField ss37;
    private javax.swing.JTextField ss38;
    private javax.swing.JTextField ss39;
    private javax.swing.JTextField ss40;
    private javax.swing.JTextField ss41;
    private javax.swing.JTextField ss42;
    private javax.swing.JTextField ss43;
    private javax.swing.JTextField ss44;
    private javax.swing.JTextField ss45;
    private javax.swing.JTextField ss46;
    private javax.swing.JTextField ss47;
    private javax.swing.JTextField ss9;
    private javax.swing.JTextField st1;
    private javax.swing.JTextField st2;
    private javax.swing.JTextField st3;
    private javax.swing.JTextField st4;
    private javax.swing.JTextField st5;
    private javax.swing.JTextField st6;
    private javax.swing.JTextField st7;
    private javax.swing.JTextField st8;
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
