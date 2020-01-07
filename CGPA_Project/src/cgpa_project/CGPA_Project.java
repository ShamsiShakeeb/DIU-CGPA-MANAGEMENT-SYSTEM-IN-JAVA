
package cgpa_project;
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class CGPA_Project {
    String Sub1;
    String Scode1;
    String Sub2;
    String Scode2;
    String Sub3;
    String Scode3; 
    String Sub4;
    String Scode4;
    int mark1;
    String letter1;
    float Point1;
   
    public void Semester1(){
         Sub1="Computer Fundamentals With Lab";
         Scode1="SWE113";
        
         Sub2="Introduction To Software Engineering";
         Scode2="SWE114";
        
         Sub3="Physics-| With lab";
         Scode3="PHY114";
    }
    public void Semester2(){
         Sub1="Basic Functional English And English Spoken";
         Scode1="ENG121";
        
         Sub2="Math-|";
         Scode2="MAT111";
        
         Sub3="Software Requirement Analysis And Design";
         Scode3="SWE121";
         
         Sub4="programming with lab";
         Scode4="SWE124";
        
    }
    
    public void Semester3(){
         Sub1="Math-||";
         Scode1="MAT121";
        
         Sub2="Data Structure With Lab";
         Scode2="SWE133";
        
         Sub3="Statistics & Probabilities";
         Scode3="STA131";
         
         Sub4="Project With lab";
         Scode4="SWE134";
        
    }
    
    public void Semester4(){
         Sub1="Java Programming with Lab";
         Scode1="SWE212";
        
         Sub2="Computer Algorithms With lab";
         Scode2="SWE214";
        
         Sub3="Introduction To Data-base with lab";
         Scode3="SWE216";
    }
    
    public void Semester5(){
         Sub1="Discrete Mathematics";
         Scode1="SWE221";
        
         Sub2="Software Engineering Quality Assurance & Testing";
         Scode2="SWE222";
        
         Sub3="Digital Electronics with lab";
         Scode3="SWE224";
         
         Sub4="Software Project Management";
         Scode4="SWE225";
        
    }
    
    public void Semester6(){
         Sub1="Documentation Of Software Engineering";
         Scode1="SWE231";
        
         Sub2="Operating System With Lab";
         Scode2="SWE233";
        
         Sub3="Object Oriented Concepts And Design With Lab";
         Scode3="SWE235";
    }
    
    public void Semester7(){
         Sub1="Principal Of Accounting";
         Scode1="ACC301";
        
         Sub2="Computer Architecture & Organization";
         Scode2="SWE311";
        
         Sub3="Theory Of Computing";
         Scode3="SWE312";
         
         Sub4=".net programming with lab";
         Scode4="SWE314";
        
    }
 
    
    public void Semester8(){
         Sub1="Data Communication With Lab";
         Scode1="SWE322";
        
         Sub2="Software Security";
         Scode2="SWE323";
        
         Sub3="Desktop And Web Programming With Lab";
         Scode3="SWE325";
    }
       public void Semester9(){
         Sub1="System Analysis & Design";
         Scode1="SWE323";
        
         Sub2="Software Engineering project-||(Web Programming)";
         Scode2="SWE332";
        
         Sub3="Computer Networks With Lab";
         Scode3="SWE334";
         
         Sub4="Bangladesh Studies";
         Scode4="GED334";
    }
    
    
    public void Semester10(){
         Sub1="Object Oriented Software Development (Lab based)";
         Scode1="SWE411";
        
         Sub2="Management Information System";
         Scode2="SWE412";
        
         Sub3="Software Engineering and Cyber Laws";
         Scode3="SWE413";
         
         Sub4="Elective Subject |";
         Scode4="";
        
    }
    
    public void Semester11(){
         Sub1="Multimedia Programming with lab";
         Scode1="SWE422";
        
         Sub2="Elective Subject With Lab-||";
         Scode2="";
        
         Sub3="Elective Subject-|||";
         Scode3="";
    }
    
    public void Semester12(){
        
         Sub1="Project/Thesis(Internship Included)";
         Scode1="SWE449";
        
         Sub2="Elective Subject-|V";
         Scode2="";
        
         Sub3="Elective Subject-V";
         Scode3="";
        
    }
     public String mark1st(int x){
               mark1=x;
              if(mark1>=80)
            letter1="A+";
             
        else if(mark1>=75 && mark1<80)
        letter1="A";
          
        else if(mark1>=70 && mark1<75)
            letter1="A-";
            
        else if(mark1>=65 && mark1<70)
            letter1="B+";
          
        else if(mark1>=60 && mark1<65)
            letter1="B";
            
        else if(mark1>=55 && mark1<60)
            letter1="B-";
           
        else if(mark1>=50 && mark1<55)
            letter1="C+";
         
        else if(mark1>=45 && mark1<50)
            letter1="C";
          
        else if(mark1>=40 && mark1<45)
            letter1="D";
          
        else
            letter1="Fail";
                 return letter1;}
       public float point1st(int m){
            mark1=m;
        if(m>=80)
            Point1=(float) 4.00;
        else if(m>=75 && m<80)
        Point1=(float) 3.75;
        else if(m>=70 && m<75)
             Point1=(float) 3.50;
        else if(m>=65 && m<70)
             Point1=(float) 3.25;
        else if(m>=60 && m<65)
             Point1=(float) 3.00;
        else if(m>=55 && m<60)
             Point1=(float) 2.75;
        else if(m>=50 && m<55)
             Point1=(float) 2.50;
        else if(m>=45 && m<50)
             Point1=(float) 2.25;
        else if(m>=40 && m<45)
             Point1=(float) 2.00;
        else
             Point1=(float) 0.00;
        
        return Point1;
     }
     public String avgletter(float x){
         String s=null;
             if(x>=4.00)
            s="A+";
      
        else if(x>=3.75 && x<4.00)
        s="A";
         
        else if(x>=3.50 && x<3.75)
            s="A-";
            
        else if(x>=3.25 && x<3.50)
           s="B+";
             
        else if(x>=3.00 && x<3.25)
          s="B";
              
        else if(x>=2.75 && x<3.00)
          s="B-";
            
        else if(x>=2.50 && x<2.75)
           s="C+";
            
        else if(x>=2.25 && x<2.50)
            s="C";
         
        else if(x>=2.00 && x<2.25)
            s="D";
          
        else
            s="Fail";
                     
      return s;
     }
    public void Folder(){
             try{
             File DCMS = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM \\");
             DCMS.mkdirs();}
             catch(Exception e){
                 System.out.println("SomeThing Went Wrong");
             }
     
              
              File semester1 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM \\Semester 1");
              semester1.mkdirs(); 
              
      
            
  
               File semeseter2 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 2");
               semeseter2.mkdirs();
           
               

                File  semeseter3 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 3");
                   semeseter3.mkdirs();
              

        
                  File semeseter4 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 4");
                 semeseter4.mkdirs();
                

                  File semeseter5 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 5");
                         semeseter5.mkdirs();

                   File semeseter6 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 6");
                   semeseter6.mkdirs();
                   File semeseter7 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 7");
                   semeseter7.mkdirs();
                   File semeseter8 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 8");
                    semeseter8.mkdirs();
                   File semeseter9 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 9");
                   semeseter9.mkdirs();
                   File semeseter10 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 10");
                   semeseter10.mkdirs();
                      File semeseter11 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 11");
                   semeseter11.mkdirs();
                      File semeseter12 = new File("D:\\DIU CGPA(SWE)MANAGEMENT SYSTEM\\Semester 12");
                    semeseter12.mkdirs();
                    
    }
   
}
