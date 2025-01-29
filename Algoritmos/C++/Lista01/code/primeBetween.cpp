#include <iostream>

int getHigherNumber(int numA, int numB){
    int higher = numA;
    if(numB > numA){
        higher = numB;
    }
    return higher;
}

bool checkPrimeBetween(int numA, int numB, int higher){
    bool primeBetween = true;
    for(int i=higher; i > 1; i--){
        if(numA % i == 0 and numB % i == 0){
            primeBetween = false;
        }
    }
    return primeBetween;
}

int main(){
    int numA, numB;
    std::cin >> numA >> numB;
    std::cout << checkPrimeBetween(numA, numB, getHigherNumber(numA, numB)) << std::endl;
    return 0;
}