public class FuncoesOrdenacoes {
    public static void bubbleSort(String lista[], int tam) {
        String aux;
        int troca;
        int cont = 0;
        for (int i = 0; i < tam - 1; i++) {
            troca = 0;
            for (int j = 1; j < tam - i; j++) {
                if (lista[j].compareTo(lista[j-1]) < 0) {
                    aux = lista[j];
                    lista[j] = lista[j-1];
                    lista[j-1] = aux;
                    troca = 1;
                    cont ++;
                }
            }
            if (troca == 0){
                break;
            }
        }
        System.out.println("Trocas: " + cont + "\n");
    }

    public static void shellSort(String v[], int n){
        int h, i, j;
        String x;

        for (h = 1; h < n; h = 3*h+1);

        while (h>1){
            h = h/3;
            for (i = h; i < n; i++) {
                x = v[i];
                j = i;
                while (j>=h && v[j-h].compareTo(x) > 0) {
                    v[j] = v[j-h];
                    j = j - h;
                }
                v[j] = x;
            }
        }
    }

    public static void selectionSort(String lista[], int n) {
        int min;
        String aux;

        for (int i = 0; i <n-1; i++){
            min = i;
            for (int j=i+1; j<n; j++){
                if (lista[j].compareTo(lista[min]) < 0){
                    min = j;
                }
            }
            aux =lista[i];
            lista[i] = lista[min];
            lista[min] = aux;
        }
    }

    public static void insertionSort(String lista[], int n){
        String chave;
        int j;

        for (int i = 1; i < n; i++){
            chave = lista[i];
            j = i-1;
            while (j >= 0 && lista[j].compareTo(chave) > 0){
                lista[j+1] = lista[j];
                j--;
            }
            lista[j+1] = chave;
        }
    }
}
