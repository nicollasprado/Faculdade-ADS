#include <iostream>
#include <vector>
#include <algorithm>


// incompleto


int backtracking_find(std::vector<std::pair<int, double>>& itens, int capacity, int total_weight, int size){
    if(total_weight > capacity) return 0;

    if(size < 0) return 0;

    int new_total_weight = itens[size].first();
    int include_item = backtracking_find(itens, capacity, total_weight, size-1);
    int exclude_item = backtracking_find(itens, capacity, total_weight, size-1);

    return std::min(include_item, exclude_item);
}


int backtracking(std::vector<std::pair<int, double>>& itens){}


int main(){
    int itens_qt, capacity;
    std::cin >> itens_qt >> capacity;

    std::vector<std::pair<int, double>> itens(itens_qt, std::pair<int, double>(0, 0));

    for(auto& item : itens){
        int weight;
        double price;
        std::cin >> weight >> price;
        item = std::pair<int, double>(weight, price);
    }

    return 0;
}
