package project1;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;





public class metroproject{

    
    public static void main(String[] args){
        
        myframe1 f1=new myframe1();
        

    }
}

 class myframe1  extends Frame implements ActionListener{
    
    

    public myframe1(){

        Frame frame1 = new Frame("MetroPolitan City");
        frame1.setSize(1920,1080);
        frame1.setVisible(true);
        frame1.setLayout(null);
        JLabel l= new JLabel("");
        ImageIcon image = new ImageIcon(this.getClass().getResource("/metropic.jpg"));
        l.setIcon(image);
        frame1.add(l);
        l.setBounds(0, 0, 1920,1080);

        frame1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });    
        Font font1= new Font("Serif",Font.BOLD,75);

        Label l1= new Label("MetroPolitan City");
        l1.setFont(font1);
        l1.setBounds(520,190,590,85);
        l.add(l1);
         
        Button B1= new Button("Continue");
        
        Font font2= new Font("Serif",Font.BOLD,25);
        
        B1.setFont(font2);
        
        B1.setBounds(690,450,200,70);

        l.add(B1);
        B1.addActionListener(this);
        

       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        myframe21 f21=new myframe21();
        
    }
}


class myframe21  extends Frame {
	
	 Label l2, userid, pass;
	 TextField Uid, password;
	 Button B3,Back , reg;

    
   
    public myframe21(){
        Frame frame2 = new Frame("MetroPolitan City");
        frame2.setSize( 1920,1080);
        frame2.setVisible(true);
        frame2.setLayout(null);

        Font font1= new Font("Serif",Font.BOLD,65);
        
        JLabel l= new JLabel("");
        ImageIcon image = new ImageIcon(this.getClass().getResource("/background.jpg"));
        l.setIcon(image);
        frame2.add(l);
        l.setBounds(0, 0,  1920,1080);
        

        Label l2 = new Label("Login ");
        Label userid= new Label("User ID :");
        Label pass = new Label("Password :");
        TextField Uid = new TextField();
        TextField password = new TextField();
        password.setEchoChar('*');
        Button B3 = new Button("Login");
        Button Back = new Button("Back");
        Button reg = new Button("Register");

        Font font2= new Font("Serif",Font.BOLD,25);
        Font font3= new Font("Serif",Font.BOLD,20);
        Back.setFont(font2);
        l2.setFont(font1);
        Uid.setFont(font3);
        password.setFont(font3);
        userid.setFont(font2);
        pass.setFont(font2);
        
        B3.setFont(font2);
        reg.setFont(font2);

        
        
        l.add(l2);
        l2.setBounds(690,150,165,78);
        l.add(userid);
        userid.setBounds(640,260,105,40);
        l.add(pass);
        pass.setBounds(640,360,122,40);
        l.add(Uid);
        Uid.setBounds(780,260,250,40);
        l.add(password);
        password.setBounds(780,360,250,40);
        l.add(B3);
        B3.setBounds(570,450,500,40);
        l.add(reg);
        reg.setBounds(760,510,110,30);
        l.add(Back);
        Back.setBounds(70,700,110,50);

        frame2.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
        reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myframe22 f22= new myframe22();
			}
			
		});
        Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myframe1 f21 = new myframe1();
			}
			
		});
        
        B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection(  
							"jdbc:oracle:thin:@localhost:1521:xe","System","Rahul1818");
					String sql = "select * from userinfo where USERID='"+Uid.getText()+"' and PASS='"+password.getText()+"'";
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();	
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Successfully");
						myframe3 f3=new myframe3();
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Password or User ID");
						
					}
					
				}catch(Exception e) {
					System.out.println(e);
				}
			}
			
		});
        
        
    }
}
    
    
    

class myframe22  extends Frame {
    
   
    public myframe22(){
        Frame frame22 = new Frame("MetroPolitan City");
        frame22.setSize( 1920,1080);
        frame22.setVisible(true);
        frame22.setLayout(null);
        
        JLabel l= new JLabel("");
        ImageIcon image = new ImageIcon(this.getClass().getResource("/background.jpg"));
        l.setIcon(image);
        frame22.add(l);
        l.setBounds(0, 0,1920,1080);

        Font font1= new Font("Serif",Font.BOLD,65);
        

        Label l22 = new Label("Register ");
        Label userid = new Label("User ID ");
        Label fname= new Label("First Name ");
        Label lname = new Label("Last Name ");
        Label phone = new Label("Phone No.");
        Label Email = new Label("Email ID");
        Label gender = new Label("Gender ");
        Label pass = new Label("Password ");
        Label s1 = new Label(" = ");
        Label s2 = new Label(" = ");
        Label s3 = new Label(" = ");
        Label s4 = new Label(" = ");
        Label s5 = new Label(" = ");
        Label s6 = new Label(" = ");
        Label s7 = new Label(" = ");
        CheckboxGroup cbg = new CheckboxGroup();
 
		Checkbox c1 = new Checkbox("Male",cbg,false);
		c1.setBounds(60, 90, 250, 30);
 
 
		Checkbox c2 = new Checkbox("Female",cbg,false);
		c2.setBounds(90, 140, 250, 30);
 
        TextField Fname = new TextField();
        TextField Lname = new TextField();
        TextField phonen = new TextField();
        TextField email = new TextField();

        TextField Uid = new TextField();
        TextField password = new TextField();
        password.setEchoChar('*');
        Button log = new Button("Login");
        Button reg = new Button("Register");

        Font font2= new Font("Serif",Font.BOLD,20);
        Font font3= new Font("Serif",Font.BOLD,25);
        Font font4= new Font("Serif",Font.BOLD,17);
        l22.setFont(font1);
        Uid.setFont(font4);
        Fname.setFont(font4);
        Lname.setFont(font4);
        phonen.setFont(font4);
        email.setFont(font4);
        userid.setFont(font2);
        password.setFont(font4);
        fname.setFont(font2);
        lname.setFont(font2);
        phone.setFont(font2);
        Email.setFont(font2);
        gender.setFont(font2);
        c1.setFont(font2);
        c2.setFont(font2);
        pass.setFont(font2);
        
        log.setFont(font2);
        reg.setFont(font2);
        s1.setFont(font3);
        s2.setFont(font3);
        s3.setFont(font3);
        s4.setFont(font3);
        s5.setFont(font3);
        s6.setFont(font3);
        s7.setFont(font3);


        
        l.add(l22);
        l22.setBounds(680,50,235,78);
        l.add(fname);
        fname.setBounds(630,190,130,30);
        l.add(lname);
        lname.setBounds(630,230,130,30);
        l.add(phone);
        phone.setBounds(630,270,130,30);
        l.add(Email);
        Email.setBounds(630,310,130,30);
        l.add(gender);
        gender.setBounds(630,350,130,30);
        l.add(pass);
        pass.setBounds(630,430,130,30);
        l.add(userid);
        userid.setBounds(630,390,130,30);



        l.add(Fname);
        Fname.setBounds(810,190,200,30);
        l.add(Lname);
        Lname.setBounds(810,230,200,30);
        l.add(phonen);
        phonen.setBounds(810,270,200,30);
        l.add(email);
        email.setBounds(810,310,200,30);
        l.add(c1);
        c1.setBounds(930,350,100,30);
        l.add(c2);
        c2.setBounds(810,350,200,30);
        l.add(Uid);
        Uid.setBounds(810,390,250,30);
        l.add(password);
        password.setBounds(810,430,250,30);
        l.add(reg);
        reg.setBounds(590,490,500,60);
        l.add(log);
        log.setBounds(780,570,140,50);



        l.add(s1);
        s1.setBounds(750, 190, 20, 30);
        l.add(s2);
        s2.setBounds(750, 230, 20, 30);
        l.add(s3);
        s3.setBounds(750, 270, 20, 30);
        l.add(s4);
        s4.setBounds(750, 310, 20, 30);
        l.add(s5);
        s5.setBounds(750, 350, 20, 30);
        l.add(s6);
        s6.setBounds(750, 390, 20, 30);
        l.add(s7);
        s7.setBounds(750, 430, 20, 30);

        frame22.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
        
        log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myframe21 f22= new myframe21();
			}
			
		});
    
       
        reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection(  
							"jdbc:oracle:thin:@localhost:1521:xe","System","Rahul1818");
					String sql = "insert into userinfo values('"+Fname.getText()+"','"+Lname.getText()+"','"+phonen.getText()+"','"+email.getText()+"','"+Uid.getText()+"','"+password.getText()+"')";
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();	
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, " Register Successfully");
						myframe21 f21=new myframe21();
						
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Password or User ID");
						
					}
					
				}catch(Exception e) {
					System.out.println(e);
				}
			}
			
		});
        

       
    }
}


class myframe3  extends Frame implements ActionListener{
	private enum Actions {
        C1,C2,C3,C4,C5,C6,C7,C8;
        
      }
   
    public myframe3(){
        Frame frame3 = new Frame("MetroPolitan City");
        frame3.setSize(1370,770);
        frame3.setVisible(true);
        frame3.setLayout(null);
        JLabel l= new JLabel("");
        ImageIcon image = new ImageIcon(this.getClass().getResource("/background.jpg"));
        l.setIcon(image);
        frame3.add(l);
        l.setBounds(0, 0, 1366, 768);

        Font font1= new Font("Serif",Font.BOLD,45);
        
        

        Label ll = new Label("Select The City");
        JButton l1 = new JButton("");
        JButton l2 = new JButton("");
        JButton l3 = new JButton("");
        JButton l4 = new JButton("");
        JButton l5 = new JButton("");
        JButton l6 = new JButton("");
        
        Label c1 = new Label("New Delhi");
        Label c2 = new Label("Mumbai");
        Label c3 = new Label("Hyderabad");
        Label c4 = new Label("Kolkata");
        Label c5 = new Label("Chennai  ");
        Label c6 = new Label("Jaipur");
        
        Button c7 = new Button("Back");
       

       
        
        Font font2= new Font("Serif",Font.BOLD,25);
        Font font3= new Font("Serif",Font.BOLD,25);
        ll.setFont(font1);
        c1.setFont(font2);
        c2.setFont(font2);
        c3.setFont(font2);
        c4.setFont(font2);
        c5.setFont(font2);
        c6.setFont(font2);
        c7.setFont(font2);
        ImageIcon image1 = new ImageIcon(this.getClass().getResource("/hydrabad.jpg"));
	    ImageIcon image2 = new ImageIcon(this.getClass().getResource("/jaipur.jpg"));
	    ImageIcon image3 = new ImageIcon(this.getClass().getResource("/mumbai.jpg"));
	    ImageIcon image4 = new ImageIcon(this.getClass().getResource("/delhi.jpg"));
	    ImageIcon image5 = new ImageIcon(this.getClass().getResource("/KOLKATA.jpg"));
	    ImageIcon image6 = new ImageIcon(this.getClass().getResource("/CHENNAI.jpg"));
	    l1.setIcon(image1);
	    l2.setIcon(image2);
	    l3.setIcon(image3);
	    l4.setIcon(image4);
	    l5.setIcon(image5);
	    l6.setIcon(image6);
		
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(l5);
		l.add(l6);
        
		
		l1.setBounds(70,90,300,250);
		l2.setBounds(70,400,300,250);
		l3.setBounds(900,90,300,250);
		l4.setBounds(500,90,300,250);
		l5.setBounds(500,400,300,250);
		l6.setBounds(900,400,300,250);
		

        
        
        l.add(ll);
        ll.setBounds(500,9,300,78);
        l.add(c1);
        c1.setBounds(595,340,140,40);
        l.add(c2);
        c2.setBounds(1000,340,100,40);
        l.add(c3);
        c3.setBounds(155,340,120,40);
        l.add(c4);
        c4.setBounds(595,650,100,40);
        l.add(c5);
        c5.setBounds(1000,650,100,40);
        l.add(c6);
        c6.setBounds(165,650,80,40);
        
        l.add(c7);
        c7.setBounds(70,33,150,35);

        frame3.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
        l4.setActionCommand(Actions.C1.name());
        l4.addActionListener(this);
        l3.setActionCommand(Actions.C2.name());
        l3.addActionListener(this);
        l1.setActionCommand(Actions.C3.name());
        l1.addActionListener(this);
        l5.setActionCommand(Actions.C4.name());
        l5.addActionListener(this);
        l6.setActionCommand(Actions.C5.name());
        l6.addActionListener(this);
        l2.setActionCommand(Actions.C6.name());
        l2.addActionListener(this);
        c7.setActionCommand(Actions.C7.name());
        c7.addActionListener(this);
       
        

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand() == Actions.C1.name()) {
			delhi f21 = new delhi();
          }
          if (e.getActionCommand() == Actions.C2.name()) {
            mumbai f21 = new mumbai();
          }
          if (e.getActionCommand() == Actions.C3.name()) {
              hydrabad f21 = new hydrabad();
           }
          if (e.getActionCommand() == Actions.C4.name()) {
              kolkata f21 = new kolkata();
           }
          if (e.getActionCommand() == Actions.C5.name()) {
              chennai f21 = new chennai();
            }
          if (e.getActionCommand() == Actions.C6.name()) {
              jaipur f21 = new jaipur();
            }
          if (e.getActionCommand() == Actions.C7.name()) {
                myframe21 f3 = new myframe21();
              }
          
            
		
		
	}
}


class delhi  extends Frame implements ActionListener{
    private enum Actions {
        N1,N2,N3,N4,N5,N6,N7,N8;
        
      }
   
    public delhi(){
        Frame frame4 = new Frame("MetroPolitan City");
        frame4.setSize(1370,770);
        frame4.setVisible(true);
        frame4.setLayout(null);

        Font font1= new Font("Serif",Font.BOLD,45);
        

        JLabel l= new JLabel("");
        ImageIcon image = new ImageIcon(this.getClass().getResource("/background.jpg"));
        l.setIcon(image);
        frame4.add(l);
        l.setBounds(0, 0, 1366, 768);
        

        Label ls = new Label("Select the Commercial point");
        JButton l1 = new JButton("");
        JButton l2 = new JButton("");
        JButton l3 = new JButton("");
        JButton l4 = new JButton("");
        JButton l5 = new JButton("");
        JButton l6 = new JButton("");
        

        Label c1 = new Label("School");
        Label c2 = new Label("Hospital");
        Label c3 = new Label("Hotel");
        Label c4 = new Label("Railway Station");
        Label c5 = new Label("Bank");
        Label c6 = new Label("Mall");
        Button Back = new Button("Back");

       
        
        Font font2= new Font("Serif",Font.BOLD,25);
        Font font3= new Font("Serif",Font.BOLD,25);
        Back.setFont(font2);
        ls.setFont(font1);
        c1.setFont(font2);
        c2.setFont(font2);
        c3.setFont(font2);
        c4.setFont(font2);
        c5.setFont(font2);
        c6.setFont(font3);

        
        
        ImageIcon image4 = new ImageIcon(this.getClass().getResource("/school.jpg"));
	    ImageIcon image3 = new ImageIcon(this.getClass().getResource("/hospital.jpg"));
	    ImageIcon image1 = new ImageIcon(this.getClass().getResource("/hotels.jpg"));
	    ImageIcon image5 = new ImageIcon(this.getClass().getResource("/railway.jpg"));
	    ImageIcon image6 = new ImageIcon(this.getClass().getResource("/zbank.jpg"));
	    ImageIcon image2 = new ImageIcon(this.getClass().getResource("/mall.jpg"));    	    
	    l1.setIcon(image1);
	    l2.setIcon(image2);
	    l3.setIcon(image3);
	    l4.setIcon(image4);
	    l5.setIcon(image5);
	    l6.setIcon(image6);
		
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(l5);
		l.add(l6);
        
		
		l1.setBounds(70,90,300,250);
		l2.setBounds(70,400,300,250);
		l3.setBounds(900,90,300,250);
		l4.setBounds(500,90,300,250);
		l5.setBounds(500,400,300,250);
		l6.setBounds(900,400,300,250);
		

        
        
		l.add(ls);
		ls.setBounds(370,9,555,78);
        l.add(c1);
        c1.setBounds(595,340,80,40);
        l.add(c2);
        c2.setBounds(1000,340,100,40);
        l.add(c3);
        c3.setBounds(170,340,65,40);
        l.add(c4);
        c4.setBounds(595,650,180,40);
        l.add(c5);
        c5.setBounds(1000,650,65,40);
        l.add(c6);
        c6.setBounds(165,650,55,40);
        
        l.add(Back);
        Back.setBounds(70,33,150,35);

        frame4.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
        l4.setActionCommand(Actions.N1.name());
        l4.addActionListener(this);
        l2.setActionCommand(Actions.N2.name());
        l2.addActionListener(this);
        l5.setActionCommand(Actions.N3.name());
        l5.addActionListener(this);
        
        l1.setActionCommand(Actions.N4.name());
        l1.addActionListener(this);
        
        l6.setActionCommand(Actions.N5.name());
        l6.addActionListener(this);
        l3.setActionCommand(Actions.N6.name());
        l3.addActionListener(this);
        Back.setActionCommand(Actions.N7.name());
        Back.addActionListener(this);
        

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand() == Actions.N1.name()) {
			dschool f21 = new dschool();
          }
          if (e.getActionCommand() == Actions.N2.name()) {
        	  dmall f21 = new dmall();
          }
          if (e.getActionCommand() == Actions.N3.name()) {
        	  drailway f21 = new drailway();
           }
          if (e.getActionCommand() == Actions.N4.name()) {
        	  dhotel f21 = new dhotel();
           }
          if (e.getActionCommand() == Actions.N5.name()) {
        	  dbank f21 = new dbank();
            }
          if (e.getActionCommand() == Actions.N6.name()) {
        	  dhospital f21 = new dhospital();
            }
          if (e.getActionCommand() == Actions.N7.name()) {
              myframe3 f21 = new myframe3();
            }
            
		
		
	}
}

class hydrabad  extends Frame implements ActionListener{
    private enum Actions {
        N1,N2,N3,N4,N5,N6,N7,N8;
        
      }
   
    public hydrabad(){
        Frame frame4 = new Frame("MetroPolitan City");
        frame4.setSize(1370,770);
        frame4.setVisible(true);
        frame4.setLayout(null);

        Font font1= new Font("Serif",Font.BOLD,45);
        

        JLabel l= new JLabel("");
        ImageIcon image = new ImageIcon(this.getClass().getResource("/background.jpg"));
        l.setIcon(image);
        frame4.add(l);
        l.setBounds(0, 0, 1366, 768);
        

        Label ls = new Label("Select the Commercial point");
        JButton l1 = new JButton("");
        JButton l2 = new JButton("");
        JButton l3 = new JButton("");
        JButton l4 = new JButton("");
        JButton l5 = new JButton("");
        JButton l6 = new JButton("");
        

        Label c1 = new Label("School");
        Label c2 = new Label("Hospital");
        Label c3 = new Label("Hotel");
        Label c4 = new Label("Railway Station");
        Label c5 = new Label("Bank");
        Label c6 = new Label("Mall");
        Button Back = new Button("Back");

       
        
        Font font2= new Font("Serif",Font.BOLD,25);
        Font font3= new Font("Serif",Font.BOLD,25);
        Back.setFont(font2);
        ls.setFont(font1);
        c1.setFont(font2);
        c2.setFont(font2);
        c3.setFont(font2);
        c4.setFont(font2);
        c5.setFont(font2);
        c6.setFont(font3);

        
        
        ImageIcon image4 = new ImageIcon(this.getClass().getResource("/school.jpg"));
	    ImageIcon image3 = new ImageIcon(this.getClass().getResource("/hospital.jpg"));
	    ImageIcon image1 = new ImageIcon(this.getClass().getResource("/hotels.jpg"));
	    ImageIcon image5 = new ImageIcon(this.getClass().getResource("/railway.jpg"));
	    ImageIcon image6 = new ImageIcon(this.getClass().getResource("/zbank.jpg"));
	    ImageIcon image2 = new ImageIcon(this.getClass().getResource("/mall.jpg"));    	    
	    l1.setIcon(image1);
	    l2.setIcon(image2);
	    l3.setIcon(image3);
	    l4.setIcon(image4);
	    l5.setIcon(image5);
	    l6.setIcon(image6);
		
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(l5);
		l.add(l6);
        
		
		l1.setBounds(70,90,300,250);
		l2.setBounds(70,400,300,250);
		l3.setBounds(900,90,300,250);
		l4.setBounds(500,90,300,250);
		l5.setBounds(500,400,300,250);
		l6.setBounds(900,400,300,250);
		

        
        
		l.add(ls);
		ls.setBounds(370,9,555,78);
        l.add(c1);
        c1.setBounds(595,340,80,40);
        l.add(c2);
        c2.setBounds(1000,340,100,40);
        l.add(c3);
        c3.setBounds(170,340,65,40);
        l.add(c4);
        c4.setBounds(595,650,180,40);
        l.add(c5);
        c5.setBounds(1000,650,65,40);
        l.add(c6);
        c6.setBounds(165,650,55,40);
        
        l.add(Back);
        Back.setBounds(70,33,150,35);

        frame4.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
        l4.setActionCommand(Actions.N1.name());
        l4.addActionListener(this);
        l2.setActionCommand(Actions.N2.name());
        l2.addActionListener(this);
        l5.setActionCommand(Actions.N3.name());
        l5.addActionListener(this);
        
        l1.setActionCommand(Actions.N4.name());
        l1.addActionListener(this);
        
        l6.setActionCommand(Actions.N5.name());
        l6.addActionListener(this);
        l3.setActionCommand(Actions.N6.name());
        l3.addActionListener(this);
        Back.setActionCommand(Actions.N7.name());
        Back.addActionListener(this);
        

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand() == Actions.N1.name()) {
			hschool f21 = new hschool();
          }
          if (e.getActionCommand() == Actions.N2.name()) {
        	  hmall f21 = new hmall();
          }
          if (e.getActionCommand() == Actions.N3.name()) {
        	  hrailway f21 = new hrailway();
           }
          if (e.getActionCommand() == Actions.N4.name()) {
        	  hhotel f21 = new hhotel();
           }
          if (e.getActionCommand() == Actions.N5.name()) {
        	  hbank f21 = new hbank();
            }
          if (e.getActionCommand() == Actions.N6.name()) {
        	  hhospital f21 = new hhospital();
            }
          if (e.getActionCommand() == Actions.N7.name()) {
              myframe3 f21 = new myframe3();
            }
            
		
		
	}
}

class chennai  extends Frame implements ActionListener{
    private enum Actions {
        N1,N2,N3,N4,N5,N6,N7,N8;
        
      }
   
    public chennai(){
        Frame frame4 = new Frame("MetroPolitan City");
        frame4.setSize(1370,770);
        frame4.setVisible(true);
        frame4.setLayout(null);

        Font font1= new Font("Serif",Font.BOLD,45);
        

        JLabel l= new JLabel("");
        ImageIcon image = new ImageIcon(this.getClass().getResource("/background.jpg"));
        l.setIcon(image);
        frame4.add(l);
        l.setBounds(0, 0, 1366, 768);
        

        Label ls = new Label("Select the Commercial point");
        JButton l1 = new JButton("");
        JButton l2 = new JButton("");
        JButton l3 = new JButton("");
        JButton l4 = new JButton("");
        JButton l5 = new JButton("");
        JButton l6 = new JButton("");
        

        Label c1 = new Label("School");
        Label c2 = new Label("Hospital");
        Label c3 = new Label("Hotel");
        Label c4 = new Label("Railway Station");
        Label c5 = new Label("Bank");
        Label c6 = new Label("Mall");
        Button Back = new Button("Back");

       
        
        Font font2= new Font("Serif",Font.BOLD,25);
        Font font3= new Font("Serif",Font.BOLD,25);
        Back.setFont(font2);
        ls.setFont(font1);
        c1.setFont(font2);
        c2.setFont(font2);
        c3.setFont(font2);
        c4.setFont(font2);
        c5.setFont(font2);
        c6.setFont(font3);

        
        
        ImageIcon image4 = new ImageIcon(this.getClass().getResource("/school.jpg"));
	    ImageIcon image3 = new ImageIcon(this.getClass().getResource("/hospital.jpg"));
	    ImageIcon image1 = new ImageIcon(this.getClass().getResource("/hotels.jpg"));
	    ImageIcon image5 = new ImageIcon(this.getClass().getResource("/railway.jpg"));
	    ImageIcon image6 = new ImageIcon(this.getClass().getResource("/zbank.jpg"));
	    ImageIcon image2 = new ImageIcon(this.getClass().getResource("/mall.jpg"));    	    
	    l1.setIcon(image1);
	    l2.setIcon(image2);
	    l3.setIcon(image3);
	    l4.setIcon(image4);
	    l5.setIcon(image5);
	    l6.setIcon(image6);
		
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(l5);
		l.add(l6);
        
		
		l1.setBounds(70,90,300,250);
		l2.setBounds(70,400,300,250);
		l3.setBounds(900,90,300,250);
		l4.setBounds(500,90,300,250);
		l5.setBounds(500,400,300,250);
		l6.setBounds(900,400,300,250);
		

        
        
		l.add(ls);
		ls.setBounds(370,9,555,78);
        l.add(c1);
        c1.setBounds(595,340,80,40);
        l.add(c2);
        c2.setBounds(1000,340,100,40);
        l.add(c3);
        c3.setBounds(170,340,65,40);
        l.add(c4);
        c4.setBounds(595,650,180,40);
        l.add(c5);
        c5.setBounds(1000,650,65,40);
        l.add(c6);
        c6.setBounds(165,650,55,40);
        
        l.add(Back);
        Back.setBounds(70,33,150,35);

        frame4.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
        l4.setActionCommand(Actions.N1.name());
        l4.addActionListener(this);
        l2.setActionCommand(Actions.N2.name());
        l2.addActionListener(this);
        l5.setActionCommand(Actions.N3.name());
        l5.addActionListener(this);
        
        l1.setActionCommand(Actions.N4.name());
        l1.addActionListener(this);
        
        l6.setActionCommand(Actions.N5.name());
        l6.addActionListener(this);
        l3.setActionCommand(Actions.N6.name());
        l3.addActionListener(this);
        Back.setActionCommand(Actions.N7.name());
        Back.addActionListener(this);
        

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand() == Actions.N1.name()) {
			cschool f21 = new cschool();
          }
          if (e.getActionCommand() == Actions.N2.name()) {
        	  cmall f21 = new cmall();
          }
          if (e.getActionCommand() == Actions.N3.name()) {
        	  crailway f21 = new crailway();
           }
          if (e.getActionCommand() == Actions.N4.name()) {
        	  chotel f21 = new chotel();
           }
          if (e.getActionCommand() == Actions.N5.name()) {
        	  cbank f21 = new cbank();
            }
          if (e.getActionCommand() == Actions.N6.name()) {
        	  chospital f21 = new chospital();
            }
          if (e.getActionCommand() == Actions.N7.name()) {
              myframe3 f21 = new myframe3();
            }
		
		
	}
}

class jaipur  extends Frame implements ActionListener{
    private enum Actions {
        N1,N2,N3,N4,N5,N6,N7,N8;
        
      }
   
    public jaipur(){
        Frame frame4 = new Frame("MetroPolitan City");
        frame4.setSize(1370,770);
        frame4.setVisible(true);
        frame4.setLayout(null);

        Font font1= new Font("Serif",Font.BOLD,45);
        

        JLabel l= new JLabel("");
        ImageIcon image = new ImageIcon(this.getClass().getResource("/background.jpg"));
        l.setIcon(image);
        frame4.add(l);
        l.setBounds(0, 0, 1366, 768);
        

        Label ls = new Label("Select the Commercial point");
        JButton l1 = new JButton("");
        JButton l2 = new JButton("");
        JButton l3 = new JButton("");
        JButton l4 = new JButton("");
        JButton l5 = new JButton("");
        JButton l6 = new JButton("");
        

        Label c1 = new Label("School");
        Label c2 = new Label("Hospital");
        Label c3 = new Label("Hotel");
        Label c4 = new Label("Railway Station");
        Label c5 = new Label("Bank");
        Label c6 = new Label("Mall");
        Button Back = new Button("Back");

       
        
        Font font2= new Font("Serif",Font.BOLD,25);
        Font font3= new Font("Serif",Font.BOLD,25);
        Back.setFont(font2);
        ls.setFont(font1);
        c1.setFont(font2);
        c2.setFont(font2);
        c3.setFont(font2);
        c4.setFont(font2);
        c5.setFont(font2);
        c6.setFont(font3);

        
        
        ImageIcon image4 = new ImageIcon(this.getClass().getResource("/school.jpg"));
	    ImageIcon image3 = new ImageIcon(this.getClass().getResource("/hospital.jpg"));
	    ImageIcon image1 = new ImageIcon(this.getClass().getResource("/hotels.jpg"));
	    ImageIcon image5 = new ImageIcon(this.getClass().getResource("/railway.jpg"));
	    ImageIcon image6 = new ImageIcon(this.getClass().getResource("/zbank.jpg"));
	    ImageIcon image2 = new ImageIcon(this.getClass().getResource("/mall.jpg"));    	    
	    l1.setIcon(image1);
	    l2.setIcon(image2);
	    l3.setIcon(image3);
	    l4.setIcon(image4);
	    l5.setIcon(image5);
	    l6.setIcon(image6);
		
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(l5);
		l.add(l6);
        
		
		l1.setBounds(70,90,300,250);
		l2.setBounds(70,400,300,250);
		l3.setBounds(900,90,300,250);
		l4.setBounds(500,90,300,250);
		l5.setBounds(500,400,300,250);
		l6.setBounds(900,400,300,250);
		

        
        
		l.add(ls);
		ls.setBounds(370,9,555,78);
        l.add(c1);
        c1.setBounds(595,340,80,40);
        l.add(c2);
        c2.setBounds(1000,340,100,40);
        l.add(c3);
        c3.setBounds(170,340,65,40);
        l.add(c4);
        c4.setBounds(595,650,180,40);
        l.add(c5);
        c5.setBounds(1000,650,65,40);
        l.add(c6);
        c6.setBounds(165,650,55,40);
        
        l.add(Back);
        Back.setBounds(70,33,150,35);

        frame4.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
        l4.setActionCommand(Actions.N1.name());
        l4.addActionListener(this);
        l2.setActionCommand(Actions.N2.name());
        l2.addActionListener(this);
        l5.setActionCommand(Actions.N3.name());
        l5.addActionListener(this);
        
        l1.setActionCommand(Actions.N4.name());
        l1.addActionListener(this);
        
        l6.setActionCommand(Actions.N5.name());
        l6.addActionListener(this);
        l3.setActionCommand(Actions.N6.name());
        l3.addActionListener(this);
        Back.setActionCommand(Actions.N7.name());
        Back.addActionListener(this);
        

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand() == Actions.N1.name()) {
			jschool f21 = new jschool();
          }
          if (e.getActionCommand() == Actions.N2.name()) {
        	  jmall f21 = new jmall();
          }
          if (e.getActionCommand() == Actions.N3.name()) {
        	  jrailway f21 = new jrailway();
           }
          if (e.getActionCommand() == Actions.N4.name()) {
        	  jhotel f21 = new jhotel();
           }
          if (e.getActionCommand() == Actions.N5.name()) {
        	  jbank f21 = new jbank();
            }
          if (e.getActionCommand() == Actions.N6.name()) {
        	  jhospital f21 = new jhospital();
            }
          if (e.getActionCommand() == Actions.N7.name()) {
              myframe3 f21 = new myframe3();
            }
            
		
		
	}
}

class kolkata  extends Frame implements ActionListener{
    private enum Actions {
        N1,N2,N3,N4,N5,N6,N7,N8;
        
      }
   
    public kolkata(){
        Frame frame4 = new Frame("MetroPolitan City");
        frame4.setSize(1370,770);
        frame4.setVisible(true);
        frame4.setLayout(null);

        Font font1= new Font("Serif",Font.BOLD,45);
        

        JLabel l= new JLabel("");
        ImageIcon image = new ImageIcon(this.getClass().getResource("/background.jpg"));
        l.setIcon(image);
        frame4.add(l);
        l.setBounds(0, 0, 1366, 768);
        

        Label ls = new Label("Select the Commercial point");
        JButton l1 = new JButton("");
        JButton l2 = new JButton("");
        JButton l3 = new JButton("");
        JButton l4 = new JButton("");
        JButton l5 = new JButton("");
        JButton l6 = new JButton("");
        

        Label c1 = new Label("School");
        Label c2 = new Label("Hospital");
        Label c3 = new Label("Hotel");
        Label c4 = new Label("Railway Station");
        Label c5 = new Label("Bank");
        Label c6 = new Label("Mall");
        Button Back = new Button("Back");

       
        
        Font font2= new Font("Serif",Font.BOLD,25);
        Font font3= new Font("Serif",Font.BOLD,25);
        Back.setFont(font2);
        ls.setFont(font1);
        c1.setFont(font2);
        c2.setFont(font2);
        c3.setFont(font2);
        c4.setFont(font2);
        c5.setFont(font2);
        c6.setFont(font3);

        
        
        ImageIcon image4 = new ImageIcon(this.getClass().getResource("/school.jpg"));
	    ImageIcon image3 = new ImageIcon(this.getClass().getResource("/hospital.jpg"));
	    ImageIcon image1 = new ImageIcon(this.getClass().getResource("/hotels.jpg"));
	    ImageIcon image5 = new ImageIcon(this.getClass().getResource("/railway.jpg"));
	    ImageIcon image6 = new ImageIcon(this.getClass().getResource("/zbank.jpg"));
	    ImageIcon image2 = new ImageIcon(this.getClass().getResource("/mall.jpg"));    	    
	    l1.setIcon(image1);
	    l2.setIcon(image2);
	    l3.setIcon(image3);
	    l4.setIcon(image4);
	    l5.setIcon(image5);
	    l6.setIcon(image6);
		
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(l5);
		l.add(l6);
        
		
		l1.setBounds(70,90,300,250);
		l2.setBounds(70,400,300,250);
		l3.setBounds(900,90,300,250);
		l4.setBounds(500,90,300,250);
		l5.setBounds(500,400,300,250);
		l6.setBounds(900,400,300,250);
		

        
        
		l.add(ls);
		ls.setBounds(370,9,555,78);
        l.add(c1);
        c1.setBounds(595,340,80,40);
        l.add(c2);
        c2.setBounds(1000,340,100,40);
        l.add(c3);
        c3.setBounds(170,340,65,40);
        l.add(c4);
        c4.setBounds(595,650,180,40);
        l.add(c5);
        c5.setBounds(1000,650,65,40);
        l.add(c6);
        c6.setBounds(165,650,55,40);
        
        l.add(Back);
        Back.setBounds(70,33,150,35);

        frame4.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
        l4.setActionCommand(Actions.N1.name());
        l4.addActionListener(this);
        l2.setActionCommand(Actions.N2.name());
        l2.addActionListener(this);
        l5.setActionCommand(Actions.N3.name());
        l5.addActionListener(this);
        
        l1.setActionCommand(Actions.N4.name());
        l1.addActionListener(this);
        
        l6.setActionCommand(Actions.N5.name());
        l6.addActionListener(this);
        l3.setActionCommand(Actions.N6.name());
        l3.addActionListener(this);
        Back.setActionCommand(Actions.N7.name());
        Back.addActionListener(this);
        

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand() == Actions.N1.name()) {
			kschool f21 = new kschool();
          }
          if (e.getActionCommand() == Actions.N2.name()) {
        	  kmall f21 = new kmall();
          }
          if (e.getActionCommand() == Actions.N3.name()) {
        	  krailway f21 = new krailway();
           }
          if (e.getActionCommand() == Actions.N4.name()) {
        	  khotel f21 = new khotel();
           }
          if (e.getActionCommand() == Actions.N5.name()) {
        	  kbank f21 = new kbank();
            }
          if (e.getActionCommand() == Actions.N6.name()) {
        	  khospital f21 = new khospital();
            }
          if (e.getActionCommand() == Actions.N7.name()) {
              myframe3 f21 = new myframe3();
            }
            
		
		
          
	}
}

class mumbai  extends Frame implements ActionListener{
    private enum Actions {
        N1,N2,N3,N4,N5,N6,N7,N8;
        
      }
   
    public mumbai(){
        Frame frame4 = new Frame("MetroPolitan City");
        frame4.setSize(1370,770);
        frame4.setVisible(true);
        frame4.setLayout(null);

        Font font1= new Font("Serif",Font.BOLD,45);
        

        JLabel l= new JLabel("");
        ImageIcon image = new ImageIcon(this.getClass().getResource("/background.jpg"));
        l.setIcon(image);
        frame4.add(l);
        l.setBounds(0, 0, 1366, 768);
        

        Label ls = new Label("Select the Commercial point");
        JButton l1 = new JButton("");
        JButton l2 = new JButton("");
        JButton l3 = new JButton("");
        JButton l4 = new JButton("");
        JButton l5 = new JButton("");
        JButton l6 = new JButton("");
        

        Label c1 = new Label("School");
        Label c2 = new Label("Hospital");
        Label c3 = new Label("Hotel");
        Label c4 = new Label("Railway Station");
        Label c5 = new Label("Bank");
        Label c6 = new Label("Mall");
        Button Back = new Button("Back");

       
        
        Font font2= new Font("Serif",Font.BOLD,25);
        Font font3= new Font("Serif",Font.BOLD,25);
        Back.setFont(font2);
        ls.setFont(font1);
        c1.setFont(font2);
        c2.setFont(font2);
        c3.setFont(font2);
        c4.setFont(font2);
        c5.setFont(font2);
        c6.setFont(font3);

        
        
        ImageIcon image4 = new ImageIcon(this.getClass().getResource("/school.jpg"));
	    ImageIcon image3 = new ImageIcon(this.getClass().getResource("/hospital.jpg"));
	    ImageIcon image1 = new ImageIcon(this.getClass().getResource("/hotels.jpg"));
	    ImageIcon image5 = new ImageIcon(this.getClass().getResource("/railway.jpg"));
	    ImageIcon image6 = new ImageIcon(this.getClass().getResource("/zbank.jpg"));
	    ImageIcon image2 = new ImageIcon(this.getClass().getResource("/mall.jpg"));    	    
	    l1.setIcon(image1);
	    l2.setIcon(image2);
	    l3.setIcon(image3);
	    l4.setIcon(image4);
	    l5.setIcon(image5);
	    l6.setIcon(image6);
		
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(l5);
		l.add(l6);
        
		
		l1.setBounds(70,90,300,250);
		l2.setBounds(70,400,300,250);
		l3.setBounds(900,90,300,250);
		l4.setBounds(500,90,300,250);
		l5.setBounds(500,400,300,250);
		l6.setBounds(900,400,300,250);
		

        
        
		l.add(ls);
		ls.setBounds(370,9,555,78);
        l.add(c1);
        c1.setBounds(595,340,80,40);
        l.add(c2);
        c2.setBounds(1000,340,100,40);
        l.add(c3);
        c3.setBounds(170,340,65,40);
        l.add(c4);
        c4.setBounds(595,650,180,40);
        l.add(c5);
        c5.setBounds(1000,650,65,40);
        l.add(c6);
        c6.setBounds(165,650,55,40);
        
        l.add(Back);
        Back.setBounds(70,33,150,35);

        frame4.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
        l4.setActionCommand(Actions.N1.name());
        l4.addActionListener(this);
        l2.setActionCommand(Actions.N2.name());
        l2.addActionListener(this);
        l5.setActionCommand(Actions.N3.name());
        l5.addActionListener(this);
        
        l1.setActionCommand(Actions.N4.name());
        l1.addActionListener(this);
        
        l6.setActionCommand(Actions.N5.name());
        l6.addActionListener(this);
        l3.setActionCommand(Actions.N6.name());
        l3.addActionListener(this);
        Back.setActionCommand(Actions.N7.name());
        Back.addActionListener(this);
        

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand() == Actions.N1.name()) {
			mschool f21 = new mschool();
          }
          if (e.getActionCommand() == Actions.N2.name()) {
        	  mmall f21 = new mmall();
          }
          if (e.getActionCommand() == Actions.N3.name()) {
        	  mrailway f21 = new mrailway();
           }
          if (e.getActionCommand() == Actions.N4.name()) {
        	  mhotel f21 = new mhotel();
           }
          if (e.getActionCommand() == Actions.N5.name()) {
        	  mbank f21 = new mbank();
            }
          if (e.getActionCommand() == Actions.N6.name()) {
        	  mhospital f21 = new mhospital();
            }
          if (e.getActionCommand() == Actions.N7.name()) {
              myframe3 f21 = new myframe3();
            }
            
		
		
	}
}

class jschool {    
    JFrame f;    
    jschool(){    
    f=new JFrame("Jaipur School");    
    String data[][]={ 
    		{"Jayshree Periwal International Schools ","Mahapura Rd, Narayan-Y-Block, Mahapura, Rajasthan-302026."},    
            {"Maharani Gayatri Devi Public School, Jaipur","Sawai Ram Singh Road, Near Ajmeri GateJaipur, Rajasthan-302001.  "},    
            {"Neerja Modi School, Jaipur","Neerja Modi School, Shipra Path, Shanthi Nagar, Mansarovar, Jaipur, Rajasthan- 302020."},
            {"  Maharaja Sawai Man Singh Vidyalaya ","Sawai Ram Singh Rd, Rambagh, Jaipur, Rajasthan 302004. "},    
            {"St Xavier's Senior Secondary School, Jaipur ","Bhagwan Das Rd, Panch Batti, C Scheme, Ashok Nagar, Jaipur, Rajasthan 302001. "},    
            {"Jayshree Periwal High School, Jaipur","2-3, Ajmer Rd, adjoining Stadium, Chitrakoot, Jaipur, Rajasthan 302021. "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?rlz=1C1SQJL_enIN1018IN1018&tbm=lcl&sxsrf=ALiCzsYfAM2qxs6EaaaOPFxj1ACOM7DOdQ:1671461609809&q=Jaipur+School&rflfq=1&num=20&stick=H4sIAAAAAAAAABWQTUoDURCEyUJx48aIi1nlCP3f1VdwJXiCIBGFwISIF_IEnstTWLN71Ovq_qrubpdHFUClulqk0yJDh6pHRU9Zp06Oungv-4nq5FhEUEJZ5bIP8zIpjaHbVU1BsV2BiZEYF7Wh_VE1A4JULx2vGuepfaoqHzDACJI2QlECDdoqEuYpufkJadw_PAGHqrQte7RaTVZCuKgDFhzN1pJIQ7Q4tlndAGaYkJ9NA1ndyGpVBCA6g9LDc7o8TLdkTjh_xJkCy0NsuWOKiWMbTV7XZIGZYFtZwcpCiQQUEkoyRuBKz63oHBBW4dEWDNJsr9hZTVhRxmxpSaTQNEvaJNh8Zc_vbve3e3o5rZfz6XA8f62Hr9Px-vZxeF-vPzf3z8fPy_f18Pr2sa7nfx0El2_XAQAA&sa=X&ved=2ahUKEwjIhojc94X8AhU3i2MGHTKJAbIQ6nUoAHoECHAQAQ&biw=1480&bih=661&dpr=0.9#rlfi=hd:;si:;mv:[[27.781923990382083,80.17312321062056],[25.29554876130623,74.35036930437056],null,[26.545473737352463,77.26174625749556],8]"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	}); 
} 
}

class jrailway {    
    JFrame f;    
    jrailway(){    
    f=new JFrame("Jaipur Railway");    
    String data[][]={ 
    		{"Railway Station ","Gopalbari, Jaipur, Rajasthan 302006"},    
            {"Kanakpura Station","Kanakpura, Jaipur, Rajasthan 302012"},    
            {"Durgapura Station","Mahavir Nagar, Mahaveer Nagar, Durgapura, Jaipur, Rajasthan 302020"},
            {"Khatipura Station","Ganga Marg, Indira Gandhi Nagar, Ghati Karolan, Jaipur, Rajasthan 303012 "},    
            {"Jaipur Junction ", "302006, Railway, Station Rd, Gopalbari, Jaipur, Rajasthan 302006 "},    
            {" Gandhinagar Jaipur Railway Station ","Jawahar Nagar, Bajaj Nagar, Jaipur, Rajasthan 302015"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=jaipur+railway&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsYU8AfafJtEp2Lt5kcKYmeViwoMZg%3A1671462259720&ei=c32gY5jLK4HD4-EPmvOsmA0&ved=0ahUKEwjY0PuR-oX8AhWB4TgGHZo5C9MQ4dUDCAk&uact=5&oq=jaipur+railway&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEJECMgUIABCRAjIICAAQgAQQsQMyBQgAEJECMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOggIABCxAxCRAjoLCAAQgAQQsQMQgwFQoBRYmCBgySpoAnAAeACAAdYBiAGQCZIBBTAuNy4xmAEAoAEBwAEB&sclient=gws-wiz-local"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});   
} 
}

class jhotel {    
    JFrame f;    
    jhotel(){    
    f=new JFrame("Jaipur Hotel");    
    String data[][]={ 
    		{"Rambagh Place ","Bhawani Singh Road, Rambagh, Jaipur "},    
            {"Lohagarh Fort Resort ","NH-8, Kachera Wala, Kukas, Jaipur, India, Kookas 303101"},    
            {"The Lalit Jaipur ","2B & 2C, Jagatpura Road, Jawahar Circle, Jaipur "},
            {"Taj Jai Mahal Palace ","Jacob Road, Civil Lines, Jaipur "},    
            {"Taj Jai Mahal Palace Jacob Road, Civil Lines, Jaipur","No. 1, Sardar Patel Marg, Nehru Sahkar Bhawan, C-Scheme, 22 Godam Circle, Jaipur"},    
            {"Ramada  Hotel Jaipur","Govind Marg Raja Park, 1st Avenue, Jaipur"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=jaipur+hotels&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsasOJLkIJLQs1ih0btjkkcGhrIVoA%3A1671461970580&ei=UnygY-iAI7-74-EPtfGxyA4&oq=Jaipur+&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAEYAzIECAAQQzIICAAQgAQQsQMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATIFCAAQgAQyCAgAEIAEELEDMggIABCABBCxAzILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgUIABCABDoFCAAQsQNQjQdYthBgsNkBaABwAHgAgAHbAYgBwAiSAQUwLjYuMZgBAKABAcABAQ&sclient=gws-wiz-local"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});    
} 
}

class jhospital {    
    JFrame f;    
    jhospital(){    
    f=new JFrame("Jaipur Hospital");    
    String data[][]={ 
    		{" Rungta Hospital ","General hospital · Calgiri Marg, near Police Station "},    
            {"Apex Hospitals ","General hospital · SP-4 & 6, Central Road"},    
            {"Apollo Spectra Hospital","J-2/37, Mahavir Marg, opp. Jai Club, Panch Batti, C Scheme, Ashok Nagar, Jaipur, Rajasthan 302001"},
            {"Santokba Durlabhji Memorial Hospital (SDMH)","General hospital · Near, Bhawani Singh Rd "},    
            {"Saket Hospital","Sector 10, Meera Marg, Ward Number 43, Agarwal Farm, Mansarovar, Jaipur, Rajasthan 302020"},    
            {"Rukmani Birla Hospital CK Birla","Gopalpura Bypass Rd, Near Triveni Flyover, Shanthi Nagar, Gopal Pura Mode, Jaipur, Rajasthan 302018"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=jaipur+hospital&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsbO_nvuZenr5k0Y4nyYOmC4clMiVQ%3A1671462194913&ei=Mn2gY4SvN-7f4-EPwNiUmAw&ved=0ahUKEwiEkIjz-YX8AhXu7zgGHUAsBcMQ4dUDCAk&uact=5&oq=jaipur+hospital&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAEIAEELEDMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgoIABCxAxCDARBDOgsIABCABBCxAxCDAToECAAQQzoICAAQsQMQgwE6BQgAEJECUNoHWNyhAWDRqgFoAnAAeACAAakCiAGyEJIBBjAuMTIuMZgBAKABAcABAQ&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[26.9922866,75.83758],[26.8439914,75.7635257]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});  
} 
}

class jmall {    
    JFrame f;    
    jmall(){    
    f=new JFrame("Jaipur Mall");    
    String data[][]={ 
    		{"Pink Square Mall ", "Shopping mall · Plot No. 1, 2, Govind Marg "},    
            {"World Trade Park ", "Shopping mall · Jawahar Lal Nehru Marg  "},    
            {"Elements Mall ","Shopping mall · 192, Ajmer Rd, near D.C.M"},
            {"Crystal Court Mall ", "Shopping mall · Gaurav Tower Parking Lot 1 "},    
            {"JTM Mall ","Shopping Mall-B 2, Jagatpura Rd, near Jagatpura Flyover, Model Town, Malviya Nagar"},    
            {"Apex Mall, Lal Kothi ", "Shopping mall · VRQ3+739, Tonk Rd "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=jaipur+mall&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsao_mOfyK2HeZFTKrNym1pja51bjA%3A1671462302813&ei=nn2gY9CkMamb4-EPpq2D4Ak&ved=0ahUKEwjQ68Gm-oX8AhWpzTgGHabWAJwQ4dUDCAk&uact=5&oq=jaipur+mall&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAEIAEELEDMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOgcIABCxAxBDOgsIABCABBCxAxCDAToICAAQsQMQgwE6CAgAELEDEJECOgUIABCRAjoECAAQA1C-DVjoFmCeJmgAcAB4AIABmQKIAecIkgEFMC40LjKYAQCgAQHAAQE&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[26.942680799999998,75.9222958],[26.808077299999997,75.7237999]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:10"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});      
} 
}


class jbank {    
    JFrame f;    
    jbank(){    
    f=new JFrame("Jaipur Bank");    
    String data[][]={ 
    		{"Federal Bank "," Plot No 4, Hathroi Fort, Gopal Bari, Jaipur, Rajasthan 302001 "},    
            {"ICICI Bank Mega Branch, Jaipur-Branch & ATM ","Shreeji Towers, Near Ahimsa Circle, Jaipur, Rajasthan 302001"},    
            {"ICICI Bank Ltd, Jaipur - JDA ","ICICI Bank Ltd, JAIPUR DEVELOPMENT AUTHORITY Jaipur, Rajasthan 302004"},
            {"ICICI Bank-DCM, Jaipur-Branch & ATM ","DCM, 17-19, Ajmer Rd, Vidhyut Nagar, Jaipur, Rajasthan 302021"},    
            {"dbs Jaipur branch ","Plot no, ground floor bearing unit no.1, Sahakar Marg, Lalkothi,Jaipur, Rajasthan 302015"},    
            {"ICICI Bank Jhotwara Road, Jaipur-Branch & ATM ","Jhotwara Rd, Bani Park, Jaipur, Rajasthan 302016"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=jaipur+bank&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsb0XPYsAYFsxKGHQfOdIrMzkvPvoQ%3A1671462385182&ei=8X2gY-vjCrbC4-EP4PCF8A0&ved=0ahUKEwiroOXN-oX8AhU24TgGHWB4Ad4Q4dUDCAk&uact=5&oq=jaipur+bank&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOggIABCABBCxAzoECAAQQzoFCAAQkQI6CAgAELEDEJECUNARWLAVYMcfaABwAHgAgAHbAogBvwmSAQcwLjQuMS4xmAEAoAEBwAEB&sclient=gws-wiz-local"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});     
} 
}




class drailway {    
    JFrame f;    
    drailway(){    
    f=new JFrame("Delhi Railway");    
    String data[][]={ 
    		{"Delhi Junction","Mori Gate, New Delhi, Delhi 110006 "},    
            {"Sadar Bazar","Rui Mandi, Sadar Bazaar, New Delhi, Delhi 110006 "},    
            {"New Delhi Railway Station ","Bhavbhuti Marg, Ratan Lal Market, Kamla Market, Ajmeri Gate, New Delhi, Delhi 110006 "},
            {"Delhi Shahdara Jn. ","Address: Shahdara, New Delhi, Delhi 110032  "},    
            {"Old Delhi Railway Station (DLI) ","Shyama Prasad Mukherjee Marg, Mori Gate, New Delhi, Delhi 110006  "},    
            {"Shivaji Bridge ", "Metro Bhawan, Fire Brigade Lane, Gas Turbine Power Station, Barakhamba, New Delhi, Delhi 110001  "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=delhi+railway&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsaMgmUgJgJQpbw6lwFIp0ifoaW0Tg%3A1671462412482&ei=DH6gY5aFHfaH4-EPlJ-CiAM&ved=0ahUKEwiWu-fa-oX8AhX2wzgGHZSPADEQ4dUDCAk&uact=5&oq=delhi+railway&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAEIAEELEDMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgUIABCRAjoLCAAQgAQQsQMQgwE6CAgAELEDEIMBOgoIABCxAxCDARBDOgQIABBDOgsIABCxAxCDARCRAlAAWMw-YOhGaABwAHgAgAG6AYgBsA-SAQQwLjEzmAEAoAEBwAEB&sclient=gws-wiz-local"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});   
} 
}

class dschool {    
    JFrame f;    
    dschool(){    
    f=new JFrame("Delhi School");    
    String data[][]={ 
    		{"Mother's International School, Sri Aurobindo Marg ", "Sri Aurobindo Marg, Vijay Mandal Enclave, Kalu Sarai, New Delhi, Delhi 110016 "},    
            {"Delhi Public School, RK Puram ","Kaifi Azmi Marg, KD Colony, Sector 12, Rama Krishna Puram, New Delhi, Delhi 110022  "},    
            {"Apeejay School, Pitampura ", "Sheikh Sarai Road Near Malviya Nagar, Panchsheel Marg, Phase I, Sheikh Sarai, New Delhi, Delhi 110017 "},
            {"Modern School, Barakhamba Road ", "Barakhamba Rd, Todarmal Road Area, Mandi House, New Delhi, Delhi 110001  "},    
            {"The British School, Chanakyapuri New Delhi ", "Dr Jose P Rizal Marg, Chanakyapuri, New Delhi, Delhi 110021  "},    
            {" Springdale School, Pusa Road ", "Springdales School, Pusa Road, Upper Ridge Road Junction, New Delhi – 110005 "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=delhi+school&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsbZikWYaeqFrRSoPOAEm_fsZQUgUQ%3A1671462573897&ei=rX6gY_K1NtCc4-EP8P-DmA0&ved=0ahUKEwiywOOn-4X8AhVQzjgGHfD_ANMQ4dUDCAk&uact=5&oq=delhi+school&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAEIAEELEDMggIABCxAxCDATIICAAQgAQQsQMyBQgAEIAEMggIABCxAxCDATIFCAAQgAQyCAgAEIAEELEDMgUIABCABDIICAAQgAQQsQMyBQgAEIAEOgQIABBDOgUIABCRAjoICAAQsQMQkQI6BQgAELEDOgsIABCABBCxAxCDAVD5BFirDWC-D2gAcAB4AIABtwGIAZQIkgEDMC43mAEAoAEBwAEB&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[28.714012999999998,77.30134749999999],[28.564055099999997,77.1692958]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});      
} 
}

class dmall {    
    JFrame f;    
    dmall(){    
    f=new JFrame("Delhi Mall");    
    String data[][]={ 
    		{"The Chanakya ","Yashwant Place Commercial Complex, Chanakyapuri, New Delhi, Delhi 110021 "},    
            {"Ambience Mall, Vasant Kunj ","2, Nelson Mandela Marg, Vasant Kunj II, Vasant Kunj, New Delhi, Delhi 110070  "},    
            {"DLF Promenade ","3 Nelson Mandela Road, Vasant Kunj Mall Road, Vasant Kunj, New Delhi, Delhi 110070 "},
            {"DLF Avenue Saket ","Press Enclave Marg, Saket District Centre, District Centre, Sector 6, Pushp Vihar, New Delhi, Delhi 110017  "},    
            {"Pacific Mall Tagore Garden","Najafgarh Rd, Tagore Garden, Tilak Nagar, New Delhi, Delhi 110018  "},    
            {"Vegas Mall","Plot No.6, North, Pocket 1, Sector 14 Dwarka, Dwarka, Delhi, 110075  "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=delhi+mall&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsa5NSyFhrugH0MFBLATc6qpgtF_Bw%3A1671462581573&ei=tX6gY9zLIoqI4-EPxs6ZgAg&ved=0ahUKEwic-rer-4X8AhUKxDgGHUZnBoAQ4dUDCAk&uact=5&oq=delhi+mall&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA06BwgAELEDEEM6CAgAEIAEELEDOggIABCxAxCDAToFCAAQgAQ6BQgAEJECOgsIABCABBCxAxCDAToHCAAQgAQQClCRBFiSHmCNIGgCcAB4AIABqQGIAeEHkgEDMC43mAEAoAEBwAEB&sclient=gws-wiz-local"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});  
} 
}

class dhotel {    
    JFrame f;    
    dhotel(){    
    f=new JFrame("Delhi Hotel");    
    String data[][]={ 
    		{"Park Inn by Radisson New Delhi IP Extension ","Plot No. 6A, I.P.Extension, Patparganj, New Delhi, Delhi 110092"},    
            {"The Umrao ","National Highway 48, Rajokri Rd, D Block, 6:Samalkha, New Delhi, Delhi 110037 "},    
            {"Lemon Tree Premier, Delhi Airport ","Indira Gandhi International Airport, Asset No. 6, Aerocity, New Delhi, Delhi 110037 "},
            {"Taj Palace, New Delhi ","Taj Palace, 2, Sardar Patel Marg, Diplomatic Enclave, Chanakyapuri, New Delhi, Delhi 110021  "},    
            {"De Pavilion Hotel, Delhi ","250-A, Road No. 6, Block RZ, Mahipalpur Village, Mahipalpur, New Delhi, Delhi 110037 "},    
            {"The Leela Ambience Convention Hotel Delhi ","CBD, 1, Maharaja Surajmal Marg,Yamuna Sports Complex,Vishwas Nagar, Shahdara, Delhi, 110032  "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=delhi+hotel&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsbm97HU1NEQBcEWgPLsf0nQVhukmw%3A1671462624037&ei=4H6gY4rvAeTX4-EPq--N4Ag&ved=0ahUKEwiK39e_-4X8AhXk6zgGHat3A4wQ4dUDCAk&uact=5&oq=delhi+hotel&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAELEDEJECMggIABCxAxCRAjIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOgcIABCABBAKOggIABCABBCxAzoLCAAQgAQQsQMQgwE6DQgAEIAEELEDEIMBEAo6CggAEIAEELEDEAo6BQgAEJECULIEWKkdYOkgaABwAHgAgAHaAYgBswuSAQUwLjkuMZgBAKABAcABAQ&sclient=gws-wiz-local"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});      
} 
}

class dhospital {    
    JFrame f;    
    dhospital(){    
    f=new JFrame("Delhi Hospital");    
    String data[][]={ 
    		{"AIIMS Hospital","Ansari Nagar East, Gautam Nagar, Ansari Nagar East, New Delhi, Delhi 110029 "},    
            {"IBS Hospital" ,"73, Ring Rd, Block L, Lajpat Nagar III, Sarojini Nagar, New Delhi, Delhi 110024 "},    
            {"Felix Hospital ","Felix Hospital, Paras Tierea, Sector 137, Noida, Uttar Pradesh 201305 "},
            {"Max Super Speciality Hospital, Patparganj ","108A, IP Ext, I.P.Extension, Patparganj, Delhi, 110092  "},    
            {"Fortis Escorts Heart Institute ","Okhla road, Sukhdev Vihar Metro Station, New Delhi, Delhi 110025  "},    
            {"Indraprastha Apollo Hospital ","Indraprastha Apollo Hospital, Mathura Rd, New Delhi, Delhi 110076  "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=delhi+hospital&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsasYkFIkQ6ifhsKdcE486SMH31GBQ%3A1671462662578&ei=Bn-gY730Ivac4-EP4byQ2AI&ved=0ahUKEwi9j4jS-4X8AhV2zjgGHWEeBCsQ4dUDCAk&uact=5&oq=delhi+hospital&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCggAEIAEELEDEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA06BwgAELEDEEM6BQgAEIAEOggIABCABBCxAzoECAAQQzoLCAAQgAQQsQMQgwFQmgZYyTdgpTloAnAAeACAAZ0BiAGcDZIBBDAuMTKYAQCgAQHAAQE&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[28.6790817,77.315601],[28.6236416,77.2088983]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});      
} 
}



class dbank {    
    JFrame f;    
    dbank(){    
    f=new JFrame("Delhi Bank");    
    String data[][]={ 
    		{"DCB Bank New Delhi ","Connaught Place Branch, #15 G Hansalaya Building, Barakhamba Rd, New Delhi, Delhi 110001"},    
            {"ICICI Bank Hargobind Enclave, New Delhi-Branch & ATM ","132, Hargovind Enclave, Anand Vihar, New Delhi, Delhi 110092  "},    
            {"State Bank of India ","Grover Bldg, Sharda Nand Marg, Ajmeri Gate, New Delhi, Delhi 110006 "},
            {"ICICI Bank Krishna Nagar, Delhi-Branch & ATM ","E-5/19, Krishna Nagar,New Delhi, Delhi 110051  "},    
            {"ICICI Bank Delhi University-Branch","Utility Centre, University Road,North Campus, New Delhi, Delhi 110007  "},    
            {"State Bank of India GANDHINAGAR (DELHI)","Gandhi Nagar, West Kanti Nagar, Seelampur, Shahdara, New Delhi, Delhi 110031  "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=delhi+bank&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsbdqaPHYE6EA5p0_RnHh_jS29D7Rw%3A1671462686925&ei=Hn-gY_v-N_Lm4-EP-Y2bqAs&ved=0ahUKEwj7hdbd-4X8AhVy8zgGHfnGBrUQ4dUDCAk&uact=5&oq=delhi+bank&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgcIABCxAxBDOgUIABCRAjoLCAAQgAQQsQMQgwE6CAgAEIAEELEDOggIABCxAxCDAVDqBViGD2CWEmgAcAB4AIABqwGIAbcFkgEDMC41mAEAoAEBwAEB&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[28.672349999999994,77.2935036],[28.5561292,77.2031855]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!2m1!1e3!3sIAE,lf:1,lf_ui:3"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});      
} 
}

class mschool {    
    JFrame f;    
    mschool(){    
    f=new JFrame("Mumbai School");    
    String data[][]={ 
    		{"Billabong High International School","5, Apna Bazar Rd, near Azad Nagar, Azad Nagar , Mumbai, Maharashtra 400053 "},    
            {"JBCN International School in Chembur, Mumbai ","Yogi Tower, Chembur Education Society,Ramakrishna Chemburkar Marg, Mumbai, Maharashtra 400071  "},    
            {"Aditya Birla World Academy","Vastu Shilp, JD Road Annexe, Gamadia Colony, Tardeo, Mumbai, Maharashtra 40000"},
            {"Jamnabai Narsee School"," Narsee Monjee Bhavan 7, N S Road No. 7, JVPD Scheme, Vile Parle West, Mumbai, Maharashtra 400049  "},    
            {"Podar International School ","Saraswati Rd, Santacruz West, Mumbai, Maharashtra 400054  "},    
            {"Bombay Scottish School, Mahim ","153, SVS Rd, Mahim West, Mahim, Mumbai, Maharashtra 400016 "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=mumbai+school&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsbHH81eglYXVeXZXKNLlIicDd20ew%3A1671462771861&ei=c3-gY5OaNNKH4-EP3aiysAg&ved=0ahUKEwjTn5aG_IX8AhXSwzgGHV2UDIYQ4dUDCAk&uact=5&oq=mumbai+school&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgUIABCRAjoECAAQQzoLCAAQgAQQsQMQgwE6BwgAELEDEEM6CAgAELEDEIMBOgoIABCxAxCDARBDOggIABCxAxCRAjoICAAQgAQQsQNQAFjPJ2D4K2gAcAB4AIABmQKIAYYRkgEGMC4xMS4ymAEAoAEBwAEB&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[19.1837906,72.9206907],[18.9092433,72.8023316]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});       
} 
}
class mmall {    
    JFrame f;    
    mmall(){    
    f=new JFrame("Mumbai Mall");    
    String data[][]={ 
    		{"Phoenix Marketcity, Mumbai","Lal Bahadur Shastri Rd, Patelwadi.Kurla, Kamani, Kurla West, Kurla, Mumbai, Maharashtra 400070 "},    
            {"Phoenix Palladium ","462, Senapati Bapat Marg, Lower Parel, Mumbai, Maharashtra 400013  "},    
            {"Oberoi Mall ","Western Express Highway Goregaon East, Oberoi Garden City, Mumbai, Maharashtra 400063 "},
            {"Growel's 101 Mall ","Police Station, Off, Western Express Highway, Akurli Rd, Samata Nagar, Mumbai, Maharashtra 400101  "},    
            {"Atria The Millennium Mall"," Dr Annie Besant Rd, Lotus Colony, Worli, Mumbai, Maharashtra 400018 "},    
            {"Infiniti Mall","Infiniti Mall Malad, Malad, Mindspace, Malad West, Mumbai, Maharashtra 400064 "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=mumbai+mall&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsb6Dl6zn70CICHzYmJ4wfE_uJx3qg%3A1671462831850&ei=r3-gY-G-M7OI4-EPh_ig2Ao&ved=0ahUKEwih0uOi_IX8AhUzxDgGHQc8CKsQ4dUDCAk&uact=5&oq=mumbai+mall&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEJECMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOggIABCABBCxAzoLCAAQgAQQsQMQgwE6CAgAELEDEJECOggIABCxAxCDAVCwBlifEGDcE2gAcAB4AIABvQGIAZQHkgEDMC42mAEAoAEBwAEB&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[19.219856399999998,72.9328987],[18.909905300000002,72.8036358]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:10"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});   
} 
}
class mrailway {    
    JFrame f;    
    mrailway(){    
    f=new JFrame("Mumbai Railway");    
    String data[][]={ 
    		{"Charni Road","Maharshi Karve Road, Girgaon, Mumbai, Maharashtra 400004"},    
            {"Mumbai Central","Nathani Heights Commercial,B'Wing,Shop no 57 Ground Floor, Mumbai Central, Mumbai, Maharashtra 400008 "},    
            {"Currey Road "," Mahadev Palav Marg, BDD Chawl, Parel, Mumbai, Maharashtra 400012 "},
            {"Kurla Station","Station Brahmanwadi, Kurla, 400024, Station Rd, Kurla West, Kurla, Mumbai, Maharashtra 400070 "},    
            {"Byculla ","Byculla West, Mazgaon, Mumbai, Maharashtra 400010  "},    
            {"Mahalaxmi","K K Road, Mahalakshmi, Mumbai, Maharashtra 400018  "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=mumbai+railway&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsZkkGwkzabAWHAsQFNAg3fwkmWuPA%3A1671462865996&ei=0X-gY6KuPPvv4-EP2eaP4AE&ved=0ahUKEwji2oez_IX8AhX79zgGHVnzAxwQ4dUDCAk&uact=5&oq=mumbai+railway&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAELEDEJECMgUIABCRAjIFCAAQkQIyCAgAELEDEJECMgUIABCRAjIICAAQgAQQsQMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOgsIABCABBCxAxCDAVD1A1ijOmCXRmgAcAB4AIABqAGIAfMJkgEDMC45mAEAoAEBwAEB&sclient=gws-wiz-local"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});    
} 
}
class mhotel {    
    JFrame f;    
    mhotel(){    
    f=new JFrame("Mumbai Hotel");    
    String data[][]={ 
    		{"Residency Hotel Fort, Mumbai"," Corner of, 26, Rustom Sidhwa Marg,Fort, Mumbai, Maharashtra 400001 "},    
            {"Empire Royale Hotel ","Empire Building,3rd floor,above Mc Donald's Cst, Mumbai, Maharashtra 400001  "},    
            {"Four Seasons Hotel Mumbai ","Gandhi Nagar, Upper Worli, Worli, Mumbai, Maharashtra 400018 "},
            {"ITC Grand Central, Mumbai- LEED Platinum certified luxury hotel","287, Dr Baba Saheb Ambedkar Rd, Parel East, Parel, Mumbai, Maharashtra 400012  "},    
            {"Hotel Marine Plaza","29, Marine Dr, opp. Cricket Club of India, Mumbai, Maharashtra 400020  "},    
            {"The Taj Mahal Palace, Mumbai","Apollo Bandar, Colaba, Mumbai, Maharashtra 400001  "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=mumbai+hotel&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsaKMNlnHm4YUOMjwHoZvM-bXNiMyQ%3A1671462900570&ei=9H-gY-arIrGo4-EPtuCniAs&ved=0ahUKEwjm9cXD_IX8AhUx1DgGHTbwCbEQ4dUDCAk&uact=5&oq=mumbai+hotel&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAELEDEJECMgUIABCABDIFCAAQgAQyCwgAEIAEELEDEIMBMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOggIABCABBCxAzoECAAQQzoFCAAQkQJQwANYsRBg3BNoAHAAeACAAacBiAHLBpIBAzAuNpgBAKABAcABAQ&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[19.1275235,72.8719655],[18.910047499999997,72.83098249999999]];tbs:lrf:!1m4!1u13!2m2!13m1!1b1!1m4!1u7!2m2!7m1!4e1!1m4!1u2!2m2!2m1!1e1!1m4!1u10!2m2!11m1!1e4!1m4!1u10!2m2!11m1!1e18!1m4!1u10!2m2!11m1!1e9!1m4!1u10!2m2!11m1!1e19!1m4!1u10!2m2!11m1!1e20!1m4!1u10!2m2!11m1!1e8!1m4!1u10!2m2!11m1!1e10!1m4!1u10!2m2!11m1!1e1!1m4!1u10!2m2!11m1!1e3!1m4!1u10!2m2!11m1!1e15!1m4!1u4!2m2!4m1!2e1!2m1!1e2!2m7!1e17!4m2!17m1!1e3!4m2!17m1!1e8!3sIAE,lf:1,lf_ui:6"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});    
} 
}
class mbank {    
    JFrame f;    
    mbank(){    
    f=new JFrame("Mumabi Bank");    
    String data[][]={ 
    		{"Mumbai District Central Cooperative Bank"," 207, Mumbai Bank Bhavan, Opp. Kitab Mahal, Church Gate, Dr Dadabhai Naoroji Rd, Mumbai, Maharashtra 400001 "},    
            {"The Bharat Co-Operative Bank Limited"," Geesee Co-Operative Housing Society Limited CST Road Opp Kotak Bank, Kalina, Santacruz East, Mumbai, Maharashtra 400098  "},    
            {"Mumbai Bank","No-1, Riddhi Siddhi Apartment, V.N. Marg, Scion Chunabatti, Mumbai, Maharashtra 400002 "},
            {"ICICI Bank Ltd","ICICI Bank Ltd, , Navsari Building, 240, Dr Dadabhai Naoroji Rd, Fort, Mumbai, Maharashtra 400001 "},    
            {"Mogaveera Bank","Shop No.9, New Dwarka Puri, Kailash Chowk, L.B.S. Marg, Near Sheetal Cinema, Kurla (West), Mumbai, Maharashtra 400070  "},    
            {"Axis Bank Branch"," SN 52, CS No 1331, GF, Nathani Heights, Dalal Estate, Mumbai, Maharashtra 400008 "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=mumbai+bank&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsa4XhJ7W2y5vLVj54RcEul5HUCkhA%3A1671462921738&ei=CYCgY-XVLISAjuMPwtm-iAo&ved=0ahUKEwil_tHN_IX8AhUEgGMGHcKsD6EQ4dUDCAk&uact=5&oq=mumbai+bank&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEIAEMgUIABCABDIHCAAQgAQQCjIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6BwgAELEDEEM6CwgAEIAEELEDEIMBOgUIABCRAjoICAAQgAQQsQNQhARY1gxg1RZoAHAAeACAAcMBiAGeBpIBAzAuNZgBAKABAcABAQ&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[29.232301300000003,77.585433],[18.3533065,72.5589668]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!2m1!1e3!3sIAE,lf:1,lf_ui:4"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});   
} 
}
class mhospital {    
    JFrame f;    
    mhospital(){    
    f=new JFrame("Mumbai Hospital");    
    String data[][]={ 
    		{"Saifee Hospital ","Saifee Hospital, 15/17, Maharshi Karve Rd, opposite Charni Road, Opera House, Station, Mumbai, Maharashtra 400004 "},    
            {"Balaji Hospital ","Cross Lane III, Sant Savata Mali Marg, Byculla East, Mumbai, Maharashtra 400027  "},    
            {" Jaslok Hospital & Research Centre ","15, Pedder Rd, IT Colony, Tardeo, Mumbai, Maharashtra 400026 "},
            {"Sir H. N. Reliance Foundation Hospital and Research Centre ","Prarthana Samaj, Raja Rammohan Roy Rd, Girgaon, Mumbai, Maharashtra 400004  "},    
            {"Wockhardt Hospitals, Mumbai Central ","1877, Dr Anandrao Nair Marg, Near Agripada, Mumbai Central, Mumbai, Maharashtra 400011 "},    
            {"S L Raheja Hospital – Fortis","Raheja Rugnalaya Marg, Mahim West, Mahim, Mumbai, Maharashtra 400016  "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=mumbai+hospital&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsYkb9EbSWAtbjT-IqjdVGCRBx8riA%3A1671586435252&ei=g2KiY5H_Drzl4-EP4MG7gAM&ved=0ahUKEwjRzLzdyIn8AhW88jgGHeDgDjAQ4dUDCAk&uact=5&oq=mumbai+hospital&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOgsIABCABBCxAxCDAToICAAQsQMQgwE6CAgAEIAEELEDOgUIABCRAjoICAAQsQMQkQI6CggAELEDEIMBEEM6BwgAELEDEEM6BAgAEAM6DQgAEIAEELEDEIMBEAo6BQgAELEDUI-BDFjAtgxgiLkMaABwAHgAgAGVAogBiROSAQYwLjE0LjKYAQCgAQHAAQE&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[19.142675099999998,72.92087939999999],[18.9294847,72.7979831]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});  
} 
}



class hschool {    
    JFrame f;    
    hschool(){    
    f=new JFrame("Hyderabad School");    
    String data[][]={ 
    		{"Delhi Public School Hyderabad","Survey No 74, Khajaguda Village, Chitrapuri Colony, Post, Hyderabad, Telangana 500104"},    
            {"Hyderabad Public School","88, Sardar Patel Rd, Begumpet, Hyderabad, Telangana 500016"},    
            {"Chirec International School","1-55/12, Botanical Garden Rd, Sri Ram Nagar, Kondapur, Hyderabad, Telangana 500084"},
            {"Sentia School","Beside B K Enclave, Road No. 2, Ranga Reddy District, Andhra Pradesh, Hyderabad, 500074"},    
            {"DAV Public School Hyderabad","Vivekananda Nagar, Kukatpally, Hyderabad, Telangana 500072"},    
            {"St Ann’s High School Hyderabad","12-5-3/1, Tarnaka Main Rd, Doctor ZMES Society, Vijayapuri Colony, Mettuguda, Secunderabad, Telangana 500017"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=hyedrabad+school&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsZ-VB06NmyXC_fpX_5IUp1NJIHpKg%3A1671586643088&ei=U2OiY9P-BMba4-EP1Mqm-Ac&ved=0ahUKEwiT9MnAyYn8AhVG7TgGHVSlCX8Q4dUDCAk&uact=5&oq=hyedrabad+school&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA06BAgAEEM6CwgAEIAEELEDEIMBOggIABCABBCxAzoFCAAQkQI6BwgAELEDEEM6BQgAEIAEOggIABCxAxCRAjoKCAAQsQMQgwEQQzoKCAAQgAQQsQMQCjoHCAAQgAQQCjoNCAAQgAQQsQMQgwEQCjoFCAAQsQM6CAgAEBYQHhAKOgUIABCGA1AAWKtcYOheaARwAHgAgAHPAYgBhxiSAQYwLjE4LjKYAQCgAQHAAQE&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[17.589344999999998,78.5556655],[17.3386727,78.2658914]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	}); 
} 
}
class hmall {    
    JFrame f;    
    hmall(){    
    f=new JFrame("Hyderabad Mall");    
    String data[][]={ 
    		{"Inorbit Mall","S No. 64, APIIC Software Layout, Inorbit Mall Road, Mindspace, Madhapur, Hyderabad, Telangana 500081"},    
            {"Hyderabad Central Mall","1 4 Plot No 6 – 3 – 673. Punjagutta Cross Road, Punjagutta, Hyderabad, Telangana 500082"},    
            {"The Forum Sujana Mall","S-16, Survey No. 1009, Opposite Malaysian Township, Hyderabad, Telangana 500072"},
            {"FMG Mall","5-9-240, Opposite Grammar School, Abids, Hyderabad, Telangana 500001"},    
            {"City Centre Mall","CITY CENTER 8-2-592, Road No. 1, Banjara Hills, Hyderabad, Telangana 500034"},    
            {"GVK One","Road No. 1, Banjara Hills, Hyderabad, Telangana 500034"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=hyderabad+mall&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsbB_8TtbbS1Qo-1QWFGvhJlW53AwA%3A1671586720716&ei=oGOiY-OqK5HV4-EP062wkAM&ved=0ahUKEwjj-svlyYn8AhWR6jgGHdMWDDIQ4dUDCAk&uact=5&oq=hyderabad+mall&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgUIABCRAjoICAAQsQMQkQI6CAgAEIAEELEDOgsIABCABBCxAxCDAToLCAAQsQMQgwEQkQI6BQgAELEDOggIABCxAxCDAToHCAAQgAQQClAAWL0WYLcZaABwAHgAgAG1AYgB-AaSAQMwLjaYAQCgAQHAAQE&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[17.497355199999998,78.6081567],[17.359850299999998,78.35012619999999]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:10"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});
} 
}
class hrailway {    
    JFrame f;    
    hrailway(){    
    f=new JFrame("Hyderabad Railway");    
    String data[][]={ 
    		{"Hafeezpet Railway Station","Aditya Nagar, Hafeezpet, Hyderabad, Telangana"},    
            {"lalaguda","SC Railway Colony, Malkajgiri, Secunderabad, Telangana"},    
            {"Fathe Nagar Railway Station","Allauddin Basthi, Sanath Nagar, Hyderabad, Telangana"},
            {"Lakdikapool Railway Station","Lakdikapul, Hyderabad, Telangana"},    
            {"Ammuguda","Bolarum, Secunderabad, Telangana"},    
            {"Nampally Railway Station","Red Hills, Lakdikapul, Hyderabad, Telangana"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=hyderabad+railway+&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsZBcIyfPm3A0AQV7ms8lFo5LbADBQ%3A1671586771781&ei=02OiY-OZL6qD4-EPh_Ce0A8&ved=0ahUKEwijz_j9yYn8AhWqwTgGHQe4B_oQ4dUDCAk&uact=5&oq=hyderabad+railway+&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAEIAEELEDMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOgcIABCABBAKOggIABCxAxCDAToLCAAQgAQQsQMQgwE6BQgAELEDOgUIABCRAjoICAAQsQMQkQI6CwgAELEDEIMBEJECUNMEWPIsYOE6aABwAHgAgAHOAYgB6A6SAQYwLjEyLjGYAQCgAQHAAQE&sclient=gws-wiz-local"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	}); 
} 
}
class hhotel {    
    JFrame f;    
    hhotel(){    
    f=new JFrame("Hyderabad Hotel");    
    String data[][]={ 
    		{"Taj Falaknuma Palace"," Engine Bowli, Falaknuma , 500053 Hyderabad, India"},    
            {"Trident Hyderabad","Hitec City, Near Cyber Towers, Madhapur, 500081 Hyderabad, India"},    
            {"ITC Kohenur","5, Hyderabad Knowledge City, Madhapur, 500081 Hyderabad, India"},
            {"Hyatt Place Hyderabad Banjara Hills","Road 1, Banjara Hills, 500034 Hyderabad, India"},    
            {"Sheraton Hyderabad Hotel","115/1 Nanakramguda, Financial District, Gachibowli Hyderabad, 500032"},    
            {"Courtyard by Marriott Hyderabad","Hussain Sagar Lake, Tank Bund Road,, 500080 Hyderabad, India"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=hyderabad+hotel&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsaKcZu1QXuB6gC2iRXN0JoI6env1Q%3A1671586844113&ei=HGSiY9DABvPD4-EPlJ2NwAg&ved=0ahUKEwjQvregyon8AhXz4TgGHZROA4gQ4dUDCAk&uact=5&oq=hyderabad+hotel&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEJECMgUIABCRAjIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOggIABCABBCxAzoHCAAQsQMQQzoFCAAQsQM6CAgAELEDEIMBOgsIABCABBCxAxCDAVC5DljJLGDTMWgAcAB4AIABrwWIAdENkgEJMC42LjEuNS0xmAEAoAEBwAEB&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[17.4477908,78.4715696],[17.3970962,78.4624864]];tbs:lrf:!1m4!1u13!2m2!13m1!1b1!1m4!1u7!2m2!7m1!4e1!1m4!1u2!2m2!2m1!1e1!1m4!1u10!2m2!11m1!1e4!1m4!1u10!2m2!11m1!1e18!1m4!1u10!2m2!11m1!1e9!1m4!1u10!2m2!11m1!1e20!1m4!1u10!2m2!11m1!1e8!1m4!1u10!2m2!11m1!1e10!1m4!1u10!2m2!11m1!1e1!1m4!1u10!2m2!11m1!1e3!1m4!1u10!2m2!11m1!1e15!1m4!1u4!2m2!4m1!2e1!2m1!1e2!2m7!1e17!4m2!17m1!1e3!4m2!17m1!1e8!3sIAE,lf:1,lf_ui:6"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});    
} 
}
class hbank {    
    JFrame f;    
    hbank(){    
    f=new JFrame("Hyderabad Bank");    
    String data[][]={ 
    		{"Reserve Bank of India","6-1-56, AG Office Rd, Saifabad, Khairtabad, Hyderabad, Telangana 500004"},    
            {"ICICI Bank Himayat Nagar","AP State Housing Board, Himayatnagar, Hyderabad, Telangana 500029"},    
            {"Canara Bank","22-7-110, II Floor SVJ Shopping mall, Pathergatti Rd, Hyderabad, Telangana 500002"},
            {"UCO Bank","H No 8/2/418, Rd Number 7, Banjara Hills, Hyderabad, Telangana 500034"},    
            {"State Bank of India","Bank St, Sultan Bazar, Koti , Hyderabad, Telangana 500095"},    
            {"SBM Bank","TSR Towers, 1st Floor, Raj Bhavan Rd, Somajiguda, Hyderabad, Telangana 500082"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=hyderabad+bank&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsbSxNMbw3pvYOBgkQrneVgAXAzM4w%3A1671586903949&ei=V2SiY5S_OY3e4-EPyca6sAI&ved=0ahUKEwjUxvu8yon8AhUN7zgGHUmjDiYQ4dUDCAk&uact=5&oq=hyderabad+bank&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgsIABCABBCxAxCDAToECAAQQzoFCAAQsQM6CAgAEIAEELEDOggIABCxAxCDAToFCAAQkQJQ6BFYiCJguCVoAHAAeACAAdIBiAGbCJIBBTAuNi4xmAEAoAEBwAEB&sclient=gws-wiz-local"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});    
} 
}


class hhospital {    
    JFrame f;    
    hhospital(){    
    f=new JFrame("Hyderabad Hospital");    
    String data[][]={ 
    		{"Pristyn Care","Road Number 1, Shyam Rao Nagar, Banjara Hills, Hyderabad, Telangana 500034"},    
            {"Aware Gleneagles Global Hospital","Aware Gleneagles Global Hospital 8-16-1,Hyderabad, Telangana - 500035"},    
            {"Continental Hospital"," Continental Hospital Plot No. 3,Nanakramguda, Gachibowli, Hyderabad, Telangana – 500035"},
            {"Sunshine Hospital","Sunshine Hospital Penderghast Road,Behind Paradise Hotel, Secunderabad, Telangana - 500003"},    
            {"Medicover Hospital","Medicover Hospital Behind Cyber Towers, IBIS Hotel Lane Hitech City,Hyderabad, Telangana - 500081"},    
            {"Global Hospital"," Global Hospital 6-1-1040/1 to 4, Lakdi-ka-pul, Hyderabad, Telangana-500004"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=hyderabad+hospital&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsY-iPgbw7ep79ekbkCJdU4MUOiZUg%3A1671586966610&ei=lmSiY_LxJODC4-EPvNOGyA8&ved=0ahUKEwjylOzayon8AhVg4TgGHbypAfkQ4dUDCAk&uact=5&oq=hyderabad+hospital&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOggIABCABBCxAzoFCAAQsQM6CAgAELEDEIMBOgUIABCRAjoLCAAQgAQQsQMQgwFQqg9YljFglzRoAHAAeACAAZ0DiAHpDJIBBzAuOS40LTGYAQCgAQHAAQE&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[17.5021952,78.56966709999999],[17.3528667,78.33386089999999]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});    
} 
}

class cschool {    
    JFrame f;    
    cschool(){    
    f=new JFrame("Chennai School");    
    String data[][]={ 
    		{"St Patrick’s Anglo Indian Higher Secondary School","1st Crescent Park Road, Gandhi Nagar, Adayar, Chennai 600020"},    
            {"Padma Seshadri Bala Bhavan Secondary School ","29, Alagiriswamy Salai, K. K. Nagar, Chennai 600078"},    
            {"SBOA School and Junior College","18, School Road, Anna Nagar West Extension, Chennai, Tamil Nadu"},
            {"Maharishi Vidya Mandir","28, Dr Guruswamy Road, Chetpet, Chennai, Tamil Nadu"},    
            {" CLM Sishya OMR School"," Rajiv Gandhi Salai (OMR), Thuraipakkam, Chennai, Tamil Nadu"},    
            {"Army Public School ","60 Feet Road, Nandambakkam, Chennai, Tamil Nadu"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=chennai+school&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsZCJbxwraqw9qXaYNzaTOQyHqCehw%3A1671587777742&ei=wWeiY7_7LJWX4-EPlJOMmAs&ved=0ahUKEwj_38_dzYn8AhWVyzgGHZQJA7MQ4dUDCAk&uact=5&oq=chennai+school&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCggAEIAEELEDEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA0yBwgAEIAEEA06CggAELEDEIMBEEM6BQgAEIAEOgQIABBDOgsIABCABBCxAxCDAToICAAQgAQQsQM6BQgAEJECULEFWJ8vYJkyaAFwAHgAgAGfAYgBrg6SAQQwLjEzmAEAoAEBwAEB&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[13.1482803,80.2834744],[12.8821144,80.1846219]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});    
} 
}
class chospital {    
    JFrame f;    
    chospital(){    
    f=new JFrame("Chennai Hospital");    
    String data[][]={ 
    		{"Lifeline Hospital","47/3, New Avadi Rd, Alagappa Nagar, Kilpauk, Chennai, Tamil Nadu 600010"},    
            {"Fortis Malar Hospital","No. 52, 1st Main Rd, Gandhi Nagar, Adyar, Chennai, Tamil Nadu 600020 "},    
            {"Billroth Hospital","52, 2nd Main Rd, RA Puram, Trustpakkam, Raja Annamalai Puram, Chennai, Tamil Nadu 600028"},
            {"Sri Balaji Hospital","1, Lawyer Jaganathan St, Guindy, Chennai, Tamil Nadu 600032"},    
            {"ANN Hospital"," No 81 - 85, Annai Terasa Street, Indira Nagar, Valasaravakkam, Near Indian Bank, Chennai, Tamil Nadu 600087"},    
            {"Raadha Rajendran Hospital","No. 7, 10, Vembuli Amman Koil St, Mela Ilandaikulam, Alandur, Chennai, Tamil Nadu 600016"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=chennai+hospital&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsa0LtdSbTdhaZ1-BzxCRe59vOikPA%3A1671587932466&ei=XGiiY-eJHNTv4-EPuc6GwAk&ved=0ahUKEwjnp7Onzon8AhXU9zgGHTmnAZgQ4dUDCAk&uact=5&oq=chennai+hospital&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAEIAEELEDMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgcIABCxAxBDOgQIABBDOgsIABCABBCxAxCDAToFCAAQkQI6CAgAELEDEJECUMkDWNYiYMklaABwAHgAgAHRAYgBhQySAQUwLjkuMZgBAKABAcABAQ&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[13.125776799999999,80.2977466],[13.003520799999999,80.17911629999999]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});    
} 
}
class cmall {    
    JFrame f;    
    cmall(){    
    f=new JFrame("Chennai Mall");    
    String data[][]={ 
    		{"Nexus Vijaya Mall","183, Great Southern Trunk Rd, Arcot Rd Vadapalani, Chennai (Madras) 600026 India"},    
            {"Express Avenue Mall"," Club House Rd, Express Estate Mount Road, Chennai (Madras) 600002 India"},    
            {"Grand Square Mall","Dr Seetaram Nagar Main Rd, Chennai (Madras) 600042 India"},
            {"Ramee Mall","365 Anna Salai, Chennai (Madras) 600018 India"},    
            {"Vivira Mall"," 33, Old Mahabalipuram Road, Chennai (Madras) 603103 India"},    
            {"Palladium Mall"," 28, Velachery Road, Nagendra Nagar, Velachery, Chennai (Madras) 600042 India"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=chennai+mall&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsaOmCCvqgiMifMRcI4TM8f0nAqDBw%3A1671587057238&ei=8WSiY6GXDp-Q4-EPsJ6GuA8&ved=0ahUKEwjh04eGy4n8AhUfyDgGHTCPAfcQ4dUDCAk&uact=5&oq=chennai+mall&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEJECMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgcIABCxAxBDOgQIABBDOggIABCABBCxAzoLCAAQgAQQsQMQgwE6CAgAELEDEJECOgcIABCABBAKUNUFWLkOYOAQaABwAHgAgAHNAYgBlQeSAQUwLjUuMZgBAKABAcABAQ&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[13.1279831,80.2787931],[12.8346804,80.18538579999999]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:10"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});    
} 
}
class crailway {    
    JFrame f;    
    crailway(){    
    f=new JFrame("Chennai Railway");    
    String data[][]={ 
    		{"Indira Nagar","Rajiv Gandhi IT Expy, Aishwarya Colony, Adyar, Chennai, Tamil Nadu 600020"},    
            {"Kotturpuram","W Canal Bank Rd, Gandhi Nagar, Kotturpuram, Chennai, Tamil Nadu 600020"},    
            {"Perungudi","Railway station, No 8e, Kannagi St, Thiruvalluvar Nagar, Perungudi, Chennai, Tamil Nadu 600096" },
            {"Tondiarpet","Vaidyanathan New Overbridge Rd, Shivaji Nagar, Old Washermanpet, Chennai, Tamil Nadu 600081"},    
            {"Chepauk","Victoria Hostel Rd, PWD Estate, Chepauk, Triplicane, Chennai, Tamil Nadu 600005 "},    
            {"Guindy","Pedestrian Bridge Stairways, Race View Colony, Guindy, Chennai, Tamil Nadu 600032"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=chennai+railway&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsYTD0oJY7srvI3OjIrwEV_Uehx3vg%3A1671587085754&ei=DWWiY9fCLYby4-EPgZyk6A0&ved=0ahUKEwiX_dOTy4n8AhUG-TgGHQEOCd0Q4dUDCAk&uact=5&oq=chennai+railway&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEJECMggIABCxAxCRAjIFCAAQkQIyBQgAEJECMgUIABCRAjIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOggIABCABBCxAzoFCAAQsQM6BAgAEEM6CwgAEIAEELEDEIMBUPYEWNAYYJM4aABwAHgAgAG0AYgBnwqSAQMwLjmYAQCgAQHAAQE&sclient=gws-wiz-local"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});     
} 
}
class chotel {    
    JFrame f;    
    chotel(){    
    f=new JFrame("Chennai Hotel");    
    String data[][]={ 
    		{"The Park Chennai","601, Anna Salai, near US Embassy, Gangai Karai Puram, Nungambakkam, Chennai, Tamil Nadu 600006"},    
            {"The Madras Grand ","1, Chinna St, Egmore, Chennai, Tamil Nadu 600008"},    
            {"Raj Palace","1, Thanikachalam Rd, Parthasarathi Puram, T. Nagar, Chennai, Tamil Nadu 600017"},
            {"Lemon Tree Hotel","72, Sardar Patel Rd, Venkta Puram, Guindy, Chennai, Tamil Nadu 600032"},    
            {"The Hydel Park","12, VV Koil St, Park Town, Chennai, Tamil Nadu 600003"},    
            {"Novotel Chennai Sipcot","It Park Siruseri, Old Mahabalipuram Road, near State Highway 49, Chennai, Tamil Nadu 603103"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=chennai+hotel&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsbXB1YaDktQX8iFD8pqnDhtxyuXLg%3A1671587119623&ei=L2WiY5HLJaXu4-EP7ba1qAQ&ved=0ahUKEwjRnuejy4n8AhUl9zgGHW1bDUUQ4dUDCAk&uact=5&oq=chennai+hotel&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAELEDEJECMgUIABCRAjIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgcIABCxAxBDOgQIABBDOgsIABCABBCxAxCDAVCYBVjHFGCWIWgAcAB4AIAB0wGIAZQIkgEFMC42LjGYAQCgAQHAAQE&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[13.0844507,80.27092329999999],[13.074730299999999,80.2551817]];tbs:lrf:!1m4!1u13!2m2!13m1!1b1!1m4!1u7!2m2!7m1!4e1!1m4!1u2!2m2!2m1!1e1!1m4!1u10!2m2!11m1!1e6!1m4!1u10!2m2!11m1!1e9!1m4!1u10!2m2!11m1!1e19!1m4!1u10!2m2!11m1!1e20!1m4!1u10!2m2!11m1!1e8!1m4!1u10!2m2!11m1!1e1!1m4!1u10!2m2!11m1!1e3!1m4!1u10!2m2!11m1!1e15!1m4!1u4!2m2!4m1!2e1!2m1!1e2!2m7!1e17!4m2!17m1!1e3!4m2!17m1!1e8!3sIAE,lf:1,lf_ui:6"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});    
} 
}
class cbank {    
    JFrame f;    
    cbank(){    
    f=new JFrame("Chennai Bank");    
    String data[][]={ 
    		{"HDFC Bank","No 56, 1st Floor, Gopathi Narayanaswami Chetty Rd, T. Nagar, Chennai, Tamil Nadu 600017" },    
            {"IDFC Bank","No 67, Old No 32, Ground Floor, Kavignar Bharathidasan Rd, Teynampet, Chennai, Tamil Nadu 600018"},    
            {"Karnataka Bank","New No 2/11 & 2/12, Ground Floor, Conron Smith Rd, Gopalapuram, Chennai, Tamil Nadu 600086"},
            {"ICICI Bank Purasawalkam","Gangadeeswarar Koil Street, Pursawalkam, Chennai, Tamil Nadu 600084"},    
            {"Canara Bank","NO.2019, G.P.O, P.B, 131, Audiappa Naicken St, George Town, Chennai, Tamil Nadu 600001"},    
            {"ICICI Bank T nagar"," New, 40, Bazullah Rd, T. Nagar, Chennai, Tamil Nadu 600017"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=chennai+bank&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsa2GHhxmMyWtytnVh4jndcOVEuDkg%3A1671587170854&ei=YmWiY-vlM8PA4-EP956NwAI&ved=0ahUKEwjrnp68y4n8AhVD4DgGHXdPAygQ4dUDCAk&uact=5&oq=chennai+bank&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEIAEMgcIABCABBAKMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6CggAELEDEIMBEEM6BAgAEEM6CwgAEIAEELEDEIMBOggIABCABBCxAzoFCAAQkQJQuwZY_Q9g3BJoAHAAeACAAa4BiAHYBpIBAzAuNpgBAKABAcABAQ&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[13.099231099999999,80.29355509999999],[12.9747615,80.20934799999999]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!2m1!1e3!3sIAE,lf:1,lf_ui:3"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});  
} 
}





class kschool {    
    JFrame f;    
    kschool(){    
    f=new JFrame("Kolkata School");    
    String data[][]={ 
    		{"Orchids The International School","Loreto House 7, Middleton Row, Park Street, Kolkata,West Bengal – 700016"},    
            {"Calcutta Public School","144 E, Kalikapur, Purbalok, South 24 Parganas, Kolkata, West Bengal – 700099"},    
            {"St. Xavier’s Collegiate School ","30, Park St, Mullick Bazar, Park Street, Kolkata, West Bengal – 700016"},
            {"Adamas International School ","4, MM Feeder Rd, Rathtala, P.O, Belghoria, Kolkata, Belghoria, Kolkata, West Bengal – 700056"},    
            {"Birla High School","1, Moira Street, Elgin, Kolkata, West Bengal – 700017"},    
            {"Our Lady Queen of The Mission School ","34 Syed Amir Ali Avenue, Park Circus, Park circus, Kolkata, West Bengal – 700017"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=kolkata+school&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsZaXLCjf0k70Op0STRBMENbo4ODlg%3A1671587202432&ei=gmWiY4CEGuTg4-EPrpSDEA&ved=0ahUKEwiAzaXLy4n8AhVk8DgGHS7KAAIQ4dUDCAk&uact=5&oq=kolkata+school&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOgsIABCxAxCDARCRAjoFCAAQkQI6CwgAEIAEELEDEIMBOgoIABCxAxCDARBDOggIABCABBCxAzoHCAAQsQMQQzoICAAQsQMQkQJQ9Q1Y40Jgz0VoBHAAeACAAdgBiAHCEpIBBjAuMTQuMpgBAKABAbABAMABAQ&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[22.5791738,88.4220424],[22.4749199,88.3253747]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});
} 
}


class kmall {    
    JFrame f;    
    kmall(){    
    f=new JFrame("Kolkata Mall");    
    String data[][]={ 
    		{"Acropolis Mall","1858/1 Rajdanga Main Road Sector 1, East Kolkata Twp, Kolkata (Calcutta) 700107"},    
            {"Quest Mall ","33, Syed Amir Ali Avenue, Beck Bagan Row, Kolkata, West Bengal 700017"},    
            {"South City Mall","375, Prince Anwar Shah Rd, South City Complex, Jadavpur, Kolkata, West Bengal 700068"},
            {"Metropolis Mall ","Hiland Park, Eastern Metropolitan Bypass, 1925, Chak Garia, Garia, West Bengal 700094"},    
            {"Axis Mall "," Major Arterial Road(South-East), CF Block(Newtown), Action Area 1C, Newtown, Kolkata, West Bengal 700156"},    
            {"Mani Square"," Major Arterial), CF Block(Newtown), Action Area 1C, Newtown, Kolkata, West Bengal 700156"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=kolkata+mall&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsbijb0U0hEXIN3LzWB9StKZvGTs9g%3A1671587255366&ei=t2WiY9f1FefZ4-EPu9aPoAk&ved=0ahUKEwiXrcTky4n8AhXn7DgGHTvrA5QQ4dUDCAk&uact=5&oq=kolkata+mall&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEJECMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOgcIABCABBANOgcIIRCgARAKOgsIABCABBCxAxCDAToICAAQgAQQsQM6CAgAELEDEJECULcJWLI3YOQ5aAJwAHgAgAHAAYgBmQuSAQQwLjEwmAEAoAEBsAEAwAEB&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[22.594401599999998,88.417171],[22.4770781,88.2505742]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:10"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});    
} 
}


class krailway {    
    JFrame f;    
    krailway(){    
    f=new JFrame("Kolkata Railway");    
    String data[][]={ 
    		{"Howrah Railway Station","Station Road, Avikar India Private Limited, Howrah"},    
            {"Kolkata Railway Station ","Raicharan Sadhukhan Road, Kolkata"},    
            {"Sealdah Railway Station"," Bepin Behari Ganguly Street, Raja Bazar, Kolkata"},
            {"Shalimar Railway Station","Ticket Counter Road, Kazipada, Shalimar, Howrah"},    
            {"Lake Gardens Railway Station","Jodhpur Gardens, Lake Gardens, Kolkata, West "},    
            {"Santragachi Junction","Santragachi Station Rd, Santragachi, Howrah, West Bengal 711109"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=kolkata+railway&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsYuse8fyDfON6K9V7Kf1Jl6jZeq_g%3A1671587293768&ei=3WWiY6bCLuXf4-EPl4at6AU&ved=0ahUKEwjmpOz2y4n8AhXl7zgGHRdDC10Q4dUDCAk&uact=5&oq=kolkata+railway&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAELEDEJECMgUIABCRAjIFCAAQkQIyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOggIABCABBCxAzoLCAAQgAQQsQMQgwE6BAgAEANQkQRY4ShgiixoAHAAeACAAbIBiAHwCZIBAzAuOZgBAKABAcABAQ&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[29.0053547,89.0529041],[22.239375,76.5492508]];tbs:lrf:!1m4!1u2!2m2!2m1!1e1!2m1!1e2!3sIAE,lf:1,lf_ui:2"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});   
} 
}


class khotel {    
    JFrame f;    
    khotel(){    
    f=new JFrame("Kolkata Hotel");    
    String data[][]={ 
    		{"ITC Royal Bengal ","1, JBS Haldane Ave, Tangra, Kolkata, West Bengal 700046"},    
            {"JW Marriott Hotel","JBS Haldane Ave, Tangra, Kolkata, West Bengal 700105"},    
            {"Vedic Village Spa Resort ","Shikharpur P.O, Bagu, Newtown, Kolkata, West Bengal 700135"},
            {"The Park Hotel ","17, Park St, Taltala, Kolkata, West Bengal 700016"},    
            {"The Sonnet ","8, The Sonnet Hotel, DD Block, Sector 1, Bidhannagar, Kolkata, West Bengal 700064"},    
            {"The Westin Kolkata Rajarhat","Cbd/2 Action Area - Ii, New Town, Rajarhat, Kolkata, West Bengal 700156"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=kolkata+hotel&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsbgWaF2ABdW-yvneGZT-Xul7zB6CA%3A1671587328275&ei=AGaiY6S3ELuX4-EPkIOUwAQ&ved=0ahUKEwikt6aHzIn8AhW7yzgGHZABBUgQ4dUDCAk&uact=5&oq=kolkata+hotel&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAELEDEJECMgUIABCRAjIFCAAQkQIyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOggIABCABBCxAzoLCAAQgAQQsQMQgwE6BggAEBYQHjoICAAQFhAeEA86CwgAEBYQHhAPEPEEOgcIABCABBANUOADWOcmYNMxaAJwAHgAgAHLAYgBjwqSAQUwLjguMZgBAKABAcABAQ&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[22.543985799999998,88.4071246],[22.5014482,88.3612304]];tbs:lrf:!1m4!1u13!2m2!13m1!1b1!1m4!1u7!2m2!7m1!4e1!1m4!1u2!2m2!2m1!1e1!1m4!1u10!2m2!11m1!1e4!1m4!1u10!2m2!11m1!1e9!1m4!1u10!2m2!11m1!1e19!1m4!1u10!2m2!11m1!1e20!1m4!1u10!2m2!11m1!1e1!1m4!1u10!2m2!11m1!1e3!1m4!1u10!2m2!11m1!1e15!1m4!1u4!2m2!4m1!2e1!2m1!1e2!2m7!1e17!4m2!17m1!1e3!4m2!17m1!1e8!3sIAE,lf:1,lf_ui:6"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});   
} 
}


class kbank {    
    JFrame f;    
    kbank(){    
    f=new JFrame("Kolkata Bank");    
    String data[][]={ 
    		{"ICICI Bank Hajra "," Shyama Prasad Mukherjee Rd, opposite Purna Cinema, Hazra, Bhowanipore, Kolkata, West Bengal 700025"},    
            {"Federal Bank ","No 91A/1, 1st Floor, Avani Signature, Park St, Kolkata, West Bengal 700016"},    
            {"Canara Bank","S.O, P.B.NO.16220, 203, Sarat Bose Rd, Kolkata, West Bengal 700029"},
            {"Axis Bank","20, BD Block, Sector 1, Bidhannagar, Kolkata, West Bengal 700064"},    
            {"ICICI Bank Lansdowne","7, Sarat Bose Rd, Sreepally, 0, Kolkata, West Bengal 700016"},    
            {"City Union Bank ","Ground Floor,64 A, opposite to B. B. D. Bag, Lal Dighi, Lal Bazar,Kolkata, West Bengal 700001"}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=kolkata+bank&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsaimPofNuoy3jP86gIGyS5dmBbRMQ%3A1671587367190&ei=J2aiY_qbC-vo4-EPj5-MyA0&ved=0ahUKEwi6y-2ZzIn8AhVr9DgGHY8PA9kQ4dUDCAk&uact=5&oq=kolkata+bank&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyBQgAEJECMgUIABCABDIFCAAQgAQyBwgAEIAEEAoyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6CAgAELEDEJECOgsIABCABBCxAxCDAToICAAQgAQQsQNQ0ARY1g5g5xBoAHAAeACAAZwBiAHrBpIBAzAuNpgBAKABAcABAQ&sclient=gws-wiz-local#rlfi=hd:;si:;mv:[[22.593751299999997,88.414777],[22.4583384,88.32088329999999]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!2m1!1e3!3sIAE,lf:1,lf_ui:3"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	});  
} 
}


class khospital {    
    JFrame f;    
    khospital(){    
    f=new JFrame("Kolkata Hospital");    
    String data[][]={ 
    		{"Manipal Hospital ","IB-193, Broadway Rd, IB Block, Sector III, Bidhannagar, Kolkata, West Bengal 700106"},    
            {"Charnock Hospital","BMC 195, Biswa Bangla Sarani, Tegharia, Newtown, Kolkata, West Bengal 700157"},    
            {"Peerless Hospital ","360, Pancha Sayar Rd, Sahid Smirity Colony, Pancha Sayar, Kolkata, West Bengal 700094"},
            {"The Calcutta Medical Research Institute","2, Diamond Harbour Rd, New Alipore, Kolkata, West Bengal 700027"},
    
            {"ILS Hospital","2nd Floor, 3rd Ave, near City Centre, DD Block, Sector 1, Bidhannagar, Kolkata, West Bengal 700064"},    
            {"NH Rabindranath Tagore International Institute of Cardiac Sciences","1489, Mukundapur Main Road, 124,Mukundapur, Kolkata, West Bengal 700099 "}
            };    
    String column[]={"Place","Location",};         
    JTable jt=new JTable(data,column);  
    JButton b= new JButton("Continue");
    Font font1= new Font("Serif",Font.BOLD,45);
    
    b.setBounds(520, 350, 300,60);
    b.setFont(font1);
    f.add(b);
    jt.setBounds(100,100,500,600);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(1370,770);    
    f.setVisible(true); 
    
    b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			try {
                   Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=kolkata+hospital&rlz=1C1SQJL_enIN1018IN1018&biw=1366&bih=625&tbm=lcl&sxsrf=ALiCzsbx8N4HbIquMVXRCB7Ir25EeEGAEg%3A1671587386422&ei=OmaiY_iqGfaH4-EPlJ-CiAM&ved=0ahUKEwj4r4OjzIn8AhX2wzgGHZSPADEQ4dUDCAk&uact=5&oq=kolkata+hospital&gs_lcp=Cg1nd3Mtd2l6LWxvY2FsEAMyCAgAEIAEELEDMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIABBDOgsIABCABBCxAxCDAToFCAAQkQI6CwgAELEDEIMBEJECOggIABCxAxCRAlD9CFj7ImC2JWgAcAB4AIABnQGIAfEKkgEEMC4xMJgBAKABAcABAQ&sclient=gws-wiz-local"));
                } catch (IOException | URISyntaxException e){
					System.out.println(e);
				}
		}
		
	}); 
} 
}



