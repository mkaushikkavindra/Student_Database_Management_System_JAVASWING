package administrator;

import javax.swing.* ;
import java.awt.* ;
import java.awt.event.*;  
import java.sql.*;

class DialogBox
{  
    private static JDialog d;  
    void ShowDialogBox(String title, String content)
      {  
        JFrame f= new JFrame();  
        d = new JDialog(f, title, true);  
        d.setLayout(new FlowLayout());  
        JButton b = new JButton ("OK");  
        b.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                DialogBox.d.setVisible(false);  
            }  
        });  
        d.add(new JLabel (content));  
        d.add(b);   
        d.setSize(500,500);    
        d.setVisible(true);  
      }  
}

class AddStudent {

DialogBox db = new DialogBox() ;
JFrame F2 ;
JLabel PgTitle1, Inst1, AS1,AS2,AS3,AS3_1,AS4,AS5,AS6,AS6_1,AS7,AS8,AS9,AS10,AS11,AS12,AS13,AS14,AS15 ;
JTextField ASTB1,ASTB2,ASTB3,ASTB4,ASTB5,ASTB6,ASTB7,ASTB8,ASTB9,ASTB10,ASTB11,ASTB12,ASTB13,ASTB14,ASTB15 ;
JRadioButton ASRB1,ASRB2 ;
JComboBox<String> ASCB1 ; 
JComboBox<Integer> ASCB2,ASCB3 ; 
JButton B1 ;

public AddStudent() {

F2 = new JFrame () ;
F2.setSize (1920,1080) ;
F2.setLayout (null) ;
F2.setTitle ("Add Student - STUDENT DATABASE MANAGEMENT SYSTEM") ;

PgTitle1 = new JLabel ("Add Student") ;
PgTitle1.setFont (new Font ("Arial", Font.BOLD, 36)) ;
PgTitle1.setBounds (850,0,300,60) ;
F2.add (PgTitle1) ;

Inst1 = new JLabel ("[Enter the student's details to be added into the database]") ;
Inst1.setFont (new Font ("Arial", Font.PLAIN, 18)) ;
Inst1.setBounds (725,80,800,40) ;
F2.add (Inst1) ;

AS1 = new JLabel ("Student ID : ") ;
AS1.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS1.setBounds (300,150,150,30) ;
F2.add (AS1) ;
ASTB1 = new JTextField () ;
ASTB1.setBounds (530,150,100,30) ;
F2.add (ASTB1) ;

AS2 = new JLabel ("Student Name : ") ;
AS2.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS2.setBounds (300,200,180,30) ;
F2.add (AS2);
ASTB2 = new JTextField () ;
ASTB2.setBounds (530,200,250,30) ;
F2.add (ASTB2) ;

AS3 = new JLabel ("Date of Birth : ") ;
AS3.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS3.setBounds (300,250,180,30) ;
F2.add (AS3);
ASTB3 = new JTextField () ;
ASTB3.setBounds (530,250,250,30) ;
F2.add (ASTB3) ;
AS3_1 = new JLabel ("(DD-Mon-YYYY) [e.g. 25-Aug-2006] ") ;
AS3_1.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS3_1.setBounds (800,250,500,30) ;
F2.add (AS3_1) ;

AS4 = new JLabel ("Mobile Number : ") ;
AS4.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS4.setBounds (300,300,180,30) ;
F2.add (AS4);
ASTB4 = new JTextField () ;
ASTB4.setBounds (530,300,250,30) ;
F2.add (ASTB4) ;

AS5 = new JLabel ("Residential Address : ") ;
AS5.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS5.setBounds (300,350,220,30) ;
F2.add (AS5);
ASTB5 = new JTextField () ;
ASTB5.setBounds (530,350,300,30) ;
F2.add (ASTB5) ;

AS6 = new JLabel ("Nationality : ") ;
AS6.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS6.setBounds (300,400,220,30) ;
F2.add (AS6);
ASRB1 = new JRadioButton ("Indian") ;
ASRB1.setBounds (530,400,100,30) ;
ASRB1.setFont (new Font ("Arial", Font.PLAIN, 20)) ;
F2.add (ASRB1) ;
ASRB2 = new JRadioButton ("Others") ;
ASRB2.setBounds (645,400,100,30) ;
ASRB2.setFont (new Font ("Arial", Font.PLAIN, 20)) ;
F2.add (ASRB2) ;
ASTB6 = new JTextField () ;
ASTB6.setBounds (750,400,150,30) ;
F2.add (ASTB6) ;
ASTB6.setVisible (false) ;
AS6_1 = new JLabel ("Enter your nationality in the displayed textbox") ;
AS6_1.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS6_1.setBounds (910,400,610,30) ;
F2.add (AS6_1) ;
AS6_1.setVisible (false) ;
ASRB1.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {
ASTB6.setVisible (false) ;
AS6_1.setVisible (false) ;
}}) ;
ASRB2.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {
ASTB6.setVisible (true) ;
AS6_1.setVisible (true) ;
}}) ;
ButtonGroup BG1 = new ButtonGroup () ;
BG1.add (ASRB1) ;
BG1.add (ASRB2) ;

AS7 = new JLabel ("Mother Tongue : ") ;
AS7.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS7.setBounds (300,450,220,30) ;
F2.add (AS7);
ASTB7 = new JTextField () ;
ASTB7.setBounds (530,450,200,30) ;
F2.add (ASTB7) ;

AS8 = new JLabel ("Blood Group : ") ;
AS8.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS8.setBounds (300,500,220,30) ;
F2.add (AS8);
ASTB8 = new JTextField () ;
ASTB8.setBounds (530,500,50,30) ;
F2.add (ASTB8) ;

AS9 = new JLabel ("Email Address : ") ;
AS9.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS9.setBounds (300,550,220,30) ;
F2.add (AS9);
ASTB9 = new JTextField () ;
ASTB9.setBounds (530,550,250,30) ;
F2.add (ASTB9) ;

AS10 = new JLabel ("Father's Name : ") ;
AS10.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS10.setBounds (300,600,220,30) ;
F2.add (AS10);
ASTB10 = new JTextField () ;
ASTB10.setBounds (530,600,250,30) ;
F2.add (ASTB10) ;

AS11 = new JLabel ("Mother's Name : ") ;
AS11.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS11.setBounds (300,650,220,30) ;
F2.add (AS11);
ASTB11 = new JTextField () ;
ASTB11.setBounds (530,650,250,30) ;
F2.add (ASTB11) ;

AS12 = new JLabel ("Guardian's Name : ") ;
AS12.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS12.setBounds (300,700,220,30) ;
F2.add (AS12);
ASTB12 = new JTextField () ;
ASTB12.setBounds (530,700,250,30) ;
F2.add (ASTB12) ;

AS13 = new JLabel ("Department : ") ;
AS13.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS13.setBounds (300,750,220,30) ;
F2.add (AS13);
String departments[] = {"","Computer Science and Engineering", "Artificial Intelligence and Data Sciences", "Artificial Intelligence and Machine Learning", "Electronics and Communication Engineering", "Electrical and Electronics Engineering", "Mechanical Engineering", "Computer Science and Business System", "CSE (Cyber Security)", "Information Technology", "Biomedical Engineering", "Mechatronics Engineering", "Civil Engineering", "B.E. Electronics Engineering (VLSI Design & Technology)", "B.E. ECE (Advanced Communication Technology"} ;
ASCB1 = new JComboBox<> (departments) ;
ASCB1.setBounds (530,750,500,30) ;
F2.add (ASCB1) ;

AS14 = new JLabel ("Year of Joining : ") ;
AS14.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS14.setBounds (300,800,220,30) ;
F2.add (AS14);
Integer yearsjoining[] = {2024,2023,2022,2021,2020,2019,2018,2017,2016,2015,2014,2013,2012,2011,2010} ;
ASCB2 = new JComboBox<> (yearsjoining) ;
ASCB2.setBounds (530,800,100,30) ;
F2.add (ASCB2) ;

AS15 = new JLabel ("Pass Out Year : ") ;
AS15.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS15.setBounds (300,850,220,30) ;
F2.add (AS15);
Integer yearsout[] = {2028,2027,2026,2025,2024,2023,2022,2021,2020,2019,2018,2017,2016,2015,2014} ;
ASCB3 = new JComboBox<> (yearsout) ;
ASCB3.setBounds (530,850,100,30) ;
F2.add (ASCB3) ;

B1 = new JButton ("Submit") ;
B1.setBounds (868,900,150,50) ;
B1.setFont (new Font ("Arial", Font.BOLD, 24)) ;
F2.add (B1) ;

B1.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {

int stid = Integer.parseInt(ASTB1.getText()) ;
String stnam = ASTB2.getText() ;
String dob = ASTB3.getText() ;
Long mobnum = Long.parseLong(ASTB4.getText()) ;
String resadr = ASTB5.getText() ;
String nationality = " " ;
if (ASRB1.isSelected()) {nationality = "Indian" ;}
else if (ASRB2.isSelected()) {
nationality = ASTB6.getText() ;
}
String mothertongue = ASTB7.getText() ;
String bloodgroup = ASTB8.getText() ;
String emailaddress = ASTB9.getText() ;
String fathername = ASTB10.getText() ;
String mothername = ASTB11.getText() ;
String guardianname = ASTB12.getText() ;
String department = (String) ASCB1.getSelectedItem() ;
int yearjoining = (Integer) ASCB2.getSelectedItem() ;
int yearout = (Integer) ASCB3.getSelectedItem() ;

System.out.println (stid + " " + stnam + " " +dob+ " " + mobnum + " " + resadr + " " + nationality + " " + mothertongue + " " + bloodgroup + " " + emailaddress + " " + fathername + " " + mothername + " " + guardianname + " " + department + " " + yearjoining + " " + yearout) ;

try {
Class.forName ("oracle.jdbc.driver.OracleDriver") ;
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
System.out.println ("Connection established with the Oracle Database") ;
PreparedStatement stmt=con.prepareStatement("insert into collegestudents values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
stmt.setInt(1,stid) ;
stmt.setString(2,stnam) ;
stmt.setString(3,dob) ;
stmt.setLong(4,mobnum) ;
stmt.setString(5,resadr) ;
stmt.setString(6,nationality) ;
stmt.setString(7,mothertongue) ;
stmt.setString(8,bloodgroup) ;
stmt.setString(9,emailaddress);
stmt.setString(10,fathername) ;
stmt.setString(11,mothername) ;
stmt.setString(12,guardianname) ;
stmt.setString(13,department);
stmt.setInt(14,yearjoining);
stmt.setInt(15,yearout) ;

int i = stmt.executeUpdate() ;
if(i==1) {System.out.println ("Inserted") ;
db.ShowDialogBox ("Successful", "Student Inserted Successfully!") ;
}
else if (i<1) {System.out.println ("Not Inserted") ;}
}
catch (Exception e1){
System.out.println (e1) ;}

}
}) ;

F2.setVisible (true) ;
}
}
/* ******* */

class EditStudentDetails {

DialogBox db = new DialogBox() ;
JFrame F2 ;
JLabel PgTitle2, Inst2, AS1,AS2,AS3,AS3_1,AS4,AS5,AS6,AS6_1,AS7,AS8,AS9,AS10,AS11,AS12,AS13,AS14,AS15 ;
JTextField ASTB1,ASTB2,ASTB3,ASTB4,ASTB5,ASTB6,ASTB7,ASTB8,ASTB9,ASTB10,ASTB11,ASTB12,ASTB13,ASTB14,ASTB15 ;
JRadioButton ASRB1,ASRB2 ;
JComboBox<String> ASCB1 ; 
JComboBox<Integer> ASCB2,ASCB3 ; 
JButton B1 ;

EditStudentDetails() {

try {
Class.forName ("oracle.jdbc.driver.OracleDriver") ;
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
System.out.println ("Connection established with the Oracle Database") ;}
catch (Exception e){
System.out.println (e) ;}

F2 = new JFrame () ;
F2.setSize (1920,1080) ;
F2.setLayout (null) ;
F2.setTitle ("Edit Student Details - STUDENT DATABASE MANAGEMENT SYSTEM") ;

PgTitle2 = new JLabel ("Edit Student Details") ;
PgTitle2.setFont (new Font ("Arial", Font.BOLD, 36)) ;
PgTitle2.setBounds (800,0,500,60) ;
F2.add (PgTitle2) ;

Inst2 = new JLabel ("[Enter the student's ID and edit the details]") ;
Inst2.setFont (new Font ("Arial", Font.PLAIN, 18)) ;
Inst2.setBounds (800,80,800,40) ;
F2.add (Inst2) ;

AS1 = new JLabel ("Student ID : ") ;
AS1.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS1.setBounds (300,150,150,30) ;
F2.add (AS1) ;
ASTB1 = new JTextField () ;
ASTB1.setBounds (530,150,100,30) ;
F2.add (ASTB1) ;

AS2 = new JLabel ("Student Name : ") ;
AS2.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS2.setBounds (300,200,180,30) ;
F2.add (AS2);
ASTB2 = new JTextField () ;
ASTB2.setBounds (530,200,250,30) ;
F2.add (ASTB2) ;

AS3 = new JLabel ("Date of Birth : ") ;
AS3.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS3.setBounds (300,250,180,30) ;
F2.add (AS3);
ASTB3 = new JTextField () ;
ASTB3.setBounds (530,250,250,30) ;
F2.add (ASTB3) ;
AS3_1 = new JLabel ("(DD-Mon-YYYY) [e.g. 25-Aug-2006] ") ;
AS3_1.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS3_1.setBounds (800,250,500,30) ;
F2.add (AS3_1) ;

AS4 = new JLabel ("Mobile Number : ") ;
AS4.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS4.setBounds (300,300,180,30) ;
F2.add (AS4);
ASTB4 = new JTextField () ;
ASTB4.setBounds (530,300,250,30) ;
F2.add (ASTB4) ;

AS5 = new JLabel ("Residential Address : ") ;
AS5.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS5.setBounds (300,350,220,30) ;
F2.add (AS5);
ASTB5 = new JTextField () ;
ASTB5.setBounds (530,350,300,30) ;
F2.add (ASTB5) ;

AS6 = new JLabel ("Nationality : ") ;
AS6.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS6.setBounds (300,400,220,30) ;
F2.add (AS6);
ASRB1 = new JRadioButton ("Indian") ;
ASRB1.setBounds (530,400,100,30) ;
ASRB1.setFont (new Font ("Arial", Font.PLAIN, 20)) ;
F2.add (ASRB1) ;
ASRB2 = new JRadioButton ("Others") ;
ASRB2.setBounds (645,400,100,30) ;
ASRB2.setFont (new Font ("Arial", Font.PLAIN, 20)) ;
F2.add (ASRB2) ;
ASTB6 = new JTextField () ;
ASTB6.setBounds (750,400,150,30) ;
F2.add (ASTB6) ;
ASTB6.setVisible (false) ;
AS6_1 = new JLabel ("Enter your nationality in the displayed textbox") ;
AS6_1.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS6_1.setBounds (910,400,610,30) ;
F2.add (AS6_1) ;
AS6_1.setVisible (false) ;
ASRB1.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {
ASTB6.setVisible (false) ;
AS6_1.setVisible (false) ;
}}) ;
ASRB2.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {
ASTB6.setVisible (true) ;
AS6_1.setVisible (true) ;
}}) ;
ButtonGroup BG1 = new ButtonGroup () ;
BG1.add (ASRB1) ;
BG1.add (ASRB2) ;

AS7 = new JLabel ("Mother Tongue : ") ;
AS7.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS7.setBounds (300,450,220,30) ;
F2.add (AS7);
ASTB7 = new JTextField () ;
ASTB7.setBounds (530,450,200,30) ;
F2.add (ASTB7) ;

AS8 = new JLabel ("Blood Group : ") ;
AS8.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS8.setBounds (300,500,220,30) ;
F2.add (AS8);
ASTB8 = new JTextField () ;
ASTB8.setBounds (530,500,50,30) ;
F2.add (ASTB8) ;

AS9 = new JLabel ("Email Address : ") ;
AS9.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS9.setBounds (300,550,220,30) ;
F2.add (AS9);
ASTB9 = new JTextField () ;
ASTB9.setBounds (530,550,250,30) ;
F2.add (ASTB9) ;

AS10 = new JLabel ("Father's Name : ") ;
AS10.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS10.setBounds (300,600,220,30) ;
F2.add (AS10);
ASTB10 = new JTextField () ;
ASTB10.setBounds (530,600,250,30) ;
F2.add (ASTB10) ;

AS11 = new JLabel ("Mother's Name : ") ;
AS11.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS11.setBounds (300,650,220,30) ;
F2.add (AS11);
ASTB11 = new JTextField () ;
ASTB11.setBounds (530,650,250,30) ;
F2.add (ASTB11) ;

AS12 = new JLabel ("Guardian's Name : ") ;
AS12.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS12.setBounds (300,700,220,30) ;
F2.add (AS12);
ASTB12 = new JTextField () ;
ASTB12.setBounds (530,700,250,30) ;
F2.add (ASTB12) ;

AS13 = new JLabel ("Department : ") ;
AS13.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS13.setBounds (300,750,220,30) ;
F2.add (AS13);
String departments[] = {"","Computer Science and Engineering", "Artificial Intelligence and Data Sciences", "Artificial Intelligence and Machine Learning", "Electronics and Communication Engineering", "Electrical and Electronics Engineering", "Mechanical Engineering", "Computer Science and Business System", "CSE (Cyber Security)", "Information Technology", "Biomedical Engineering", "Mechatronics Engineering", "Civil Engineering", "B.E. Electronics Engineering (VLSI Design & Technology)", "B.E. ECE (Advanced Communication Technology"} ;
ASCB1 = new JComboBox<> (departments) ;
ASCB1.setBounds (530,750,500,30) ;
F2.add (ASCB1) ;

AS14 = new JLabel ("Year of Joining : ") ;
AS14.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS14.setBounds (300,800,220,30) ;
F2.add (AS14);
Integer yearsjoining[] = {2024,2023,2022,2021,2020,2019,2018,2017,2016,2015,2014,2013,2012,2011,2010} ;
ASCB2 = new JComboBox<> (yearsjoining) ;
ASCB2.setBounds (530,800,100,30) ;
F2.add (ASCB2) ;

AS15 = new JLabel ("Pass Out Year : ") ;
AS15.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS15.setBounds (300,850,220,30) ;
F2.add (AS15);
Integer yearsout[] = {2028,2027,2026,2025,2024,2023,2022,2021,2020,2019,2018,2017,2016,2015,2014,2013,2012,2011,2010} ;
ASCB3 = new JComboBox<> (yearsout) ;
ASCB3.setBounds (530,850,100,30) ;
F2.add (ASCB3) ;

B1 = new JButton ("Submit") ;
B1.setBounds (868,900,150,50) ;
B1.setFont (new Font ("Arial", Font.BOLD, 24)) ;
F2.add (B1) ;

B1.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {

int stid = Integer.parseInt(ASTB1.getText()) ;
String stnam = ASTB2.getText() ;
String dob = ASTB3.getText() ;
Long mobnum = Long.parseLong(ASTB4.getText()) ;
String resadr = ASTB5.getText() ;
String nationality = " " ;
if (ASRB1.isSelected()) {nationality = "Indian" ;}
else if (ASRB2.isSelected()) {
nationality = ASTB6.getText() ;
}
String mothertongue = ASTB7.getText() ;
String bloodgroup = ASTB8.getText() ;
String emailaddress = ASTB9.getText() ;
String fathername = ASTB10.getText() ;
String mothername = ASTB11.getText() ;
String guardianname = ASTB12.getText() ;
String department = (String) ASCB1.getSelectedItem() ;
int yearjoining = (Integer) ASCB2.getSelectedItem() ;
int yearout = (Integer) ASCB3.getSelectedItem() ;

System.out.println (stid + " " + stnam + " " +dob+ " " + mobnum + " " + resadr + " " + nationality + " " + mothertongue + " " + bloodgroup + " " + emailaddress + " " + fathername + " " + mothername + " " + guardianname + " " + department + " " + yearjoining + " " + yearout) ;

try {
Class.forName ("oracle.jdbc.driver.OracleDriver") ;
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
System.out.println ("Connection established with the Oracle Database") ;
PreparedStatement stmt=con.prepareStatement("update collegestudents set STUDENT_NAME = ?, DATE_OF_BIRTH = ?, MOBILE_NUMBER = ?, RESIDENTIAL_ADDRESS = ?, NATIONALITY = ?, MOTHER_TONGUE = ?, BLOOD_GROUP = ?, EMAIL_ADDRESS = ?, FATHER_NAME = ?, MOTHER_NAME = ?, GUARDIAN_NAME = ?, DEPARTMENT = ?, YEAR_OF_JOINING = ?, PASS_OUT_YEAR = ? where STUDENT_ID = ?"); 
stmt.setString(1,stnam) ;
stmt.setString(2,dob) ;
stmt.setLong(3,mobnum) ;
stmt.setString(4,resadr) ;
stmt.setString(5,nationality) ;
stmt.setString(6,mothertongue) ;
stmt.setString(7,bloodgroup) ;
stmt.setString(8,emailaddress);
stmt.setString(9,fathername) ;
stmt.setString(10,mothername) ;
stmt.setString(11,guardianname) ;
stmt.setString(12,department);
stmt.setInt(13,yearjoining);
stmt.setInt(14,yearout) ;
stmt.setInt(15,stid) ;

int i = stmt.executeUpdate() ;
if(i==1) {System.out.println ("Edited Successfully") ;
db.ShowDialogBox ("Successful", "Student Details Edited Successfully!") ;
}
else if (i<1) {System.out.println ("Not Inserted") ;
db.ShowDialogBox ("Not Successful", "Student Not Available with the given ID!") ;
}
}
catch (Exception e1){
System.out.println (e1) ;}

}
}) ;

F2.setVisible (true) ;
}
}
/* ******* */

class RemoveStudent {

DialogBox db = new DialogBox() ;
JFrame F4 ;
JLabel PgTitle3, Inst3,AS1 ;
JTextField ASTB1 ;
JButton B1 ;

RemoveStudent() {

try {
Class.forName ("oracle.jdbc.driver.OracleDriver") ;
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
System.out.println ("Connection established with the Oracle Database") ;}
catch (Exception e){
System.out.println (e) ;}

F4 = new JFrame () ;
F4.setSize (1920,1080) ;
F4.setLayout (null) ;
F4.setTitle ("Remove Student - STUDENT DATABASE MANAGEMENT SYSTEM") ;

PgTitle3 = new JLabel ("Remove Student") ;
PgTitle3.setFont (new Font ("Arial", Font.BOLD, 36)) ;
PgTitle3.setBounds (850,0,500,60) ;
F4.add (PgTitle3) ;

Inst3 = new JLabel ("[Enter the student's ID, to remove the student from the database]") ;
Inst3.setFont (new Font ("Arial", Font.PLAIN, 18)) ;
Inst3.setBounds (725,80,800,40) ;
F4.add (Inst3) ;

AS1 = new JLabel ("Student ID : ") ;
AS1.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS1.setBounds (800,150,120,30) ;
F4.add (AS1) ;
ASTB1 = new JTextField () ;
ASTB1.setBounds (950,150,100,30) ;
F4.add (ASTB1) ;

B1 = new JButton ("Submit") ;
B1.setBounds (885,200,150,50) ;
B1.setFont (new Font ("Arial", Font.BOLD, 24)) ;
F4.add (B1) ;

B1.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {

int stid = Integer.parseInt(ASTB1.getText()) ;

System.out.println (stid) ;

try {
Class.forName ("oracle.jdbc.driver.OracleDriver") ;
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
System.out.println ("Connection established with the Oracle Database") ;

PreparedStatement stmt=con.prepareStatement("delete from collegestudents where STUDENT_ID = ?"); 
stmt.setInt(1,stid) ;

int i = stmt.executeUpdate() ;
if(i==1) {System.out.println ("Removed") ;
db.ShowDialogBox ("Successful", "Student Removed Successfully!") ;
}
else if (i<1) {System.out.println ("Not Removed") ;
db.ShowDialogBox ("Not Successful", "Student with Given ID does not exist") ;}
}
catch (Exception e1){
System.out.println (e1) ;}

}
}) ;


F4.setVisible (true) ;
}
}
/* ******* */

class ViewStudent {

DialogBox db = new DialogBox() ;
JFrame F5 ;
JLabel PgTitle4, Inst4,AS1,DD1,DD2,DD3,DD4,DD5,DD6,DD7,DD8,DD9,DD10,DD11,DD12,DD13,DD14 ;
JTextField ASTB1 ;
JButton B1 ;

ViewStudent() {

F5 = new JFrame () ;
F5.setSize (1920,1080) ;
F5.setLayout (null) ;
F5.setTitle ("View Student - STUDENT DATABASE MANAGEMENT SYSTEM") ;

PgTitle4 = new JLabel ("View Student Details") ;
PgTitle4.setFont (new Font ("Arial", Font.BOLD, 36)) ;
PgTitle4.setBounds (860,0,600,60) ;
F5.add (PgTitle4) ;

Inst4 = new JLabel ("[Enter the student's ID, to view the details]") ;
Inst4.setFont (new Font ("Arial", Font.PLAIN, 18)) ;
Inst4.setBounds (850,80,800,40) ;
F5.add (Inst4) ;

AS1 = new JLabel ("Student ID : ") ;
AS1.setFont (new Font ("Arial", Font.BOLD, 20)) ;
AS1.setBounds (870,150,120,30) ;
F5.add (AS1) ;
ASTB1 = new JTextField () ;
ASTB1.setBounds (1020,150,100,30) ;
F5.add (ASTB1) ;

B1 = new JButton ("Submit") ;
B1.setBounds (910,200,150,50) ;
B1.setFont (new Font ("Arial", Font.BOLD, 24)) ;
F5.add (B1) ;

DD1 = new JLabel () ;
DD1.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD1.setBounds (10,300,1000,35) ;
F5.add (DD1) ;

DD2 = new JLabel () ;
DD2.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD2.setBounds (10,350,1000,35) ;
F5.add (DD2) ;

DD3 = new JLabel () ;
DD3.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD3.setBounds (10,400,1000,35) ;
F5.add (DD3) ;

DD4 = new JLabel () ;
DD4.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD4.setBounds (10,450,1000,35) ;
F5.add (DD4) ;

DD5 = new JLabel () ;
DD5.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD5.setBounds (10,500,1000,35) ;
F5.add (DD5) ;

DD6 = new JLabel () ;
DD6.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD6.setBounds (10,550,1000,35) ;
F5.add (DD6) ;

DD7 = new JLabel () ;
DD7.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD7.setBounds (10,600,1000,35) ;
F5.add (DD7) ;

DD8 = new JLabel () ;
DD8.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD8.setBounds (10,650,1000,35) ;
F5.add (DD8) ;

DD9 = new JLabel () ;
DD9.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD9.setBounds (10,700,1000,35) ;
F5.add (DD9) ;

DD10 = new JLabel () ;
DD10.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD10.setBounds (10,750,1000,35) ;
F5.add (DD10) ;

DD11 = new JLabel () ;
DD11.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD11.setBounds (10,800,1000,35) ;
F5.add (DD11) ;

DD12 = new JLabel () ;
DD12.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD12.setBounds (10,850,1000,35) ;
F5.add (DD12) ;

DD13 = new JLabel () ;
DD13.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD13.setBounds (10,900,1000,35) ;
F5.add (DD13) ;

DD14 = new JLabel () ;
DD14.setFont (new Font ("Arial", Font.BOLD, 20)) ;
DD14.setBounds (10,950,1000,35) ;
F5.add (DD14) ;

B1.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {

int stid = Integer.parseInt(ASTB1.getText()) ;

System.out.println (stid) ;

String StdName = "", DateOfBirth="", ResiAdr="",Nationality="",MotherTongue="",BloodGroup="", EmailAddress="",FatherName="", MotherName="",GuardianName="", Department="" ;
Long MobileNumber=0L ;
int YearJoin=0, YearOut=0 ; 

try {
Class.forName ("oracle.jdbc.driver.OracleDriver") ;
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
System.out.println ("Connection established with the Oracle Database") ;
PreparedStatement stmt=con.prepareStatement("select * from collegestudents where STUDENT_ID = ?"); 

stmt.setInt (1,Integer.parseInt(ASTB1.getText())) ;

ResultSet rs = stmt.executeQuery() ;

while (rs.next()) {
StdName = rs.getString(2) ;
DateOfBirth = rs.getString(3) ;
MobileNumber = rs.getLong(4) ;
ResiAdr = rs.getString(5) ;
Nationality = rs.getString(6) ;
MotherTongue = rs.getString(7) ;
BloodGroup = rs.getString(8) ;
EmailAddress = rs.getString(9) ;
FatherName = rs.getString(10) ;
MotherName = rs.getString(11) ;
GuardianName = rs.getString(12) ;
Department = rs.getString(13) ;
YearJoin = rs.getInt(14) ;
YearOut = rs.getInt(15) ;
System.out.println (rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getLong(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " " + rs.getString(9) + " " + rs.getString(10) + " " + rs.getString(11) + " " + rs.getString(12) + " " + rs.getString(13) + " " + rs.getInt(14) + " " + rs.getInt(15)) ;
}
DD1.setText ("Student Name : " + StdName) ;
DD2.setText ("Date of Birth : " + DateOfBirth) ;
DD3.setText ("Mobile Number : " + MobileNumber) ;
DD4.setText ("Residential Address : " + ResiAdr) ;
DD5.setText ("Nationality : " + Nationality) ;
DD6.setText ("Mother Tongue : " + MotherTongue) ;
DD7.setText ("Blood Group : " + BloodGroup) ;
DD8.setText ("Email Address : " + EmailAddress) ;
DD9.setText ("Father's Name : " + FatherName) ;
DD10.setText ("Mother's Name : " + MotherName) ;
DD11.setText ("Guardian's Name : " + GuardianName) ;
DD12.setText ("Department : " + Department) ;
DD13.setText ("Year of Joining : " + YearJoin) ;
DD14.setText ("Pass out Year : " + YearOut) ;
}
catch (Exception e1){
System.out.println (e1) ;}
}



}) ;

F5.setVisible (true) ;
}
}
/* ******* */

public class admin {

JFrame F1 ;
JLabel Welcome ;
JButton Bu1,Bu2,Bu3,Bu4 ;

public void admindisplay() {

F1 = new JFrame () ;
F1.setSize (1920,1080) ;
F1.setLayout (null) ;
F1.setTitle ("Administrator - STUDENT DATABASE MANAGEMENT SYSTEM") ;
F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Welcome = new JLabel ("Welcome!") ;
Welcome.setFont (new Font ("Arial", Font.BOLD, 36)) ;
Welcome.setBounds (850,0,200,60) ;
F1.add (Welcome) ;

Bu1 = new JButton ("Add Student") ;
Bu1.setFont (new Font ("Arial", Font.BOLD, 24)) ;
Bu1.setBounds (400,300,240,200) ;
Bu1.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {
AddStudent astd = new AddStudent() ;
}
}) ;
F1.add (Bu1) ;

Bu2 = new JButton ("Edit Student Details") ;
Bu2.setFont (new Font ("Arial", Font.BOLD, 24)) ;
Bu2.setBounds (800,300,300,200) ;
Bu2.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {
EditStudentDetails esd = new EditStudentDetails() ;
}
}) ;
F1.add (Bu2) ;

Bu3 = new JButton ("Remove Student") ;
Bu3.setFont (new Font ("Arial", Font.BOLD, 24)) ;
Bu3.setBounds (1300,300,240,200) ;
Bu3.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {
RemoveStudent rstd = new RemoveStudent () ;
}
}) ;
F1.add (Bu3) ;

Bu4 = new JButton ("View Student Details") ;
Bu4.setFont (new Font ("Arial", Font.BOLD, 24)) ;
Bu4.setBounds (800,600,300,200) ;
Bu4.addActionListener (new ActionListener () {
public void actionPerformed (ActionEvent e) {
ViewStudent vstd = new ViewStudent () ;
}
}) ;
F1.add (Bu4) ;

F1.setVisible (true) ;
}
}
