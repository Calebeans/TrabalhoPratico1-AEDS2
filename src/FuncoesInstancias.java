import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FuncoesInstancias {

    public static void dicionarioAleatorio(int escolha){
        String vecto[] = new String[29855];
        long tempoTotal = 0, tempoFinal = 0;
        int comparacoes = 0;
        Path arquivo = Paths.get("C:/Users/Calebe/Documents/GitHub/TrabalhoOrdenacao/Arquivos/Instâncias-TP1/DicionarioAleatorio-29855.txt");
        int i =0;

        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha:linhas){
                vecto[i] = linha;
                i++;
                //System.out.println(linha);
            }
        }catch (Exception e){
            System.out.println("Erro");
        }

        tempoTotal = Funcoes.funcoesArquivos(escolha, vecto,comparacoes);

        System.out.println("\nOrdenado");
        for (int j = 0; j < 29855; j++){
            System.out.println(vecto[j]);
        }

        System.out.println("\nTempo: " + (tempoTotal) + " milisegundos\n" + "Comparações: " + comparacoes);
    }

    public static void dicionarioAleatorio2(){
        String vecto[] = new String[261791];
        Path arquivo = Paths.get("C:/Users/Calebe/Documents/GitHub/TrabalhoOrdenacao/Arquivos/Instâncias-TP1/DicionarioAleatorio-261791.txt");
        int i =0;

        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha:linhas){
                vecto[i] = linha;
                i++;
                //System.out.println(linha);
            }
        }catch (Exception e){
            System.out.println("Erro");
        }

        long tempoInicial1 = System.currentTimeMillis();
        FuncoesOrdenacoes.shellSort(vecto, 261791);
        long tempoFinal1 = System.currentTimeMillis();

        System.out.println("\nOrdenado");
        for (int j = 0; j < 261791; j++){
            System.out.println(vecto[j]);
        }

        System.out.println("\nTempo: " + (tempoFinal1 - tempoInicial1) + " mielisegundos\n");
    }
}
