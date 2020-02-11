package matheuselucas.poo.jogodavelha;
/**
 * Classe que define o m�todo da exce��o quando uma posi��o fora do tabuleiro � escolhida
 * @author Minski, Lucas Vieira
 *
 */
public class outOfTableException extends Exception {
	String abc;
/**
 * Define a mensagem da exce��o
 */
	 public outOfTableException(){
	        this.abc = "Numero fora do tabuleiro";
	    }

	    @Override
	    public String toString(){
	        return abc;
	    }
}