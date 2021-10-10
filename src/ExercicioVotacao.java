
public class ExercicioVotacao {

	public static void main(String[] args) {
		int anoNascimento= 2008;
		int Idade= (2021 - anoNascimento);
		System.out.println("Sua idade é " + Idade);
		if (Idade>=16) {
			System.out.println("Você pode votar!");
		} else {
			System.out.println("Você não poderá votar esse ano!");
		}
	}

}
