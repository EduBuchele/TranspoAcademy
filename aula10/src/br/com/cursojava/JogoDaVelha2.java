package br.com.cursojava;

import java.util.Scanner;

public class JogoDaVelha2 {
//Corrigido
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int jogadorAtual = 0;
		boolean venceu = false;
		boolean valido = false;
		String posicao = "";
		String[] tipoJogador = {"X","O"};
		String[][] tabuleiro = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		
		
		
		for (int linha = 0; linha < tabuleiro.length; linha++) {
			for (int coluna = 0; coluna < tabuleiro[linha].length;coluna++) {
				System.out.printf("%s", tabuleiro[linha][coluna]);
				if(coluna < tabuleiro[coluna].length -1){
					System.out.print(" | ");
				}
			}
			if(linha < tabuleiro.length -1){
				System.out.println("\n----------");
			}
		}
		System.out.println();
		System.out.println();
		
		
		for(int i = 0; i< 9; i++){
			valido = false;
			do{
				System.out.printf("Jogador %s escolha uma posição: \n",tipoJogador[jogadorAtual]);
				posicao = teclado.nextLine();
				for (int linha = 0; linha < tabuleiro.length; linha++) {
					for (int coluna = 0; coluna < tabuleiro[linha].length;coluna++) {
						if(tabuleiro[linha][coluna].equals(posicao)){
							tabuleiro[linha][coluna] = tipoJogador[jogadorAtual];
							valido = true;
						}
					}
				}
				if(!valido){
					System.out.println("Número invádido");
				}
				
			}while(!valido);
			
			
			for (int linha = 0; linha < tabuleiro.length; linha++) {
				for (int coluna = 0; coluna < tabuleiro[linha].length;coluna++) {
					System.out.printf("%s", tabuleiro[linha][coluna]);
					if(coluna < tabuleiro[coluna].length -1){
						System.out.print(" | ");
					}
				}
				if(linha < tabuleiro.length -1){
					System.out.println("\n----------");
				}
			}
			System.out.println();
			System.out.println();
			//verifica se houve ganhador
			if(
					(tabuleiro[0][0].equals(tabuleiro[0][1]) && tabuleiro[0][1].equals(tabuleiro[0][2])) ||
					(tabuleiro[1][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[1][2])) ||
					(tabuleiro[2][0].equals(tabuleiro[2][1]) && tabuleiro[2][1].equals(tabuleiro[2][2])) ||
					(tabuleiro[0][0].equals(tabuleiro[1][0]) && tabuleiro[1][0].equals(tabuleiro[2][0])) ||
					(tabuleiro[0][1].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][1])) ||
					(tabuleiro[0][2].equals(tabuleiro[1][2]) && tabuleiro[1][2].equals(tabuleiro[2][2])) ||
				
					(tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][2])) ||
					(tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][0])) 
				
			){
				venceu = true;
			}
			
			if(venceu){
				break;
			}
			
			jogadorAtual = jogadorAtual == 0 ? 1 : 0;
			
		}
		if(venceu){
			System.out.println("Parabéns, o Jogador "+tipoJogador[jogadorAtual]+ " venceu!");
		}else{
			System.out.println("Não houve vencedor!");
		}
		
		teclado.close();
	}

}