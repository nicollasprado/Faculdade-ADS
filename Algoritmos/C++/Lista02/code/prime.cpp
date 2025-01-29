#include <iostream>

int main(){
    int qtNums;
    int qtPrimes = 0;
    std::cin >> qtNums;
    int nums[qtNums], primes[qtNums];
    for(int i=0; i < qtNums; i++){
        std::cin >> nums[i];
    }

    int primesAuxIndex = 0;
    for(int j=0; j < qtNums; j++){
        for(int z = nums[j]-1; z > 0; z = z - 1){
            if(z == 1){
                primes[primesAuxIndex] = nums[j];
                primesAuxIndex++;
                qtPrimes++;
                break;
            }else if(nums[j] % z == 0){
                break;
            }
        }
    }

    std::cout << "Primes: " << qtPrimes << " -> ";
    for(int x = 0; x < qtPrimes; x++){
        std::cout << primes[x] << ", ";
    }
    return 0;
}