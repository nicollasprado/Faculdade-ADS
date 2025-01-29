#include <iostream>
#include <iomanip>
#include <vector>

int partition(double *a, int left, int right){
    double pivot = a[right]; // pivot vai ser o ultimo valor do array
    int i = left - 1; // i não deve começar no 0

    for(int j=left; j < right; j++){
        if(a[j] >= pivot){ // se J for menor que o pivot, soma i e inverte os valores de i e j
            i++;
            double aux = a[i];
            a[i] = a[j];
            a[j] = aux;
        }
    }

    // no final, troca o pivot com o valor de i+1 que será o maior valor do array
    double aux = a[i+1];
    a[i+1] = a[right];
    a[right] = aux;
    return i+1; // retorna o maior valor do array
}

void quickSort(double *a, int left, int right){
    if(left < right){
        int pivot = partition(a, left, right); // retornará o maior valor do array
        quickSort(a, left, pivot-1); // ordenará recursivamente a parte da esquerda do pivot
        quickSort(a, pivot+1, right); // ordenará recursivamente a parte da direita do pivot
    }
}


int main(){
    int qtTests, chosenAvg;
    std::vector<double> results;
    int qtResults = 0;
    while(std::cin >> qtTests >> chosenAvg){
        double testsRes[qtTests];
        for(int j=0; j < qtTests; j++){
            std::cin >> testsRes[j];
        }
        // testes divididos 3 em 3 -> Combinação sem repetição
        int qtSubgroups = ((qtTests * (qtTests-1)) * (qtTests-2)) / 6;
        double averages[qtSubgroups];
        int avgsIndex = 0;
        // Geração das médias
        for(int g = 0; g < qtTests; g++){
            for(int j = g+1; j < qtTests; j++){
                for(int k = j+1; k < qtTests; k++){
                    averages[avgsIndex] = (testsRes[g] + testsRes[j] + testsRes[k]) / 3.0;
                    avgsIndex++;
                }
            }
        }

        if(qtSubgroups > 1){
            quickSort(averages, 0, qtSubgroups-1); // Ordenará de forma decrescente o array das médias
        }
        results.push_back(averages[chosenAvg-1]);
        qtResults++;
    }

    // print
    for(int i=0; i < qtResults; i++){
        std::cout << std::fixed << std::setprecision(1) << results[i] << std::endl;
    }

    return 0;
}
