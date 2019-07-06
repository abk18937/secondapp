package login_sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

import Traveling_Tiket.Traveling;
import studentDatabase.Student;
import studentDatabase.StudentDatabaseApp;

public class Login_System {

	private JFrame frame;
	private JTextField txtUsernam;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_System window = new Login_System();
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
	public Login_System() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setFont(new Font("Arial Black", Font.BOLD, 45));
		frame.setBounds(250, 250, 550, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsernam = new JLabel("Usernam");
		lblUsernam.setBounds(10, 85, 105, 32);
		lblUsernam.setBackground(Color.WHITE);
		lblUsernam.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblUsernam);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(10, 136, 111, 44);
		lblpassword.setBackground(Color.DARK_GRAY);
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblpassword);
		
		// comnetaire a ajouter
		
		txtUsernam = new JTextField();
		txtUsernam.setBounds(178, 85, 206, 33);
		txtUsernam.setBackground(Color.WHITE);
		txtUsernam.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(txtUsernam);
		
		// commentaite den haut a effacer
		
		

		txtUsernam = new JTextField();
		txtUsernam.setBounds(178, 85, 206, 33);
		txtUsernam.setBackground(Color.WHITE);
		txtUsernam.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(txtUsernam);
		txtUsernam.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(178, 142, 206, 33);
		txtPassword.setForeground(SystemColor.textHighlight);
		txtPassword.setBackground(Color.WHITE);
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(10, 215, 105, 44);
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBackground(Color.YELLOW);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				//String password=txtPassword.getText();
// ce code de haut est generer pour minimiser leuurreur au niveau de getText
			@SuppressWarnings("deprecation")
			String password=txtPassword.getText();
			String username=txtUsernam.getText();
			
			
			//if(password.contains("1234")&& username.contains("koffi")) {

			if(password.contains("1234") && username.contains("koffi")) {
				
				txtPassword.setText(null);
				txtUsernam.setText(null);
				
				Traveling info = new Traveling();
				Traveling.main(null);
				
//				Student infI =new Student();
//				Student.class.getInterfaces();
//				
//				StudentDatabaseApp infr= new StudentDatabaseApp();
//				StudentDatabaseApp.main(null);
				
				
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Ivalide Login","Login Error", JOptionPane.ERROR_MESSAGE);
				
				txtPassword.setText(null);
				txtUsernam.setText(null);
				
				
			}
				
				
			}
		});
		
		frame.getContentPane().add(btnLogin);
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(134, 215, 133, 44);
		btnReset.setForeground(new Color(0, 0, 0));
		btnReset.setBackground(Color.GREEN);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUsernam.setText(null);
				txtPassword.setText(null);
				
			}
		});
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(302, 213, 148, 44);
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setBackground(Color.MAGENTA);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.addActionListener(new ActionListener() {
			private Component frmLogin_System;

			public void actionPerformed(ActionEvent e) {
				
				
		JFrame frmLogin_System = new JFrame("Exit");
		if(JOptionPane.showConfirmDialog(frmLogin_System," Confirm if you want exit","Login System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
			System.exit(0);
		}	
			
			
			}
		});
		
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 202, 474, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 36, 484, 2);
		frame.getContentPane().add(separator_1);
		
		
		JLabel lblLoginSystems = new JLabel("Login Systems");
		lblLoginSystems.setBackground(Color.GREEN);
		lblLoginSystems.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLoginSystems.setBounds(167, 11, 179, 25);
		frame.getContentPane().add(lblLoginSystems);
	}

}
