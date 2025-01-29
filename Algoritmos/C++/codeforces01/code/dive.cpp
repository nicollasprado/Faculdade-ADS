#include <iostream>

int main(){
    int volunteers, returnedVolunteers, id;
    std::cin >> volunteers >> returnedVolunteers;
    int returnedIds[returnedVolunteers];
    // Criação do array dos ids que retornaram
    for(int z=0; z<=returnedVolunteers-1; z++){
        std::cin >> id;
        returnedIds[z] = id;
    }
    int notReturnedIds[volunteers-returnedVolunteers];
    int notReturnedIndex = 0;
    // Verifica os ids que não retornaram
    for(int i=1; i <= volunteers; i++){
        bool isInArr = false;
        for(int n=0; n <= returnedVolunteers-1; n++){
            if(i == returnedIds[n]){
                isInArr = true;
            }
            if(n == returnedVolunteers-1 && isInArr == false){
                notReturnedIds[notReturnedIndex] = i;
                notReturnedIndex++;
                isInArr = false;
            }
        }
    }
    // printa os ids que não retornaram
    if(sizeof(notReturnedIds) == 0){
        std::cout << "*" << std::endl;
    }else{
        for(int p=0; p<=(volunteers-returnedVolunteers)-1; p++){
            if(p == (volunteers-returnedVolunteers)-1){
                std::cout << notReturnedIds[p] << " " << std::endl;
            }else{
                std::cout << notReturnedIds[p] << " ";
            }
        }
    }
    
    return 0;
}