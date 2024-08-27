import java.util.Scanner;

public class Curso {
	
	protected String nome;
	protected String tipo;
	protected int ch;
	protected float duracao;
	protected float mensalidade;
	
	Scanner ler = new Scanner(System.in);
	
	public Curso (){
		
	}
	
	public Curso(String nome, String tipo, int ch, float duracao, float mensalidade) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.ch = ch;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {		
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {		
		this.tipo = tipo;
	}

	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {		
		this.ch = ch;
	}

	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {		
		this.duracao = duracao;
	}

	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {		
		this.mensalidade = mensalidade;
	}
	
	public void setCurso2(Curso curs) {
		System.out.print("Nome do curso: ");
		nome = ler.nextLine();
		setNome(nome);
		
		System.out.print("Tipo de formação: ");
		tipo = ler.nextLine();
		setTipo(tipo);
		
		System.out.print("Carga horária: ");
		ch = ler.nextInt();
		setCh(ch);
		
		System.out.print("Duração: ");
		duracao = ler.nextFloat();
		setDuracao(duracao);
		
		System.out.print("Valor da mensalidade: ");
		mensalidade = ler.nextFloat();
		setMensalidade(mensalidade);		
	}
}