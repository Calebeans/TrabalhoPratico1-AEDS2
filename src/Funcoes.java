import java.util.Scanner;
public class Funcoes {

    public static void menu(){
        System.out.println("Escolha os metodos:");
        System.out.println("1-Bubble Sort");
        System.out.println("2-Shell Sort");
        System.out.println("3-Selecion Sort");
        System.out.println("4-Insertion Sort");
        System.out.println("5-Quick Sort");
        System.out.println("6-Merge Sort");
        System.out.println("0-Sair");
    }

    public static void instancias(){
        System.out.println("Escolha a instancia");
        System.out.println("1-DicionarioAleatorio-29855.txt");
        System.out.println("2-DicionarioAleatorio-261791.txt");
        System.out.println("3-DicionarioInversamenteOrdenado-261791.txt");
        System.out.println("4-DicionarioInversamenteOrdenado-29855.txt");
        System.out.println("5-DicionarioOrdenado-261791.txt");
        System.out.println("6-DicionarioOrdenado-29855.txt");
        System.out.println("7-ListaAleatoria-1000.txt");
        System.out.println("8-ListaAleatoria-10000.txt");
        System.out.println("9-ListaAleatoria-100000.txt");
        System.out.println("10-ListaAleatoria-1000000.txt");
        System.out.println("11-ListaInversamenteOrdenada-1000.txt");
        System.out.println("12-ListaInversamenteOrdenada-10000.txt");
        System.out.println("13-ListaInversamenteOrdenada-100000.txt");
        System.out.println("14-ListaInversamenteOrdenada-1000000.txt");
        System.out.println("15-ListaOrdenada-1000.txt");
        System.out.println("16-ListaOrdenada-10000.txt");
        System.out.println("17-ListaOrdenada-100000.txt");
        System.out.println("18-ListaOrdenada-1000000.txt");
        System.out.println("19-ListaQuaseOrdenada-1000.txt");
        System.out.println("20-ListaQuaseOrdenada-10000.txt");
        System.out.println("21-ListaQuaseOrdenada-100000.txt");
        System.out.println("22-ListaQuaseOrdenada-1000000.txt");
        System.out.println("0-Sair");
    }

    public static void escolhaInstancias(int escolhaInstancia, int escolhaFuncao){
        switch (escolhaInstancia){
            case 1:
                FuncoesInstancias.dicionarioAleatorio(escolhaFuncao);
                break;
            case 2:
                FuncoesInstancias.dicionarioAleatorio2();
                break;
        }
    }

    public static long funcoesArquivos(int escolha, String[] vecto, int comparacoes){
        long tempoTotal = 0;
        int aux;
        switch (escolha){
            case 1:
                long tempoInicial = System.currentTimeMillis();
                aux = FuncoesOrdenacoes.bubbleSort(vecto, 29855);
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                break;
        }

        return tempoTotal;
    }


    public static void escolha(){
        int escolhaInstancia = 0;

        String vecto[] = new String[29855];

        //FuncoesInstancias.dicionarioAleatorio();

            Funcoes.instancias();
            Scanner s = new Scanner(System.in);
            escolhaInstancia = s.nextInt();
            switch (escolhaInstancia){
                case 1:

                    break;

                case 2:
                    long tempoInicial1 = System.currentTimeMillis();
                    FuncoesOrdenacoes.shellSort(vecto, 29855);
                    long tempoFinal1 = System.currentTimeMillis();

                    System.out.println("Ordenado\n");
                    for (int k = 0; k < 29855; k++){
                        System.out.println(vecto[k]);
                    }

                    System.out.println("\nTempo: " + (tempoFinal1 - tempoInicial1)/1000 + " segundos\n");
                    break;

                case 3:
                    long tempoInicial2 = System.currentTimeMillis();
                    FuncoesOrdenacoes.selectionSort(vecto, 29855);
                    long tempoFinal2 = System.currentTimeMillis();

                    System.out.println("Ordenado\n");
                    for (int k = 0; k < 29855; k++){
                        System.out.println(vecto[k]);
                    }

                    System.out.println("\nTempo: " + (tempoFinal2 - tempoInicial2)/1000 + " segundos\n");
                    break;
            }


    }

}
