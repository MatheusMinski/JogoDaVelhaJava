package matheuselucas.poo.jogodavelha;
/**
 * Classe que define exce��o que indica uma escolha errada na hora de escolher O ou X
 * @author Minski, Lucas Vieira
 *
 */
public class numberOutOfContextException extends Exception{
	String abc;
/**
 * Cria a mensagem para exibir na hora da exce��o
 */
	 public numberOutOfContextException(){
	        this.abc = "Digite um n�mero que seja 1 ou 2";
	    }

	    @Override
	    public String toString(){
	        return abc;
	    }
	
}
