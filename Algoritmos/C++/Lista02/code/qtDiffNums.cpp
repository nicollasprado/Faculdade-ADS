#include <iostream>

// NÃO FINALIZADO

int main(){
    int arraySize;
    std::cin >> arraySize;
    int arr[arraySize];
    for(int i=0; i < arraySize; i++){
        std::cin >> arr[i];
    }

    int qtDiffNums = 0;
    int secondNumAuxIndex = 1;
    for(int j=0; j < arraySize; j++){
        if(j == arraySize-1){
            for(int x=j-1; x >= 0; x = x - 1){
                if(x == 0 and arr[j] != arr[x]){
                    std::cout << arr[j] << " j-x " << arr[x] << std::endl; 
                    qtDiffNums++;
                }else if(arr[j] == arr[x]){
                    break;
                }
            }
        }else{
            for(int p=secondNumAuxIndex; p < arraySize; p++){
                if(p == arraySize-1 and arr[j] != arr[p]){
                    std::cout << arr[j] << " j-p " << arr[p] << std::endl; 
                    qtDiffNums++;
                }else if(arr[j] == arr[p]){
                    break;
                }
            }
        }
        secondNumAuxIndex++;
    }

    std::cout << qtDiffNums << std::endl;
    return 0;
}