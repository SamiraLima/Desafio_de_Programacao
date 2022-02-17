import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questao1 extends JFrame {

	private JPanel contentPane;
	private JTextField valor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao1 frame = new Questao1();
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
	public Questao1() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 226);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Desafio 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBounds(150, 11, 134, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblDigiteONmero = new JLabel("Digite o n\u00FAmero que deseja fazer a escada:");
		lblDigiteONmero.setForeground(new Color(0, 0, 0));
		lblDigiteONmero.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDigiteONmero.setBounds(91, 66, 263, 22);
		contentPane.add(lblDigiteONmero);
		
		valor = new JTextField();
		valor.setBounds(165, 99, 106, 20);
		contentPane.add(valor);
		valor.setColumns(10);
		
		
		JButton Confirmar = new JButton("Confirmar");
		Confirmar.setForeground(new Color(0, 0, 0));
		Confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(valor.getText().isEmpty()) {
					 valor.setBackground(Color.red);
						JOptionPane.showMessageDialog(null, "Insira um valor");

					}else {
						valor.setBackground(Color.white);
					}
				int n = Integer.parseInt(valor.getText());
				
				int s, e;
			    
			    for (s = 1; s <= n; s++) {
			    	
			        for (e = 1; e <= s; e++) {
			            System.out.print("*");
			        }
			        
			        System.out.println();
			    }
			}
			
		});
		Confirmar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Confirmar.setBounds(91, 142, 106, 23);
		contentPane.add(Confirmar);
		
		JButton proximo = new JButton("Pr\u00F3ximo");
		proximo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		proximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Questao2 questao2 = new Questao2(); 
				questao2.setVisible(true);
				dispose();
				
			}
		});
		proximo.setForeground(Color.BLACK);
		proximo.setBounds(248, 142, 106, 23);
		contentPane.add(proximo);
	}
}
