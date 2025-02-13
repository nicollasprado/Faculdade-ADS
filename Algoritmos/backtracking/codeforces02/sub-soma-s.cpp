#include <iostream>
#include <vector>

bool backtracking(std::vector<int>& list, int index, int sum){
    bool ans;

    if(sum == 0) return true;

    if(index < 0 || sum < 0) return false;

    ans = backtracking(list, index-1, (sum - list[index - 1]));
    ans = ans || backtracking(list, index-1, sum);

    return ans;
}

int main(){
    int size, find;
    std::cin >> size >> find;

    std::vector<int> list(size, 0);

    for(auto& num : list){
        std::cin >> num;
    }

    std::cout << backtracking(list, size, find) << std::endl;
    return 0;
}
