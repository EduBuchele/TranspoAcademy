package br.com.cursojava;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		// criar um jogo da velha
		Scanner scan = new Scanner(System.in);
		System.out.println("###  Jogo da Velha ###");

		String[][] tabuleiro = { { "1", "2", "3" }, { "4", "5", "6", }, { "7", "8", "9" } };
		int escolha = 0;
		String jogador = "O";
		boolean status = false;
		boolean trocaPlayer = false;

		MostraTabuleiro(tabuleiro);

		while (status == false) {

			jogador = "O";
			System.out.println("Jogador 'O' \nInforme o numero da sua escolha");
			escolha = Integer.parseInt(scan.nextLine());
			trocaPlayer = AtualizaTabuleiro(escolha, trocaPlayer, tabuleiro, jogador);
			MostraTabuleiro(tabuleiro);
			status = StatusJogo(tabuleiro, jogador);
			jogador = "X";
			if (status) {
				break;
			}
			System.out.println("Jogador 'O' \nInforme o numero da sua escolha");
			escolha = Integer.parseInt(scan.nextLine());
			trocaPlayer = AtualizaTabuleiro(escolha, trocaPlayer, tabuleiro, jogador);
			MostraTabuleiro(tabuleiro);
			status = StatusJogo(tabuleiro, jogador);

		}

		scan.close();
		System.out.println("Fim de JOGO");
	}

	private static boolean StatusJogo(String[][] tabuleiro, String jogador) {
		boolean status;
		if (tabuleiro[0][0].equals(jogador) && tabuleiro[0][1].equals(jogador) && tabuleiro[0][2].equals(jogador)) {
			status = true;
			System.out.println("O " + jogador + " ganhou /////////////////////////////////");
		} else if (tabuleiro[1][0].equals(jogador) && tabuleiro[1][1].equals(jogador)
				&& tabuleiro[1][2].equals(jogador)) {
			status = true;
			System.out.println("O " + jogador + " ganhou /////////////////////////////////");
		} else if (tabuleiro[2][0].equals(jogador) && tabuleiro[2][1].equals(jogador)
				&& tabuleiro[2][2].equals(jogador)) {
			status = true;
			System.out.println("O " + jogador + " ganhou /////////////////////////////////");
		} else if (tabuleiro[0][0].equals(jogador) && tabuleiro[1][0].equals(jogador)
				&& tabuleiro[2][0].equals(jogador)) {
			status = true;
			System.out.println("O " + jogador + " ganhou /////////////////////////////////");
		} else if (tabuleiro[0][1].equals(jogador) && tabuleiro[1][1].equals(jogador)
				&& tabuleiro[2][1].equals(jogador)) {
			status = true;
			System.out.println("O " + jogador + " ganhou /////////////////////////////////");
		} else if (tabuleiro[0][2].equals(jogador) && tabuleiro[1][1].equals(jogador)
				&& tabuleiro[2][2].equals(jogador)) {
			status = true;
			System.out.println("O " + jogador + " ganhou /////////////////////////////////");
		} else if (tabuleiro[0][0].equals(jogador) && tabuleiro[1][1].equals(jogador)
				&& tabuleiro[2][2].equals(jogador)) {
			status = true;
			System.out.println("O " + jogador + " ganhou /////////////////////////////////");
		} else if (tabuleiro[0][2].equals(jogador) && tabuleiro[1][1].equals(jogador)
				&& tabuleiro[2][0].equals(jogador)) {
			status = true;
			System.out.println("O " + jogador + " ganhou /////////////////////////////////");
		} else {
			status = false;
			System.out.println("\\\\\\\\\\\\O jogo ainda nao acabou///////////////////");
		}
		return status;
	}

	public static boolean AtualizaTabuleiro(int escolha, boolean trocaPlayer, String[][] tabuleiro, String jogador) {
		switch (escolha) {
		case 1:
			if (tabuleiro[0][0].equals("O") || tabuleiro[0][0].equals("X")) {
				System.out.println("Escolha Outro numero!!");
				trocaPlayer = false;
				break;
			} else {
				tabuleiro[0][0] = jogador;
				trocaPlayer = true;
			}
			break;
		case 2:
			if (tabuleiro[0][1].equals("O") || tabuleiro[0][0].equals("X")) {
				System.out.println("Escolha Outro numero!!");
				trocaPlayer = false;
				break;
			} else {
				tabuleiro[0][1] = jogador;
				trocaPlayer = true;
			}
			break;

		case 3:
			if (tabuleiro[0][2].equals("O") || tabuleiro[0][0].equals("X")) {
				System.out.println("Escolha Outro numero!!");
				trocaPlayer = false;
				break;
			} else {
				tabuleiro[0][2] = jogador;
				trocaPlayer = true;
			}
			break;
		case 4:
			if (tabuleiro[1][0].equals("O") || tabuleiro[0][0].equals("X")) {
				System.out.println("Escolha Outro numero!!");
				trocaPlayer = false;
				break;
			} else {
				tabuleiro[1][0] = jogador;
				trocaPlayer = true;
			}
			break;
		case 5:
			if (tabuleiro[1][1].equals("O") || tabuleiro[0][0].equals("X")) {
				System.out.println("Escolha Outro numero!!");
				trocaPlayer = false;
				break;
			} else {
				tabuleiro[1][1] = jogador;
				trocaPlayer = true;
			}
			break;

		case 6:
			if (tabuleiro[1][2].equals("O") || tabuleiro[0][0].equals("X")) {
				System.out.println("Escolha Outro numero!!");
				trocaPlayer = false;
				break;
			} else {
				tabuleiro[1][2] = jogador;
				trocaPlayer = true;
			}
			break;
		case 7:
			if (tabuleiro[2][0].equals("O") || tabuleiro[0][0].equals("X")) {
				System.out.println("Escolha Outro numero!!");
				trocaPlayer = false;
				break;
			} else {
				tabuleiro[2][0] = jogador;
				trocaPlayer = true;
			}
			break;
		case 8:
			if (tabuleiro[2][1].equals("O") || tabuleiro[0][0].equals("X")) {
				System.out.println("Escolha Outro numero!!");
				trocaPlayer = false;
				break;
			} else {
				tabuleiro[2][1] = jogador;
				trocaPlayer = true;
			}
			break;

		case 9:
			if (tabuleiro[2][2].equals("O") || tabuleiro[0][0].equals("X")) {
				System.out.println("Escolha Outro numero!!");
				trocaPlayer = false;
				break;
			} else {
				tabuleiro[2][2] = jogador;
				trocaPlayer = true;
			}
			break;

		default:
			System.out.println("Numero Invalido");
			trocaPlayer = false;
		}
		return trocaPlayer;
	}

	public static void MostraTabuleiro(String[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			System.out.println("_____________");
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print("| " + tabuleiro[i][j] + " ");
			}
			System.out.println("|");
		}
		System.out.println("_____________");
	}

}
