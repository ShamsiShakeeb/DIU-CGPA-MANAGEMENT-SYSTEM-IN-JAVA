
package cgpa_project;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;


public class OutputSemesters4Subjects extends javax.swing.JFrame {
              String opName;
              String opID;
              String ops1;
              String ops2;
              String ops3;
              String ops4;
              
              String opsc1;
              String opsc2;
              String opsc3;
              String opsc4;
              
               int opmark1;
               int opmark2;
               int opmark3;
               int opmark4;
               
             String opLetter1;
             String opLetter2;
             String opLetter3;
             String opLetter4;
             
             float oppoint1;
             float oppoint2;
             float oppoint3;
             float oppoint4;
             String SemesterNo;
             String dirSave;
   
    public OutputSemesters4Subjects(String Name,String ID,String sub1,String sub2,String sub3,String sub4,String sc1,String sc2,String sc3,String sc4,int mark1,int mark2,int mark3,int mark4,String Letter1,String Letter2,String Letter3,String Letter4,float point1,float point2,float point3,float point4,String Save,String SemiNo) {
                opName=Name;
               opID=ID;
               ops1=sub1;
              
               ops2=sub2;
               ops3=sub3;
               ops4=sub4;
               
               opsc1=sc1;
               opsc2=sc2;
               opsc3=sc3;
               opsc4=sc4;
               
                opmark1=mark1;
                opmark2=mark2;
                opmark3=mark3;
                opmark4=mark4;
                
              opLetter1=Letter1;
              opLetter2=Letter2;
              opLetter3=Letter3;
              opLetter4=Letter4;
              
              oppoint1=point1;
              oppoint2=point2;
              oppoint3=point3;
              oppoint4=point4;
              SemesterNo=SemiNo;
              dirSave=Save;
        initComponents();
    }
       public static BufferedImage getScreenShot(Component component) {

        BufferedImage image = new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);
        // paints into image's Graphics
        component.paint(image.getGraphics());
        return image;}
           public static void getSaveSnapShot(Component component, String fileName) throws Exception {
        BufferedImage img = getScreenShot(component);
        // write the captured image as a PNG
        ImageIO.write(img, "png", new File(fileName));
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OutputSemesterfor3sub = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CGPA_Table2 = new javax.swing.JTable();
        Name_Label1 = new javax.swing.JLabel();
        ID_Label = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Average_Table2 = new javax.swing.JTable();
        Save_Result = new javax.swing.JButton();
        Error_SMS = new javax.swing.JLabel();
        SemesNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        OutputSemesterfor3sub.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                OutputSemesterfor3subAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        CGPA_Table2.setModel(new javax.swing.table.DefaultTableModel(
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
        CGPA_Table2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CGPA_Table2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(CGPA_Table2);

        Name_Label1.setText("Name:");

        ID_Label.setText("  ID:");

        Name.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                NameAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ID.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                IDAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cgpa_project/Diu.png"))); // NOI18N

        Average_Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Average Letter", "Average Point"
            }
        ));
        Average_Table2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Average_Table2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(Average_Table2);

        Save_Result.setText("Result");
        Save_Result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_ResultActionPerformed(evt);
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

        javax.swing.GroupLayout OutputSemesterfor3subLayout = new javax.swing.GroupLayout(OutputSemesterfor3sub);
        OutputSemesterfor3sub.setLayout(OutputSemesterfor3subLayout);
        OutputSemesterfor3subLayout.setHorizontalGroup(
            OutputSemesterfor3subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(OutputSemesterfor3subLayout.createSequentialGroup()
                .addGroup(OutputSemesterfor3subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OutputSemesterfor3subLayout.createSequentialGroup()
                        .addComponent(SemesNo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error_SMS, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OutputSemesterfor3subLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(OutputSemesterfor3subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OutputSemesterfor3subLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Name_Label1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OutputSemesterfor3subLayout.createSequentialGroup()
                                .addGroup(OutputSemesterfor3subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(OutputSemesterfor3subLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(ID_Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(OutputSemesterfor3subLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(Save_Result)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        OutputSemesterfor3subLayout.setVerticalGroup(
            OutputSemesterfor3subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutputSemesterfor3subLayout.createSequentialGroup()
                .addComponent(Save_Result)
                .addGap(10, 10, 10)
                .addGroup(OutputSemesterfor3subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(OutputSemesterfor3subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OutputSemesterfor3subLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error_SMS, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(OutputSemesterfor3subLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OutputSemesterfor3subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID_Label)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(SemesNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OutputSemesterfor3sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OutputSemesterfor3sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CGPA_Table2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CGPA_Table2AncestorAdded
            CGPA_Table2.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {ops1, opsc1, opmark1, opLetter1, oppoint1},
        {ops2, opsc2, opmark2, opLetter2, oppoint2},
        {ops3, opsc3, opmark3, opLetter3, oppoint3},
        {ops4, opsc4, opmark4, opLetter4, oppoint4}
    },
    new String [] {
        "Subject Name", "Subject Code", "     Mark", "Grade Letter", "Grade Point"
    }
));

       

    }//GEN-LAST:event_CGPA_Table2AncestorAdded

    private void NameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_NameAncestorAdded
        // TODO add your handling code here:
        Name.setText(opName);
    }//GEN-LAST:event_NameAncestorAdded

    private void IDAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_IDAncestorAdded
        // TODO add your handling code here:

        ID.setText(opID);
    }//GEN-LAST:event_IDAncestorAdded

    private void Average_Table2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Average_Table2AncestorAdded
        // TODO add your handling code here:

        float avg_point=(oppoint1+oppoint2+oppoint3+oppoint4)/4;
        CGPA_Project shakeeb= new CGPA_Project();
        String avg_Letter=shakeeb.avgletter(avg_point);

        Average_Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {avg_Letter, avg_point}
            },
            new String [] {
                "Average Letter", "Average Point"
            }
        ));

    }//GEN-LAST:event_Average_Table2AncestorAdded

    private void Save_ResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_ResultActionPerformed
        // TODO add your handling code here:
        String s=".png";
        try {
            getSaveSnapShot(OutputSemesterfor3sub, dirSave+opID +s);
               SaveMsg shakeeb=new SaveMsg(dirSave);
              shakeeb.setVisible(true);
                   setVisible(false);
        } catch (Exception ex) {
            Error_SMS.setText("       Please Set The Directory!");
            setVisible(true);
            // Logger.getLogger(Output1stSemester.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
     
    }//GEN-LAST:event_Save_ResultActionPerformed

    private void SemesNoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_SemesNoAncestorAdded
        // TODO add your handling code here:
        
        SemesNo.setText(SemesterNo);
    }//GEN-LAST:event_SemesNoAncestorAdded

    private void OutputSemesterfor3subAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_OutputSemesterfor3subAncestorAdded
        // TODO add your handling code here:
       
    }//GEN-LAST:event_OutputSemesterfor3subAncestorAdded

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Average_Table2;
    private javax.swing.JTable CGPA_Table2;
    private javax.swing.JLabel Error_SMS;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ID_Label;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name_Label1;
    private javax.swing.JPanel OutputSemesterfor3sub;
    private javax.swing.JButton Save_Result;
    private javax.swing.JLabel SemesNo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
