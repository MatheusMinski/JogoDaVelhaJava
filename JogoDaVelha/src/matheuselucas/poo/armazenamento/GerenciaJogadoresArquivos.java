package matheuselucas.poo.armazenamento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import matheuselucas.poo.jogodavelha.Jogador;
import java.util.Date;
import java.text.DateFormat;



/**
 * Esta classe implementa os métodos da classe GerenciaJogadores, que servem para gravar e ler arquivos
 * 
 * @author Matheus Minski, Lucas Vieira
 *
 */
public class GerenciaJogadoresArquivos implements GerenciaJogadores {
/**
 *Este método escreve o nome do jogador que venceu o jogo em um arquivo
 *@param j1 É o objeto o qual contém o nome do jogador
 */
	@Override
	public void gravarVencedor(Jogador j1) {
		Date data = new Date();
		DateFormat formato = DateFormat.getDateInstance(DateFormat.SHORT);
		String s = formato.format(data);
		
		try (FileWriter fw = new FileWriter("vencedores.txt", true)){
			fw.write("Data: "+s+ "| Vencedor " + j1.nome + "\r\n" );
		}catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
/**
 * Este método lê o arquivos que contém os nomes dos vencedores e exibe na tela
 */
	@Override
	public void mostrarVencedores() {
		String s;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Perguntas.txt"));
			s = br.readLine();
			while (!s.equals("**")) {
				System.out.println(s);
				s = br.readLine();
				
			}
			while (!s.equals("**")) {
				System.out.println(s);
				s = br.readLine();
				
			}
		} catch (IOException exc) {
			System.out.println("Erro de I/O: " + exc);
		}
		
		
	}
	
}
