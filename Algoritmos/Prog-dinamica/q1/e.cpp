#include <iostream>
#include <vector>
#include <algorithm>
#include <cstring>

int table[50][50];

int find_change(std::vector<int> nums, int sum, int index){
    if(sum == 0) return 0;
    if(sum < 0 || index >= (int) nums.size()) return 100000;


    if(table[sum][index] != -1) return table[sum][index];


    int use_coin = 1 + find_change(nums, sum - nums[index], index+1);
    int skip_coin = find_change(nums, sum, index+1);

    return table[sum][index] = std::min(use_coin, skip_coin);
}

int troco(std::vector<int> nums, int sum){
    memset(table, -1, sizeof(table));

    std::vector<int> x;
    return find_change(nums, sum, 0);
}


int main(){
    std::vector<int> nums;
    int aux;
    while(std::cin >> aux && aux != -1){
        nums.push_back(aux);
    }

    int sum;
    std::cin >> sum;

    std::cout << troco(nums, sum);
    return 0;
}
