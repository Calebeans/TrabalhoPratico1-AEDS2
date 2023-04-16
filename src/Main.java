import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolhaFuncao = 0;
        int escolhaInstancia = 0;
        Contador c = new Contador();
        String arq = "C:/Users/Calebe/Documents/GitHub/Trabalho1Ordenacao/DadosTP1/Dados.csv";
        do{
            Funcoes.menu();
            Scanner s = new Scanner(System.in);
            escolhaFuncao = s.nextInt();
            c.tempoExecucao = 0;
            c.contComparações = 0;
            c.contTrocas = 0;
            switch (escolhaFuncao){
                case 1:
                    Funcoes.instancias();
                    escolhaInstancia = s.nextInt();
                    Funcoes.escolhaInstancias(escolhaInstancia, escolhaFuncao,c);
                    System.out.println("Trocas1: " + c.contTrocas);
                    System.out.println("Comparações1: " + c.contComparações);
                    System.out.println("Tempo: " + c.tempoExecucao/1000 + " segundos");
                    break;

                case 2:
                    Funcoes.instancias();
                    escolhaInstancia = s.nextInt();
                    Funcoes.escolhaInstancias(escolhaInstancia, escolhaFuncao,c);
                    System.out.println("Trocas1: " + c.contTrocas);
                    System.out.println("Comparações1: " + c.contComparações);
                    System.out.println("Tempo: " + c.tempoExecucao/1000 + " segundos");
                    break;

                case 3:
                    Funcoes.instancias();
                    escolhaInstancia = s.nextInt();
                    Funcoes.escolhaInstancias(escolhaInstancia, escolhaFuncao,c);
                    System.out.println("Trocas1: " + c.contTrocas);
                    System.out.println("Comparações1: " + c.contComparações);
                    System.out.println("Tempo: " + c.tempoExecucao/1000 + " segundos");
                    break;
                case 4:
                    Funcoes.instancias();
                    escolhaInstancia = s.nextInt();
                    Funcoes.escolhaInstancias(escolhaInstancia, escolhaFuncao,c);
                    System.out.println("Trocas1: " + c.contTrocas);
                    System.out.println("Comparações1: " + c.contComparações);
                    System.out.println("Tempo: " + c.tempoExecucao/1000 + " segundos");
                    break;
                case 5:
                    Funcoes.instancias();
                    escolhaInstancia = s.nextInt();
                    Funcoes.escolhaInstancias(escolhaInstancia, escolhaFuncao,c);
                    System.out.println("Trocas1: " + c.contTrocas);
                    System.out.println("Comparações1: " + c.contComparações);
                    System.out.println("Tempo: " + c.tempoExecucao/1000 + " segundos");
                    break;
                case 6:
                    Funcoes.instancias();
                    escolhaInstancia = s.nextInt();
                    Funcoes.escolhaInstancias(escolhaInstancia, escolhaFuncao,c);
                    System.out.println("Trocas: " + c.contTrocas);
                    System.out.println("Comparações: " + c.contComparações);
                    System.out.println("Tempo: " + c.tempoExecucao/1000 + " segundos");
                    break;
            }

            String trocas = String.valueOf(c.contTrocas);
            String comparacoes = String.valueOf(c.contComparações);
            String tempo = String.valueOf(c.tempoExecucao);
            String conteudo = trocas+ "\r\n" + comparacoes + "\r\n" + tempo + "\r\n";

            if (write(arq, conteudo)){
                System.out.println("Arquivo Salvo com Sucesso!");
            }else {
                System.out.println("Erro ao Salvar o arquivo");
            }
        }while (escolhaFuncao != 0);

    }

    public static boolean write(String caminho, String conteudo){
        try {
            FileWriter arq = new FileWriter(caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(conteudo);
            gravarArq.close();
            return  true;
        }catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
