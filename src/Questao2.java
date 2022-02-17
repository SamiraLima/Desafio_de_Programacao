import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Questao2 extends JFrame {

	private JPanel contentPane;
	private JTextField Cnome;
	private JTextField Csenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao2 frame = new Questao2();
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
	public Questao2() {
		Questao1 questao1 = new Questao1();
		Questao3 questao3 = new Questao3();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Desafio 2");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBounds(150, 11, 134, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Preencha os campos abaixo:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(127, 55, 180, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(127, 94, 51, 14);
		contentPane.add(lblNewLabel_2);
		
		Cnome = new JTextField();
		Cnome.setForeground(Color.BLACK);
		Cnome.setBounds(127, 109, 180, 20);
		contentPane.add(Cnome);
		Cnome.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSenha.setBounds(127, 150, 51, 14);
		contentPane.add(lblSenha);
		
		Csenha = new JTextField();
		Csenha.setForeground(Color.BLACK);
		Csenha.setBounds(127, 165, 180, 20);
		contentPane.add(Csenha);
		Csenha.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questao1.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(21, 227, 106, 23);
		contentPane.add(btnVoltar);
		
		JButton btnProximo = new JButton("Pr\u00F3ximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				questao3.setVisible(true);
				dispose();
			}
		});
		btnProximo.setForeground(Color.BLACK);
		btnProximo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnProximo.setBounds(307, 227, 106, 23);
		contentPane.add(btnProximo);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setForeground(Color.BLACK);
		btnConfirmar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 String senha = Csenha.getText();
			 String nome = Cnome.getText();
			 int nl = senha.length();
			 
			 if(Cnome.getText().isEmpty()) {
				 Cnome.setBackground(Color.red);
				}else {
					Cnome.setBackground(Color.white);
				}
			 
			 if(Csenha.getText().isEmpty()) {
				 Csenha.setBackground(Color.red);
				}else {
					Csenha.setBackground(Color.white);
				}
			 
		     
			 switch (nl) {
			 
			 case 1:
			 System.out.println("Para sua senha ser considerada forte por favor insira mais 5 caracteres");
			 break;
			 
			 case 2:
		     System.out.println("Para sua senha ser considerada forte por favor insira mais 4 caracteres");
			 break;

			 case 3:
			 System.out.println("Para sua senha ser considerada forte por favor insira mais 3 caracteres");
			 break;

			 case 4:
		     System.out.println("Para sua senha ser considerada forte por favor insira mais 2 caracteres");
			 break;

			 case 5:
			 System.out.println("Para sua senha ser considerada forte por favor insira mais 1 caracteres");
			 break;

			 case 6:
				 JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso: " +  "\n" + "Nome:" + nome + "\n" + "Senha:" + senha );
				 Cnome.setText("");
				 Csenha.setText("");
			 break;
			 
			}
			 
		}
		});
		btnConfirmar.setBounds(163, 227, 106, 23);
		contentPane.add(btnConfirmar);
	}
	
}
