function bubbleSort(lista) {
    let n = lista.length
    for(let i = 0; i < n; i++){
        for(let j = 0; j < n - i - 1; j++){
            if(lista[j] > lista[j+1]){
                let temp = lista[j]
                lista[j] = lista[j+1]
                lista[j+1] = temp
            }
        }
    }
}

let lista = [2,5,1,3,23,4,87,17]
bubbleSort(lista)
console.log(lista)