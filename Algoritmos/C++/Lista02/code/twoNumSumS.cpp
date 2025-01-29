#include <iostream>

int main(){
    int arraySize, s;
    std::cin >> arraySize;
    std::cin >> s;
    int numbers[arraySize];
    for(int i=0; i < arraySize; i++){
        std::cin >> numbers[i];
    }

    int numA, numB;
    bool theresAsum = false;
    int secondNumberAuxIndex = 1;
    for(int j=0; j < arraySize; j++){
        for(int p=secondNumberAuxIndex; p < arraySize; p++){
            if(numbers[j] + numbers[p] == s){
                theresAsum = true;
                numA = numbers[j];
                numB = numbers[p];
                break;
            }
        }
        secondNumberAuxIndex++;
    }

    if(theresAsum){
        std::cout << "Soma encontrada: " << numA << " + " << numB << std::endl; 
    }else{
        std::cout << "Nenhuma combinação de dois números resulta em " << s << std::endl;
    }
    return 0;
}