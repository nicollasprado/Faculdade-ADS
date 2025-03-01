#include <iostream>
#include <vector>


int min_change(std::vector<int> coins, int sum){
    std::vector<int> vals(sum+1, 10000);
    vals[0] = 0;

    for(int i = 1; i <= sum; i++){
        for(int coin : coins){
            if(i >= coin && vals[i - coin] != 10000){
                vals[i] = std::min(vals[i], vals[i - coin] + 1);
            }
        }
    }

    return (vals[sum] == 10000 ? -1 : vals[sum]);
}


int main(){
    std::vector<int> coins;
    int aux;
    while(std::cin >> aux && aux != -1){
        coins.push_back(aux);
    }

    int sum;
    std::cin >> sum;

    std::cout << min_change(coins, sum);
    return 0;
}
