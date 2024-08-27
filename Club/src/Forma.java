import java.util.Scanner;

public class Forma {
	
	protected String titulo;
	protected String curso;
	protected int chCurso;
	
	Scanner ler = new Scanner(System.in);

	public Forma() {
		
	}
	public Forma(String titulo, String curso, int chCurso) {
		
		this.titulo = titulo;
		this.curso = curso;
		this.chCurso = chCurso;		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {		
		this.titulo = titulo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		
		this.curso = curso;
	}
	public int getChCurso() {
		return chCurso;
	}
	public void setChCurso(int chCurso) {
		
		this.chCurso = chCurso;
	}	
	public void setFormacao(Forma formacao) {
		System.out.print("Título: ");
		titulo = ler.nextLine();
		setTitulo(titulo);
		
		System.out.print("Nome do curso: ");
		curso = ler.nextLine();
		setCurso(curso);
		
		System.out.print("Carga horária do curso: ");
		chCurso = ler.nextInt();
		setChCurso(chCurso);
		
		
		
		
		
	}
}