import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jogadorNumero1, jogadorNumero2;
		int[] vetorColuna1 = new int[3];
		int[] vetorColuna2 = new int[3];
		int[] vetorColuna3 = new int[3];
		int linha, coluna;
		int rodada=0;
		boolean vencedor= false;
		boolean empty=true;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println ("Olá, seja bem vindo! Por favor, digite o nome do jogador número 1:");
		jogadorNumero1 = leitor.next();
		
		System.out.println ("Agora, por favor, digite o nome do jogador número 2:");
		jogadorNumero2 = leitor.next();
		
		System.out.println ("Ótimo! Estamos prontos para começar!");
		
		
		while (rodada <= 8 && vencedor == false) {
			
		System.out.println ("Rodada " + (rodada+1));
	
		
		if(rodada == 0 || rodada == 2 || rodada == 4 || rodada == 6 || rodada ==8){
			System.out.println ("É a vez do(a) " + jogadorNumero1);			
		} else {
			System.out.println ("É a vez do(a) " + jogadorNumero2);				
		}
		
		
		System.out.println ("Coluna");
		coluna = leitor.nextInt();
		
		while (coluna <= 0 || coluna > 3) {
			System.out.println ("Coluna inválida! Digite um valor válido (de 1 a 3). Obrigada! :)");
			coluna = leitor.nextInt();
		}
					
		
		System.out.println ("Linha:");
		linha = leitor.nextInt();
		
		while (coluna <= 0 || coluna > 3) {
			System.out.println ("Linha inválida! Digite um valor válido (de 1 a 3). Obrigada! :)");
			coluna = leitor.nextInt();
		}
					
		
		if(rodada == 0 || rodada == 2 || rodada == 4 || rodada == 6 || rodada ==8){
			
			if (coluna == 1 && linha ==1) {
				vetorColuna1[0] = 1;
			}
			if (coluna == 1 && linha ==2) {
				vetorColuna1[1] = 1;
			}
			if (coluna == 1 && linha ==3) {
				vetorColuna1[2] = 1;
			}
			
			if (coluna == 2 && linha ==1) {
				vetorColuna2[0] = 1;
			}
			if (coluna == 2 && linha ==2) {
				vetorColuna2[1] = 1;
			}
			if (coluna == 2 && linha ==3) {
				vetorColuna2[2] = 1;
			}			
			
			if (coluna == 3 && linha ==1) {
				vetorColuna3[0] = 1;
			}
			if (coluna == 3 && linha ==2) {
				vetorColuna3[1] = 1;
			}
			if (coluna == 3 && linha ==3) {
				vetorColuna3[2] = 1;
			}		
		} else {
			
			if (coluna == 1 && linha ==1) {
				vetorColuna1[0] = 2;
			}
			if (coluna == 1 && linha ==2) {
				vetorColuna1[1] = 2;
			}
			if (coluna == 1 && linha ==3) {
				vetorColuna1[2] = 2;
			}
			
			if (coluna == 2 && linha ==1) {
				vetorColuna2[0] = 2;
			}
			if (coluna == 2 && linha ==2) {
				vetorColuna2[1] = 2;
			}
			if (coluna == 2 && linha ==3) {
				vetorColuna2[2] = 2;
			}			
			
			if (coluna == 3 && linha ==1) {
				vetorColuna3[0] = 2;
			}
			if (coluna == 3 && linha ==2) {
				vetorColuna3[1] = 2;
			}
			if (coluna == 3 && linha ==3) {
				vetorColuna3[2] = 2;
			}
			
		}
		
			
		
		// Apresenta tabuleiro
		System.out.println (vetorColuna1[0] + "|" + vetorColuna2[0] + "|" + vetorColuna3[0]); 
		System.out.println (vetorColuna1[1] + "|" + vetorColuna2[1] + "|" + vetorColuna3[1]);
		System.out.println (vetorColuna1[2] + "|" + vetorColuna2[2] + "|" + vetorColuna3[2]);
			
		if ((vetorColuna3[0] == 1 && vetorColuna3[1] == 1 && vetorColuna3[2]==1)||(vetorColuna2[0] == 1 && vetorColuna2[1] == 1 && vetorColuna2[2]==1) || (vetorColuna1[0] == 1 && vetorColuna1[1] == 1 && vetorColuna1[2]==1) || (vetorColuna1[0] == 1 && vetorColuna2[1] == 1 && vetorColuna3[2]==1)|| vetorColuna1[0] == 1 && vetorColuna2[0] == 1 && vetorColuna3[0]==1 || (vetorColuna1[1] == 1 && vetorColuna2[1] == 1 && vetorColuna3[1]==1) || (vetorColuna1[2] == 1 && vetorColuna2[2] == 1 && vetorColuna3[2]==1)) {
			System.out.println ("O(a)" + jogadorNumero1 + " venceu!");
			vencedor = true;
		} else if ((vetorColuna3[0] == 2 && vetorColuna3[1] == 2 && vetorColuna3[2]==2) || (vetorColuna2[0] == 2 && vetorColuna2[1] == 2 && vetorColuna2[2]==2) || (vetorColuna1[0] == 2 && vetorColuna1[1] == 2 && vetorColuna1[2]==2) ||(vetorColuna1[0] == 2 && vetorColuna2[1] == 2 && vetorColuna3[2]==2) || (vetorColuna1[0] == 2 && vetorColuna2[0] == 2 && vetorColuna3[0]==2) || (vetorColuna1[1] == 2 && vetorColuna2[1] == 2 && vetorColuna3[1]==2) || (vetorColuna1[2] == 2 && vetorColuna2[2] == 2 && vetorColuna3[2]==2)) {
			System.out.println ("O(a)" + jogadorNumero2 + " venceu!");
			vencedor = true;
		} else {			
			vencedor = false;			
		} 
		
		
		if (rodada < 8) {
			rodada=rodada+1;
		} else {
			rodada = 9;
			}
		
		if (rodada == 9 && vencedor == false) {
			System.out.println ("Game Over! EMPATE!");
			
		}	
					
		}
	}

}
