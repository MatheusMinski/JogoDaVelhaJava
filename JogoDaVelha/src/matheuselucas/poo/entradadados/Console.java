package matheuselucas.poo.entradadados;
import java.util.Scanner;
import matheuselucas.poo.armazenamento.*;
import matheuselucas.poo.jogodavelha.Jogador;
import matheuselucas.poo.jogodavelha.Jogada;
import matheuselucas.poo.jogodavelha.numberOutOfContextException;
import matheuselucas.poo.jogodavelha.outOfTableException;
/**
 * Esta classe realiza a captura dos dados inseridos no console
 * 
 * @author Minski, Lucas Vieira
 *@version 1.0
 */

public class Console{
	Scanner scan = new Scanner(System.in);
	/**
	 * Este método define o nome dos jogadores 
	 * @param jogador Captura o nome e insere no obj jogador
	 */
	public void setJogador(Jogador jogador) {
		System.out.println("Digite seu nome");
		jogador.nome= scan.next();
	}
	
	/**
	 * Define o símbolo de cada jogador
	 * @param jogador1 Obj que contém os dados de cada jogador
	 * @param jogador2 Obj que contém os dados de cada jogador
	 * @throws numberOutOfContextException Indica que o jogador não digitou 1 ou 2
	 */
	
	public void lerXO(Jogador jogador1, Jogador jogador2) throws numberOutOfContextException{
		System.out.println(jogador1.nome + " digite 1 para escolher X e 2 para escolher O");
		int XO = scan.nextInt();
		if(XO != 1 && XO!= 2) {
			throw new numberOutOfContextException();
		}else {
			Jogador.setXO(jogador1, jogador2, XO);
		}
	}
	
	GerenciaJogadores gerenciador = new GerenciaJogadoresArquivos();
	/**
	 * Este método dá a opção para visualizar os vencedores anteriores
	 */
	public void seeWinners() {
		int aux;
		System.out.println("Deseja ver a lista de vencedores? 1 para sim, 2 para nao");
		aux = scan.nextInt();
		if (aux == 1) {
			gerenciador.mostrarVencedores();
		}
	}
	/**
	 * Faz a leitura da posição em que o jogador quer inserir o símbolo
	 * @param jogador Obj que define qual jogador está fazendo a jogada atual
	 * @return Retorna a posição que o jogador escolheu
	 * @throws outOfTableException Indica que o jogador escolheu uma posição que não existe no tabuleiro
	 */
	public int getJogada(Jogador jogador) throws outOfTableException {
		int posicao;
		System.out.println(jogador.nome +" digite a sua próxima jogada");
		posicao = scan.nextInt();
		if(posicao < 1 || posicao > 9) {
			throw new outOfTableException();
		}else {
			return posicao;
		}
		

		
	}

}
