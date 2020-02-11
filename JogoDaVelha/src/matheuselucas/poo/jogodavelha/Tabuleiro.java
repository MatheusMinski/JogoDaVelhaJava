package matheuselucas.poo.jogodavelha;
/**
 * Classe que contém cada casa do tabuleiro
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
 * Retorna o valor que está dentro da casa
 * @return valor que está armazenado dentro da casa
 */
	public char getValue() {
		return value;
	}
	/**
	 * Muda o char que está dentro da casa
	 * @param value Valor novo para a casa
	 */
	public void setValue(char value) {
		this.value = value;
	}
	
	
}