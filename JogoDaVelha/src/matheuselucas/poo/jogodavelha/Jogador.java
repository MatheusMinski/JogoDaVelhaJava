package matheuselucas.poo.jogodavelha;
/**
 * Esta classe armazena os dados de cada jogador
 * @author Minski, Lucas Vieira
 *
 */
public class Jogador {
	public String nome;
	public char XO;
	/**
	 * 
	 * @return retorna o nome do jogador
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Grava o nome do jogador
	 * @param nome nome que foi lido do console
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * 
	 * @return Retorna o s�mbolo que o jogador escolheu
	 */
	public char getXO() {
		return XO;
	}
	/**
	 * Define os s�mbolos de cada jogador, baseado na leitura do console
	 * @param jogador1 Obj que cont�m os dados do jogador 1
	 * @param jogador2 Obj que cont�m os dados do jogador 1
	 * @param XO Valor que foi lido do console para definir os s�mbolos
	 */
	public static void setXO(Jogador jogador1,Jogador jogador2,int XO) {
		if(XO==1){
			jogador1.XO='x';
			jogador2.XO='o';
		}else {
			jogador1.XO='o';
			jogador2.XO='x';
		}
	}

}
