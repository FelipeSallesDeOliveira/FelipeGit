import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Aluno a = new Aluno();
		Professor p = new Professor();

		byte opc;
		do {
			System.out.println("\n..: Menu Principal :..");
			System.out.println("----------------------");
			System.out.println("1 - Cadastrar aluno");
			System.out.println("2 - Cadastrar professor");
			System.out.println("3 - Mostrar dados");
			System.out.println("4 - Sair do sistema");			
			System.out.print("Digite uma opção: ");
			opc = ler.nextByte();

			switch (opc) {
			case 1:
				System.out.println("\n Cadastrar Aluno:");
				a.cadastrarAluno(ler);
				break;
			case 2:
				System.out.println("\n Cadastrar Professor:");
				p.cadastrarProfessor(ler);
				break;
			case 3:
				System.out.println("\n Escolha uma das opções: ");

				byte opca;
				do {
					System.out.println("1 - Dados do aluno");
					System.out.println("2 - Dados do professor");
					System.out.println("3 - Voltar ao menu");
					opca = ler.nextByte();

					switch (opca) {
					case 1:
						a.dadosAluno();
						break;
					case 2:
						p.dadosProfessor();
						break;
					case 3:
						System.out.println("sair do sistema...");

					default:
						System.out.println("Opção Inválida!");
					}
				} while (opca != 3);
				
				ler.close();

			case 4:
				System.out.println("sair do sistema...");

			default:
				System.out.println("Opção Inválida!");
			}
		} while (opc != 4);

		ler.close();
	}
}
