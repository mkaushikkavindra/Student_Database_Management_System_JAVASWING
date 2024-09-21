import javax.swing.* ;
import java.awt.* ;
import java.awt.event.*;  
import administrator.* ;


public class HomePage {

private JFrame f ;
private JLabel L1,L2,L3,L4,L5,L6 ;
private JTextField T1 ;
private JPasswordField P1 ;
private JButton B1 ;

void Display () {

f = new JFrame () ;
f.setSize (1920,1080) ;
f.setLayout (null) ;
f.setTitle ("Homepage - STUDENT DATABASE MANAGEMENT SYSTEM") ;
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

L1 = new JLabel ("Student Database Management System") ;
L1.setBounds (400,30,1200,100) ;
L1.setFont (new Font ("Arial", Font.BOLD, 60)) ;
f.add (L1) ;

L2 = new JLabel ("***LOG IN***") ;
L2.setBounds (850,230,450,50) ;
L2.setFont (new Font ("Arial", Font.BOLD, 36)) ;
f.add (L2) ;

L3 = new JLabel ("User Name : ") ;
L3.setBounds (400,305,180,50) ;
L3.setFont (new Font ("Arial", Font.PLAIN, 24)) ;
f.add (L3) ;

L4 = new JLabel ("Password : ") ;
L4.setBounds (400,380,180,50) ;
L4.setFont (new Font ("Arial", Font.PLAIN, 24)) ;
f.add (L4) ;

L5 = new JLabel ("Welcome! Enter the required credentials.") ;
L5.setBounds (750,550,500,50) ;
L5.setFont (new Font ("Arial", Font.PLAIN, 24)) ;
f.add (L5) ;

T1 = new JTextField () ;
T1.setBounds (600,320,200,30) ;
f.add (T1) ;

P1 = new JPasswordField () ;
P1.setBounds (600,395,200,30) ;
f.add (P1) ;

B1 = new JButton ("Submit") ;
B1.setBounds (868,450,150,50) ;
B1.setFont (new Font ("Arial", Font.BOLD, 24)) ;
f.add (B1) ;
B1.addActionListener(new ActionListener() {
public void actionPerformed (ActionEvent e) {
String usn = T1.getText () ;
char[] pwdarr = P1.getPassword () ;
String pwdd = new String (pwdarr) ;
if (usn.equals("administrator") && pwdd.equals("college123456")) {
f.setVisible (false) ;
admin adm = new admin() ;
adm.admindisplay() ;
}
else {
L5.setText ("Sorry, wrong credentials. Please try again!") ;
T1.setText ("") ;
P1.setText ("") ;
System.out.println ("Incorrect Credentials Entered By User") ;
}
}
}) ;


f.setVisible (true) ;
}

public static void main (String args[]) {
HomePage h = new HomePage () ;
h.Display () ;
}
}