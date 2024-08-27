import java.util.Scanner;

public class Pessoa {
	protected String nome;	
	protected String CPF;
	protected Endereco endereco;
	
	Scanner ler = new Scanner(System.in);
	Endereco end = new Endereco();
	public Pessoa() {
		this.endereco = new Endereco();
	}
	public Pessoa(String nome, String CPF, Endereco endereco) {
	
		this.nome = nome;		
		this.CPF = CPF;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		System.out.print("Nome: ");
		nome = ler.nextLine();
		this.nome = nome;				
	}	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		System.out.print("CPF: ");
		CPF = ler.nextLine();
		
		while (CPF.length() != 11) {
			System.out.println("\nCPF inválido!!! \n");
			System.out.print("Informe o CPF: ");
			CPF = ler.nextLine();
		}
		this.CPF = CPF;				
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}