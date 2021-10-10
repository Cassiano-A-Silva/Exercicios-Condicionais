import java.util.Scanner;

public class ExercicioValidacaoSenha {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		String senha = leitor.next();
		if (senha.equals("1234")) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}
		leitor.close();
	}
}