package matheuselucas.poo.jogodavelha;
/**
 * Define a Exceção da posição já escolhida
 * @author Minski, Lucas Vieira
 *
 */
public class positionUsedException extends Exception {
	String abc;
/**
 * Defina a mensagem da exceção
 */
	 public positionUsedException(){
	        this.abc = "Posição já preenchida";
	    }

	    @Override
	    public String toString(){
	        return abc;
	    }
}
