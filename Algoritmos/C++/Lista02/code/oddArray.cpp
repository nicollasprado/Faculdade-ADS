#include <iostream>

int getOdds(int arr[], int arraySize){
    int qtOdds = 0;
    for(int i=0; i < arraySize; i++){
        if(arr[i] % 2 != 0){
            qtOdds++;
        }
    }
    return qtOdds;
}

int main(){
    int sizeArr;
    std::cin >> sizeArr;
    int arr[sizeArr];
    for(int i=0; i < sizeArr; i++){
        std::cin >> arr[i];
    }
    int qtOdds = getOdds(arr, sizeArr);
    std::cout << qtOdds << std::endl;
    return 0;
}