#include <iostream>

int main(){
    int qtNumbers;
    std::cin >> qtNumbers;
    int nums[qtNumbers];
    for(int i=0; i < qtNumbers; i++){
        std::cin >> nums[i];
    }

    int highestSum = nums[0] + nums[1];
    int firstSumNumberIndex = 0;
    for(int j=1; j < qtNumbers; j += 1){
        if((nums[j] + nums[j+1]) > highestSum){
            highestSum = nums[j] + nums[j+1];
            firstSumNumberIndex = j;
        }
    }

    std::cout << "Highest Consecutive Sum = " << highestSum << " The numbers are in the following indexes: " << firstSumNumberIndex << " + " << firstSumNumberIndex+1 << std::endl;
    return 0;
}