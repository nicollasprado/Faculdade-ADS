#include <iostream>

void splitPositivesNegatives(int qtNums, int nums[], int positives[], int negatives[], int& qtPositives, int& qtNegatives){
    int positivesIndex = 0;
    int negativesIndex = 0;
    for(int i=0; i < qtNums; i++){
        if(nums[i] < 0){
            negatives[negativesIndex] = nums[i];
            negativesIndex++;
            qtNegatives++;
        }else{
            positives[positivesIndex] = nums[i];
            positivesIndex++;
            qtPositives++;
        }
    }
}

int main(){
    int qtNumbers, qtPositives, qtNegatives;
    std::cin >> qtNumbers;
    int nums[qtNumbers], positives[qtNumbers], negatives[qtNumbers];
    for(int i=0; i < qtNumbers; i++){
        std::cin >> nums[i];
    }
    splitPositivesNegatives(qtNumbers, nums, positives, negatives, qtPositives, qtNegatives);

    std::cout << "Positivos " << qtPositives << " - ";
    for(int j=0; j < qtPositives; j++){
        std::cout << positives[j] << ", ";
    }
    std::cout << std::endl << "Negativos " << qtNegatives << " - ";
    for(int z=0; z < qtNegatives; z++){
        std::cout << negatives[z] << ", ";
    }
    return 0;
}