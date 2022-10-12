import java.util.Scanner;

public class JogoDaVelha {
    private static final String[][] Campo = null;

    public static void main(String[] args){
    //jogo da velha nada mais é que uma matriz de campos
    Campo[][] velha=new Campo[3][3];
    char simboloAtual='X'; //Sempre guarda o simbolo atual ou o 'X' ou o 'O'
    Boolean game=true;
    String vitoria= "";
    Scanner scan = new Scanner(System.in);
   
   
    //funções para criação do jogo 
    iniciarJogo(velha);
        while(game){
            desenhaJogo(velha);
            vitoria=verificaVitoria(velha);
            if(!vitoria.equals(" ")){
                System.out.printf("Jogador %s venceu%n",vitoria);
                break;
            }
            try{
                if(verificarJogada(velha,jogar(scan,simboloAtual),simboloAtual)){
                    if(simboloAtual=='X'){
                        simboloAtual='O';
                    }else{
                        simboloAtual='X';
                    }
                }
            }catch(Exception e){
                System.out.printf("Erro");
            }
        }
        System.out.printf("Fim do jogo");
    }

    public static Boolean verificaJogada(Campo[][] velha, int[] jogar, char simboloAtual) {
        return false;
    }

    public static void desenhaJogo(Campo[][] velha) {
    //função para desenhar o jogo da velha e a cada jogada desenha o jogo da velha com a jogada atual

        System.out.println("  0   1   2\n");
        System.out.printf("0  %c | %c | %c %n",velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
        System.out.println("   -----------");
        System.out.printf("1  %c | %c | %c %n",velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
        System.out.println("   -----------");
        System.out.printf("2  %c | %c | %c %n",velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());
    }

    public static void limpaTela(){
        for(int cont = 0; cont<200;cont++){
            System.out.println("");
        }
    }

    
    public static Boolean verificarJogada(Campo[][] velha,int p[],char simboloAtual){
        if(velha[p[0]][p[1]].getSimbolo()==' '){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    }

    public static int[] jogar(Scanner scan, char sa){
        int p[] = new int[2];
        System.out.printf("%s %c%n","Quem joga: ",sa);
        System.out.print("Informa a linha: ");
        p[0]=scan.nextInt();
        System.out.print("Informa a coluna: ");
        p[1]=scan.nextInt();
        return p;

    }

    public static void iniciarJogo(Campo[][] velha){
        for(int l=0;l<3;l++){
            for(int c=0;c<3;c++){
                velha[l][c]=new Campo();
            }
        }
    }

    public static String verificaVitoria(Campo[][] velha){

        for(int l=0;l<3;l++){
            if((velha[l][0]==velha[l][1])&&(velha[l][1]==velha[l][2])){
                return Campo[l][0];
            }
        }


        for(int c=0;c<3;c++){
            if((velha[0][c]==velha[1][c])&&(velha[1][c]==velha[2][c])){
                return Campo[0][c];
            }
        }

        if((velha[0][0]==velha[1][1])&&(velha[1][1]==velha[2][2])){
            return Campo[0][0];
        }
        if((velha[0][2]==velha[1][1])&&(velha[1][1]==velha[2][0])){
            return Campo[0][2];
        }
        return " ";

    }
}
