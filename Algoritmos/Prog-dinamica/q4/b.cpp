#include <iostream>
#include <vector>

int backtracking_find(std::vector<int> coins, int value, int sum, int last){
    if(sum == value) return 1;
    if(sum > value) return 0;

    int counter = 0;
    for(int i=0; i < (int) coins.size(); i++){
        if(coins[i] >= last){
            counter += backtracking_find(coins, value, sum + coins[i], coins[i]);
        }
    }

    return counter;
}

int backtracking(std::vector<int> coins, int value){
    return backtracking_find(coins, value, 0, -1);
}

int main(){
    int qt_coins;
    std::cin >> qt_coins;
    std::vector<int> coins(qt_coins, 0);
    for(int& coin : coins){
        std::cin >> coin;
    }
    int value;
    std::cin >> value;
    std::cout << backtracking(coins, value) << std::endl;
    return 0;
}
