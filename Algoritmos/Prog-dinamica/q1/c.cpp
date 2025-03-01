#include <iostream>
#include <vector>
#include <algorithm>


int find_troco(std::vector<int> nums, int sum, int index){
    if(sum == 0) return 0;
    if(sum < 0 || index >= (int) nums.size()) return 100000;


    int use_coin = 1 + find_troco(nums, sum - nums[index], index+1);
    int skip_coin = find_troco(nums, sum, index+1);

    return std::min(use_coin, skip_coin);
}

int troco(std::vector<int> nums, int sum){
    return find_troco(nums, sum, 0);
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
