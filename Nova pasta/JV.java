

public class JV {

	private String[][] matriz = {{"1","2","3"},
								 {"4","5","6"},
								 {"7","8","9"}};
	

	public String Mostrar() {
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				System.out.printf("   "+matriz[l][c]);
			}
			System.out.println("\n");
		}
		return null;
	}
	
	public boolean Valido(String p) {
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				if(matriz[l][c].equals(p)) {
					return true;
				}
			}
		}
		return false;
	}
	public void Jogada(String p, String j) {
		if(p.equals("1")) {
			matriz[0][0]=j;
		}else if(p.equals("2")) {
			matriz[0][1]=j;
		}else if(p.equals("3")) {
			matriz[0][2]=j;
		}else if(p.equals("4")) {
			matriz[1][0]=j;
		}else if(p.equals("5")) {
			matriz[1][1]=j;
		}else if(p.equals("6")) {
			matriz[1][2]=j;
		}else if(p.equals("7")) {
			matriz[2][0]=j;
		}else if(p.equals("8")) {
			matriz[2][1]=j;
		}else if(p.equals("9")) {
			matriz[2][2]=j;
		}
	}
	
	public String Ganhou(int jogadas) {
		String[] T = new String[8];
		String vencedor = "null";
		if(jogadas == 9) {
			vencedor = "EMPATE!";
		}
		//linhas
		T[0] = matriz[0][0]+matriz[0][1]+matriz[0][2];
		T[1] = matriz[1][0]+matriz[1][1]+matriz[1][2];
		T[2] = matriz[2][0]+matriz[2][1]+matriz[2][2];
		//colunas
		T[3] = matriz[0][0]+matriz[1][0]+matriz[2][0];
		T[4] = matriz[0][1]+matriz[1][1]+matriz[2][1];
		T[5] = matriz[0][2]+matriz[1][2]+matriz[2][2];
		//diagonais
		T[6] = matriz[0][0]+matriz[1][1]+matriz[2][2];
		T[7] = matriz[0][2]+matriz[1][1]+matriz[2][0];
		
		for(int i=0;i<T.length;i++) {
			if(T[i].equals("XXX")) {
				vencedor = "Jogador 1";
			}else if(T[i].equals("OOO")) {
				vencedor = "Jogador 2";
			}
		}
		return vencedor;
	}
				
			
			
	

		
	
}