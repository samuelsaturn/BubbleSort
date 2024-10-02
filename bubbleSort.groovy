class Main{
    static void main(String[] args){
        int[] lista = [4,1,6,2,7,83,321,21]
        bubbleSort(lista)
        println(lista)
    }

    static void bubbleSort(int[] lista){
        int n = lista.length
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(lista[j] > lista[j+1]{
                    int temp = lista[j]
                    lista[j] = lista[j+1]
                    lista[j+1] = temp
                })
            }
        }
    }
}