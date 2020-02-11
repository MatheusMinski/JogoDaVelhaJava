package matheuselucas.poo.jogodavelha;
/**
 * Classe que define exceção que indica uma escolha errada na hora de escolher O ou X
 * @author Minski, Lucas Vieira
 *
 */
public class numberOutOfContextException extends Exception{
	String abc;
/**
 * Cria a mensagem para exibir na hora da exceção
 */
	 public numberOutOfContextException(){
	        this.abc = "Digite um número que seja 1 ou 2";
	    }

	    @Override
	    public String toString(){
	        return abc;
	    }
	
}
