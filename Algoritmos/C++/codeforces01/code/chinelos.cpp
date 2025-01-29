#include <iostream>

int main(){
    int qtChinelos, auxInt;
    std::cin >> qtChinelos;
    int chinelosStock[qtChinelos];
    for(int i=1; i<=qtChinelos; i++){
        std::cin >> auxInt;
        chinelosStock[i] = auxInt;
    }

    int qtdOrders, auxOrderInt;
    int qtSold = 0;
    std::cin >> qtdOrders;
    for(int n=1; n <= qtdOrders; n++){
        std::cin >> auxOrderInt;
        if(chinelosStock[auxOrderInt] > 0){
            chinelosStock[auxOrderInt] -= 1;
            qtSold++; 
        }
    }
    std::cout << qtSold << std::endl;
    return 0;
}