public class ExercicioNumeroInteiro {

	public static void main(String[] args) {
		int one= 500;
		int two= 200;
		int three= 100;
		
		if (one< two && one< three) {
			System.out.println("O n�mero " +one+ " � o menor!");
		} else if (two < one && two < three) {
			System.out.println("O n�mero " +two+ " � o menor! ");
		} else {
			System.out.println("O n�mero " +three+ " � o menor! ");
		} 
		
		if (one> two && one> three) {
			System.out.println("O n�mero " +one+ " � o maior!");
		} else if (two> one && two> three) {
			System.out.println("O n�mero " +two+ " � o maior! ");
		} else {
			System.out.println("O n�mero " +three+ " � o maior! ");
		}
	}
}