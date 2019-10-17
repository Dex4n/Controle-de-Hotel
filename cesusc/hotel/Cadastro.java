package cesusc.hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.SwingConstants;
import java.awt.Color;

public class Cadastro extends JFrame {
	
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private JTextField txtValorAvaliacao;
	Hotel meuHotel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					
					/*
					Hotel meuHotel = new Hotel(1,"Premium");
					meuHotel.setEstado("Santa Catarina");
					meuHotel.setCidade("Florianópolis");
					meuHotel.setAvaliacao(10.00);
					
					frame.carregaHotel(meuHotel);
					*/
					
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
	public Cadastro() {
		
		meuHotel = new Hotel(0, "");
		
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(null);
		
		JLabel varCodigo = new JLabel("Código");
		varCodigo.setBounds(10, 15, 46, 14);
		getContentPane().add(varCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(60, 10, 358, 20);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel varNome = new JLabel("Nome");
		varNome.setBounds(10, 45, 46, 14);
		getContentPane().add(varNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(60, 40, 358, 20);
		getContentPane().add(txtNome);
		
		JLabel varCidade = new JLabel("Cidade");
		varCidade.setBounds(10, 75, 46, 14);
		getContentPane().add(varCidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(60, 70, 358, 20);
		getContentPane().add(txtCidade);
		
		JLabel varEstado = new JLabel("Estado");
		varEstado.setBounds(10, 105, 46, 14);
		getContentPane().add(varEstado);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(60, 100, 358, 20);
		getContentPane().add(txtEstado);
		
		JLabel var1Estrela = new JLabel("1");
		var1Estrela.setBackground(Color.WHITE);
		var1Estrela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				txtValorAvaliacao.setText("1");
			}
		});
		
		JLabel var2Estrela = new JLabel("2");
		var2Estrela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				txtValorAvaliacao.setText("2");
			}
		});
		
		JLabel var3Estrela = new JLabel("3");
		var3Estrela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				txtValorAvaliacao.setText("3");
			}
		});
		
		JLabel var4Estrela = new JLabel("4");
		var4Estrela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				txtValorAvaliacao.setText("4");
			}
		});
		
		JLabel var5Estrela = new JLabel("5");
		var5Estrela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				txtValorAvaliacao.setText("5");
			}
		});
		
		var1Estrela.setIcon(new ImageIcon("C:\\Users\\ADS\\Desktop\\Java - Ling Prog I\\Java 03 10 2019\\src\\cesusc\\hotel\\favoritos.png"));
		var1Estrela.setBounds(60, 130, 16, 16);
		getContentPane().add(var1Estrela);
		
		var2Estrela.setIcon(new ImageIcon("C:\\Users\\ADS\\Desktop\\Java - Ling Prog I\\Java 03 10 2019\\src\\cesusc\\hotel\\favoritos.png"));
		var2Estrela.setBounds(80, 130, 16, 16);
		getContentPane().add(var2Estrela);
		
		var3Estrela.setIcon(new ImageIcon("C:\\Users\\ADS\\Desktop\\Java - Ling Prog I\\Java 03 10 2019\\src\\cesusc\\hotel\\favoritos.png"));
		var3Estrela.setBounds(100, 130, 16, 16);
		getContentPane().add(var3Estrela);
		
		var4Estrela.setIcon(new ImageIcon("C:\\Users\\ADS\\Desktop\\Java - Ling Prog I\\Java 03 10 2019\\src\\cesusc\\hotel\\favoritos.png"));
		var4Estrela.setBounds(120, 130, 16, 16);
		getContentPane().add(var4Estrela);
		
		var5Estrela.setIcon(new ImageIcon("C:\\Users\\ADS\\Desktop\\Java - Ling Prog I\\Java 03 10 2019\\src\\cesusc\\hotel\\favoritos.png"));
		var5Estrela.setBounds(140, 130, 16, 16);
		getContentPane().add(var5Estrela);
		
		txtValorAvaliacao = new JTextField();
		txtValorAvaliacao.setEditable(false);
		txtValorAvaliacao.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorAvaliacao.setBounds(100, 150, 30, 20);
		getContentPane().add(txtValorAvaliacao);
		txtValorAvaliacao.setColumns(10);
		
		JButton botaoEnviar = new JButton("Enviar");
		botaoEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
						
				if(!validaFormulario()) {
					JOptionPane.showMessageDialog(null, "Os campos de <Código, Nome, Cidade, Estado e Avaliação> obrigatoriamente devem estar preenchidos!");
				} else {
					atualizaHotel();
				}		
			}
		});
		botaoEnviar.setBounds(130, 150, 85, 20);
		getContentPane().add(botaoEnviar);
		
		
		JLabel varAvaliacao = new JLabel("Avaliação");
		varAvaliacao.setBounds(10, 155, 86, 14);
		getContentPane().add(varAvaliacao);
		
		JButton btnNewButton = new JButton("GitHub @D3x4n vers\u00E3o 1.0");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				try {
					java.awt.Desktop.getDesktop().browse(new java.net.URI("https://github.com/Dex4n/Java"));
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(363, 327, 211, 23);
		getContentPane().add(btnNewButton);
	}
	
	/*
	public void carregaHotel(Hotel hotel) {
		this.txtNome.setText(hotel.getNome());
		this.txtCodigo.setText("" + hotel.getCodigo());
		this.txtCidade.setText(hotel.getCidade());
		this.txtEstado.setText(hotel.getEstado());
		this.txtValorAvaliacao.setText("" + hotel.getAvaliacao());
		meuHotel = hotel;
	}
	*/
	
	public void atualizaHotel() {
		meuHotel.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
		meuHotel.setNome(txtNome.getText());
		meuHotel.setCidade(txtCidade.getText());
		meuHotel.setEstado(txtEstado.getText());
		meuHotel.setAvaliacao(Double.parseDouble(txtValorAvaliacao.getText()));
		JOptionPane.showMessageDialog(null, "Atualização do " + meuHotel.toString());
	}
	
	public boolean validaFormulario() {
		return (!txtNome.getText().equals("") && !txtCodigo.getText().equals(""));
	}
}
