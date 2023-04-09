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
        System.out.println("0-Sair");
    }

    public static void escolhaInstancias(int esc){
        switch (esc){
            case 1:
                FuncoesInstancias.dicionarioAleatorio();
                break;
            case 2:
                FuncoesInstancias.dicionarioAleatorio2();
                break;
        }
    }

    public static void escolha(){
        int escolhaInstancia = 0;

        String vecto[] = new String[29855];

        FuncoesInstancias.dicionarioAleatorio();

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
