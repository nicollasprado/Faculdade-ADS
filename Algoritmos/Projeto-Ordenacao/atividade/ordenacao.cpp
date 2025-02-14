#include "ordenacao.hpp"

bool ordenado(int list[], unsigned int size){
    bool ans = true;
    for(int i=0; i < (int) size-1; i++){
        if(list[i] > list[i+1]){
            ans = false;
            break;
        }
    }

    return ans;
}



int get_smaller(int list[], int start_index, int size){
    int smaller = list[start_index];
    int smaller_index = start_index;

    for(int i = start_index; i < size; i++){
        if(smaller > list[i]){
            smaller = list[i];
            smaller_index = i;
        }
    }

    return smaller_index;
}

void selecao(int list[], unsigned int size){
    int aux;

    // Procura o menor valor e vai trocando para a posiçao de i, assim ordenando
    for(int i=0; i < (int) size-1; i++){
        int smaller_index = get_smaller(list, i, size);

        if(smaller_index == i) continue;

        aux = list[i];
        list[i] = list[smaller_index];
        list[smaller_index] = aux;
    }
}



void insert(int list[], int insertion_num, int ordened_final_index){
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

void insercao(int list[], unsigned int size){
    int ordened_final_index = 1;

    for(int x = 1; x < (int) size; x++){
        insert(list, list[x], ordened_final_index);
        ordened_final_index++;
    }
}




void merge(int list[], int start_l1, int end_l1, int start_l2, int end_l2){
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

void m_sort(int list[], int start, int end){
    // Em quanto a partição for maior que 1
    if(start < end){
        int mid = (start + end) / 2;
        m_sort(list, start, mid);
        m_sort(list, mid+1, end);
        merge(list, start, mid, mid+1, end);
    }
}


void merge_sort(int list[], unsigned int size){
    m_sort(list, 0, size-1);
}
