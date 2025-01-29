#include <iostream>

int getHigherNumber(int numA, int numB){
    int higher = numA;
    if(numB > numA){
        higher = numB;
    }
    return higher;
}

int mdc(int numA, int numB, int higher){
    for(int i=higher; i > 1; i--){
        if(numA % i == 0 and numB % i == 0){
            return i;
            break;
        }
    }
}

int main(){
    int numA, numB;
    std::cin >> numA >> numB;
    std::cout << mdc(numA, numB, getHigherNumber(numA, numB)) << std::endl;
    return 0;
}