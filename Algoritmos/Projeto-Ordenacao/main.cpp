#include <iostream>
#include <vector>

// Esaa função ainda vai ser corrigida
bool check_ordened(std::vector<int>* list, int start_index, int final_index){
    std::cout << start_index << " " << final_index << "\n";
    if((final_index - start_index) <= 2){
        std::cout << "TESTE" << "\n";
        return (list->at(final_index) > list->at(start_index) ? true : false); 
    }

    int center = (start_index + final_index) / 2;
    bool first_half = check_ordened(list, start_index, center);
    bool second_half = check_ordened(list, center + 1, final_index);

    std::cout << list->at(start_index) << " " << list->at(center) << "\n";
    std::cout << list->at(center+1) << " " << list->at(final_index) << "\n";

    return (first_half && second_half);
}   


int main(){
    std::vector<int> test = {1, 6, 3, 4};

    std::cout << check_ordened(&test, 0, test.size()-1) << "\n";
    return 0;
}