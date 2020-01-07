
package cgpa_project;
import javax.swing.*;
import java.awt.*;

public class CGPA_Calculator_Part2 extends javax.swing.JFrame {
             String Name;
              String ID;
              String s1;
              String s2;
              String s3;
              String s4;
              
              String sc1;
              String sc2;
              String sc3;
              String sc4;
              
               int mark1;
               int mark2;
               int mark3;
               int mark4;
             
             String Letter1;
             String Letter2;
             String Letter3;
             String Letter4;
                     
             float point1;
             float point2;
             float point3;
             float point4;
             String SemesterNo;
             String Save;
             
             int move=10;
             String msg="DIU CGPA(SWE)MANAGEMENT SYSTEM";
    public CGPA_Calculator_Part2() {
        initComponents();
    }
    public void paint(Graphics g){
       super.paint(g);
      g.setColor(Color.blue);
      g.drawString(msg, move++, 75);
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
        Choose2ndSemester2 = new javax.swing.JButton();
        Choose3rdSemester3 = new javax.swing.JButton();
        Choose5thSemester5 = new javax.swing.JButton();
        Choose10thSemester10 = new javax.swing.JButton();
        Choose7thSemester7 = new javax.swing.JButton();
        Choose9thSemester9 = new javax.swing.JButton();
        Error = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Mark4 = new javax.swing.JTextField();
        SemesNo = new javax.swing.JLabel();
        Moving_String = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        Choose2ndSemester2.setText("2nd");
        Choose2ndSemester2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose2ndSemester2ActionPerformed(evt);
            }
        });

        Choose3rdSemester3.setText("3rd");
        Choose3rdSemester3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose3rdSemester3ActionPerformed(evt);
            }
        });

        Choose5thSemester5.setText("5th");
        Choose5thSemester5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose5thSemester5ActionPerformed(evt);
            }
        });

        Choose10thSemester10.setText("10th");
        Choose10thSemester10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose10thSemester10ActionPerformed(evt);
            }
        });

        Choose7thSemester7.setText("7th");
        Choose7thSemester7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose7thSemester7ActionPerformed(evt);
            }
        });

        Choose9thSemester9.setText("9th");
        Choose9thSemester9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose9thSemester9ActionPerformed(evt);
            }
        });

        jLabel6.setText("Mark 4");

        Moving_String.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Moving_StringAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Back.setText("<---");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Moving_StringLayout = new javax.swing.GroupLayout(Moving_String);
        Moving_String.setLayout(Moving_StringLayout);
        Moving_StringLayout.setHorizontalGroup(
            Moving_StringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Moving_StringLayout.createSequentialGroup()
                .addComponent(Back)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Moving_StringLayout.setVerticalGroup(
            Moving_StringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Moving_StringLayout.createSequentialGroup()
                .addComponent(Back)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jLabel7.setText("   /");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CGPA_PanelLayout = new javax.swing.GroupLayout(CGPA_Panel);
        CGPA_Panel.setLayout(CGPA_PanelLayout);
        CGPA_PanelLayout.setHorizontalGroup(
            CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Choose2ndSemester2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Choose3rdSemester3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Choose5thSemester5))
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
                                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CGPA_PanelLayout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(Mark1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(16, 16, 16)
                                                .addComponent(Mark2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)))
                                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(Mark3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Mark4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(Add_Mark)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                        .addComponent(Choose7thSemester7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Choose9thSemester9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Choose10thSemester10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CGPA_PanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(43, 43, 43))))
            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                        .addComponent(SemesNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                .addComponent(Moving_String, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CGPA_PanelLayout.setVerticalGroup(
            CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CGPA_PanelLayout.createSequentialGroup()
                .addComponent(Moving_String, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Choose2ndSemester2)
                        .addComponent(Choose3rdSemester3)
                        .addComponent(Choose5thSemester5)
                        .addComponent(Choose10thSemester10)
                        .addComponent(Choose7thSemester7)
                        .addComponent(Choose9thSemester9)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
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
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mark1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mark2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mark3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mark4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(Add_Mark))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CGPA_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CGPA_PanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CGPA_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SemesNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
           try{

            mark4=Integer.parseInt(Mark4.getText());
            if(mark4>100 || mark4<0){
                Error.setText("   Please Enter a Number Between 1 -100 in Mark4 ");
            }
        }
        catch(Exception e){
            Error.setText("   Please Enter a Number Between 1 -100 in Mark4 ");
        }

        CGPA_Project shakeeb=new CGPA_Project();
        Letter1=shakeeb.mark1st(mark1);
        Letter2=shakeeb.mark1st(mark2);
        Letter3=shakeeb.mark1st(mark3);
        Letter4=shakeeb.mark1st(mark4);
        point1=shakeeb.point1st(mark1);
        point2=shakeeb.point1st(mark2);
        point3=shakeeb.point1st(mark3);
        point4=shakeeb.point1st(mark4);

      jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1, sc1, mark1, Letter1, point1},
        {s2, sc2, mark2, Letter2, point2},
        {s3, sc3, mark3, Letter3, point3},
        {s4, sc4, mark4, Letter4, point4}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));
       SemesNo.setText(SemesterNo);
          
         if((mark1>100 || mark1<0) || (mark2>100 || mark2<0) || (mark3>100 || mark3<0) ||(mark4>100 || mark4<0) ){
         msg="Please Enter Mark Between 1-100";
         }
         else{
       OutputSemesters4Subjects shakeeb1=new OutputSemesters4Subjects(Name,ID,s1,s2,s3,s4,sc1,sc2,sc3,sc4,mark1,mark2,mark3,mark4,Letter1,Letter2,Letter3,Letter4,point1,point2,point3,point4,Save,SemesterNo);
         shakeeb1.setVisible(true);}

    }//GEN-LAST:event_Add_MarkActionPerformed

    private void Choose2ndSemester2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose2ndSemester2ActionPerformed
        // TODO add your handling code here:
        CGPA_Project shakeeb=new CGPA_Project();
        shakeeb.Semester2();
        Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 2\\";
         SemesterNo="Semester 2";
        
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=shakeeb.Sub1, sc1=shakeeb.Scode1, null, null, null},
        {s2=shakeeb.Sub2, sc2=shakeeb.Scode2, null, null, null},
        {s3=shakeeb.Sub3, sc3=shakeeb.Scode3, null, null, null},
        {s4=shakeeb.Sub4, sc4=shakeeb.Scode4, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));
    }//GEN-LAST:event_Choose2ndSemester2ActionPerformed

    private void Choose3rdSemester3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose3rdSemester3ActionPerformed
        // TODO add your handling code here:
          CGPA_Project shakeeb=new CGPA_Project();
        shakeeb.Semester3();
           Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 3\\";
           SemesterNo="Semester 3";
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=shakeeb.Sub1, sc1=shakeeb.Scode1, null, null, null},
        {s2=shakeeb.Sub2, sc2=shakeeb.Scode2, null, null, null},
        {s3=shakeeb.Sub3, sc3=shakeeb.Scode3, null, null, null},
        {s4=shakeeb.Sub4, sc4=shakeeb.Scode4, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));
      
    }//GEN-LAST:event_Choose3rdSemester3ActionPerformed

    private void Choose5thSemester5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose5thSemester5ActionPerformed
        // TODO add your handling code here:
        
          CGPA_Project shakeeb=new CGPA_Project();
        shakeeb.Semester5();
          Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 5\\";
          SemesterNo="Semester 5";
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=shakeeb.Sub1, sc1=shakeeb.Scode1, null, null, null},
        {s2=shakeeb.Sub2, sc2=shakeeb.Scode2, null, null, null},
        {s3=shakeeb.Sub3, sc3=shakeeb.Scode3, null, null, null},
        {s4=shakeeb.Sub4, sc4=shakeeb.Scode4, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));
     

    }//GEN-LAST:event_Choose5thSemester5ActionPerformed

    private void Choose10thSemester10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose10thSemester10ActionPerformed
        // TODO add your handling code here:
          CGPA_Project shakeeb=new CGPA_Project();
        shakeeb.Semester10();
          Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 10\\";
          SemesterNo="Semester 10";
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=shakeeb.Sub1, sc1=shakeeb.Scode1, null, null, null},
        {s2=shakeeb.Sub2, sc2=shakeeb.Scode2, null, null, null},
        {s3=shakeeb.Sub3, sc3=shakeeb.Scode3, null, null, null},
        {s4=shakeeb.Sub4, sc4=shakeeb.Scode4, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));

    
    }//GEN-LAST:event_Choose10thSemester10ActionPerformed

    private void Choose7thSemester7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose7thSemester7ActionPerformed
        // TODO add your handling code here:
          CGPA_Project shakeeb=new CGPA_Project();
        shakeeb.Semester7();
          Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 7\\";
          SemesterNo="Semester 7";
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=shakeeb.Sub1, sc1=shakeeb.Scode1, null, null, null},
        {s2=shakeeb.Sub2, sc2=shakeeb.Scode2, null, null, null},
        {s3=shakeeb.Sub3, sc3=shakeeb.Scode3, null, null, null},
        {s4=shakeeb.Sub4, sc4=shakeeb.Scode4, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));
       
    }//GEN-LAST:event_Choose7thSemester7ActionPerformed

    private void Choose9thSemester9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose9thSemester9ActionPerformed
        // TODO add your handling code here:
          CGPA_Project shakeeb=new CGPA_Project();
        shakeeb.Semester9();
          Save="D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 9\\";
          SemesterNo="Semester 9";
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {s1=shakeeb.Sub1, sc1=shakeeb.Scode1, null, null, null},
        {s2=shakeeb.Sub2, sc2=shakeeb.Scode2, null, null, null},
        {s3=shakeeb.Sub3, sc3=shakeeb.Scode3, null, null, null},
        {s4=shakeeb.Sub4, sc4=shakeeb.Scode4, null, null, null}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));

     
    }//GEN-LAST:event_Choose9thSemester9ActionPerformed

    private void Moving_StringAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Moving_StringAncestorAdded
        // TODO add your handling code here:
        try{
        paint(null);}
        catch(Exception e){
            
        }
    }//GEN-LAST:event_Moving_StringAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InputName.setText("");
        ID_Input.setText("");
        Mark1.setText("");
        Mark2.setText("");
        Mark3.setText("");
        Mark4.setText("");
        Error.setText("");
        msg="DIU CGPA(SWE)MANAGEMENT SYSTEM";
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CGPA_Calculator shakeeb=new CGPA_Calculator();
        shakeeb.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void CGPA_PanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CGPA_PanelAncestorAdded
        // TODO add your handling code here:
     
      
     
    }//GEN-LAST:event_CGPA_PanelAncestorAdded

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Mark;
    private javax.swing.JButton Back;
    private javax.swing.JPanel CGPA_Panel;
    private javax.swing.JButton Choose10thSemester10;
    private javax.swing.JButton Choose2ndSemester2;
    private javax.swing.JButton Choose3rdSemester3;
    private javax.swing.JButton Choose5thSemester5;
    private javax.swing.JButton Choose7thSemester7;
    private javax.swing.JButton Choose9thSemester9;
    private javax.swing.JLabel Error;
    private javax.swing.JTextField ID_Input;
    private javax.swing.JLabel ID_Label;
    private javax.swing.JTextField InputName;
    private javax.swing.JTextField Mark1;
    private javax.swing.JTextField Mark2;
    private javax.swing.JTextField Mark3;
    private javax.swing.JTextField Mark4;
    private javax.swing.JPanel Moving_String;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JLabel SemesNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
