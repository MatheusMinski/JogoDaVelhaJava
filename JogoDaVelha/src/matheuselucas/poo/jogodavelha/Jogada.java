package matheuselucas.poo.jogodavelha;
import matheuselucas.poo.entradadados.Console;
/**
 * Esta classe analisa se a posição escolhida da jogada é válida e a registra no tabuleiro
 * @author Minski, Lucas Vieira
 *
 */
public class Jogada {
	public static int cont=0;
	public int posicao;
	public boolean dentroDaTabela= false;
	/**
	 * Este método verifica a casa jogada e registra a jogada
	 * @param jogador Obj do jogador que efetuou a jogada
	 * @param t Tabuleiro atual do jogo
	 * @throws positionUsedException Indica que a posição escolhida já foi utililizada
	 */
	public void setValor(Jogador jogador, Tabuleiro t[]) throws positionUsedException{
		Console console = new Console();
		while(dentroDaTabela == false) {
			try {
				posicao = console.getJogada(jogador);
				dentroDaTabela = true;
			}catch(outOfTableException e) {
				System.out.println(e);
			}
		}
		dentroDaTabela = false;
		
		if((t[posicao].value=='o')||(t[posicao].value=='x')) {
			throw new positionUsedException();
		}else {
			cont++;
			t[posicao].setValue(jogador.XO);
		}
		
		
	}

}
