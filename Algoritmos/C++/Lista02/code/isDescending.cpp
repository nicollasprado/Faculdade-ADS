#include <iostream>

bool isDescending(int arr[], int qtNumbers){
    bool descending = true;
    for(int j=0; j < qtNumbers-1; j++){
        if(arr[j+1] > arr[j]){
            descending = false;
            break;
        }
    }
    return descending;
}

int main(){
    int arraySize;
    std::cin >> arraySize;
    int array[arraySize];
    for(int i=0; i < arraySize; i++){
        std::cin >> array[i];
    }
    std::cout << isDescending(array, arraySize) << std::endl;
    return 0;
}