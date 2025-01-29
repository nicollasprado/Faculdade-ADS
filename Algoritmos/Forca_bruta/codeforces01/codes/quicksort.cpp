#include <iostream>

int partition(int arr[], int left, int right){
    int pivot = arr[right];
    int i = left-1;

    for(int j=left; j < right; j++){
        if(arr[j] <= pivot){
            i++;
            int aux = arr[i];
            arr[i] = arr[j];
           arr[j] = aux;
        }
        int aux = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = aux;
    }
    return i+1;
}

void quickSort(int arr[], int left, int right){
    if(left < right){
        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot+1, right);
    }
}



int main(){
    int sizeArr;
    std::cin >> sizeArr;
    int arr[sizeArr];
    for(int i=0; i < sizeArr; i++){
        std::cin >> arr[i];
    }
    quickSort(arr, 0, sizeArr-1);

    for(int j=0; j < sizeArr; j++){
        std::cout << arr[j] << " ";
    }
}
