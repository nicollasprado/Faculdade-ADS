#include <iostream>
#include <vector>
#include <algorithm>


struct ans {
    std::vector<int> vals;
    int total = 0;
};


ans greedy(std::vector<int> nums, int sum){
    ans result;

    std::sort(nums.rbegin(), nums.rend());

    for(int i = 0; i < (int) nums.size(); i++){
        if(result.total >= sum) break;

        if(result.total + nums[i] <= sum){
            result.vals.push_back(nums[i]);
            result.total += nums[i];
        }
    }

    return result;
}

int main(){
    std::vector<int> nums = {1, 2, 5, 10, 20, 50, 100, 200, 500};
    int sum = 7;
    ans result = greedy(nums, sum);

    for(auto& num : result.vals){
        std::cout << num << " ";
    }

    return 0;
}
