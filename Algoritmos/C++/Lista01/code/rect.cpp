#include <iostream>

int getPerimeter(int sideA, int sideB){
    return (sideA * 2) + (sideB * 2);
}

int main(){
    int sideA, sideB, perimeter;
    std::cin >> sideA;
    std::cin >> sideB;
    perimeter = (sideA * 2) + (sideB * 2);
    std::cout << perimeter << std::endl; 
    std::cout << getPerimeter(sideA, sideB) << std::endl; 
    return 0;
}