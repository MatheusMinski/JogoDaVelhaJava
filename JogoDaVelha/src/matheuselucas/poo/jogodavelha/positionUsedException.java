package matheuselucas.poo.jogodavelha;
/**
 * Define a Exce��o da posi��o j� escolhida
 * @author Minski, Lucas Vieira
 *
 */
public class positionUsedException extends Exception {
	String abc;
/**
 * Defina a mensagem da exce��o
 */
	 public positionUsedException(){
	        this.abc = "Posi��o j� preenchida";
	    }

	    @Override
	    public String toString(){
	        return abc;
	    }
}
