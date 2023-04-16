import java.util.Scanner;

class Contador{
    long contTrocas;
    long contComparações;
    long tempoExecucao;
}
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

    public static void escolhaInstancias(int escolhaInstancia, int escolhaFuncao, Contador c){
        switch (escolhaInstancia){
            case 1:
                FuncoesInstancias.dicionarioAleatorio29855(escolhaInstancia, escolhaFuncao, c);
                break;
            case 2:
                FuncoesInstancias.dicionarioAleatorio261791(escolhaInstancia, escolhaFuncao, c);
                break;
            case 3:
                FuncoesInstancias.dicionarioInversamenteOrdenado29855(escolhaInstancia, escolhaFuncao, c);
                break;
            case 4:
                FuncoesInstancias.dicionarioInversamenteOrdenado261791(escolhaInstancia, escolhaFuncao, c);
                break;
            case 5:
                FuncoesInstancias.dicionarioOrdenado261791(escolhaInstancia, escolhaFuncao, c);
                break;
            case 6:
                FuncoesInstancias.dicionarioOrdenado29855(escolhaInstancia, escolhaFuncao, c);
                break;
            case 7:
                FuncoesInstancias.listaAleatoria1000(escolhaInstancia, escolhaFuncao, c);
                break;
        }
    }

    public static long funcoesArquivos(int escolha, String[] vecto, int tamanho, Contador c){
        long tempoTotal = 0;
        long tempoInicial = 0;
        long tempoFinal = 0;
        int i = 0;
        String vectoAux[] = new String[tamanho];
        c.contTrocas = 0;
        c.contComparações = 0;
        int aux = 0;
        switch (escolha){
            case 1:
                tempoInicial = System.currentTimeMillis();
                FuncoesOrdenacoes.bubbleSort(vecto, tamanho, c);
                tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                break;

            case 2:
                tempoInicial = System.currentTimeMillis();
                FuncoesOrdenacoes.shellSort(vecto, tamanho, c);
                tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                break;

            case 3:
                tempoInicial = System.currentTimeMillis();
                FuncoesOrdenacoes.selectionSort(vecto, tamanho, c);
                tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                break;

            case 4:
                tempoInicial = System.currentTimeMillis();
                FuncoesOrdenacoes.insertionSort(vecto, tamanho, c);
                tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                break;
            case 5:
                tempoInicial = System.currentTimeMillis();
                FuncoesOrdenacoes.quickSort(vecto, 0, tamanho-1, c);
                tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                break;
            case 6:
                tempoInicial = System.currentTimeMillis();
                FuncoesOrdenacoes.mergeSort(vecto, vectoAux, 0, tamanho-1, c);
                tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                break;
        }

        return tempoTotal;
    }

}
