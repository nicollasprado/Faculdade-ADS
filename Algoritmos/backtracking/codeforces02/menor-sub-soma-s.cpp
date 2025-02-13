#include <iostream>
#include <vector>

int backtracking_find(std::vector<int>& list, int index, int sum){
    if(sum == 0) return 0;

    if(index < 0 || sum < 0) return 100000;

    int include_num = 1 + backtracking_find(list, index-1, (sum - list[index - 1]));
    int exclude_num = backtracking_find(list, index-1, sum);

    return std::min(include_num, exclude_num);
}

int backtracking(std::vector<int>& list, int index, int sum){
    int min_sub = backtracking_find(list, index, sum);

    return (min_sub >= 100000) ? 0 : min_sub;
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
