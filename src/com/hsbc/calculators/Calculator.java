package com.hsbc.calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textDisplay;
	
	//----Variable declaration
	
	double firstNum;
	double secondNum;
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 263, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(10, 11, 230, 39);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		//------ row 1-----
		JButton btnBS = new JButton("<-");
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace;
				if (textDisplay.getText().length()> 0){
					StringBuilder strBS = new StringBuilder(textDisplay.getText());
					backSpace = strBS.deleteCharAt(textDisplay.getText().length()-1).toString();
					textDisplay.setText(backSpace);
				}
			}
		});
		btnBS.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBS.setBounds(10, 60, 50, 50);
		frame.getContentPane().add(btnBS);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(70, 60, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnPerc = new JButton("%");
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "%";
			}
		});
		btnPerc.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPerc.setBounds(130, 60, 50, 50);
		frame.getContentPane().add(btnPerc);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlus.setBounds(190, 60, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		//-----------row 2-----------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(enterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 120, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(enterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 120, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(enterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(130, 120, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(190, 120, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		//----------row 3 ----------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(enterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 180, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(enterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 180, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(enterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(130, 180, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(190, 180, 50, 50);
		frame.getContentPane().add(btnMult);
		
		//----row 4---------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(enterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 240, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(enterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 240, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(enterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(130, 240, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(190, 240, 50, 50);
		frame.getContentPane().add(btnDivide);
		
		
		//----row 5---------------------
				JButton btnZero = new JButton("0");
				btnZero.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String enterNumber = textDisplay.getText() + btnZero.getText();
						textDisplay.setText(enterNumber);
					}
				});
				btnZero.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnZero.setBounds(10, 300, 50, 50);
				frame.getContentPane().add(btnZero);
				
				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if (textDisplay.getText().contains("."))
						{
							
						}
						else
						{
							String dot = String.valueOf(textDisplay.getText());
							dot =dot + ".";
							textDisplay.setText(dot);
						}
					}
				});
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnDot.setBounds(70, 300, 50, 50);
				frame.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("+-");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double pm = Double.parseDouble(String.valueOf(textDisplay.getText()));
						pm = pm * (-1);
						textDisplay.setText(String.valueOf(pm));
						
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnPM.setBounds(130, 300, 50, 50);
				frame.getContentPane().add(btnPM);
				
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						secondNum= Double.parseDouble(String.valueOf(textDisplay.getText()));
						
						if (operations == "+")
						{
							result = firstNum + secondNum;
							answer = String.format("%.2f", result);
							textDisplay.setText(answer);
									
						}
						else if (operations == "-")
						{
							result = firstNum - secondNum;
							answer = String.format("%.2f", result);
							textDisplay.setText(answer);			
						}
						
						else if (operations == "*")
						{
							result = firstNum * secondNum;
							answer = String.format("%.2f", result);
							textDisplay.setText(answer);			
						}
						else if (operations == "/")
						{
							result = firstNum / secondNum;
							answer = String.format("%.2f", result);
							textDisplay.setText(answer);			
						}	
						else if (operations == "%")
						{
							result = firstNum % secondNum;
							answer = String.format("%.2f", result);
							textDisplay.setText(answer);			
						}
					}
				});
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnEqual.setBounds(190, 300, 50, 50);
				frame.getContentPane().add(btnEqual);
				

		
	}
}
