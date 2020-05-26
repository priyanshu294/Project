package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setFont(new Font("Dialog", Font.BOLD, 20));
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Photos\\IMG_20181230_165358_961.jpg"));
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.setBackground(new Color(240, 240, 240));
		frmCalculator.getContentPane().setBackground(new Color(32, 178, 170));
		frmCalculator.setBounds(100, 100, 285, 465);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 0, 0));
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(20, 22, 237, 40);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		//..............row 1.................//
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setBackground(new Color(255, 228, 196));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(20, 73, 50, 50);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 228, 196));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(87, 73, 50, 50);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 228, 196));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(147, 73, 50, 50);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.setBackground(new Color(255, 228, 196));
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplus.setBounds(207, 73, 50, 50);
		frmCalculator.getContentPane().add(btnplus);
		
		

		//..............row 2.................//
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 228, 196));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(20, 129, 50, 50);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 228, 196));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(85, 129, 50, 50);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 228, 196));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(145, 127, 50, 50);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btnsub = new JButton("-");
		btnsub.setBackground(new Color(255, 228, 196));
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnsub.setBounds(207, 127, 50, 50);
		frmCalculator.getContentPane().add(btnsub);
		
		//..............row 3.................//
		
				JButton btn1 = new JButton("1");
				btn1.setBackground(new Color(255, 228, 196));
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btn1.getText();
						textField.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn1.setBounds(20, 185, 50, 50);
				frmCalculator.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.setBackground(new Color(255, 228, 196));
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btn2.getText();
						textField.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn2.setBounds(85, 185, 50, 50);
				frmCalculator.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.setBackground(new Color(255, 228, 196));
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btn3.getText();
						textField.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn3.setBounds(145, 185, 50, 50);
				frmCalculator.getContentPane().add(btn3);
				
				JButton btnmul = new JButton("*");
				btnmul.setBackground(new Color(255, 228, 196));
				btnmul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						

						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "*";
					}
				});
				btnmul.setFont(new Font("Tahoma", Font.BOLD, 22));
				btnmul.setBounds(207, 183, 50, 50);
				frmCalculator.getContentPane().add(btnmul);
				
				//..............row 4.................//
				
				JButton btnzero = new JButton("0");
				btnzero.setBackground(new Color(255, 228, 196));
				btnzero.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btnzero.getText();
						textField.setText(EnterNumber);
					}
				});
				btnzero.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnzero.setBounds(20, 241, 50, 50);
				frmCalculator.getContentPane().add(btnzero);
				
				JButton btndot = new JButton(".");
				btndot.setBackground(new Color(255, 228, 196));
				btndot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btndot.getText();
						textField.setText(EnterNumber);
					}
				});
				btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
				btndot.setBounds(85, 241, 50, 50);
				frmCalculator.getContentPane().add(btndot);
				
				JButton btndiv = new JButton("/");
				btndiv.setBackground(new Color(255, 228, 196));
				btndiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						

						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "/";
					}
				});
				btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
				btndiv.setBounds(145, 241, 50, 50);
				frmCalculator.getContentPane().add(btndiv);
				
				JButton btneq = new JButton("=");
				btneq.setBackground(new Color(255, 228, 196));
				btneq.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String answer;
						secondnum = Double.parseDouble(textField.getText());
						if(operations == "+") {
							
							result = firstnum + secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operations == "-") {
							
							result = firstnum - secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operations == "*") {
							
							result = firstnum * secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operations == "/") {
							
							result = firstnum / secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operations == "%") {
							
							result = firstnum % secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						
				
					}
				});
				btneq.setFont(new Font("Tahoma", Font.BOLD, 20));
				btneq.setBounds(87, 302, 108, 50);
				frmCalculator.getContentPane().add(btneq);
				
				
//..............row 5.................//
				
				JButton btnback = new JButton("<-");
				btnback.setBackground(new Color(255, 228, 196));
				btnback.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String btnback = null;
						if(textField.getText().length() > 0) {
							StringBuilder strb = new StringBuilder(textField.getText());
							strb.deleteCharAt(textField.getText().length() - 1);
							btnback = strb.toString();
							textField.setText(btnback);
						}
					}
				});
				btnback.setFont(new Font("Tahoma", Font.BOLD, 15));
				btnback.setBounds(20, 302, 60, 50);
				frmCalculator.getContentPane().add(btnback);
				
				JButton btncl = new JButton("C");
				btncl.setBackground(new Color(0, 255, 127));
				btncl.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						textField.setText(null);
					}
				});
				btncl.setFont(new Font("Tahoma", Font.BOLD, 20));
				btncl.setBounds(20, 365, 237, 50);
				frmCalculator.getContentPane().add(btncl);
				
				JButton btnmod = new JButton("%");
				btnmod.setBackground(new Color(255, 228, 196));
				btnmod.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						

						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "%";
					}
				});
				btnmod.setFont(new Font("Tahoma", Font.BOLD, 15));
				btnmod.setBounds(205, 244, 52, 50);
				frmCalculator.getContentPane().add(btnmod);
				
				JButton btnpm = new JButton("+-");
				btnpm.setBackground(new Color(255, 228, 196));
				btnpm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						double ops = Double.parseDouble(String.valueOf(textField.getText()));
						ops = ops * (-1);
						textField.setText(String.valueOf(ops));
					}
				});
				btnpm.setFont(new Font("Tahoma", Font.BOLD, 15));
				btnpm.setBounds(199, 302, 58, 50);
				frmCalculator.getContentPane().add(btnpm);
				
				
				
				
				
}
}
