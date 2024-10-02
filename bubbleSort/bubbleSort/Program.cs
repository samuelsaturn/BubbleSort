namespace bubbleSort
{
    class Program {
        static void Main(string[] args) {
            int[] lista  = {7,3,4,1,65,22,8};
            bubbleSort(lista);
            Array.ForEach(lista, Console.WriteLine);
        }

        static void bubbleSort(int[] lista){
            int n = lista.Length;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n - i - 1; j++){
                    if(lista[j] > lista[j+1]){
                        int temp = lista[j];
                        lista[j] = lista[j+1];
                        lista[j+1] =  temp;
                    }
                }
            }
        }
    }
}