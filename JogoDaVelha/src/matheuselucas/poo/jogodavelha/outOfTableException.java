package matheuselucas.poo.jogodavelha;
/**
 * Classe que define o método da exceção quando uma posição fora do tabuleiro é escolhida
 * @author Minski, Lucas Vieira
 *
 */
public class outOfTableException extends Exception {
	String abc;
/**
 * Define a mensagem da exceção
 */
	 public outOfTableException(){
	        this.abc = "Numero fora do tabuleiro";
	    }

	    @Override
	    public String toString(){
	        return abc;
	    }
}