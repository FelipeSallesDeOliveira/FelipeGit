import java.util.Scanner;

public class Aluno extends Pessoa {
	protected byte ra;
	protected String curso;	
	
	protected Curso curso2;
	
	Scanner ler = new Scanner(System.in);	
	Curso cur = new Curso();  
	public Aluno() {
		
	}
	public Aluno( String nome, String CPF, Endereco endereco, byte ra, String curso, Curso curso2) {
		super(nome, CPF, endereco);
		this.ra = ra;
		this.curso = curso;
	}
	public byte getRa() {
		return ra;
	}
	public void setRa(byte ra) {
		System.out.print("Digite o Registro Acadêmico do aluno(a): ");
		ra = ler.nextByte();
		this.ra = ra;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		System.out.print("Digite o seu curso: ");		
		curso = ler.nextLine();
		curso = ler.nextLine();
		this.curso = curso;
	}
	public void cadastrarAluno(Scanner ler) {

		System.out.println("\n-- Cadastramento --");		
		setNome(nome);
		setCPF(CPF);
		end.setEndereco(endereco);		
		setRa(ra);
		setCurso(curso);
		cur.setCurso2(curso2);
	}
	public void dadosAluno() {
		System.out.println("\n Pessoa Fisica\n" 
	                     + "-----------------" 				          
				         + "\n   nome: "+ getNome() 
				         + "\n   CPF: " + getCPF()
				         + "\n   rua: " + endereco.getRua()
				         + "\n   numero: " + end.getNumero()
				         + "\n   bairro: " + end.getBairro()
				         + "\n   cidade: " + end.getCidade()
				         + "\n   RA: " + getRa() 
				         + "\n   Curso: " + getCurso()
		                 + "\n   Nome do curso: " + cur.getNome()
		                 + "\n   Tipo de formação: " + cur.getTipo()
		                 + "\n   Carga horária: " + cur.getCh()
		                 + "\n   Duração: " + cur.getDuracao()
		                 + "\n   Valor da mensalidade: " + cur.getMensalidade());
	}
}