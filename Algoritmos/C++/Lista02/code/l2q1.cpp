#include <iostream>

int indice_menorArr(int a[], unsigned int n){
    int auxIndex = 0;
    int index = 0;
    int minor = a[0];
    for(int i=1; i < n; i++){
        auxIndex++;
        if(minor > a[i]){
            minor = a[i];
            index = auxIndex;
        }
    }
    return index;
}

int indice_maiorArr(int a[], unsigned int n){
    int auxIndex = 0;
    int index = 0;
    int highest = a[0];
    for(int i = 1; i < n; i++){
        auxIndex++;
        if(a[i] > highest){
            highest = a[i];
            index = auxIndex;
        }
    }
    return index;
}

int maior_array(int a[], unsigned int n) {
    int resultado = a[0];
    for (unsigned int i = 1; i < n; ++i) {
        if (a[i] > resultado) {
        resultado = a[i];
        }
    }
    return resultado;
}

int main() {
    unsigned int n;
    std::cin >> n;
    int a[n];
    for (unsigned int i = 0; i < n; ++i) {
        std::cin >> a[i];
    }
    int maior = maior_array(a, n);
    int indexMaior = indice_maiorArr(a, n);
    int indexMenor = indice_menorArr(a, n);
    std::cout << "-" << std::endl << maior << std::endl << indexMaior << std::endl << indexMenor << std::endl;
    return 0;
}