import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Questao3 extends JFrame {

	private JPanel contentPane;
	private JTextField valor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao3 frame = new Questao3();
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
	public Questao3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 220);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Desafio 3");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBounds(150, 11, 134, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblDigiteONmero = new JLabel("Digite uma palavra para o anagrama:");
		lblDigiteONmero.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiteONmero.setForeground(Color.BLACK);
		lblDigiteONmero.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDigiteONmero.setBounds(92, 55, 263, 22);
		contentPane.add(lblDigiteONmero);
		
		valor = new JTextField();
		valor.setColumns(10);
		valor.setBounds(165, 99, 106, 20);
		contentPane.add(valor);
		
		JButton confirmar = new JButton("Confirmar");
		confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palavra = valor.getText();
				
				if(valor.getText().isEmpty()) {
					valor.setBackground(Color.red);
					}else {
						valor.setBackground(Color.white);
					}
				
				ArrayList<String> anagrama = new ArrayList<String>();
				
				for(int s = 0; s <palavra.length(); s++) {
					
					for(int m = 1; m < palavra.length(); m++) {
						
						if(palavra.charAt(s) == palavra.charAt(m) && s !=m && s < m) {
							
							if(palavra.charAt(s) == palavra.charAt(s+1)) {
							String x = palavra.substring(s, s + 1);
							anagrama.add(x);
							
							}else {
							String a = palavra.substring(s, m);
							String b = palavra.substring(s + 1, m + 1);
							String c = palavra.substring(s, s + 1);
							anagrama.add(c);
							anagrama.add(a);
							anagrama.add(b);
							}
						}
					}
				}
				
				
				JOptionPane.showMessageDialog(null, "O número de pares de substrings que são anagramas é: " + "\n" + anagrama.size() + "\n" + anagrama);
			}
		});
		confirmar.setForeground(Color.BLACK);
		confirmar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		confirmar.setBounds(165, 142, 106, 23);
		contentPane.add(confirmar);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Questao2 questao2 = new Questao2(); 
				questao2.setVisible(true);
				dispose();
			}
		});
		voltar.setForeground(Color.BLACK);
		voltar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		voltar.setBounds(21, 142, 106, 23);
		contentPane.add(voltar);
		
		JButton sair = new JButton("Sair");
		sair.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		sair.setForeground(Color.BLACK);
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		sair.setBounds(307, 142, 106, 23);
		contentPane.add(sair);
	}
}
