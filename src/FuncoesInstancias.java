import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FuncoesInstancias {

    public static void dicionarioAleatorio29855(int escolhaInstancia, int escolha, Contador c){
        int tamanho = 29855;
        int vectorInt[] = new int[tamanho];
        String vecto[] = new String[tamanho];
        long tempoTotal = 0;
        Path arquivo = Paths.get("C:/Users/Calebe/Documents/GitHub/TrabalhoOrdenacao/Arquivos/Instâncias-TP1/DicionarioAleatorio-29855.txt");
        int i =0;

        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha:linhas){
                vecto[i] = linha;
                i++;
            }
        }catch (Exception e){
            System.out.println("Erro");
        }

        tempoTotal = Funcoes.funcoesArquivos(escolha, vecto, tamanho, c);

        System.out.println("\nOrdenado");
        for (int j = 0; j < tamanho; j++){
            System.out.println(vecto[j]);
        }

        c.tempoExecucao = tempoTotal;
    }

    public static void dicionarioAleatorio261791(int escolhaInstancia, int escolha, Contador c){
        int tamanho = 261791;
        int vectorInt[] = new int[tamanho];
        String vecto[] = new String[tamanho];
        long tempoTotal = 0;
        Path arquivo = Paths.get("C:/Users/Calebe/Documents/GitHub/TrabalhoOrdenacao/Arquivos/Instâncias-TP1/DicionarioAleatorio-261791.txt");
        int i =0;

        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha:linhas){
                vecto[i] = linha;
                i++;

            }
        }catch (Exception e){
            System.out.println("Erro");
        }

        tempoTotal = Funcoes.funcoesArquivos(escolha, vecto, tamanho, c);

        System.out.println("\nOrdenado");
        for (int j = 0; j < tamanho; j++){
            System.out.println(vecto[j]);
        }

        c.tempoExecucao = tempoTotal;
    }

    public static void dicionarioInversamenteOrdenado29855(int escolhaInstancia, int escolha, Contador c){
        int tamanho = 29855;
        int vectorInt[] = new int[tamanho];
        String vecto[] = new String[tamanho];
        long tempoTotal;
        Path arquivo = Paths.get("C:/Users/Calebe/Documents/GitHub/TrabalhoOrdenacao/Arquivos/Instâncias-TP1/DicionarioInversamenteOrdenado-29855.txt");
        int i =0;

        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha:linhas){
                vecto[i] = linha;
                i++;

            }
        }catch (Exception e){
            System.out.println("Erro");
        }

        tempoTotal = Funcoes.funcoesArquivos(escolha, vecto, tamanho, c);

        System.out.println("\nOrdenado");
        for (int j = 0; j < tamanho; j++){
            System.out.println(vecto[j]);
        }

        c.tempoExecucao = tempoTotal;
    }

    public static void dicionarioInversamenteOrdenado261791(int escolhaInstancia, int escolha, Contador c){
        int tamanho = 261791;
        int vectorInt[] = new int[tamanho];
        String vecto[] = new String[tamanho];
        long tempoTotal = 0;
        Path arquivo = Paths.get("C:/Users/Calebe/Documents/GitHub/TrabalhoOrdenacao/Arquivos/Instâncias-TP1/DicionarioInversamenteOrdenado-261791.txt");
        int i =0;

        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha:linhas){
                vecto[i] = linha;
                i++;

            }
        }catch (Exception e){
            System.out.println("Erro");
            System.out.println("Teste");
        }

        tempoTotal = Funcoes.funcoesArquivos(escolha, vecto, tamanho, c);

        System.out.println("\nOrdenado");
        for (int j = 0; j < tamanho; j++){
            System.out.println(vecto[j]);
        }

        c.tempoExecucao = tempoTotal;
    }

    public static void dicionarioOrdenado29855(int escolhaInstancia, int escolha, Contador c){
        int tamanho = 29855;
        int vectorInt[] = new int[tamanho];
        String vecto[] = new String[tamanho];
        long tempoTotal = 0;
        Path arquivo = Paths.get("C:/Users/Calebe/Documents/GitHub/TrabalhoOrdenacao/Arquivos/Instâncias-TP1/DicionarioOrdenado-29855.txt");
        int i =0;

        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha:linhas){
                vecto[i] = linha;
                i++;

            }
        }catch (Exception e){
            System.out.println("Erro");
            System.out.println("Teste");
        }

        tempoTotal = Funcoes.funcoesArquivos(escolha, vecto, tamanho, c);

        System.out.println("\nOrdenado");
        for (int j = 0; j < tamanho; j++){
            System.out.println(vecto[j]);
        }

        c.tempoExecucao = tempoTotal;
    }

    public static void dicionarioOrdenado261791(int escolhaInstancia, int escolha, Contador c){
        int tamanho = 261791;
        int vectorInt[] = new int[tamanho];
        String vecto[] = new String[tamanho];
        long tempoTotal = 0;
        Path arquivo = Paths.get("C:/Users/Calebe/Documents/GitHub/TrabalhoOrdenacao/Arquivos/Instâncias-TP1/DicionarioOrdenado-261791.txt");
        int i =0;

        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha:linhas){
                vecto[i] = linha;
                i++;

            }
        }catch (Exception e){
            System.out.println("Erro");
            System.out.println("Teste");
        }

        tempoTotal = Funcoes.funcoesArquivos(escolha, vecto, tamanho, c);

        System.out.println("\nOrdenado");
        for (int j = 0; j < tamanho; j++){
            System.out.println(vecto[j]);
        }

        c.tempoExecucao = tempoTotal;
    }

    public static void listaAleatoria1000(int escolhaInstancia, int escolha, Contador c){
        int tamanho = 1000;
        String vecto[] = new String[tamanho];
        int vectorInt[] = new int[tamanho];
        long tempoTotal = 0;
        Path arquivo = Paths.get("C:/Users/Calebe/Documents/GitHub/TrabalhoOrdenacao/Arquivos/Instâncias-TP1/ListaAleatoria-1000.txt");
        int i =0;

        try {
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha : linhas) {
                vecto[i++] = linha;
            }
        }catch (Exception e){
            System.out.println("Erro");
        }

        tempoTotal = Funcoes.funcoesArquivos(escolha, vecto, tamanho, c);

        System.out.println("\nOrdenado");
        for (int j = 0; j < tamanho; j++){
                System.out.println(vecto[j]);
        }

        c.tempoExecucao = tempoTotal;
    }


}
