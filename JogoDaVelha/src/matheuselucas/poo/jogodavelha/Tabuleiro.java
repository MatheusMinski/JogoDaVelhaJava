package matheuselucas.poo.jogodavelha;
/**
 * Classe que cont�m cada casa do tabuleiro
 * @author Minski, Lucas Vieira
 *
 */
public class Tabuleiro{
	public char value;
	/**
	 * Construtor que insere um caracter dentro de cada casa do tabuleiro
	 * @param num Caracter que vai ser inserido dentro da casa
	 */
	public Tabuleiro(char num) {
		this.value= num;
	}
/**
 * Retorna o valor que est� dentro da casa
 * @return valor que est� armazenado dentro da casa
 */
	public char getValue() {
		return value;
	}
	/**
	 * Muda o char que est� dentro da casa
	 * @param value Valor novo para a casa
	 */
	public void setValue(char value) {
		this.value = value;
	}
	
	
}