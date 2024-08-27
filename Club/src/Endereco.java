import java.util.Scanner;

public class Endereco {
	protected String rua;
	protected int numero;
	protected String bairro;
	protected String cidade;
	
	Scanner ler = new Scanner(System.in);	
	public Endereco() {
		
	}

	public Endereco(String rua, int numero, String bairro, String cidade) {
	
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {		
		this.rua = rua;				
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {		
		this.numero = numero;
	}	
	public String getBairro() {
		return bairro;
	}	
	public void setBairro(String bairro) {		
		this.bairro = bairro;
	}	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {		
		this.cidade = cidade;
	}
	public void setEndereco(Endereco endereco) {
		System.out.print("Rua: ");
		rua = ler.nextLine();		
		setRua(rua);
		
		System.out.print("Número: ");
		numero = ler.nextInt();
		setNumero(numero);
		
		System.out.print("Bairro: ");
		bairro = ler.nextLine();
		bairro = ler.nextLine();
		setBairro(bairro);
		
		System.out.print("Cidade: ");
		cidade = ler.nextLine();
		setCidade(cidade);
	}	
}