

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		JV jogo = new JV();
		String posicao;
		int valida = 0, jogadas = 0;
		
        System.out.println(":::::Jogo da Velha:::::");
		jogo.Mostrar();
		while(true) {
			
			
			do {//jogador 1
				System.out.print("Jogador 1 informe onde vai jogar: ");
				posicao = ler.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada ínvalida! Tente novamente!");
					System.out.print("Jogador 1 informe onde vai jogar: ");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "X");
				valida = 1;
				
			}while(valida == 0);
			
                jogadas++;
                valida = 0;
                jogo.Mostrar();
                
                if(!jogo.Ganhou(jogadas).equals("null")) {
                    break;
			}
			
			
			do {//jogador 2
				System.out.print("Jogador 2 informe onde vai jogar: ");
				posicao = ler.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada ínvalida! Tente novamente!");
					System.out.print("Jogador 2 informe onde vai jogar: ");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "O");
				valida = 1;
				
			}while(valida == 0);
			
                jogadas++;
                valida = 0;
                jogo.Mostrar();
                
                if(!jogo.Ganhou(jogadas).equals("null")) {
                    break;
			}
			
		}
		System.out.println("O "+jogo.Ganhou(jogadas)+" venceu!");
		
	}

}