package cesusc.hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class Opcoes extends JFrame {
	
	private JPanel Janela;
	private ControleHotel controleHotel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opcoes frameOpcoes = new Opcoes();
					
					frameOpcoes.setVisible(true);		
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Opcoes() {
		controleHotel = new ControleHotel();
		
		setTitle("Menu de Op\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 400, 358);
		Janela = new JPanel();
		Janela.setBackground(Color.WHITE);
		Janela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Janela);
		Janela.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 384, 28);
		menuBar.setBackground(new Color(192, 192, 192));
		Janela.add(menuBar);
		JList list = new JList();
		list.setBackground(Color.PINK);

		JMenuItem mntmCadastrarCliente = new JMenuItem("Cadastrar Cliente");
		mntmCadastrarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {

			}
		});
		
		JMenuItem mntmCadastrarHotel = new JMenuItem("Cadastrar Hotel");
		mntmCadastrarHotel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {;
				Cadastro novoCadastro = new Cadastro();
				novoCadastro.setControleHotel(controleHotel);
				novoCadastro.setModal(true);
				novoCadastro.setVisible(true);
				
				list.setModel(new AbstractListModel() {
					String[] values = controleHotel.getListaHotel();
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
			}
		});
		
		menuBar.add(mntmCadastrarHotel);
		menuBar.add(mntmCadastrarCliente);
		
		list.setBounds(10, 39, 364, 269);
		Janela.add(list);
	}
}
