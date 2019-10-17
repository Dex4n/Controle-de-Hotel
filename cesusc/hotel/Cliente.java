package cesusc.hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cliente extends JFrame {

	private JPanel Janela;
	private JTextField txtNomeCliente;
	private JTextField txtCpfCliente;
	private JLabel cpfCliente;
	private JTextField txtEmailCliente;
	private JLabel emailCliente;
	private JTextField txtEnderecoCliente;
	private JLabel enderecoCliente;
	private JTextField txtTelefoneCliente;
	private JLabel telefoneCliente;
	
	
	Pessoa novaPessoa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
				
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
	public Cliente() {

		novaPessoa = new Pessoa();
		
		
		setTitle("Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		Janela = new JPanel();
		Janela.setToolTipText("");
		Janela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Janela);
		Janela.setLayout(null);
		
		JLabel nomeCliente = new JLabel("Nome: ");
		nomeCliente.setBounds(10, 15, 46, 14);
		Janela.add(nomeCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(80, 10, 400, 20);
		Janela.add(txtNomeCliente);
		txtNomeCliente.setColumns(10);
		
		cpfCliente = new JLabel("CPF: ");
		cpfCliente.setBounds(10, 45, 46, 14);
		Janela.add(cpfCliente);
		
		txtCpfCliente = new JTextField();
		txtCpfCliente.setColumns(10);
		txtCpfCliente.setBounds(80, 40, 400, 20);
		Janela.add(txtCpfCliente);
		
		emailCliente = new JLabel("E-mail: ");
		emailCliente.setBounds(10, 75, 46, 14);
		Janela.add(emailCliente);
		
		txtEmailCliente = new JTextField();
		txtEmailCliente.setColumns(10);
		txtEmailCliente.setBounds(80, 70, 400, 20);
		Janela.add(txtEmailCliente);
		
		enderecoCliente = new JLabel("Endere\u00E7o: ");
		enderecoCliente.setBounds(10, 105, 70, 14);
		Janela.add(enderecoCliente);
		
		txtEnderecoCliente = new JTextField();
		txtEnderecoCliente.setColumns(10);
		txtEnderecoCliente.setBounds(80, 100, 400, 20);
		Janela.add(txtEnderecoCliente);
		
		telefoneCliente = new JLabel("Telefone: ");
		telefoneCliente.setBounds(10, 135, 70, 14);
		Janela.add(telefoneCliente);
		
		txtTelefoneCliente = new JTextField();
		txtTelefoneCliente.setColumns(10);
		txtTelefoneCliente.setBounds(80, 130, 400, 20);
		Janela.add(txtTelefoneCliente);
		
		JButton botaoEnviar = new JButton("Enviar");
		botaoEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				if(!validaFormulario()) {
					JOptionPane.showMessageDialog(null, "Os campos de <Nome, CPF e Telefone> obrigatoriamente devem estar preenchidos!");
				} else {
					atualizaCliente();
				}	
			}
		});
		botaoEnviar.setBounds(391, 161, 90, 20);
		Janela.add(botaoEnviar);
		
		JRadioButton radioSexoMasculino = new JRadioButton("Masculino");
		radioSexoMasculino.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				novaPessoa.setSexoCliente("Masculino");
			}
		});
		radioSexoMasculino.setBounds(80, 170, 80, 23);
		Janela.add(radioSexoMasculino);
		
		JRadioButton radioSexoFeminino = new JRadioButton("Feminino");
		radioSexoFeminino.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				novaPessoa.setSexoCliente("Feminino");
			}
		});
		radioSexoFeminino.setBounds(160, 170, 80, 23);
		Janela.add(radioSexoFeminino);
		
		JRadioButton radioSexoNaoEspecificado = new JRadioButton("N\u00E3o especificado");
		radioSexoNaoEspecificado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				novaPessoa.setSexoCliente("Não especificado");
			}
		});
		radioSexoNaoEspecificado.setBounds(240, 170, 110, 23);
		Janela.add(radioSexoNaoEspecificado);
	}
	
	
	public void atualizaCliente() {
		novaPessoa.setNomeCliente(this.txtNomeCliente.getText());
		novaPessoa.setCpfCliente(this.txtCpfCliente.getText());
		novaPessoa.setEmailCliente(this.txtEmailCliente.getText());
		novaPessoa.setEnderecoCliente(this.txtEnderecoCliente.getText());
		novaPessoa.setTelefoneCliente(this.txtTelefoneCliente.getText());
		JOptionPane.showMessageDialog(null, "Atualização do " + novaPessoa.toString());
	}
	
	public boolean validaFormulario() {
		
		return (!this.txtNomeCliente.getText().equals("") && !this.txtCpfCliente.getText().equals("") && !this.txtTelefoneCliente.getText().equals(""));
	}
	
	
	
}
