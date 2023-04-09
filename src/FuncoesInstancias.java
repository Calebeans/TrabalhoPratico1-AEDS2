import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FuncoesInstancias {

    public static void dicionarioAleatorio(){
        String vecto[] = new String[29855];
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

        long tempoInicial = System.currentTimeMillis();
        FuncoesOrdenacoes.bubbleSort(vecto, 29855);
        long tempoFinal = System.currentTimeMillis();

        System.out.println("\nOrdenado");
        for (int j = 0; j < 29855; j++){
            System.out.println(vecto[j]);
        }

        System.out.println("\nTempo: " + (tempoFinal - tempoInicial) + " milisegundos\n");
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
