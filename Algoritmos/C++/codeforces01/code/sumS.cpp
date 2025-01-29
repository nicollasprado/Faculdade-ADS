#include <iostream>

int main(){
    int arraySize, sumToFind, auxInt;
    std::cin >> arraySize >> sumToFind;
    int nums[arraySize];
    // Adição dos números que trabalharemos no array
    for(int i=0; i <= arraySize-1; i++){
        std::cin >> auxInt;
        nums[i] = auxInt;
    }
    bool foundS = false;
    // Verifica se alguma soma resulta em "sumToFind"
    for(int n=0; n <= arraySize-1; n++){
        for(int j=0; j <= arraySize-1; j++){
            if(nums[n] + nums[j] == sumToFind && n != j){
                foundS = true;
                break;
            }
        }
    }
    if(foundS){
        std::cout << "YES" << std::endl;
    }else{
        std::cout << "NO" << std::endl;
    }
    return 0;
}