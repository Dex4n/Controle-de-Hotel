package cesusc.hotel;

import javax.swing.JOptionPane;

public class Pessoa {
	
	protected String nomeCliente;
	protected String cpfCliente;
	protected String emailCliente;
	protected String enderecoCliente;
	protected String telefoneCliente;
	protected String sexoCliente;
	
	
	
	public Pessoa () {
		
	}
	

	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public String getCpfCliente() {
		return cpfCliente;
	}



	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}



	public String getEmailCliente() {
		return emailCliente;
	}



	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}



	public String getEnderecoCliente() {
		return enderecoCliente;
	}



	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}



	public String getTelefoneCliente() {
		return telefoneCliente;
	}



	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}


	public String getSexoCliente() {
		return sexoCliente;
	}


	public void setSexoCliente(String sexoCliente) {
		this.sexoCliente = sexoCliente;
	}


	public String toString() {
		return "Informações \n[Nome do Cliente = " + nomeCliente + ",\nCPF do Cliente = " + cpfCliente + ",\nE-mail do Cliente = " + emailCliente
				+ ",\nEndereçodo Cliente = " + enderecoCliente + ",\nTelefone do Cliente = " + telefoneCliente + "\n,Sexo do Cliente = " + sexoCliente + "].";
	}
}
