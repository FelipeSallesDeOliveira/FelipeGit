import java.util.Scanner;

public class Professor extends Pessoa {
	private String titul;
	private String form;
	
	protected Forma formacao;
	Scanner ler = new Scanner(System.in);
	
	Forma forma = new Forma ();
	
	public Professor() {
		
	}

	public Professor(String nome, String CPF, Endereco endereco, String titul, String form, Forma formacao) {
		super(nome, CPF, endereco);
		this.titul = titul;
		this.form = form;
	}
	public String getTitul() {
		return titul;
	}
	public void setTitul(String titul) {
		System.out.print("Digite a graduação do professor(a): ");
		titul = ler.nextLine();
		this.titul = titul;
	}
	
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		System.out.print("Digite sua formação: ");		
		form = ler.nextLine();
		this.form = form;
	}
	public void cadastrarProfessor(Scanner ler) {

		System.out.println("\n-- Cadastramento --");		
		setNome(nome);
		setCPF(CPF);
		end.setEndereco(endereco);
		setTitul(titul);
		setForm(form);	
		forma.setFormacao(formacao);
	}
	public void dadosProfessor() {
		System.out.println("\n Pessoa Fisica\n" 
							+ "-----------------" 
							+ "\n   CPF: " + getCPF() 
							+ "\n   nome: "	+ getNome()
							+ "\n   rua: " + endereco.getRua()
					        + "\n   numero: " + end.getNumero()
					        + "\n   bairro: " + end.getBairro()
					        + "\n   cidade: " + end.getCidade()
							+ "\n   Título: " + getTitul() 
							+ "\n   Formação: "	+ getForm()
							+ "\n   Título: " + forma.getTitulo()
							+ "\n   Nome do Curso: " + forma.getCurso()
							+ "\n   Carga horária: " + forma.getChCurso());
	}
}