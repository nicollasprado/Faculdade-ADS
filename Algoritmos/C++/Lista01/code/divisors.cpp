#include <iostream>

int getDivisors(int num){
    int divisorsCount = 1;
    for(int i=num; i<=num && i>1; i--){
        if(num % i == 0){
            divisorsCount++;
        }
    }
    return divisorsCount;
}

int main(){
    int input;
    std::cin >> input;
    std::cout << getDivisors(input) << std::endl;
    return 0;
}