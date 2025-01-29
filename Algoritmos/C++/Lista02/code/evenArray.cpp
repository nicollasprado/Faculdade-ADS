#include <iostream>

void conta_pares(int nums[], int qtNums, int pares[], int& qtd_pares) {
    for (int i = 0; i < qtNums; ++i) {
        if (nums[i] % 2 == 0) {
            pares[qtd_pares] = nums[i];
            qtd_pares = qtd_pares + 1;
        }
    }
}

int main() {
    int qtNums, qtd_pares = 0;
    std::cin >> qtNums;
    int nums[qtNums], pares[qtNums];
    for (int i = 0; i < qtNums; ++i) {
        std::cin >> nums[i];
    }
    conta_pares(nums, qtNums, pares, qtd_pares);
    std::cout << qtd_pares << std::endl;
    if (qtd_pares > 0){
        std::cout << pares[0];
        for (int i = 1; i < qtd_pares; ++i) {
            std::cout << " " << pares[i];
        }
    }
    return 0;
}