#include <iostream>
#include <vector>



//////////////////////////////////////////////////////////////////
void insert(std::vector<int>* list, int insertion_num, int ordened_final_index){
    for(int i = 0; i < ordened_final_index; i++){
        if(list->at(i) > insertion_num){
            int aux = list->at(i);
        }
    }
}

void insertion_sort(std::vector<int>* list){
    int ordened_final_index = 0;

    for(int i = 0; i < list->size(); i++){
        a
    }
}


//////////////////////////////////////////////////////////////////
// SELECTION SORT

int get_smaller(std::vector<int>* list, int start_index){
    int smaller = list->at(start_index);
    int smaller_index = start_index;

    for(int i = start_index; i < list->size(); i++){
        if(smaller > list->at(i)){
            smaller = list->at(i);
            smaller_index = i;
        }
    }

    return smaller_index;
}

void selection_sort(std::vector<int>* list){
    int aux;

    for(int i=0; i < list->size()-1; i++){
        int smaller_index = get_smaller(list, i);

        if(smaller_index == i) continue;

        aux = list->at(i);
        list->at(i) = list->at(smaller_index);
        list->at(smaller_index) = aux;
    }
}

//////////////////////////////////////////////////////////////////




bool check_ordened(std::vector<int>* list){
    bool ans = true;
    for(int i=0; i < list->size()-1; i++){
        if(list->at(i) > list->at(i+1)){
            ans = false;
            break;
        }
    }

    return ans;
}   

int main(){
    std::vector<int> test = {1, 6, 3, 4, 0};

    selection_sort(&test);
    
    for(auto& iter : test){
        std::cout << iter << " ";
    }
    std::cout << "\n";
    
    std::cout << (check_ordened(&test) ? "Odernado" : "Não ordenado") << "\n";
    return 0;
}