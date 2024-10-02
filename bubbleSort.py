def bubbleSort(lista):
    n = len(lista)
    for i in range(n):
        for j in range(n - i - 1):
            if lista[j] > lista[j+1]:
                temp = lista[j]
                lista[j] = lista[j+1]
                lista[j+1] = temp
                
lista = [9,4,2,6,63,7]
bubbleSort(lista)
print(lista)