package matheuselucas.poo.jogodavelha;
import matheuselucas.poo.entradadados.Console;
import matheuselucas.poo.armazenamento.*;

/**
 * Esta classe instancia todo o jogo
 * @author Minski, Lucas Vieira
 * @version 1.0
 */
public class ClassePrincipal {
	public static void  main(String args[]) {
		boolean validacao=false;
		
		Tabuleiro tabuleiro[] = new Tabuleiro[10];
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		Console console = new Console();
		
		GerenciaJogadores gerenciador = new GerenciaJogadoresArquivos();
		
	
		tabuleiro[1]= new Tabuleiro('1');
		tabuleiro[2]= new Tabuleiro('2');
		tabuleiro[3]= new Tabuleiro('3');
		tabuleiro[4]= new Tabuleiro('4');
		tabuleiro[5]= new Tabuleiro('5');
		tabuleiro[6]= new Tabuleiro('6');
		tabuleiro[7]= new Tabuleiro('7');
		tabuleiro[8]= new Tabuleiro('8');
		tabuleiro[9]= new Tabuleiro('9');
		
		Jogada jogada = new Jogada();
		
		console.setJogador(jogador1);
		console.setJogador(jogador2);
		while (validacao == false) {
			try {
				console.lerXO(jogador1, jogador2);
				validacao=true;
			}catch(numberOutOfContextException e) {
				System.out.println(e);
			}
		}
		validacao=false;
		
		System.out.println("Digite a sua primeira jogada baseado no tabuleiro abaixo");
		Interface.mostrarJogo(tabuleiro);
		
		do {
			while (validacao == false) {
				try {
					jogada.setValor(jogador1, tabuleiro);
					validacao=true;
				}catch(positionUsedException e) {
					System.out.println(e);
				}
			}
			validacao=false;
			
			Interface.mostrarJogo(tabuleiro);
			if(Jogo.ganhou(tabuleiro)) {
				gerenciador.gravarVencedor(jogador1);
				System.out.println("Jogador "+jogador1.nome+" ganhou!!");
				break;
			}
			if(Jogada.cont==9) {
				break;
			}
			
			while (validacao == false) {
				try {
					jogada.setValor(jogador2, tabuleiro);
					validacao=true;
				}catch(positionUsedException e) {
					System.out.println(e);
				}
			}
			validacao=false;
			
			Interface.mostrarJogo(tabuleiro);
			if(Jogo.ganhou(tabuleiro)) {
				gerenciador.gravarVencedor(jogador2);
				System.out.println("Jogador "+jogador2.nome+" ganhou!!");
				break;
			}
			
		}while(Jogada.cont!=9);
		
		if((jogada.cont==9)&&(!(Jogo.ganhou(tabuleiro)))) {
			System.out.println("Jogo empatou!");
		}
		
		console.seeWinners();
		
	
		
	}
}
