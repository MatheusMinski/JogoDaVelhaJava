package matheuselucas.poo.jogodavelha;

/**
 * Esta classe cont�m os verificadores das regras do jogo
 * @author Minski, Lucas Vieira
 *
 */
public class Jogo {
	
	/**
	 * Este m�todo verifica se o jogo foi ganho por algum dos jogadores
	 * @param t Tabuleiro atual
	 * @return Indica se algu�m j� ganhou o jogo
	 */
	public static boolean ganhou(Tabuleiro t[]) {
		if(t[7].value==t[8].value&&t[8].value==t[9].value){
			return true;
		}else if(t[7].value==t[5].value&&t[5].value==t[3].value) {
			return true;	
		}else if(t[4].value==t[5].value&&t[5].value==t[6].value) {
			return true;
		}else if(t[1].value==t[2].value&&t[2].value==t[3].value) {
			return true;
		}else if(t[7].value==t[4].value&&t[4].value==t[1].value) {
			return true;
		}else if(t[8].value==t[5].value&&t[5].value==t[2].value) {
			return true;
		}else if(t[9].value==t[6].value&&t[6].value==t[3].value) {
			return true;
		}else if(t[1].value==t[5].value&&t[5].value==t[9].value) {
			return true;
		}else {
			return false;
		}
	}

	
}
