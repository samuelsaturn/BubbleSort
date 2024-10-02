import java.util.Arrays;

public class bubbleSort{
    public static void main(String[] args){
        int[] lista = {9,5,4,1,2,82,12};
        bubbleSort(lista);
        System.out.println(Arrays.toString(lista));
    }

    public static void bubbleSort(int[] lista){
        int n = lista.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(lista[j] > lista[j+1]){
                    int temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                }
            }
        }
    }
}

// A diferença entre o Java e as outras liguagens é que não tem como imprimir o objeto de array diretamente e esperar uma saída desejada, tem várias maneiras de se fazer, tem como fazer um loop pra cada item no array, guardar e imprimir ou com a bilioteca que usei de arrays.