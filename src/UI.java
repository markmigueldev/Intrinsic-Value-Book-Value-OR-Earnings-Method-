import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window;

@SuppressWarnings("serial")
public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField one;
	private JTextField two;
	private JLabel lblNewLabel_1;
	private JTextField three;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JTextField four;
	private JLabel lblNewLabel_3;
	private JTextField five;
	private JLabel lblNewLabel_4;
	private JTextField six;
	private JLabel lblNewLabel_5;
	private JTextField seven;
	private JLabel lblNewLabel_6;
	private JTextField eight;
	private JLabel lblNewLabel_7;
	private JButton btnCalculate;
	private JTextField ten;
	private JLabel lblNewLabel_8;
	private JTextField nine;
	private JLabel lblNewLabel_9;
	private JLabel lblEnterCompanyTicker;
	private JTextField ticker;
	private JButton findButton;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		setTitle("Intrinsic Value Calculator (Book Value Method)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 950);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Current Book Value ($):");
		lblNewLabel.setBounds(10, 91, 464, 30);
		contentPane.add(lblNewLabel);
		
		one = new JTextField();
		one.setBounds(10, 119, 464, 30);
		contentPane.add(one);
		one.setColumns(10);
		
		two = new JTextField();
		two.setColumns(10);
		two.setBounds(10, 188, 464, 30);
		contentPane.add(two);
		
		lblNewLabel_1 = new JLabel("Old Book Value ($):");
		lblNewLabel_1.setBounds(10, 160, 464, 30);
		contentPane.add(lblNewLabel_1);
		
		three = new JTextField();
		three.setColumns(10);
		three.setBounds(10, 257, 464, 30);
		contentPane.add(three);
		
		lblNewLabel_2 = new JLabel("Number of Years Between Book Values:");
		lblNewLabel_2.setBounds(10, 229, 464, 30);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double a1 = Double.parseDouble(one.getText().trim());
					double a2 = Double.parseDouble(two.getText().trim());
					int a3 = Integer.parseInt(three.getText().trim());
					
					BookValueMethod c = new BookValueMethod();
					four.setText(Double.toString(c.AverageBookValueChange(a1, a2, a3)));
					
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Input must be valid!");
				}
			}
		});
		btnNewButton.setBounds(10, 298, 130, 40);
		contentPane.add(btnNewButton);
		
		four = new JTextField();
		four.setColumns(10);
		four.setBounds(10, 377, 464, 30);
		contentPane.add(four);
		
		lblNewLabel_3 = new JLabel("Average Book Value Change (%):");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 349, 464, 30);
		contentPane.add(lblNewLabel_3);
		
		five = new JTextField();
		five.setColumns(10);
		five.setBounds(10, 461, 464, 30);
		contentPane.add(five);
		
		lblNewLabel_4 = new JLabel("Cash Taken Out of Business ($):");
		lblNewLabel_4.setBounds(10, 433, 464, 30);
		contentPane.add(lblNewLabel_4);
		
		six = new JTextField();
		six.setColumns(10);
		six.setBounds(10, 530, 464, 30);
		contentPane.add(six);
		
		lblNewLabel_5 = new JLabel("Current Book Value ($):");
		lblNewLabel_5.setBounds(10, 502, 464, 30);
		contentPane.add(lblNewLabel_5);
		
		seven = new JTextField();
		seven.setColumns(10);
		seven.setBounds(10, 599, 464, 30);
		contentPane.add(seven);
		
		lblNewLabel_6 = new JLabel("Average Book Value Change (%):");
		lblNewLabel_6.setBounds(10, 571, 464, 30);
		contentPane.add(lblNewLabel_6);
		
		eight = new JTextField();
		eight.setColumns(10);
		eight.setBounds(10, 668, 464, 30);
		contentPane.add(eight);
		
		lblNewLabel_7 = new JLabel("Years:");
		lblNewLabel_7.setBounds(10, 640, 464, 30);
		contentPane.add(lblNewLabel_7);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a1 = Double.parseDouble(five.getText().trim());
					double a2 = Double.parseDouble(six.getText().trim());
					double a3 = Double.parseDouble(seven.getText().trim());
					int a4 = Integer.parseInt(eight.getText().trim());
					double a5 = Double.parseDouble(nine.getText().trim());
					
					BookValueMethod c = new BookValueMethod();
					ten.setText(Double.toString(c.IntrinsicValue(a1, a2, a4, a5, a3)));
					
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Input must be valid!");
				}
				
			}
		});
		btnCalculate.setBounds(10, 778, 130, 40);
		contentPane.add(btnCalculate);
		
		ten = new JTextField();
		ten.setColumns(10);
		ten.setBounds(10, 857, 464, 30);
		contentPane.add(ten);
		
		lblNewLabel_8 = new JLabel("Intrinsic Value ($):");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(10, 829, 464, 30);
		contentPane.add(lblNewLabel_8);
		
		nine = new JTextField();
		nine.setColumns(10);
		nine.setBounds(10, 737, 464, 30);
		contentPane.add(nine);
		
		lblNewLabel_9 = new JLabel("(Discount Rate) Federal Note (%):");
		lblNewLabel_9.setBounds(10, 709, 225, 30);
		contentPane.add(lblNewLabel_9);
		
		lblEnterCompanyTicker = new JLabel("COMPANY TICKER SYMBOL:");
		lblEnterCompanyTicker.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterCompanyTicker.setBounds(10, 11, 464, 30);
		contentPane.add(lblEnterCompanyTicker);
		
		ticker = new JTextField();
		ticker.setColumns(10);
		ticker.setBounds(10, 40, 225, 40);
		contentPane.add(ticker);
		
		findButton = new JButton("Find");
		findButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = "https://financials.morningstar.com/ratios/r.html?t=";
				String last = "&region=usa&culture=en-US&ownerCountry=USA";
				String symbol = ticker.getText().trim();
				if (symbol.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Field is Empty!");
				}
				else {
					String url = first+symbol+last;
					
					try {
						  Desktop desktop = java.awt.Desktop.getDesktop();
						  URI oURL1 = new URI("https://www.treasury.gov/resource-center/data-chart-center/interest-rates/Pages/TextView.aspx?data=yield");
						  desktop.browse(oURL1);
						  URI oURL = new URI(url);
						  desktop.browse(oURL);
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, "Input must be valid!");
						}
				}
			}
		});
		findButton.setBounds(245, 40, 110, 40);
		contentPane.add(findButton);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Close JPanel window
				JComponent comp = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(comp);
				win.dispose();
				//open log in GUI
				Main frame = new Main();
				frame.setVisible(true);
				
			}
		});
		btnBack.setBounds(365, 40, 110, 40);
		contentPane.add(btnBack);
		
	}
}
