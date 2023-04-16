public class FuncoesOrdenacoes {
    public static void bubbleSort(String lista[], int tam, Contador c) {
        int troca;
        long contComp = 0, contTroca = 0;
            String aux;

            for (int i = 0; i < tam - 1; i++) {
                troca = 0;
                for (int j = 1; j < tam - i; j++) {
                    if (lista[j].compareTo(lista[j-1]) < 0) {
                        aux = lista[j];
                        lista[j] = lista[j-1];
                        lista[j-1] = aux;
                        troca = 1;
                        contTroca++;
                    }
                    contComp++;
                }
                if (troca == 0){
                    break;
                }
            }
        c.contTrocas = contTroca;
        c.contComparações = contComp;
    }

    public static void bubbleSortInt(int lista[], int tam, Contador c) {
        int troca;
        long contComp = 0, contTroca = 0;
        int aux;

        for (int i = 0; i < tam - 1; i++) {
            troca = 0;
            for (int j = 1; j < tam - i; j++) {
                if (lista[j] < (lista[j-1])) {
                    aux = lista[j];
                    lista[j] = lista[j-1];
                    lista[j-1] = aux;
                    troca = 1;
                    contTroca++;
                }
                contComp++;
            }
            if (troca == 0){
                break;
            }
        }
        c.contTrocas = contTroca;
        c.contComparações = contComp;
    }

    public static void shellSort(String v[], int n, Contador c){
        int h, i, j;
        long contComp = 0, contTroca = 0;
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
                    contTroca++;
                    contComp += 2;
                }

                v[j] = x;
            }
        }

        c.contTrocas = contTroca;
        c.contComparações = contComp;
    }

    public static void shellSortInt(int v[], int n, Contador c){
        int h, i, j;
        long contComp = 0, contTroca = 0;
        int x;

        for (h = 1; h < n; h = 3*h+1);

        while (h>1){
            h = h/3;
            for (i = h; i < n; i++) {
                x = v[i];
                j = i;
                while (j>=h && v[j-h] > x ) {
                    v[j] = v[j-h];
                    j = j - h;
                    contTroca++;
                    contComp += 2;
                }

                v[j] = x;
            }
        }

        c.contTrocas = contTroca;
        c.contComparações = contComp;
    }

    public static void selectionSort(String lista[], int n , Contador c) {
        int min;
        String aux;
        long contComp = 0, contTroca = 0;

        for (int i = 0; i <n-1; i++){
            min = i;
            for (int j=i+1; j<n; j++){
                contComp++;
                if (lista[j].compareTo(lista[min]) < 0){
                    min = j;
                }
            }
            contTroca++;
            aux =lista[i];
            lista[i] = lista[min];
            lista[min] = aux;
        }

        c.contTrocas = contTroca;
        c.contComparações = contComp;
    }

    public static void selectionSortInt(int lista[], int n , Contador c) {
        int min;
        int aux;
        long contComp = 0, contTroca = 0;

        for (int i = 0; i <n-1; i++){
            min = i;
            for (int j=i+1; j<n; j++){
                contComp++;
                if (lista[j] < lista[min]){
                    min = j;
                }
            }
            contTroca++;
            aux =lista[i];
            lista[i] = lista[min];
            lista[min] = aux;
        }

        c.contTrocas = contTroca;
        c.contComparações = contComp;
    }

    public static void insertionSort(String lista[], int n, Contador c){
        String chave;
        int j;
        long contTroca = 0, contComp = 0;

        for (int i = 1; i < n; i++){
            chave = lista[i];
            j = i-1;
            contComp++;
            while (j >= 0 && lista[j].compareTo(chave) > 0){
                lista[j+1] = lista[j];
                j--;

                contComp++;
                contTroca++;
            }
            lista[j+1] = chave;
        }

        c.contTrocas = contTroca;
        c.contComparações = contComp;
    }

    public static void insertionSortInt(int lista[], int n, Contador c){
        int chave;
        int j;
        long contTroca = 0, contComp = 0;

        for (int i = 1; i < n; i++){
            chave = lista[i];
            j = i-1;
            contComp++;
            while (j >= 0 && lista[j] > chave){
                lista[j+1] = lista[j];
                j--;

                contComp++;
                contTroca++;
            }
            lista[j+1] = chave;
        }

        c.contTrocas = contTroca;
        c.contComparações = contComp;
    }

    public static void quickSort(String[] lista, int esquerda, int direita, Contador c){
        int i = esquerda, j = direita, central = (esquerda + direita)/2;
        String pivo, tmp;
        pivo = lista[central];
        long contTroca = 0, contComp = 0;

        while (i <= j) {
            contComp++;
            while (lista[i].compareTo(pivo) < 0){
                i++;
                contComp++;
            }
            while (lista[j].compareTo(pivo) > 0){
                contComp++;
                j--;
            }
            contComp++;
            if (i <= j){
                contTroca++;
                tmp = lista[i];
                lista[i] = lista[j];
                lista[j] = tmp;
                i++;
                j--;
            }
        }


        if (esquerda < j){
            quickSort(lista, esquerda, j, c);
        }
        if (i < direita){
            quickSort(lista, i, direita, c);
        }

        c.contTrocas = contTroca;
        c.contComparações = contComp;
    }

    public static void quickSortInt(int[] lista, int esquerda, int direita, Contador c){
        int i = esquerda, j = direita, central = (esquerda + direita)/2;
        int pivo, tmp;
        pivo = lista[central];
        long contTroca = 0, contComp = 0;

        while (i <= j) {
            contComp++;
            while (lista[i] < pivo){
                i++;
                contComp++;
            }
            while (lista[j] > pivo){
                contComp++;
                j--;
            }
            contComp++;
            if (i <= j){
                contTroca++;
                tmp = lista[i];
                lista[i] = lista[j];
                lista[j] = tmp;
                i++;
                j--;
            }
        }


        if (esquerda < j){
            quickSortInt(lista, esquerda, j, c);
        }
        if (i < direita){
            quickSortInt(lista, i, direita, c);
        }

        c.contTrocas = contTroca;
        c.contComparações = contComp;
    }

    public static void mergeSort(String[] lista, String[] listaAux, int inicio, int fim, Contador c){
            int meio;
            if (inicio < fim) {
                meio = (inicio + fim) / 2;
                mergeSort(lista, listaAux, inicio, meio, c);
                mergeSort(lista, listaAux, meio + 1, fim, c);
                intercala(lista, listaAux, inicio, meio, fim, c);

            }
    }

    private static void intercala(String[] lista, String[] listaAux, int inicio, int meio, int fim, Contador c){
        int i,j;

        for (i=inicio; i<=fim; i++){
            listaAux[i] = lista[i];
        }
        i = inicio;
        j = meio + 1;


        c.contComparações++;
        for (int k = inicio; k <=fim; k++){
            c.contComparações++;
            if (i > meio){
                lista[k] = listaAux[j++];
                c.contTrocas++;
            }
            else{
                c.contComparações++;
                if (j > fim){
                    lista[k] = listaAux[i++];
                    c.contTrocas++;
                }
                else if (listaAux[i].compareTo(listaAux[j]) < 0){
                    lista[k] = listaAux[i++];
                    c.contTrocas++;
                }
                else{
                    lista[k] = listaAux[j++];
                    c.contTrocas++;
                }
            }
            c.contComparações++;
        }
    }

    public static void mergeSortInt(int[] lista, int[] listaAux, int inicio, int fim, Contador c){
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeSortInt(lista, listaAux, inicio, meio, c);
            mergeSortInt(lista, listaAux, meio + 1, fim, c);
            intercalaInt(lista, listaAux, inicio, meio, fim, c);

        }
    }

    private static void intercalaInt(int[] lista, int[] listaAux, int inicio, int meio, int fim, Contador c){
        int i,j;

        for (i=inicio; i<=fim; i++){
            listaAux[i] = lista[i];
        }
        i = inicio;
        j = meio + 1;


        c.contComparações++;
        for (int k = inicio; k <=fim; k++){
            c.contComparações++;
            if (i > meio){
                lista[k] = listaAux[j++];
                c.contTrocas++;
            }
            else{
                c.contComparações++;
                if (j > fim){
                    lista[k] = listaAux[i++];
                    c.contTrocas++;
                }
                else if (listaAux[i] < listaAux[j]){
                    lista[k] = listaAux[i++];
                    c.contTrocas++;
                }
                else{
                    lista[k] = listaAux[j++];
                    c.contTrocas++;
                }
            }
            c.contComparações++;
        }
    }
}
