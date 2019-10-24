package cesusc.hotel;


public class Hotel {
	
	private int codigo;
	private String nome;
	private String cidade;
	private String estado;
	private double avaliacao;
	
	
	public Hotel (int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Hotel() {
		super();
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void validaAvaliacao(double avaliacao) {
		if (avaliacao > 10) {
			System.out.println("Valor da avalia��o inv�lido");
		}
		else if (avaliacao < 0) {
			System.out.println("Valor da avalia��o inv�lido");
		} else {
			this.avaliacao = avaliacao;
		}
	}
	
	public void retornarAvaliacao() {
		if (avaliacao < 5) {
			System.out.println("Ruim");
		}
		else if (avaliacao >= 5 && avaliacao <= 7) {
			System.out.println("Regular");
		}
		else if (avaliacao >= 7 && avaliacao <= 9) {
			System.out.println("Bom");
		}
		else if (avaliacao >= 9 && avaliacao <= 10) {
			System.out.println("�timo");
		}
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "Hotel \nC�digo = " + codigo + ",\nNome = " + nome + ",\nCidade = " + cidade + ",\nEstado = " + estado
				+ ",\nAvalia��o = " + avaliacao;
	}
}
