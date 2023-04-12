import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolhaFuncao = 0;

        do{
            Funcoes.menu();
            Scanner s = new Scanner(System.in);
            escolhaFuncao = s.nextInt();
            switch (escolhaFuncao){
                case 1:
                    Funcoes.instancias();
                    int escolhaInstancia = 0;
                    escolhaInstancia = s.nextInt();
                    Funcoes.escolhaInstancias(escolhaInstancia, escolhaFuncao);

                    break;

                case 2:
                    Funcoes.instancias();
                    int escolhaInstancia1 = 0;
                    escolhaInstancia1 = s.nextInt();
                    Funcoes.escolhaInstancias(escolhaInstancia1, escolhaFuncao);
                    break;

                case 3:
                    Funcoes.escolha();
                    break;
            }
        }while (escolhaFuncao != 0);

    }
}
