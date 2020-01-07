
package cgpa_project;
import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CGPA_Calculator extends javax.swing.JFrame {
              String Name;
              String ID;
              String s1;
              String s2;
              String s3;
              
              String sc1;
              String sc2;
              String sc3;
              
               int mark1;
               int mark2;
               int mark3;
             
             String Letter1;
             String Letter2;
             String Letter3;
             
             float point1;
             float point2;
             float point3;
             String SemesterNo;
             String Save;
   
             int move=10;
             
              String msg="DIU CGPA(SWE)MANAGEMENT SYSTEM";
            
           
    public CGPA_Calculator() { 
           
        initComponents();
    }
    
  
 
  
   
   
    
    public void paint(Graphics g){
  //   CGPA_Project shakeeb=new CGPA_Project();
    
      super.paint(g);
      g.setColor(Color.blue);
      g.drawString(msg, move++, 80);
     
      try{
      Thread.sleep(20);}
      catch(Exception e){
          
      }
      if(move==600)
          move=0;
      repaint();
    }
   
        

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        CGPA_Panel = new javax.swing.JPanel();
        Name_Label = new javax.swing.JLabel();
        InputName = new javax.swing.JTextField();
        ID_Label = new javax.swing.JLabel();
        ID_Input = new javax.swing.JTextField();
        Mark1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Mark3 = new javax.swing.JTextField();
        Mark2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Add_Mark = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Choose1stSemester = new javax.swing.JButton();
        Choose4thSemester4 = new javax.swing.JButton();
        Choose6thSemester6 = new javax.swing.JButton();
        Choose12thSemester12 = new javax.swing.JButton();
        Choose8thSemester9 = new javax.swing.JButton();
        Choose11thSemester11 = new javax.swing.JButton();
        Error = new javax.swing.JLabel();
        SemesNo = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Moving_String = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        More = new javax.swing.JMenu();
        Directory = new javax.swing.JMenuItem();
        MoreSemesters = new javax.swing.JMenuItem();

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
        jScrollPane2.setViewportView(jTable2);

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CGPA_Panel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CGPA_PanelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Name_Label.setText("Name:");

        ID_Label.setText("   ID");

        jLabel2.setText("    Mark 1");

        jLabel3.setText("    Mark 2");

        jLabel4.setText("    Mark 3");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
            }
        ));
        jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cgpa_project/Diu.png"))); // NOI18N

        Add_Mark.setText("Add Mark");
        Add_Mark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_MarkActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose Semester:");

        Choose1stSemester.setText("1st");
        Choose1stSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose1stSemesterActionPerformed(evt);
            }
        });

        Choose4thSemester4.setText("4th");
        Choose4thSemester4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose4thSemester4ActionPerformed(evt);
            }
        });

        Choose6thSemester6.setText("6th");
        Choose6thSemester6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose6thSemester6ActionPerformed(evt);
            }
        });

        Choose12thSemester12.setText("12th");
        Choose12thSemester12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose12thSemester12ActionPerformed(evt);
            }
        });

        Choose8thSemester9.setText("8th");
        Choose8thSemester9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose8thSemester9ActionPerformed(evt);
            }
        });

        Choose11thSemester11.setText("11th");
        Choose11thSemester11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose11thSemester11ActionPerformed(evt);
            }
        });

        SemesNo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                SemesNoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        jLabel6.setText("  /");

        Moving_String.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Moving_StringAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout Moving_StringLayout = new javax.swing.GroupLayout(Moving_String);
        Moving_String.setLayout(Moving_StringLayout);
        Moving_StringLayout.setHorizontalGroup(
            Moving_StringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Moving_StringLayout.setVerticalGroup(
            Moving_StringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CGPA_PanelLayout = new javax.swing.GroupLayout(CGPA_Panel);
        CGPA_Panel.setLayout(CGPA_PanelLayout);
        CGPA_PanelLayout.setHorizontalGroup(
            CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                .addComponent(SemesNo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Name_Label)
                                            .addComponent(ID_Label))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(InputName)
                                            .addComponent(ID_Input, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(Mark1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(Mark2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(37, 37, 37)
                                                        .addComponent(Mark3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18))
                                                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(Add_Mark)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Choose1stSemester)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Choose4thSemester4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Choose6thSemester6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(Choose8thSemester9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Choose11thSemester11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Choose12thSemester12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Refresh)))
                .addContainerGap())
            .addComponent(Moving_String, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CGPA_PanelLayout.setVerticalGroup(
            CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                .addComponent(Moving_String, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Choose1stSemester)
                    .addComponent(Choose4thSemester4)
                    .addComponent(Choose6thSemester6)
                    .addComponent(Choose12thSemester12)
                    .addComponent(Choose8thSemester9)
                    .addComponent(Choose11thSemester11)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CGPA_PanelLayout.createSequentialGroup()
                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID_Label)
                            .addComponent(ID_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mark1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mark2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mark3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(Add_Mark)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CGPA_PanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SemesNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        More.setText("Other Semesters & Directory");

        Directory.setText("Set Directory");
        Directory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectoryActionPerformed(evt);
            }
        });
        More.add(Directory);

        MoreSemesters.setText("More Semesters");
        MoreSemesters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoreSemestersActionPerformed(evt);
            }
        });
        More.add(MoreSemesters);

        jMenuBar1.add(More);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CGPA_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CGPA_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable3AncestorAdded
  
    }//GEN-LAST:event_jTable3AncestorAdded

    private void Choose1stSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose1stSemesterActionPerformed
        // TODO add your handling code here:
        CGPA_Project s=new  CGPA_Project();
        s.Semester1();
        
        Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 1\\";
        SemesterNo="Semester 1";
        
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=s.Sub1,sc1=s.Scode1, null, null, null},
        {s2=s.Sub2,sc2=s.Scode2, null, null, null},
        {s3=s.Sub3,sc3=s.Scode3, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));



jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
    public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
    }
    public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        jTable3AncestorAdded(evt);
    }
    public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
    }
});

jScrollPane3.setViewportView(jTable3);


    
    }//GEN-LAST:event_Choose1stSemesterActionPerformed

    private void Choose6thSemester6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose6thSemester6ActionPerformed
        // TODO add your handling code here:
        CGPA_Project shakeeb=new CGPA_Project();
        shakeeb.Semester6();
        
         Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 6\\";
         SemesterNo="Semester 6";
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=shakeeb.Sub1,sc1=shakeeb.Scode1, null, null, null},
        {s2=shakeeb.Sub2,sc2=shakeeb.Scode2, null, null, null},
        {s3=shakeeb.Sub3,sc3=shakeeb.Scode3, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));



jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
    public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
    }
    public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        jTable3AncestorAdded(evt);
    }
    public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
    }
});

jScrollPane3.setViewportView(jTable3);



     
    }//GEN-LAST:event_Choose6thSemester6ActionPerformed

    private void Choose12thSemester12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose12thSemester12ActionPerformed
        // TODO add your handling code here:
        
        CGPA_Project shakeeb=new CGPA_Project();
        shakeeb.Semester12();
        
         Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 12\\";
         SemesterNo="Semester 12";
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=shakeeb.Sub1,sc1=shakeeb.Scode1, null, null, null},
        {s2=shakeeb.Sub2,sc2=shakeeb.Scode2, null, null, null},
        {s3=shakeeb.Sub3,sc3=shakeeb.Scode3, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));



jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
    public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
    }
    public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        jTable3AncestorAdded(evt);
    }
    public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
    }
});

jScrollPane3.setViewportView(jTable3);



    }//GEN-LAST:event_Choose12thSemester12ActionPerformed

    private void Choose8thSemester9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose8thSemester9ActionPerformed
        // TODO add your handling code here:
        CGPA_Project shakeeb=new CGPA_Project();
        shakeeb.Semester8();
        
         Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 8\\";
         SemesterNo="Semester 8";
         
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=shakeeb.Sub1,sc1=shakeeb.Scode1, null, null, null},
        {s2=shakeeb.Sub2,sc2=shakeeb.Scode2, null, null, null},
        {s3=shakeeb.Sub3,sc3=shakeeb.Scode3, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));



jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
    public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
    }
    public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        jTable3AncestorAdded(evt);
    }
    public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
    }
});

jScrollPane3.setViewportView(jTable3);



    }//GEN-LAST:event_Choose8thSemester9ActionPerformed

    private void Choose11thSemester11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose11thSemester11ActionPerformed
        // TODO add your handling code here:
        
        CGPA_Project shakeeb=new CGPA_Project();
        shakeeb.Semester11();
        
         Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 11\\";
         SemesterNo="Semester 11";
         
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=shakeeb.Sub1,sc1=shakeeb.Scode1, null, null, null},
        {s2=shakeeb.Sub2,sc2=shakeeb.Scode2, null, null, null},
        {s3=shakeeb.Sub3,sc3=shakeeb.Scode3, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));



jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
    public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
    }
    public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        jTable3AncestorAdded(evt);
    }
    public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
    }
});

jScrollPane3.setViewportView(jTable3);

    }//GEN-LAST:event_Choose11thSemester11ActionPerformed

    private void Choose4thSemester4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose4thSemester4ActionPerformed
        // TODO add your handling code here:
         CGPA_Project shakeeb=new  CGPA_Project();
         shakeeb.Semester4();
         
         Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 4\\";
          SemesterNo="Semester 4";
         jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=shakeeb.Sub1,sc1=shakeeb.Scode1, null, null, null},
        {s2=shakeeb.Sub2,sc2=shakeeb.Scode2, null, null, null},
        {s3=shakeeb.Sub3,sc3=shakeeb.Scode3, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));



jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
    public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
    }
    public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        jTable3AncestorAdded(evt);
    }
    public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
    }
});

jScrollPane3.setViewportView(jTable3);     
    }//GEN-LAST:event_Choose4thSemester4ActionPerformed

    private void Add_MarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_MarkActionPerformed
        // TODO add your handling code here:
     
        Name=InputName.getText();
        ID=ID_Input.getText();
        
        try{
        mark1=Integer.parseInt(Mark1.getText());
         if(mark1>100 || mark1<0){
            Error.setText("   Please Enter a Number Between 1 -100 in Mark1 ");
        }
        }
        catch(Exception e){
            Error.setText("   Please Enter a Number Between 1 -100 in Mark2");
        }
        try{
            
        mark2=Integer.parseInt(Mark2.getText());
         if(mark2>100 || mark2<0){
            Error.setText("   Please Enter a Number Between 1 -100 in Mark2 ");
        }
        }
        catch(Exception e){
             Error.setText("   Please Enter a Number Between 1 -100 in Mark2 ");
        }
        try{
            
        mark3=Integer.parseInt(Mark3.getText());
         if(mark3>100 || mark3<0){
            Error.setText("   Please Enter a Number Between 1 -100 in Mark3 ");
        }
        }
        catch(Exception e){
            Error.setText("   Please Enter a Number Between 1 -100 in Mark3 ");
        }
        
        CGPA_Project shakeeb=new CGPA_Project();
        Letter1=shakeeb.mark1st(mark1);
        Letter2=shakeeb.mark1st(mark2);
        Letter3=shakeeb.mark1st(mark3);
        point1=shakeeb.point1st(mark1);
        point2=shakeeb.point1st(mark2);
        point3=shakeeb.point1st(mark3);
        
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1, sc1, mark1, Letter1, point1},
        {s2, sc2, mark2, Letter2, point2},
        {s3, sc3, mark3, Letter3, point3}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));



jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
    public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
    }
    public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        jTable3AncestorAdded(evt);
    }
    public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
    }
});

jScrollPane3.setViewportView(jTable3);
         
         
         SemesNo.setText(SemesterNo);
          
         if((mark1>100 || mark1<0) || (mark2>100 || mark2<0) || (mark3>100 || mark3<0)){
         msg="Please Enter Mark Between 1-100";
         }
         else{
         OutputSemesters3Subjects shakeeb1=new OutputSemesters3Subjects(Name,ID,s1,s2,s3,sc1,sc2,sc3,mark1,mark2,mark3,Letter1,Letter2,Letter3,point1,point2,point3,Save,SemesterNo);
         shakeeb1.setVisible(true);}

        
     
    }//GEN-LAST:event_Add_MarkActionPerformed

    private void MoreSemestersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoreSemestersActionPerformed
        // TODO add your handling code here:
        CGPA_Calculator_Part2 shakeeb1=new CGPA_Calculator_Part2();
        shakeeb1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MoreSemestersActionPerformed

    private void SemesNoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_SemesNoAncestorAdded
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_SemesNoAncestorAdded

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        InputName.setText("");
        ID_Input.setText("");
        Mark1.setText("");
        Mark2.setText("");
        Mark3.setText("");
       
        Error.setText("");
        msg="DIU CGPA(SWE)MANAGEMENT SYSTEM";
    }//GEN-LAST:event_RefreshActionPerformed

    private void Moving_StringAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Moving_StringAncestorAdded
        // TODO add your handling code here:  
         try{
          paint(null); }
         catch(Exception e){
             
         }
    }//GEN-LAST:event_Moving_StringAncestorAdded

    private void DirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectoryActionPerformed
        // TODO add your handling code here:
        CGPA_Project shakeeb=new CGPA_Project();
        shakeeb.Folder();
        msg="Directory Created on D Drive";
    }//GEN-LAST:event_DirectoryActionPerformed

    private void CGPA_PanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CGPA_PanelAncestorAdded
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_CGPA_PanelAncestorAdded

    
    public static void main(String args[]) {
    
      
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CGPA_Calculator().setVisible(true);
                                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Mark;
    private javax.swing.JPanel CGPA_Panel;
    private javax.swing.JButton Choose11thSemester11;
    private javax.swing.JButton Choose12thSemester12;
    private javax.swing.JButton Choose1stSemester;
    private javax.swing.JButton Choose4thSemester4;
    private javax.swing.JButton Choose6thSemester6;
    private javax.swing.JButton Choose8thSemester9;
    private javax.swing.JMenuItem Directory;
    private javax.swing.JLabel Error;
    private javax.swing.JTextField ID_Input;
    private javax.swing.JLabel ID_Label;
    private javax.swing.JTextField InputName;
    private javax.swing.JTextField Mark1;
    private javax.swing.JTextField Mark2;
    private javax.swing.JTextField Mark3;
    private javax.swing.JMenu More;
    private javax.swing.JMenuItem MoreSemesters;
    private javax.swing.JPanel Moving_String;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel SemesNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
