package Inventaris;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.sql.*;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
                                    
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection connection=null;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	public Login() {
		initialize();
		connection=SqliteConnection.dbConnector();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 525, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(90, 86, 84, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(87, 130, 87, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(184, 84, 86, 20);
		frame.getContentPane().add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JButton buttonLogin = new JButton("Login");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					String query="select * from Login where Username=? and Password=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textFieldUsername.getText());
					pst.setString(2, passwordField.getText());
					
					ResultSet rs=pst.executeQuery();
					int count = 0;
					
					while(rs.next()){
						count = count +1;
					}
					
					if(count == 1){
						JOptionPane.showMessageDialog(null, "Selamat Datang"); 
                                                GUI_Data_Kelas gdk = new GUI_Data_Kelas();
                                                gdk.Data_Kelas();
					}
					
					else if(count >1){
						JOptionPane.showMessageDialog(null, "Maaf Akun Anda Terkunci, Harap Hubungi Costemer Service.");
					}
					
					else{
						JOptionPane.showMessageDialog(null, "Maaf Username Dan Password Anda Salah, Silahkan Coba Kembali.");
					}
					
					rs.close();
					pst.close();
					
				} catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
		buttonLogin.setBounds(194, 195, 89, 23);
		frame.getContentPane().add(buttonLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(184, 127, 86, 20);
		frame.getContentPane().add(passwordField);
	}
}
