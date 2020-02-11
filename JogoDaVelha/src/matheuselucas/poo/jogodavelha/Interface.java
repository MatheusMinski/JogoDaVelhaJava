package matheuselucas.poo.jogodavelha;
/**
 * Esta classe exibe de forma correta o tabuleiro
 * @author Minski, Lucas Vieira
 *
 */
public class Interface {
	/**
	 * Exbibe no console o Tabuleiro
	 * @param t Tabuleiro Atual
	 */
	public static void mostrarJogo(Tabuleiro t[]) {
		System.out.println("Situação atual de jogo:");
		System.out.print(t[7].value);
		System.out.print(" | ");
		System.out.print(t[8].value);
		System.out.print(" | ");
		System.out.print(t[9].value);
		System.out.println();
		System.out.println("---------");
		System.out.print(t[4].value);
		System.out.print(" | ");
		System.out.print(t[5].value);
		System.out.print(" | ");
		System.out.print(t[6].value);
		System.out.println();
		System.out.println("---------");
		System.out.print(t[1].value);
		System.out.print(" | ");
		System.out.print(t[2].value);
		System.out.print(" | ");
		System.out.print(t[3].value);
		System.out.println();
		
	}
}
