#include <iostream>

int main(){
    long long sideA, sideB, perimeter;
    std::cin >> sideA >> sideB;
    perimeter = (sideA * 2) + (sideB * 2);
    std::cout << perimeter << std::endl; 
    return 0;
}