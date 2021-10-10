public class ExercicioNumeroInteiro {

	public static void main(String[] args) {
		int one= 500;
		int two= 200;
		int three= 100;
		
		if (one< two && one< three) {
			System.out.println("O número " +one+ " é o menor!");
		} else if (two < one && two < three) {
			System.out.println("O número " +two+ " é o menor! ");
		} else {
			System.out.println("O número " +three+ " é o menor! ");
		} 
		
		if (one> two && one> three) {
			System.out.println("O número " +one+ " é o maior!");
		} else if (two> one && two> three) {
			System.out.println("O número " +two+ " é o maior! ");
		} else {
			System.out.println("O número " +three+ " é o maior! ");
		}
	}
}