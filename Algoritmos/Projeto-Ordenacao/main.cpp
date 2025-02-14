#include <iostream>
#include <vector>


//////////////////////////////////////////////////////////////////
// MERGE SORT

void merge(std::vector<int>& list, int start_l1, int end_l1, int start_l2, int end_l2){
    // espaço temporário para guardar a parte da lista ordenada
    int* temp= new int[((end_l1 - start_l1) + (end_l2 - start_l2) + 2)];
    int i = start_l1;   // i é usado pra somar qnts vezes a partição 1 foi iterada
    int j = start_l2;   // j é usado pra somar qnts vezes a partição 2 foi iterada
    int temp_index = 0; // index da lista temporária

    // O loop continua ate uma das listas serem completamente iteradas
    while(i <= end_l1 && j <= end_l2){
        // O menor item das duas partições é colocado na lista temporária
        if(list[i] < list[j]){
            temp[temp_index++] = list[i++];
        }else{
            temp[temp_index++]= list[j++];
        }
    }

    // Aqui apenas um dos dois whiles será utilizado, já que, no while acima uma das listas
    // foi iterada completamente
    // Esses whiles servem para colocar os itens que sobraram
    while(i <= end_l1){
        temp[temp_index++] = list[i++];
    }

    while(j <= end_l2){
        temp[temp_index++] = list[j++];
    }

    // passa a lista temporária para a lista original
    for(i = start_l1, j = 0; i <= end_l2; i++, j++){
        list[i] = temp[j];
    }

    delete[] temp;
}


void merge_sort(std::vector<int>& list, int start, int end){
    // Em quanto a partição for maior que 1
    if(start < end){
        int mid = (start + end) / 2;
        merge_sort(list, start, mid);
        merge_sort(list, mid+1, end);
        merge(list, start, mid, mid+1, end);
    }
}


//////////////////////////////////////////////////////////////////
void insert(std::vector<int> &list, int insertion_num, int ordened_final_index){
    // Itera a parte ordenada até encontrar um valor menor que o valor a ser inserido
    // Se nao for encontrado o valor continua na sua posição
    for(int i = 0; i <= ordened_final_index; i++){
        int insertion_index;
        if(list[i] > insertion_num){
            insertion_index = i;
        }else {
            continue;
        }

        // Movimenta todos os valores da lista ordenada a partir do index a ser inserido
        for(int j = ordened_final_index; j > insertion_index; j--){
            list[j] = list[j-1];
        }

        // insere o valor
        list[insertion_index] = insertion_num;
        break;
    }
}

void insertion_sort(std::vector<int> &list){
    int ordened_final_index = 1;

    for(int x = 1; x < (int) list.size(); x++){
        insert(list, list[x], ordened_final_index);
        ordened_final_index++;
    }
}


//////////////////////////////////////////////////////////////////
// SELECTION SORT

int get_smaller(std::vector<int> &list, int start_index){
    int smaller = list.at(start_index);
    int smaller_index = start_index;

    for(int i = start_index; i < (int) list.size(); i++){
        if(smaller > list.at(i)){
            smaller = list.at(i);
            smaller_index = i;
        }
    }

    return smaller_index;
}

void selection_sort(std::vector<int> &list){
    int aux;

    // Procura o menor valor e vai trocando para a posiçao de i, assim ordenando
    for(int i=0; i < (int) list.size()-1; i++){
        int smaller_index = get_smaller(list, i);

        if(smaller_index == i) continue;

        aux = list.at(i);
        list.at(i) = list.at(smaller_index);
        list.at(smaller_index) = aux;
    }
}

//////////////////////////////////////////////////////////////////


bool check_ordened(std::vector<int> &list){
    bool ans = true;
    for(int i=0; i < (int) list.size()-1; i++){
        if(list.at(i) > list.at(i+1)){
            ans = false;
            break;
        }
    }

    return ans;
}

int main(){
    std::vector<int> test = {6, 5, 3, 1, 0, -5};

    //selection_sort(test);
    insertion_sort(test);
    //merge_sort(test, 0, test.size()-1);

    // para teste
    for(auto& iter : test){
        std::cout << iter << " ";
    }
    std::cout << "\n";
    // para teste

    std::cout << (check_ordened(test) ? "Odernado" : "Não ordenado") << "\n";
    return 0;
}
