package Traveling_Tiket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Traveling {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketnr;
	private JTextField txtPrice;
	private JTextField txtRoute;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traveling window = new Traveling();
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
	public Traveling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.BOLD, 20));
		frame.setBounds(0, 0, 1380, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(68, 39, 599, 57);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Travelling Ticketing Systems");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Class");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(185, 107, 161, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 24));
		rdbtnStandard.setBounds(6, 172, 138, 37);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 24));
		rdbtnEconomy.setBounds(10, 227, 161, 23);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 24));
		rdbtnFirstClass.setBounds(10, 277, 147, 30);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 24));
		rdbtnReturnTicket.setBounds(227, 227, 195, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 24));
		rdbtnSingleTicket.setBounds(227, 172, 184, 37);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 24));
		rdbtnAdult.setBounds(424, 172, 138, 37);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 24));
		rdbtnChild.setBounds(424, 220, 138, 37);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Kilbum", "Preston", "Oxford", "Leed"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 24));
		comboBox.setBounds(237, 277, 248, 31);
		frame.getContentPane().add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 163, 502, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 351, 502, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTax.setBounds(10, 390, 91, 37);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Dialog", Font.BOLD, 20));
		lblSubtotal.setBounds(10, 448, 91, 41);
		frame.getContentPane().add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTotal.setBounds(6, 500, 105, 30);
		frame.getContentPane().add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTax.setBounds(130, 390, 121, 30);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtSubTotal.setColumns(10);
		txtSubTotal.setBounds(130, 448, 121, 30);
		frame.getContentPane().add(txtSubTotal);
		
		txtTotal = new JTextField();
		txtTotal.setBackground(Color.YELLOW);
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTotal.setColumns(10);
		txtTotal.setBounds(130, 500, 121, 30);
		frame.getContentPane().add(txtTotal);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
			double tax=19.50;	
			double MilesK8 = 25.70;	
			double MilesK12 = 24.50;	
			double MilesK10 = 45.20;	
			double MilesK30 = 55.98;	
			double totalCost, eco=3.85, fclass= 5.60;	
			
			
		if((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())
			&& comboBox.getSelectedItem().equals("Kilbum"))
			
		{
			totalCost=(tax * MilesK8 )/100; 
			String sTax = String.format("$%.2f", totalCost);
			txtTax.setText(sTax);
			
			
			String subTotal=String.format("$%.2f",MilesK8);
			txtSubTotal.setText(subTotal);
			
			String Total = String.format("$%.2f",MilesK8 + totalCost);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtTicket.setText("One Way");
			txtChild.setText("NIL");
			txtClass.setText("STD");
			txtAdult.setText("ONE");
			
			
			
		
		}else if 
		
		((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected())&& (rdbtnAdult.isSelected())
				&& comboBox.getSelectedItem().equals("Kilbum"))
			
			{
				totalCost=(tax * MilesK8*2)/100; 
				String sTax=String.format("$%.2f", totalCost);
				txtTax.setText(sTax);
				
				
				String subTotal=String.format("$%.2f",MilesK8);
				txtSubTotal.setText(subTotal);
				
				String Total=String.format("$%.2f",MilesK8 + totalCost);
				txtTotal.setText(Total);
				txtPrice.setText(Total);
				txtClass.setText("STD");
				txtTicket.setText("Return");
				txtAdult.setText("ONE");
				txtChild.setText("NIL");
				
				
			
			}
		
		
else if 
		
		((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected())&& (rdbtnChild.isSelected())
				&& comboBox.getSelectedItem().equals("Kilbum"))
			
			{
				totalCost=(tax * MilesK8)/100; 
				String sTax=String.format("$%.2f", totalCost);
				txtTax.setText(sTax);
				
				
				String subTotal=String.format("$%.2f",MilesK8);
				txtSubTotal.setText(subTotal);
				
				String Total=String.format("$%.2f",MilesK8 + totalCost);
				txtTotal.setText(Total);
				txtPrice.setText(Total);
				txtClass.setText("STD");
				txtTicket.setText("Return");
				txtAdult.setText("ONE");
				txtChild.setText("NIL");
				
				
				
				
			}
				
		
else if 

((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())
		&& comboBox.getSelectedItem().equals("Kilbum"))
	
	{
		totalCost=(tax * MilesK8*2)/100; 
		String sTax=String.format("$%.2f", totalCost-18);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK8*2);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",((MilesK8 + totalCost)*2)-18);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("Return");
		txtAdult.setText("NIL");//ADULT
		txtChild.setText("One");//CHILD
		
		
		
		
	}
		
else if 

((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())
		&& comboBox.getSelectedItem().equals("Preston"))
	
	{
		totalCost=(tax * MilesK12)/100; 
		String sTax=String.format("$%.2f", totalCost);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK12);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",MilesK12 + totalCost);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("ONE WAY");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
		
		
		
		
	}
else if 

((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected())&& (rdbtnAdult.isSelected())
		&& comboBox.getSelectedItem().equals("Preston"))
	
	{
		totalCost=(tax * (MilesK8*2))/100; 
		String sTax=String.format("$%.2f", totalCost);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK8*2);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",(MilesK8 + totalCost)*2);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("Return");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
		
		
		
		
	}
			
else if 

((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())
		&& comboBox.getSelectedItem().equals("preston"))
	
	{
		totalCost=(tax * MilesK12)/100; 
		String sTax=String.format("$%.2f", totalCost-18);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK12);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",MilesK12 + totalCost-18);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("ONE WAY");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
			
	}
else if 

((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())
		&& comboBox.getSelectedItem().equals("Preston"))
	
	{
		totalCost=(tax * MilesK8*2)/100; 
		String sTax=String.format("$%.2f", totalCost-18);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK8*2);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",((MilesK8 + totalCost)*2)-18);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("Return");
		txtAdult.setText("NIL");
		txtChild.setText("One");
		
		
		
		
	}
else if 

((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())
		&& comboBox.getSelectedItem().equals("Oxford"))
	
	{
		totalCost=(tax * MilesK10)/100; 
		String sTax=String.format("$%.2f", totalCost);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK10);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",MilesK10 + totalCost);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("Return");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
		
	}
else if 

((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())
		&& comboBox.getSelectedItem().equals("Oxford"))
	
	{
		totalCost=(tax * MilesK30)/100; 
		String sTax=String.format("$%.2f", totalCost);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK30);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",(MilesK30 + totalCost)-18);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("Return");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
		
		
		
		
	}
			
else if 

((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected())&& (rdbtnChild.isSelected())
		&& comboBox.getSelectedItem().equals("Oxford"))
	
	{
		totalCost=(tax * MilesK10)/100; 
		String sTax=String.format("$%.2f", totalCost);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK10);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",(MilesK10 + totalCost)-18);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("Return");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
		
		
		
		
	}
else if 

((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())
		&& comboBox.getSelectedItem().equals("Oxford"))
	
	{
		totalCost=(tax * MilesK8); 
		String sTax=String.format("$%.2f", totalCost);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK8);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",(MilesK8 ));
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("Return");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
		
		
	}	
		
else if 

((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())
		&& comboBox.getSelectedItem().equals("Leed"))
	
	{
		totalCost=(tax * MilesK8); 
		String sTax=String.format("$%.2f", totalCost);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK8);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",MilesK8 + totalCost);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("Return");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
		
		
		
		
	}
			
else if 

((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())
		&& comboBox.getSelectedItem().equals("Leed"))
	
	{
		totalCost=(tax * MilesK8)/100; 
		String sTax=String.format("$%.2f", totalCost);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK8);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",(MilesK8 + totalCost)-15);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("RETURN");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
		
		
		
		
	}		
else if 

((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())
		&& comboBox.getSelectedItem().equals("Leed"))
	
	{
		totalCost=(tax * MilesK10)/100; 
		String sTax=String.format("$%.2f", totalCost);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK10);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",(MilesK10 + totalCost)-18);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("Return");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
		
		
		
		
	}			
else if 

((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected())&& (rdbtnAdult.isSelected())
		&& comboBox.getSelectedItem().equals("Leed"))
	
	{
		totalCost=(tax * MilesK10)/100; 
		String sTax=String.format("$%.2f", totalCost);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK10);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",(MilesK10 + totalCost)-18);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("Return");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
		
		
		
		
	}
else if 

((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected())&& (rdbtnAdult.isSelected())
		&& comboBox.getSelectedItem().equals("Leed"))
	
	{
		totalCost=(tax * MilesK10); 
		String sTax=String.format("$%.2f", totalCost);
		txtTax.setText(sTax);
		
		
		String subTotal=String.format("$%.2f",MilesK10);
		txtSubTotal.setText(subTotal);
		
		String Total=String.format("$%.2f",MilesK10 + totalCost);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("Return");
		txtAdult.setText("ONE");
		txtChild.setText("NIL");
		
		
		
		
	}
				
		}
				
			
		});
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//=======================Time==================================		
			Calendar timer=Calendar.getInstance();	
			timer.getTime();
			SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
			txtTime.setText(tTime.format(timer.getTime()));	
				
			//=======================Date==================================	
				
				
			SimpleDateFormat tdate=new SimpleDateFormat("dd-MMM-yyyy");
			txtDate.setText(tdate.format(timer.getTime()));	
			
			
			txtFrom.setText("London *");
			txtTo.setText((String) comboBox.getSelectedItem()+" *");
			//=======================Random Number==================================	
			
			int num1;
			String q1="";
			num1=1325+ (int) (Math.random()*4238);
			q1 += num1 +1325;
			txtTicketnr.setText(q1);
			
			//=======================Random Number==================================	
			
			txtRoute.setText("ANY");
			
		
			
			
			}
		});
		btnTotal.setToolTipText("Total Cost of Ticket");
		btnTotal.setFont(new Font("Dialog", Font.BOLD, 20));
		btnTotal.setBounds(10, 567, 113, 45);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("ResetSystems");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtTax.setText(null);
				txtSubTotal.setText(null);	
				txtTotal.setText(null);
				
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				comboBox.setSelectedItem("Destination");
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				
				txtTo.setText(null);
				//txtTotal.setText(null);
				txtFrom.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				
				txtPrice.setText(null);
				txtRoute.setText(null);
				txtTicketnr.setText(null);
				txtChild.setText(null);
				txtClass.setText(null);
				txtTicket.setText(null);
				txtAdult.setText(null);
				
		
			
			}
		});
		
		btnReset.setFont(new Font("Dialog", Font.BOLD, 20));
		btnReset.setBounds(162, 567, 113, 45);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("ExitSystems");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//CODE DE CONFIRMATION TRES IMPORTANT	

       JFrame frmLogin_System = new JFrame("Exit");
		if(JOptionPane.showConfirmDialog(frmLogin_System," Confirm if you want exit","Login System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
			System.exit(0);
		}
		}
		});
		btnExit.setFont(new Font("Dialog", Font.BOLD, 20));
		btnExit.setBounds(335, 567, 108, 45);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(6, 560, 502, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(655, 107, 15, 543);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(668, 39, -1, 611);
		frame.getContentPane().add(separator_4);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Dialog", Font.BOLD, 20));
		lblClass.setBounds(677, 89, 114, 41);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTicket.setBounds(847, 89, 91, 41);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Dialog", Font.BOLD, 20));
		lblAdult.setBounds(1011, 89, 91, 41);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Dialog", Font.BOLD, 20));
		lblChild.setBounds(1186, 89, 91, 41);
		frame.getContentPane().add(lblChild);
		
		txtFrom = new JTextField();
		txtFrom.setBackground(Color.CYAN);
		txtFrom.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtFrom.setColumns(10);
		txtFrom.setBounds(845, 202, 173, 37);
		frame.getContentPane().add(txtFrom);
		
		txtTo = new JTextField();
		txtTo.setBackground(Color.GREEN);
		txtTo.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTo.setColumns(10);
		txtTo.setBounds(845, 276, 173, 45);
		frame.getContentPane().add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtDate.setColumns(10);
		txtDate.setBounds(845, 375, 173, 45);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTime.setColumns(10);
		txtTime.setBounds(845, 489, 173, 41);
		frame.getContentPane().add(txtTime);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Dialog", Font.BOLD, 20));
		lblFrom.setBounds(680, 196, 91, 41);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTo.setBounds(686, 274, 91, 41);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Dialog", Font.BOLD, 20));
		lblDate.setBounds(680, 388, 91, 41);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTime.setBounds(680, 495, 91, 41);
		frame.getContentPane().add(lblTime);
		
		JLabel lblTiketNo = new JLabel("Ticket No");
		lblTiketNo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTiketNo.setBounds(1172, 240, 105, 33);
		frame.getContentPane().add(lblTiketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPrice.setBounds(1172, 334, 91, 41);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Dialog", Font.BOLD, 20));
		lblRoute.setBounds(1172, 439, 91, 41);
		frame.getContentPane().add(lblRoute);
		
		txtTicketnr = new JTextField();
		txtTicketnr.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTicketnr.setColumns(10);
		txtTicketnr.setBounds(1165, 283, 121, 30);
		frame.getContentPane().add(txtTicketnr);
		
		txtPrice = new JTextField();
		txtPrice.setBackground(Color.MAGENTA);
		txtPrice.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtPrice.setColumns(10);
		txtPrice.setBounds(1165, 382, 121, 30);
		frame.getContentPane().add(txtPrice);
		
		txtRoute = new JTextField();
		txtRoute.setBackground(Color.YELLOW);
		txtRoute.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtRoute.setColumns(10);
		txtRoute.setBounds(1165, 497, 121, 30);
		frame.getContentPane().add(txtRoute);
		
		txtClass = new JTextField();
		txtClass.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtClass.setColumns(10);
		txtClass.setBounds(670, 141, 121, 37);
		frame.getContentPane().add(txtClass);
		
		txtTicket = new JTextField();
		txtTicket.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTicket.setColumns(10);
		txtTicket.setBounds(845, 141, 121, 37);
		frame.getContentPane().add(txtTicket);
		
		txtAdult = new JTextField();
		txtAdult.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtAdult.setColumns(10);
		txtAdult.setBounds(991, 141, 121, 37);
		frame.getContentPane().add(txtAdult);
		
		txtChild = new JTextField();
		txtChild.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtChild.setColumns(10);
		txtChild.setBounds(1165, 141, 121, 37);
		frame.getContentPane().add(txtChild);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(655, 128, 631, -3);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(665, 128, 612, 2);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(668, 183, 618, 8);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(1055, 189, 15, 461);
		frame.getContentPane().add(separator_8);
	}
}
